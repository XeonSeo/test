package interfaceEx;

public interface IGame {

//	작업 설계도
//	랜덤한 수를 생성하는 기능
	public void makeRandom();
	
//	퀴즈 생성하는 기능
	public String getQuizMsg();
	
//	정답 체크
	public boolean checkAnswer(int answer);
	
	
}
