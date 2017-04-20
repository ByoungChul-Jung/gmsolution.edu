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
	//„êµ°ê°€ ´ìë¦¬ì— ŒìŠ¤ë¥ê±´ë“œë¦°ë‹¤ë©?
    public void display() {
        System.out.println("\n\n=== ´ë²¤ ì ===");
        System.out.println("\n\n" + newsString);
    }
}