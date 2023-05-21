package com.upgrad.sweethome.payment.service;

import com.upgrad.sweethome.payment.model.TransactionDetailsEntity;

public interface PaymentService {
    int createTransaction(TransactionDetailsEntity transactionDetailsEntity);

    TransactionDetailsEntity getTransaction(int transactionId);
}
