package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void test1(){
    Calculator calculator = new Calculator();
    double value = calculator.calculate("10*2/20");
    assertEquals(1D, value);
  }
  
  //@Test
  //public void test2(){
  //  Calculator calculator = new Calculator();
  //  double value = calculator.calculate("200+200");
  //  assertEquals(300D, value);
  //}
}
