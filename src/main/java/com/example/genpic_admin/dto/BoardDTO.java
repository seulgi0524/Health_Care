package com.example.genpic_admin.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BoardDTO {
    private String title;
    private MultipartFile thumbnail;
    private String contents;
}
