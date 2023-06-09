package com.vitor.dev.credit.application.system.service


import com.vitor.dev.credit.application.system.dto.CustomerDto
import com.vitor.dev.credit.application.system.dto.CustomerUpdateDto
import com.vitor.dev.credit.application.system.entity.Customer
import com.vitor.dev.credit.application.system.repository.CustomerRepository
import com.vitor.dev.credit.application.system.service.impl.CustomerService
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.ActiveProfiles
import java.math.BigDecimal


@ActiveProfiles("test")
@ExtendWith(MockKExtension::class)
class CustomerServiceTest {

    @MockK
    lateinit var customerRepository: CustomerRepository

    @InjectMockKs
    lateinit var customerService: CustomerService


    @Test
    fun `should create customer`() {
        //given = DADOS A SEREM RECEBIDOS
        val fakeCustomer : CustomerDto = builderCustomer()


        //when = METODO A SER TESTADO


        //then = ASSERTIVAS
    }


    private fun builderCustomer(
        firstName: String = "Vitor",
        lastName: String = "Dev",
        cpf: String = "28475934625",
        email: String = "vitordev@email.com",
        income: BigDecimal = BigDecimal.valueOf(1000.0),
        password: String = "1234",
        zipCode: String = "000000",
        street: String = "Rua do Vitor, 987",
    ) = CustomerDto(
        firstName = firstName,
        lastName = lastName,
        cpf = cpf,
        email = email,
        income = income,
        password = password,
        zipCode = zipCode,
        street = street
    )

    private fun builderCustomerUpdateDto(
        firstName: String = "VitorUpdate",
        lastName: String = "VitorUpdate",
        income: BigDecimal = BigDecimal.valueOf(5000.0),
        zipCode: String = "369369",
        street: String = "Rua Updated"
    ): CustomerUpdateDto = CustomerUpdateDto(
        firstName = firstName,
        lastName = lastName,
        income = income,
        zipCode = zipCode,
        street = street
    )
}