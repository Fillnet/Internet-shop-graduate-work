package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class User {
    Integer id;
    String username;
    String firstName;
    String lastName;
    String phone;
    String image;
}