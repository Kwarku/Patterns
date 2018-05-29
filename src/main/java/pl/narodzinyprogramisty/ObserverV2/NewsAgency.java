package pl.narodzinyprogramisty.ObserverV2;

import java.util.ArrayList;
import java.util.List;
/**
 * Watched
 *
 *This is watched class because other object observed him.
 * */
public class NewsAgency {
    private List<Channel> channels = new ArrayList<>();

    public void add(Channel chanel) {
        if (!channels.contains(chanel)) {
            channels.add(chanel);
        }
    }

    public void remove(Channel chanel) {
        if (channels.contains(chanel)) {
            channels.remove(chanel);
        }
    }

    public void notify(String news){
        for (Channel channel : channels) {
            channel.update(news);
        }
    }
}
