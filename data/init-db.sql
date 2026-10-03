CREATE TABLE financial_transaction(
    financial_transaction_id UUID PRIMARY KEY,
    date_transactional TIMESTAMP NOT NULL,
    value_transactional DECIMAL NOT NULL
);
