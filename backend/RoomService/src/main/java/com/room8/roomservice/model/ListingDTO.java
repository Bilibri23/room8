package com.room8.roomservice.model;

import com.room8.roomservice.enums.BathroomLocation;
import com.room8.roomservice.enums.ListingStyle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ListingDTO {
    private Long id;
    private Integer numberOfRooms;
    private Double roomArea; //in square meters
    private Long numberOfBathrooms;
    private Boolean isSharedBathroom;
    private Double bathroomArea; //in square meters
    private Integer numberOfKitchens;
    private Boolean isSharedKitchen;
    private Double kitchenArea; //in square meters
    private BathroomLocation bathroomLocation;
    private String listingCountry;
    private String listingState;
    private String listingCity;
    private String listingStreet;
    private Double listingPrice;
    private String listingDescription;
    private ListingStyle listingStyle;
    private Integer numberOfHouseMates;
}
