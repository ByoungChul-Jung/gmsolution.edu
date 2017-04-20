/*
 * 메인 클래스입니다.
 */
public class MainClass {
    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber as = new AnnualSubscriber(newsMachine);
        EventSubscriber es = new EventSubscriber(newsMachine);
         
        newsMachine.setNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
        newsMachine.setNewsInfo("벛꽃 축제합니다", "다같이 벚꽃보러~");
		//벚꽃 축제는 난 누구랑 가지?
    }
}