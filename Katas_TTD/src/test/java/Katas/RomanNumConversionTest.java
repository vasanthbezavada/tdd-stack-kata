package Katas;

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumConversionTest {

    RomanNumConversion conversion = new RomanNumConversion();
    @Test
    public void check_RomanNumericalOrNot(){
        String value = "IIX";
        assertEquals("Not a Roman",conversion.convertToDecimal(value));
        String value2 = "XXLX";
        assertEquals("Not a Roman",conversion.convertToDecimal(value2));
    }
    @Test
    public void check_caseSensitive(){
        String value = "IIi";
        assertEquals("3",conversion.convertToDecimal(value));
        String value2 = "VIIi";
        assertEquals("8",conversion.convertToDecimal(value));
    }
    @Test
    public void check_conversionOutput(){
        String value = "DCC";
        assertEquals("700",conversion.convertToDecimal(value));
        String value2 = "MDCL";
        assertEquals("1650",conversion.convertToDecimal(value));    
    }


}
