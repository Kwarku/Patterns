package pl.narodzinyprogramisty.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer ob1 = new YtUser("user1");
        Observer ob2 = new YtUser("user2");
        Observer ob3 = new YtUser("user3");

        Subject youTube = new YouTube();
        youTube.subscribe(ob1);
        youTube.subscribe(ob2);
        youTube.subscribe(ob3);


        youTube.sandNotify("first update!");
        youTube.sandNotify("second update!");

        youTube.unSubscribe(ob2);

        youTube.sandNotify("third update!");
    }
}
