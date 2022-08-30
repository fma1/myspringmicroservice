package com.fma.myspringmicroservice.model

import org.springframework.data.annotation.{Id, Version}
import org.springframework.data.relational.core.mapping.Table

import java.math.{BigDecimal => JBigDecimal}
import java.time.ZonedDateTime
import java.util.UUID
import scala.beans.BeanProperty

@Table("transactions")
case class Transaction(
                        @BeanProperty var amount: JBigDecimal,
                        @BeanProperty var reference: String,
                        @BeanProperty var receivingUser: String
                      ) {
  @BeanProperty
  @Id
  var id: String = UUID.randomUUID().toString

  @BeanProperty
  var timestamp: ZonedDateTime = ZonedDateTime.now()

  @BeanProperty
  @Version
  var version: Int = _
}
