package observer.push;

public class ObserverA implements Observer{
	private int state = 0;
	
	public void update(int state){
		this.state = state;
	}
	
	public void getState(){
		System.out.println("oa 现在的状态为：" + state);
	}
}
