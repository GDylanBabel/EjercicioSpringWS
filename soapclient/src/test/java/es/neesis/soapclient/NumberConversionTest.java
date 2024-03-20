package es.neesis.soapclient;

import es.neesis.soapclient.client.NumberConversionClient;
import es.neesis.soapclient.config.NumberConversionClientConfig;
import es.neesis.soapclient.config.UserClientConfig;
import es.neesis.soapclient.exception.NumberConversionException;
import es.neesis.soapclient.ws.numberConversion.NumberToDollarsResponse;
import es.neesis.soapclient.ws.numberConversion.NumberToWordsResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.math.BigDecimal;
import java.math.BigInteger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberConversionClientConfig.class, loader = AnnotationConfigContextLoader.class)

public class NumberConversionTest {

    @Autowired
    private NumberConversionClient client;

    @Test
    public void testNumberToDollar() {
        NumberToDollarsResponse response = this.client.getNumberToDollarsResponse(BigDecimal.valueOf(12.0));
        Assert.assertEquals("twelve dollars", response.getNumberToDollarsResult());
    }

    @Test
    public void testNumberToDollarDecimal() {
        NumberToDollarsResponse response = this.client.getNumberToDollarsResponse(BigDecimal.valueOf(12.55));
        Assert.assertEquals("twelve dollars and fifty five cents", response.getNumberToDollarsResult());
    }

    @Test
    public void testNumberToDollarNegative() {
        try {
            NumberToDollarsResponse response = this.client.getNumberToDollarsResponse(BigDecimal.valueOf(-12.0));
        } catch (NumberConversionException numberConversionException) {
            Assert.assertEquals("Invalid number introduced for conversion: -12,00", numberConversionException.getMessage());
        }
    }

    @Test
    public void testNumberToWords() {
        NumberToWordsResponse response = this.client.getNumberToWordsResponse(BigInteger.valueOf(12));
        Assert.assertEquals("twelve ", response.getNumberToWordsResult());
    }

    @Test
    public void testNumberToWordsNegative() {
        try {
            NumberToWordsResponse response = this.client.getNumberToWordsResponse(BigInteger.valueOf(-12));
        } catch (NumberConversionException exception) {
            Assert.assertEquals("Invalid number introduced for conversion: -12", exception.getMessage());
        }
    }
}
