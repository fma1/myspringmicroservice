package com.fma.myspringmicroservice.repository

import com.fma.myspringmicroservice.model.Transaction
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait TransactionRepository extends CrudRepository[Transaction, String] {

}
