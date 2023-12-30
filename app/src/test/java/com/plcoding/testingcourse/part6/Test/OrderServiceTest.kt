package com.plcoding.testingcourse.part6.Test

import com.google.firebase.auth.FirebaseAuth
import com.plcoding.testingcourse.part6.EmailClient
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Test

class OrderServiceTest {
    private lateinit var auth: FirebaseAuth
    private lateinit var emailClient: EmailClient

    @BeforeEach
    fun setUp() {
        auth = mockk(relaxed = true)
        emailClient = mockk(relaxed = true)

    }
    @Test
    fun placeOrder() {

    }
}