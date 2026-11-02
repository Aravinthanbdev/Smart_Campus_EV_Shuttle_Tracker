package com.example.smart_campus_ev_shuttle_tracker.Repository;
import com.example.smart_campus_ev_shuttle_tracker.Model.Shuttles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShuttleRepo extends JpaRepository<Shuttles, Integer> {
}
