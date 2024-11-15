package SixMinuteInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTests {

    @Test
    public void test_1() {

        String originalNumber = "+1(858)775-2868";
        String strippedNumber = "+18587752868";
        String northAmericanNumber = "(858)775-2868";
        String internationalNumber = "+1.858.775.2868";
        PhoneNumber ph = new PhoneNumber(originalNumber);

        assertEquals( originalNumber, ph.OriginalNumber(),"[" + originalNumber + "]Original Number");
        assertEquals( strippedNumber, ph.StrippedNumber(),"[" + strippedNumber + "]Stripped Number");
        assertEquals( northAmericanNumber, ph.NorthAmericanNumber(),"[" + northAmericanNumber + "]North American Number");
        assertEquals( internationalNumber, ph.InternationalNumber(),"[" + internationalNumber + "]International Number");
    }

    @Test
    public void test_2() {

        String originalNumber = "+1(858)775-2868x123";
        String strippedNumber = "+18587752868x123";
        String northAmericanNumber = "(858)775-2868";
        String internationalNumber = "+1.858.775.2868x123";
        PhoneNumber ph = new PhoneNumber(originalNumber);

        assertEquals( originalNumber, ph.OriginalNumber(),"[" + originalNumber + "]Original Number");
        assertEquals( strippedNumber, ph.StrippedNumber(),"[" + strippedNumber + "]Stripped Number");
        assertEquals( northAmericanNumber, ph.NorthAmericanNumber(),"[" + northAmericanNumber + "]North American Number");
        assertEquals( internationalNumber, ph.InternationalNumber(),"[" + internationalNumber + "]International Number");
    }

    @Test
    public void test_3() {

        String originalNumber = "+598.123.4567x858";
        String strippedNumber = "+5981234567x858";
        String northAmericanNumber = null;
        String internationalNumber = "+598.123.456.7x858";
        PhoneNumber ph = new PhoneNumber(originalNumber);

        assertEquals( originalNumber, ph.OriginalNumber(),"[" + originalNumber + "]Original Number");
        assertEquals( strippedNumber, ph.StrippedNumber(),"[" + strippedNumber + "]Stripped Number");
        assertEquals( northAmericanNumber, ph.NorthAmericanNumber(),"[" + northAmericanNumber + "]North American Number");
        assertEquals( internationalNumber, ph.InternationalNumber(),"[" + internationalNumber + "]International Number");
    }

    @Test
    public void test_4() {

        String originalNumber = "+27 1234 5678 ext 4";
        String strippedNumber = "+2712345678x4";
        String northAmericanNumber = null;
        String internationalNumber = "+27 1234 5678 ext 4";
        PhoneNumber ph = new PhoneNumber(originalNumber);

        assertEquals( originalNumber, ph.OriginalNumber(),"[" + originalNumber + "]Original Number");
        assertEquals( strippedNumber, ph.StrippedNumber(),"[" + strippedNumber + "]Stripped Number");
        assertEquals( northAmericanNumber, ph.NorthAmericanNumber(),"[" + northAmericanNumber + "]North American Number");
        assertEquals( internationalNumber, ph.InternationalNumber(),"[" + internationalNumber + "]International Number");
    }

    @Test
    public void test_5() {

        String originalNumber = "858-775-2868";
        String strippedNumber = "+18587752868";
        String northAmericanNumber = "(858)775-2868";
        String internationalNumber = "+1.858.775.2868";
        PhoneNumber ph = new PhoneNumber(originalNumber);

        assertEquals( originalNumber, ph.OriginalNumber(),"[" + originalNumber + "]Original Number");
        assertEquals( strippedNumber, ph.StrippedNumber(),"[" + strippedNumber + "]Stripped Number");
        assertEquals( northAmericanNumber, ph.NorthAmericanNumber(),"[" + northAmericanNumber + "]North American Number");
        assertEquals( internationalNumber, ph.InternationalNumber(),"[" + internationalNumber + "]International Number");
    }
}
