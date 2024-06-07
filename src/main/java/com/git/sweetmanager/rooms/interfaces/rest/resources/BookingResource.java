package com.git.sweetmanager.rooms.interfaces.rest.resources;

import java.util.Date;

public record BookingResource(int clientId, int bedroomId,
                              Date startDate, Date finalDate,
                              float totalPrice, String state) {
}