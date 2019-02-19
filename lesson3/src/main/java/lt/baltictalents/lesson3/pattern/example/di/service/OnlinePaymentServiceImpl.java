package lt.baltictalents.lesson3.pattern.example.di.service;

public class OnlinePaymentServiceImpl implements PaymentService {
    @Override
    public String sendPayment(String accNumber, Integer amount) {
        return "Account "+accNumber+ " has received "+amount+" euros via online payment";
    }


}
