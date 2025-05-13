package logger;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityLogger {

    private static ActivityLogger instance;
    private final List<String> logList;
  
    private ActivityLogger() {
        this.logList = new ArrayList<>();
    }

    public static ActivityLogger getInstance() {
        if (instance == null){
        instance = new ActivityLogger();
        }
        return instance;
    }

    public void logActivity(String message) {
        this.logList.add("Date: " + new Date() + "- message: " + message);
    }

    public List<String> getActivityLog() {
        return this.logList;
    }
    
}
