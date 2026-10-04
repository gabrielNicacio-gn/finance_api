package com.challenge.finance_api.usecases;

import com.challenge.finance_api.repository.FinancialTransactionDatabase;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteFinancialTransaction {
    private final FinancialTransactionDatabase database;

    public DeleteFinancialTransaction(FinancialTransactionDatabase database) {
        this.database = database;
    }

    public void delete(UUID transactionalId){
        database.deleteTransactional(transactionalId);
    }
}
