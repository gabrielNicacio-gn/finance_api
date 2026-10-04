package com.challenge.finance_api.api.controllers;

import com.challenge.finance_api.api.dtos.RequestCreateFinancialTransactionDto;
import com.challenge.finance_api.api.dtos.ResponseCreateTransactionalDto;
import com.challenge.finance_api.usecases.CreateNewTransactionalUseCase;
import com.challenge.finance_api.usecases.DeleteFinancialTransaction;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
public class FinancialTransactionalController {
    private final CreateNewTransactionalUseCase create;
    private final DeleteFinancialTransaction delete;
    public FinancialTransactionalController(CreateNewTransactionalUseCase create, DeleteFinancialTransaction delete) {
        this.create = create;
        this.delete = delete;
    }

    @PostMapping("/transactional")
    public ResponseEntity<ResponseCreateTransactionalDto> createTransactional(@Valid @RequestBody RequestCreateFinancialTransactionDto request){
        ResponseCreateTransactionalDto response = create.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/transactional/{id}")
    public ResponseEntity deleteTransactional(@PathVariable UUID id){
        delete.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
