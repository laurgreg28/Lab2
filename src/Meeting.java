import java.util.*;

abstract class Meeting extends Event implements Completable{
    Date endDateTime;
    String location;
}
