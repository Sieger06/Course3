package com.example.course3.model;

public enum Color {
    WHITE("белый"),
    RAD("крвсный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("синий"),
    PURPLE("фиолетовый"),
    BLACK("черный");
    private String name;

    Color(String name) {
        this.name = name;
    }
}