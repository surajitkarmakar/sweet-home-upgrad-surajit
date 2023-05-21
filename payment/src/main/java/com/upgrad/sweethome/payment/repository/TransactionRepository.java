package com.upgrad.sweethome.payment.repository;

import com.upgrad.sweethome.payment.model.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionDetailsEntity, Integer> {

}
