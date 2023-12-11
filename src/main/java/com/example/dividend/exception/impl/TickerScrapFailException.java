package com.example.dividend.exception.impl;

import com.example.dividend.exception.AbstractException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class TickerScrapFailException extends AbstractException {
    private String ticker;
    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public String getMessage() {
        return "Failed to Scrap ticker -> "+ ticker;
    }
}