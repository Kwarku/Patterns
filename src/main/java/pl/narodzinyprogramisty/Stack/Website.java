package pl.narodzinyprogramisty.Stack;

import java.time.LocalDateTime;

public class Website {
    private String url;
    private String title;
    private LocalDateTime timeStamp;

    public Website(String url, String title, LocalDateTime timeStamp) {
        this.url = url;
        this.title = title;
        this.timeStamp = timeStamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Website{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
