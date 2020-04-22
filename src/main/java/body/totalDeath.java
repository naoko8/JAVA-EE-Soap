package body;

import model.Covid;
import model.getStatistic;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class totalDeath {

    int helper=0;
    @WebMethod
    public int sumOfDeath() {

        for(Covid x: getStatistic.getCovid()){
            helper+=x.getDeaths();
        }
        return helper;
    }
}
