package com.example.dividend.exception.impl;

import com.example.dividend.exception.AbstractException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public
class DividendNotFoundException extends AbstractException {

    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public String getMessage() {
        return "배당금 정보를 조회 할 수 없습니다. ";
    }
}
