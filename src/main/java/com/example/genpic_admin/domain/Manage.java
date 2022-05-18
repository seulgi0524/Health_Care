package com.example.genpic_admin.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Manage {

    private Integer idx;
    private String majorCD;
    private String minorCD;
    private String aliginCD;
    private String enable;
    private String registeredID;
    private String registeredIP;
    private String registeredDate;
    private String updateID;
    private String updateIP;
    private String updateDate;

}
