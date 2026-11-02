package com.example.smart_campus_ev_shuttle_tracker.Service;

import com.example.smart_campus_ev_shuttle_tracker.Controller.Register;
import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import com.example.smart_campus_ev_shuttle_tracker.Repository.ShuttleRepo;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class RegisterShuttle {

    @Autowired
    ShuttleRepo sr;

    public void registerbus(Shuttles su) {
        sr.save(su);

    }

}
