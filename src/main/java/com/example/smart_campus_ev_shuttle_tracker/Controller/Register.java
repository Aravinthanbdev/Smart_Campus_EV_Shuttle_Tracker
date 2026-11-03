package com.example.smart_campus_ev_shuttle_tracker.Controller;

import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import com.example.smart_campus_ev_shuttle_tracker.Service.RegisterShuttle;
import com.example.smart_campus_ev_shuttle_tracker.Service.All;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Register {
    @Autowired
    RegisterShuttle rs;
    @Autowired
    All al;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Shuttles shut) {
        rs.registerbus(shut);
        return ResponseEntity.ok("Shuttle registered successfully");

    }
    @GetMapping("/all")
    public ResponseEntity<List<Shuttles>> all() {
        return ResponseEntity.ok(al.allbus());
    }
}
