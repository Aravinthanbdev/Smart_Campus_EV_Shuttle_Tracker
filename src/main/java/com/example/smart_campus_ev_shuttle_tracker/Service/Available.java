package com.example.smart_campus_ev_shuttle_tracker.Service;

import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import com.example.smart_campus_ev_shuttle_tracker.Repository.ShuttleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smart_campus_ev_shuttle_tracker.Model.Status;

import java.util.List;

@Service
public class Available {

    @Autowired
    ShuttleRepo sar;


    public List<Shuttles> availablebus() {
        return sar.findAll()
                .stream()
                .filter(shuttle -> shuttle.getStatus() == Status.AVAILABLE )
                .filter(shuttle -> (shuttle.getBattery_pct()) >= 20)
                .toList();


    }
}
