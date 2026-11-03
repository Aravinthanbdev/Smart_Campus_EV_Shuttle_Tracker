package com.example.smart_campus_ev_shuttle_tracker.Service;

import com.example.smart_campus_ev_shuttle_tracker.Model.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smart_campus_ev_shuttle_tracker.Repository.RoutesRepo;

@Service

public class Trip {
    @Autowired
    RoutesRepo rj;

    public void route(Routes rsd){
    rj.save(rsd);
    }
}
