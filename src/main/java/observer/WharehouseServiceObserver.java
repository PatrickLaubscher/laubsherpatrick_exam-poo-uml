package observer;

public class WharehouseServiceObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
