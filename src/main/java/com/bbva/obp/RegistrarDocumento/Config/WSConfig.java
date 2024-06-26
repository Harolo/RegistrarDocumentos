package com.bbva.obp.RegistrarDocumento.Config;

import com.bbva.obp.RegistrarDocumento.obp.SOAPRegistroClient;
import com.bbva.obp.RegistrarDocumento.Utils.AppProperties;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
@EnableWs
public class WSConfig {

    @Autowired
    private AppProperties appProperties;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bbva.obp.RegistrarDocumento.wsdl");
        return marshaller;
    }

    @Bean
    public SOAPRegistroClient soapRegistroClient(Jaxb2Marshaller marshaller) {
        SOAPRegistroClient client = new SOAPRegistroClient();
        client.setDefaultUri(appProperties.getSoapWebServiceURI());
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }


    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() {
        Wss4jSecurityInterceptor interceptor = new Wss4jSecurityInterceptor();
        interceptor.setSecurementActions(WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.USERNAME_TOKEN);

        interceptor.setSecurementActions("UsernameToken");
        interceptor.setSecurementUsername(appProperties.getUsername());
        interceptor.setSecurementPassword(appProperties.getPassword());
        interceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        return interceptor;
    }

    @Bean
    public HttpComponentsMessageSender messageSender() {
        RequestConfig config = RequestConfig
                .custom()
                .setProxy(new HttpHost(appProperties.getProxyHost(), appProperties.getProxyPort()))
                .build();
        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(config)
                .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
                .build();
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender(httpClient);
        return messageSender;
    }


}
