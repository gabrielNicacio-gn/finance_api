package com.challenge.finance_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class FinancialTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID financialTransactionalId;

    private LocalDateTime dateTransactional;

    private BigDecimal valueTransactional;

    public FinancialTransaction(){
        dateTransactional = LocalDateTime.now();
    }

}
