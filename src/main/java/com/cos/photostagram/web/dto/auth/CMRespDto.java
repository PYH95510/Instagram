package com.cos.photostagram.web.dto.auth;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMRespDto<T> {
    private Integer code;
    private String message;
    private T data;

    // we have created CMRespDto class to return both message and erroMap. Now, we
    // have to change the return type for erro type to CMRespDto

}
/*
 * Why are we using generic T here? we cannot always response to error data
 * type. Sometimes we need to response to member data and various
 * data. In that case we cannot always change the CMRespDto. To consider all of
 * those cases, the best way to address is using generics
 * 
 */