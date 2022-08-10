package com.challenge.travel.Enum;

public enum PaisesEnum {
    EUA ("Estados Unidos"),
    INGLATERRA ("Inglaterra"),
    FRANCA ("França"),
    CANADA ("Canadá");

    private String name;

    PaisesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}