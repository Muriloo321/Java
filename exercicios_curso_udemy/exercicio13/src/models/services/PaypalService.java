package models.services;

public class PaypalService implements OnlinePaymentService{


    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, Integer months) {
        return amount * ((double) months / 100);
    }
}
