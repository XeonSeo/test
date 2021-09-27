package interfaceEx;

import java.util.Random;

public class PlusGame implements IGame {

	Random rd = new Random();
	int num1, num2;
	
	@Override
	public void makeRandom() {
		// 랜덤한 수를 2개 생성
		num1 = rd.nextInt(9)+1;
		num2 = rd.nextInt(9)+1;
	}

	@Override
	public String getQuizMsg() {
		// 퀴즈를 출제
		// 랜덤한 수 2개를 가지고 와서
		// 2+3=
		return ("QUIZ :: "+num1+" + "+num2+" = ");
	}

	@Override
	public boolean checkAnswer(int answer) {
		// 정답인지 아닌지 여부를 체크
		if(answer == num1+num2)
			return true;
		else						
			return false;
	}

	
}
