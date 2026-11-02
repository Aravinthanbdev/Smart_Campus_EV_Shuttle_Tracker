package com.example.smart_campus_ev_shuttle_tracker.Repository;

import com.example.smart_campus_ev_shuttle_tracker.Model.Trip_Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Trip_LogsRepo extends JpaRepository<Trip_Logs, Integer> {
}
