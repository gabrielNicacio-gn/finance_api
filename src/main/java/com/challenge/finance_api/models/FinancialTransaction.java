package com.challenge.finance_api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class FinancialTransaction {

    private LocalDateTime dateTransactional;

    private BigDecimal valueTransactional;

    public FinancialTransaction(){

        dateTransactional = LocalDateTime.now();;
    }
}
