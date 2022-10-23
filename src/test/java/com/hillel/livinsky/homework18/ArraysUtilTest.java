package com.hillel.livinsky.homework18;

import com.hillel.livinsky.lessons.homework18.ArraysUtil;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraysUtilTest {
    @Test
    public void CheckingArrayForSquareTrue() {
        assertTrue(ArraysUtil.checkingArrayForSquare(new int[2][2]));
    }

    @Test
    public void CheckingArrayForSquareFalse() {
        assertFalse(ArraysUtil.checkingArrayForSquare(new int[2][1]));
    }

    @Test
    public void GetArithmeticOfArrayElementsReturnDoublePositive() {
        double testArray[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        double result = ArraysUtil.getAverageArithmeticOfArrayElements(testArray);
        assertEquals(3.0,result);
    }

    @Test
    public void GetArithmeticOfArrayElementsReturnNullPointerException() {
        NullPointerException actualException = assertThrows(NullPointerException.class, ()->{
            ArraysUtil.getAverageArithmeticOfArrayElements(null);
        }, "Cannot read the array length because \"<local3>\" is null");
    }

    @Test
    public void GetArithmeticOfArrayElementsReturnArrayIsEmpty(){
     double testIntArray[] = {};
     double result = ArraysUtil.getAverageArithmeticOfArrayElements(testIntArray);
     assertEquals(Double.NaN,result);
    }
}



