package com.cos.photostagram.web.dto.auth;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMRespDto {
    private String message;
    private Map<String, String> errorMap;

}
