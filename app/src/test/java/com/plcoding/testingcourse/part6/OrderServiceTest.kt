package com.plcoding.testingcourse.part6

import com.google.firebase.auth.FirebaseAuth
import io.mockk.mockk
import io.mockk.verify
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class OrderServiceTest {
    private lateinit var auth: FirebaseAuth
    private lateinit var emailClient: EmailClient
    private lateinit var orderService: OrderService


    @BeforeEach
    fun setUp() {
        auth = mockk(relaxed = true)
        emailClient = mockk(relaxed = true)
        orderService = OrderService(auth, emailClient)

    }
    @Test
    fun `Place order email and product name check`() = runBlocking {

        orderService.placeOrder(
            customerEmail = "ddd@gmail.com",
            productName = "ice cream"
        )

        verify {
          emailClient.send(
              Email(
                  subject = "Order Confirmation",
                  content ="Thank you for your order of ice cream.",
                  recipient = "ddd@gmail.com"
              )
          )
        }
    }
}