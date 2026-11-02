package com.example.smart_campus_ev_shuttle_tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.smart_campus_ev_shuttle_tracker.Model.Routes;

public interface RoutesRepo extends JpaRepository<Routes, Integer> {
}

