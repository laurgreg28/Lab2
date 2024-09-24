import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

class Meeting extends Event implements Completable{
    LocalDateTime endDateTime;
    String location;
    boolean complete;

    Meeting(String name, LocalDateTime start, LocalDateTime end, String location){
            super(name, start);
    }

    @Override
    public void complete() {
        complete = true;
    }

    public boolean isComplete() {
        return complete;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
    public Duration getDuration() {
        return Duration.between(dateTime, endDateTime);
    }

    public String getLocation() {
        return location;
    }
    public void setEndDateTime(LocalDateTime end){
        this.endDateTime = end;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
