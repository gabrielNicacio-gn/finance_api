package com.challenge.finance_api.api.dtos;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public record RequestCreateFinancialTransactionDto(
        @DecimalMin(value = "0.01", message = "Valor não pode ser menor que 0")
        BigDecimal valueTransactional
) { }
