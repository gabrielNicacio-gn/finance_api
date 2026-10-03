package com.challenge.finance_api.api.controllers;

import com.challenge.finance_api.api.dtos.RequestCreateFinancialTransactionDto;
import com.challenge.finance_api.api.dtos.ResponseCreateTransactionalDto;
import com.challenge.finance_api.usecases.CreateNewTransactionalUseCase;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class FinancialTransactionalController {
    private final CreateNewTransactionalUseCase create;

    public FinancialTransactionalController( CreateNewTransactionalUseCase create) {
        this.create = create;
    }

    @PostMapping("/transactional")
    public HttpEntity<ResponseCreateTransactionalDto> createTransactional(@Valid @RequestBody RequestCreateFinancialTransactionDto request){
        ResponseCreateTransactionalDto response = create.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
