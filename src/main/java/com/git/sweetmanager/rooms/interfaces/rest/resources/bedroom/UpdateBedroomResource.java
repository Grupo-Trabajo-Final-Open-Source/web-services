package com.git.sweetmanager.rooms.interfaces.rest.resources.bedroom;

public record UpdateBedroomResource(long id,  String workName, int totalBeds,
                                    int totalBathroom, int totalTelevision, String state, String name, String description, Double price, String clientName) {
}
