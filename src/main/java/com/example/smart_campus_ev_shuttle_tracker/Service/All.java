package com.example.smart_campus_ev_shuttle_tracker.Service;


import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import com.example.smart_campus_ev_shuttle_tracker.Repository.ShuttleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class All {
    @Autowired
    ShuttleRepo sar;

    public List<Shuttles> allbus() {
        return sar.findAll();
    }
}
