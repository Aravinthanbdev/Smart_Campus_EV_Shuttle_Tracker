package com.example.smart_campus_ev_shuttle_tracker.Model;

import jakarta.persistence.*;

@Entity
public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int route_id;
    @Column(name = "stop_name", length = 100, nullable = false)
    private String stop_name;
    @Column(name = "sequence_order", nullable = false)
    private int sequence_order;

    public Routes() {
    }

    public Routes(String stop_name, int sequence_order) {
        super();
        this.stop_name = stop_name;
        this.sequence_order = sequence_order;
    }


    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }

    public Integer getSequence_order() {
        return sequence_order;
    }

    public void setSequence_order(int sequence_order) {
        this.sequence_order = sequence_order;
    }
}
