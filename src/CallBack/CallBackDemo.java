package CallBack;

/**
 * Created by wings on 2018/7/11.
 */
public class CallBackDemo {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber();
        subscriber.subscribeEvent();

    }

}

class Subscriber {

    public void subscribeEvent() {

        new Watcher(new Listener() {

            @Override
            public void notifyOther() {
                //  received notice

                // then do something
            }
        });
    }
}

class Watcher {
    private Listener mListener;

    public Watcher(Listener listener) {
        this.mListener = listener;
        start();
    }

    public void start() {
        // watching

        //then something happened, need notifyOthers
        if (mListener != null) {
            mListener.notifyOther();
        }
    }

}

interface Listener {
    void notifyOther();
}