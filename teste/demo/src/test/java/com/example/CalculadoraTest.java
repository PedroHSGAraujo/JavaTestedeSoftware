package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSomar() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.somar(2, 3);

        // Assert
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");
    }
    @Test
    void testSomarPosComNeg() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.somar(2, -3);

        // Assert
        assertEquals(-1, resultado, "A soma de 2 + (-3) deve ser -1");
    }
    @Test
    void testSomarNegComPos() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.somar(-2, 3);

        // Assert
        assertEquals(1, resultado, "A soma de (-2)+ 3 deve ser 1");
    }
    @Test
    void testSomarNegativo() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.somar(-2, -3);

        // Assert
        assertEquals(-5, resultado, "A soma de (-2) + (-3) deve ser -5");
    }
    @Test
    void testSubtrair() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.subtrair(3, 2);

        // Assert
        assertEquals(1, resultado, "A soma de 3 - 2 deve ser 1");
    }
    @Test
    void testSubtrairPosComNeg() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.subtrair(3, -2);

        // Assert
        assertEquals(5, resultado, "A soma de 3 - (-2) deve ser 5");
    }
    @Test
    void testMultiplicar() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.multiplicar(3, 2);

        // Assert
        assertEquals(6, resultado, "A soma de 3 * 2 deve ser 6");
    }
    @Test
    void testMultiplicarPosComNeg() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.multiplicar(3, -2);

        // Assert
        assertEquals(-6, resultado, "A soma de 3 * (-2) deve ser -6");
    }
    @Test
    void testDividir() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.dividir(6, 2);

        // Assert
        assertEquals(3, resultado, "A soma de 6 / 2 deve ser 3");
    }
    @Test
    void testDividirPosComNeg() {
        // Arrange
        Calculadora calculadora = new Calculadora();

        // Act
        int resultado = calculadora.dividir(6, -2);

        // Assert
        assertEquals(-3, resultado, "A soma de 6 / (-2) deve ser -3");
    }
}