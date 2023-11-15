package it.exercise.mycollection.model;

public enum Platform {
    PS4("PlayStation 4"),
    PS3("PlayStation 3"),
    PS2("PlayStation 2"),
    SWITCH("Nintendo Switch"),
    GAMECUBE("Nintendo Gamecube"),
    X360("Xbox 360");

    final String description;

    Platform(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
