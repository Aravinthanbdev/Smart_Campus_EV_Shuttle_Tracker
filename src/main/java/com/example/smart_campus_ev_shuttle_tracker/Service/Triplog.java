package com.example.smart_campus_ev_shuttle_tracker.Service;

import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import com.example.smart_campus_ev_shuttle_tracker.Model.Trip_Logs;
import com.example.smart_campus_ev_shuttle_tracker.Repository.RoutesRepo;
import com.example.smart_campus_ev_shuttle_tracker.Repository.ShuttleRepo;
import com.example.smart_campus_ev_shuttle_tracker.Repository.Trip_LogsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.example.smart_campus_ev_shuttle_tracker.Model.Status;
import com.example.smart_campus_ev_shuttle_tracker.Model.Routes;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Triplog {
    @Autowired
    Trip_LogsRepo tr;
    @Autowired
    ShuttleRepo sh;
    @Autowired
    RoutesRepo rr;


    @Transactional
    public String logTrip(int shuttleId, Integer routeId,
                          int passengerCount) {
        Shuttles shuttle = sh.findById(shuttleId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Shuttle not found"));
        Routes route = rr.findById(routeId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Route not found"));

        if (passengerCount < 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid passenger count");
        }

        if (shuttle.getStatus() != Status.AVAILABLE) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Shuttle is not available");
        }

        int remainingBattery = Integer.parseInt(String.valueOf(Math.max(
                0, shuttle.getBattery_pct() - 5)));;

        shuttle.setBattery_pct(remainingBattery);

        if (remainingBattery < 15) {
            shuttle.setStatus(Status.MAINTENANCE);
        }

        Trip_Logs tripLog = new Trip_Logs();

        tripLog.setShuttle_id(shuttle);
        tripLog.setRoute_id(route);
        tripLog.setPassengers_boarded(passengerCount);


        sh.save(shuttle);
        tr.save(tripLog);

        return "Trip completed successfully! Remaining Battery: "
                + remainingBattery + "% | Status: "
                + shuttle.getStatus();
    }
}