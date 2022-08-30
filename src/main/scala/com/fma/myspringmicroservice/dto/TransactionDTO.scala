package com.fma.myspringmicroservice.dto

import java.math.{BigDecimal => JBigDecimal}
import javax.validation.constraints.{Min, NotNull}
import scala.beans.BeanProperty

class TransactionDTO {
  @BeanProperty
  @Min(0)
  var amount: JBigDecimal = _
  @BeanProperty
  var reference: String = _
  @BeanProperty
  @NotNull
  var receivingUser: String = _
}
