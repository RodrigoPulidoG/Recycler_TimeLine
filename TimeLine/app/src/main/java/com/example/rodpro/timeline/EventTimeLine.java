package com.example.rodpro.timeline;


public class EventTimeLine {

    private int icon;
    private  String time, date, edn;

    public EventTimeLine(){

    }


    public EventTimeLine(int icon, String time, String date, String edn) {
        this.icon = icon;
        this.time = time;
        this.date = date;
        this.edn = edn;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEdn() {
        return edn;
    }

    public void setEdn(String edn) {
        this.edn = edn;
    }
}

