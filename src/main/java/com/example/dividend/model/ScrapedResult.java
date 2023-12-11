package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor // 모든 필드를 초기화 하는 생성자 코드를 사용 할 수 있음.
public class ScrapedResult {

    private Company company;

    private List<Dividend> dividends;

    public ScrapedResult() {  this.dividends = new ArrayList<>();
    }
}
