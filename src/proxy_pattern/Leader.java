package proxy_pattern;

public class Leader implements Work{
	private Work worker;
	
	public Leader(Work worker){
		this.worker = worker;
	}
	
	//领导分配员工解决问题
	public void solveProblem(){
		worker.solveProblem();
	}
}
