package com.workinghours.WorkingHours.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class WorkingDay {
    //id (PK)	date	start_time	end_time	pause_duration	app_user_id (FK)

    public WorkingDay(Date date, int start_time_in_sec, int end_time_in_sec, int pause_duration_in_sec, AppUser appUser) {
        this.date = date;
        this.start_time_in_sec = start_time_in_sec;
        this.end_time_in_sec = end_time_in_sec;
        this.pause_duration_in_sec = pause_duration_in_sec;
        this.appUser = appUser;
    }

    public WorkingDay() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    long id;

    Date date;

    int start_time_in_sec;

    int end_time_in_sec;

    int pause_duration_in_sec;

    @ManyToOne
    AppUser appUser;


}
