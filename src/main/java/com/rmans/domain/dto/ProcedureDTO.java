package com.rmans.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProcedureDTO {
    @NotNull
    @Size(min = 3, max = 100)
    private String name;

    @NotNull
    private String startTime;

    @NotNull
    private String endTime;

    @NotNull
    private String dayOfWeek;

    // Геттери та сеттери
}
