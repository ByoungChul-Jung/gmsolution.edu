public class NewsMachine implements Publisher {
    private ArrayList<Observer> observers;
    private String title;
    private String news;
    
	//NewsMachine 입니당
    public NewsMachine() {
        observers = new ArrayList<>();
    }
 
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }
 
    @Override
    public void delete(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }
 
    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(title, news);
        }
    }
    
	//퍼블릭 보이드 setNewsInfo
    public void setNewsInfo(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObserver();
		//주석이닷~!!!!
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getNews() {
        return news;
    }
}