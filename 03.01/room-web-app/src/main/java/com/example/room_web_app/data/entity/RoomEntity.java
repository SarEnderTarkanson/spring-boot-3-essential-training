package com.example.room_web_app.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ROOMS")
@Getter
@Setter
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ROOM_ID")
    private UUID roomId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "BED_INFO")
    private String bedInfo;

    @Override
    public String toString() {
        return "RoomEntity{" +
                "roomId=" + roomId +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }
}
