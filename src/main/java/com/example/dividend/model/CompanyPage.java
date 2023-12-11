package com.example.dividend.model;

import com.example.dividend.persist.entity.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyPage {

    private List<CompanyEntity> contents;
    private Pageable pageable;
    private long totalElements;
    private boolean last;
    private int numberOfElements;
    private int size;
    private int number;
    private Object sort;
    private boolean first;
    private boolean empty;


    public static CompanyPage of(Page<CompanyEntity> companies) {
        return CompanyPage.builder()
                .contents(companies.getContent())
                .pageable(companies.getPageable())
                .totalElements(companies.getTotalElements())
                .last(companies.isLast())
                .numberOfElements(companies.getNumberOfElements())
                .sort(companies.getSort())
                .first(companies.isFirst())
                .empty(companies.isEmpty())
                .build();
    }
}