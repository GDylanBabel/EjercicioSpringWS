package es.neesis.soapclient.client;

import es.neesis.soapclient.exception.NumberConversionException;
import es.neesis.soapclient.ws.numberConversion.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberConversionClient extends WebServiceGatewaySupport {

    private ObjectFactory objectFactory;

    public NumberConversionClient() {
        this.objectFactory = new ObjectFactory();
    }

    public NumberToDollarsResponse getNumberToDollarsResponse(BigDecimal decimal) {
        NumberToDollars request = this.objectFactory.createNumberToDollars();
        if (decimal.doubleValue() < 0) {
            throw new NumberConversionException(decimal);
        }
        request.setDNum(decimal);
        return (NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public NumberToWordsResponse getNumberToWordsResponse(BigInteger integer) {
        NumberToWords request = this.objectFactory.createNumberToWords();
        if (integer.doubleValue() < 0) {
            throw new NumberConversionException(integer);
        }
        request.setUbiNum(integer);
        return (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
