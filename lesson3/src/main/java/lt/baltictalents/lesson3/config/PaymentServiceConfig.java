package lt.baltictalents.lesson3.config;

import lt.baltictalents.lesson3.pattern.example.di.service.OnlinePaymentServiceImpl;
import lt.baltictalents.lesson3.pattern.example.di.service.PaymentService;
import lt.baltictalents.lesson3.pattern.example.di.service.mobilePaymentServiceImpl;
import lt.baltictalents.lesson3.pattern.example.legacy.EmailService;
import lt.baltictalents.lesson3.service.EmailServiceImpl;
import lt.baltictalents.lesson3.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentServiceConfig {
    @Bean
    public PaymentService mobilePaymentService() {

        return new mobilePaymentServiceImpl();
    }

    @Bean
    public PaymentService onlinePaymentService() {

        return new OnlinePaymentServiceImpl();
    }
}
