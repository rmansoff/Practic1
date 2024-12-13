package com.rmans.domain.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProcedureDTO {

    @NotNull
    private String name;

    @Size(min = 5, max = 100)
    private String description;

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
