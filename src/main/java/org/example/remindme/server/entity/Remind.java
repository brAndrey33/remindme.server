package org.example.remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.Date;


@Entity
@Table(name = "remind")
public class Remind {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "remind_date", nullable = false)
    private Date remindData;


    public Remind() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //***************
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //*******************
    public Date getData() {
        return remindData;
    }

    public void setTitle(Date remindData) {
        this.remindData = remindData;
    }

}
