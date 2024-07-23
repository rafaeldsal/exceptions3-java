package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        Duration t1 = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
        return t1.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Room " + this.roomNumber + ", ");
        sb.append("check-in: " + this.checkIn.format(fmt) + ", ");
        sb.append("check-out: " + this.checkOut.format(fmt) + ", ");
        sb.append(duration() + " nights");

        return sb.toString();
    }
}
