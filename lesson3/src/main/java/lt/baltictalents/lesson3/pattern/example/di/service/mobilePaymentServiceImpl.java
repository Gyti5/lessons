package lt.baltictalents.lesson3.pattern.example.di.service;

public class mobilePaymentServiceImpl implements PaymentService {
    @Override
    public String sendPayment(String msg, Integer amount) {
        return "Account "+msg+ " has received "+amount+" euros via mobile payment";

    }


}
