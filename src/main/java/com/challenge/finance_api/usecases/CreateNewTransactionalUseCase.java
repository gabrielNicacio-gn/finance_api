package com.challenge.finance_api.usecases;

import com.challenge.finance_api.api.dtos.RequestCreateFinancialTransactionDto;
import com.challenge.finance_api.api.dtos.ResponseCreateTransactionalDto;
import com.challenge.finance_api.models.FinancialTransaction;
import com.challenge.finance_api.repository.FinancialTransactionDatabase;
import org.springframework.stereotype.Service;

@Service
public class CreateNewTransactionalUseCase {

    private final FinancialTransactionDatabase database;

    public CreateNewTransactionalUseCase(FinancialTransactionDatabase database) {
        this.database = database;
    }

    public ResponseCreateTransactionalDto create(RequestCreateFinancialTransactionDto dto){
        FinancialTransaction newTransactional = new FinancialTransaction();
        newTransactional.setValueTransactional(dto.valueTransactional());
        FinancialTransaction savedTransactional = database.addTransaction(newTransactional);
        return new ResponseCreateTransactionalDto(savedTransactional.getTransactionalId(),savedTransactional.getValueTransactional(),savedTransactional.getDateTransactional());
    }
}
