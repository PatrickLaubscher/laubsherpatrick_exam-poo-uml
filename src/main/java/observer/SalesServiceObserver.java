package observer;

public class SalesServiceObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println(message);
    }

}
