package body;
import model.Covid;
import model.getStatistic;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class countryStatistic {

    @WebMethod
    public Covid countryStatistic(String country){
        for(Covid covid: getStatistic.getCovid()){
            if(covid.getCountry().equals(country)){
                return covid;
            }
        }
        return new Covid();
    }

}
