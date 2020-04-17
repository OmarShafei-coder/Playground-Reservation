package com.omarshafei.playgroundreservation;

public class PlayGround {

    private String playgroundName;
    private String ownerName;
    private String number;
    private String address;
    private String location;

    public PlayGround(String playgroundName, String ownerName, String number, String address, String location) {
        this.playgroundName = playgroundName;
        this.ownerName = ownerName;
        this.number = number;
        this.address = address;
        this.location = location;
    }

    public String getPlaygroundName() {
        return playgroundName;
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
