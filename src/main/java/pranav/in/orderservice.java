package pranav.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class orderservice
{
    private paymentservice paymentservice;
    @Autowired
    public orderservice(paymentservice paymentservice)
    {
        this.paymentservice = paymentservice  ;
    }
    public void order()
    {
        System.out.println("order placed");
        paymentservice.pay() ;
    }
}
