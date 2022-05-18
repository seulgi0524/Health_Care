package com.example.genpic_admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class rData {

    @JsonProperty("SID")
    private String SID;

    private Admin admin;

    private int strUserIdx;
}
