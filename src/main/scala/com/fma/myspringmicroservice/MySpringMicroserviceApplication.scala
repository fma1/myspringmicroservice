package com.fma.myspringmicroservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object MySpringMicroserviceApplication {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[MySpringMicroserviceApplication], args: _*)
  }
}

@SpringBootApplication
class MySpringMicroserviceApplication
