package ru.dart69.inamoratas.users.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("Male"), FEMALE("Female");

    private final String name;
}
