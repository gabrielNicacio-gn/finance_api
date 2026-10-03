package com.challenge.finance_api.repository;

import com.challenge.finance_api.models.FinancialTransaction;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class FinancialTransactionDatabase {
    private final HashMap<UUID, FinancialTransaction> dataTransaction;

    public FinancialTransactionDatabase(HashMap<UUID, FinancialTransaction> dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public FinancialTransaction addTransaction(FinancialTransaction transaction){
        UUID transactionId = UUID.randomUUID();
        dataTransaction.put(transactionId, transaction);
        return dataTransaction.get(transactionId);
    }

    public void deleteTransactional(UUID transactionalId){
        dataTransaction.remove(transactionalId);
    }

    public List<FinancialTransaction> getAll(){
        return dataTransaction.values().stream().toList();
    }
}
