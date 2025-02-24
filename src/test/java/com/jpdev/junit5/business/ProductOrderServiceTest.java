package com.jpdev.junit5.business;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductOrderServiceTest {

    private ProductOrderService productOrderService;

    @BeforeAll
    static void setUp() {
        System.out.println("Antes de todos los test");
    }


    @BeforeEach
    void init() {
        productOrderService = new ProductOrderService();
        System.out.println("Antes de cada test");
    }

    @Test
    void testSum() {
        int result = 2 + 3;
        Assertions.assertEquals(5, result, "La suma debe ser 5");
    }

    @Test
    void testSub() {
        int result = 2 - 3;
        Assertions.assertEquals(-1, result);
    }

    @AfterAll
    static void done() {
        System.out.println("Despues de todos los test");
    }

    @AfterEach
    void afterLastEach() {
        System.out.println("Despues de cada los test");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> productOrderService.divide(10, 0));
    }

}
