package com.shetu.ecommerce.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
@Slf4j
public class TestProductRepository {

    @Test
    public void testAdd() {
    double num1 = 0.04;
    double num2 = 0.03;
    double subtractionResultForPrimitiveDouble = num1 - num2;
    log.info("result after subtraction for primitive type double:{}",subtractionResultForPrimitiveDouble);
        Double num1ForDoubleType = 0.04;
        Double num2ForDoubleType = 0.03;
        Double subtractionForDouble = num1ForDoubleType - num2ForDoubleType;
        log.info("result after subtraction for Object type Double:{}",subtractionForDouble);

        String num1Str = num1ForDoubleType.toString();
        String num2Str = num2ForDoubleType.toString();
        BigDecimal num1ForBigDecimalType = new BigDecimal(num1Str);
        BigDecimal num2ForBigDecimalType = new BigDecimal(num2Str);
        BigDecimal subtractionForBigDecimalType = num1ForBigDecimalType.subtract(num2ForBigDecimalType);
        log.info("result after subtraction for type BigDecimal:{}",subtractionForBigDecimalType);
    }
}
