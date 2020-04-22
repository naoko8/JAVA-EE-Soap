package body;

import model.Covid;
import model.getStatistic;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class totalConfirmed {
    int helper=0;
    @WebMethod
    public int sumOfConfirmed() {

        for(Covid x: getStatistic.getCovid()){
            helper+=x.getConfirmedCases();
        }
        return helper;
    }
}
