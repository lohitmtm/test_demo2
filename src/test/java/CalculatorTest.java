import junit.framework.TestCase;
public class CalculatorTest extends TestCase
{
Calculator cal=new Calculator();
public void testadd() 
{
assertEquals(3,cal.add(1,1));
}
}
