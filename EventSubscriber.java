public class EventSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;
     
    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }
     
    @Override
    public void update(String title, String news) {
        newsString = title + "\n------------------------------------\n" + news;
        display();
    }
     // conflict test
	//�군가 �자리에 �스�건드린다�?
    public void display() {
        System.out.println("\n\n=== �벤�� ===");
        System.out.println("\n\n" + newsString);
    }
}