package com.example.smart_campus_ev_shuttle_tracker.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.smart_campus_ev_shuttle_tracker.Service.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.smart_campus_ev_shuttle_tracker.Model.Routes;
@RestController

public class newroute {
    @Autowired
    Trip tr;

    @PostMapping("/newroute")
    public String newroute1(@RequestBody Routes rsd ) {
        tr.route(rsd);
        return "New route added successfully";
    }
}
