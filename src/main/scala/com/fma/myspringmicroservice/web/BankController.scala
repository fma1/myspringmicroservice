package com.fma.myspringmicroservice.web

import com.fma.myspringmicroservice.dto.TransactionDTO
import com.fma.myspringmicroservice.model.Transaction
import com.fma.myspringmicroservice.service.TransactionService
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RestController}

import java.lang.{Iterable => JIterable}
import javax.validation.Valid

@RestController
class BankController(transactionService: TransactionService) {
  @GetMapping(Array("/transactions"))
  def transactions(): JIterable[Transaction] = {
    transactionService.findAll()
  }

  @PostMapping(Array("/transactions"))
  def createTransaction(@Valid @RequestBody transactionDTO: TransactionDTO): Transaction = {
    transactionService.create(transactionDTO.amount, transactionDTO.reference, transactionDTO.receivingUser)
  }
}
