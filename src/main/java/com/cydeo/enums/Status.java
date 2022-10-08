package com.cydeo.enums;

public enum Status {

    OPEN("Open"), COMPLETE("Complete"), IN_PROGRESS("In progress");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
