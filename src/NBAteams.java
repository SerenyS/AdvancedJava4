public enum NBAteams {
    BUCKS("BUC", "MILWAUKEE", "MIL"),
    RAPTORS("RAP", "TORONTO", "TOR"),
    CELTICS("CEL", "BOSTON", "BOS"),
    BULLS("BUL", "CHICAGO", "CHI");


    private String abr;
    private String city;
    private String cityAbbr;

    @Override
    public String toString() {
        return "NBAteams{" +
                "abr='" + abr + '\'' +
                ", city='" + city + '\'' +
                ", cityAbbr='" + cityAbbr + '\'' +
                '}';
    }

    NBAteams(String abr, String city, String cityAbbr) {
        this.abr = abr;
        this.city = city;
        this.cityAbbr = cityAbbr;
    }


    public String getAbr() {
        return abr.toUpperCase();
    }

    public void setAbr(String abr) {
        this.abr = abr;
        abr.toUpperCase();
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        city.toUpperCase();
    }



    public String getCityAbbr() {
        return cityAbbr;

    }
    public void setCityAbbr(String cityAbbr) {
        this.cityAbbr = cityAbbr;
        cityAbbr.toUpperCase();
    }
}
