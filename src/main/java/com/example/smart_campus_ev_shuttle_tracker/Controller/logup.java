package com.example.smart_campus_ev_shuttle_tracker.Controller;

import com.example.smart_campus_ev_shuttle_tracker.Service.Triplog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logup {

    @Autowired
    Triplog to;

    @PostMapping("/log")
    public String logup(@RequestParam("shuttleId") int shuttleId,
                        @RequestParam("routeId") int routeId,
                        @RequestParam("passengerCount") int passengerCount
    ) {
        return to.logTrip(shuttleId,routeId,passengerCount);

    }
}
