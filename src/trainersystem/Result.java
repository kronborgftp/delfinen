package trainersystem;

import java.time.LocalDate;

public class Result {
    private String time;
    private LocalDate date;

    public Result(String time, LocalDate date) {
        this.time = time;
        this.date = date;
    }

    // Getter and Setter methods
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Result{" +
                "time='" + time + '\'' +
                ", date=" + date +
                '}';
    }
}

