package ru.dart69.inamoratas.users.data;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "users", indexes = {
        @Index(columnList = "username", unique = true),
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private @NonNull String username;
    private @NonNull String firstName;
    private @NonNull String middleName;
    private String lastName;
    private @NonNull LocalDate birthDate;
    @Enumerated
    private @NonNull Gender gender;
}