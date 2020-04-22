package model;

public class Covid {

    String country;
    int confirmedCases;
    int deaths;
    int recovered;

    public Covid(String country, int confirmedCases, int deaths, int recovered) {
        this.country = country;
        this.confirmedCases = confirmedCases;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public Covid() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(int confirmedCases) {
        this.confirmedCases = confirmedCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "Covid{" +
                "country='" + country + '\'' +
                ", confirmedCases=" + confirmedCases +
                ", deaths=" + deaths +
                ", recovered=" + recovered +
                '}';
    }
}
