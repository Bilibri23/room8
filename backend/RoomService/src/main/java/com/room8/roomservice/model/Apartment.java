package com.room8.roomservice.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Apartment extends Listing{
    private Boolean hasLivingRoom;
    private Integer numberOfLivingRooms;
    private Double livingRoomArea; //in square meters
    private Boolean hasOutDoorLivingArea;
    private Double outDoorArea; //in square meters
}
