package model;
import java.util.List;
import java.util.ArrayList;

public class getStatistic {

    public static List<Covid> getCovid() {
        List<Covid> covidList = new ArrayList<Covid>();
        covidList.add(new Covid("United States", 826258,45382,75519));
        covidList.add(new Covid("Spain", 208389,21717,4420));
        covidList.add(new Covid("Italy", 183957,24648,51600));
        return covidList;
    }
}
