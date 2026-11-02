package com.example.smart_campus_ev_shuttle_tracker.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Trip_Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long log_id;
    @ManyToOne
    @JoinColumn(name = "shuttle_id", nullable = false)
    private Shuttles shuttle_id;
    @ManyToOne
    @JoinColumn(name = "route_id", nullable = false)
    private Routes route_id;
    @Column(name = "Passengers_Boarded", nullable = false)
    private int passengers_boarded;
    @Column(name = "Time_Stamp", nullable = false , insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime time_stamp;

    public Trip_Logs() {
    }

    public Trip_Logs(Shuttles shuttle_id, Routes route_id, int passengers_boarded, LocalDateTime time_stamp) {
        super();
        this.shuttle_id = shuttle_id;
        this.route_id = route_id;
        this.passengers_boarded = passengers_boarded;
        this.time_stamp = time_stamp;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public Shuttles getShuttle_id() {
        return shuttle_id;
    }

    public void setShuttle_id(Shuttles shuttle_id) {
        this.shuttle_id = shuttle_id;
    }

    public Routes getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Routes route_id) {
        this.route_id = route_id;
    }

    public int getPassengers_boarded() {
        return passengers_boarded;
    }

    public void setPassengers_boarded(int passengers_boarded) {
        this.passengers_boarded = passengers_boarded;
    }

    public LocalDateTime getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(LocalDateTime time_stamp) {
        this.time_stamp = time_stamp;
    }
}
