package proxy_pattern;

public class Leader implements Work{
	private Work worker;
	
	public Leader(Work worker){
		this.worker = worker;
	}
	
	//�쵼����Ա���������
	public void solveProblem(){
		worker.solveProblem();
	}
}
