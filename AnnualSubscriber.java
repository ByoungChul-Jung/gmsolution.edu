public class AnnualSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;
     
    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }
	/*
	Conflict를 언제 낼 수 있을까


	*/
     
    @Override
    public void update(String title, String news) {
        this.newsString = title + " \n -------- \n " + news;
        display();
    }
 
    private void display() {
        System.out.println("\n\n오늘의 뉴스\n============================\n\n" + newsString);
	System.out.println("끗!");
    }
	//오늘은 아침, 점심, 저녁을 다먹었다. 다이어트 개망
	//헬스도 안감
}