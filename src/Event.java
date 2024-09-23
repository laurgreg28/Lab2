import java.util.*;
public abstract class Event implements Comparable<Event> {
    String name;
    Date dateTime;
    public String getName(){
        return name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Event o) {
        return 0;
    }
}