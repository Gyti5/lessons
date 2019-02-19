/*package lt.baltictalents.lesson3.pattern.example.di;

import lt.baltictalents.lesson3.pattern.example.di.client.Client;
import lt.baltictalents.lesson3.pattern.example.di.injector.BankServiceInjector;
import lt.baltictalents.lesson3.pattern.example.di.injector.MobilePaymentInjector;
import lt.baltictalents.lesson3.pattern.example.di.injector.OnlinePaymentInjector;



public class BankRun {

    public static void main(String[] args) {
        String accountNumber = "LT00000000000000";
        Integer amount= 10;
        BankServiceInjector injector = null;
        Client app = null;





        // Send Online
        injector = new OnlinePaymentInjector();
        app = injector.getClient();
        app.processMessages(accountNumber, amount);

        // Send Mobile
        injector = new MobilePaymentInjector();
        app = injector.getClient();
        app.processMessages(accountNumber, amount);

    }

}
*/