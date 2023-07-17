package ru.skypro.homework.dto;

import lombok.Data;

import java.util.List;

@Data
public class Ads {
    Integer count;
    List<AdDTO> results;
}
