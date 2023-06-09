package com.vitor.dev.credit.application.system.service

import com.vitor.dev.credit.application.system.entity.Customer

interface ICustomerService {

    fun save(customer : Customer): Customer

    fun findById(customerId: Long) : Customer

    fun delete(customerId: Long)
}