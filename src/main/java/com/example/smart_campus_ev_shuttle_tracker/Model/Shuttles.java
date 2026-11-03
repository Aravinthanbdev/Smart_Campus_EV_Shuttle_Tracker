package com.example.smart_campus_ev_shuttle_tracker.Model;

import jakarta.persistence.*;
@Entity
public class Shuttles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shuttle_id;
    @Column(name = "driver_name", length = 100, nullable = false)
    private String driver_name;
    @Column (name = "battery_pct", length = 100, nullable = false)
    private int battery_pct;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Shuttles() {
    }

    public Shuttles(String driver_name, int battery_pct, Status status) {
        super();
        this.driver_name = driver_name;
        this.battery_pct = battery_pct;
        this.status = status;
    }

    public Long getShuttle_id() {
        return shuttle_id;
    }

    public void setShuttle_id(Long shuttle_id) {
        this.shuttle_id = shuttle_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getBattery_pct() {
        return battery_pct;
    }

    public void setBattery_pct(int battery_pct) {
        this.battery_pct = battery_pct;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
