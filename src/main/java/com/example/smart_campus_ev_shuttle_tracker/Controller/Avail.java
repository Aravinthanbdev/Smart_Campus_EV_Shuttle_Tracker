package com.example.smart_campus_ev_shuttle_tracker.Controller;

import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.smart_campus_ev_shuttle_tracker.Service.Available;

import java.util.List;

@RestController
public class Avail {
    @Autowired
    Available av;
    @GetMapping("/available")
    public List<Shuttles> available() {
        return av.availablebus();
    }
}
