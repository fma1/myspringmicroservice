package com.fma.myspringmicroservice.service

import com.fma.myspringmicroservice.model.Transaction
import com.fma.myspringmicroservice.repository.TransactionRepository
import org.springframework.stereotype.Service

import java.lang.{Iterable => JIterable}
import java.math.{BigDecimal => JBigDecimal}

@Service
class TransactionService(transactionRepository: TransactionRepository) {
  def findAll(): JIterable[Transaction] = {
    transactionRepository.findAll()
  }

  def create(amount: JBigDecimal, reference: String, receivingUser: String): Transaction = {
    transactionRepository.save(Transaction(amount, reference, receivingUser))
  }
}
