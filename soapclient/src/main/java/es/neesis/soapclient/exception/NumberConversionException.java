package es.neesis.soapclient.exception;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberConversionException extends RuntimeException {

    public NumberConversionException(BigDecimal decimal) {
        super(String.format("Invalid number introduced for conversion: %.2f", decimal));
    }

    public NumberConversionException(BigInteger integer) {
        super(String.format("Invalid number introduced for conversion: %d", integer));
    }
}
