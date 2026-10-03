package com.challenge.finance_api.api.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record ResponseCreateTransactionalDto (BigDecimal valueTransactional,
                                              LocalDateTime dateTransactional){ }
