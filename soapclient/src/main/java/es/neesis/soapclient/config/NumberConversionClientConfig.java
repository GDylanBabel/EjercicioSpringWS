package es.neesis.soapclient.config;

import es.neesis.soapclient.client.NumberConversionClient;
import es.neesis.soapclient.client.UserClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NumberConversionClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("es.neesis.soapclient.ws.numberConversion");
        return marshaller;
    }

    @Bean
    public NumberConversionClient userClient(Jaxb2Marshaller marshaller) {
        NumberConversionClient client = new NumberConversionClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
