package interfaceEx;

import java.util.Random;

public class PlusGame implements IGame {

	Random rd = new Random();
	int num1, num2;
	
	@Override
	public void makeRandom() {
		// ������ ���� 2�� ����
		num1 = rd.nextInt(9)+1;
		num2 = rd.nextInt(9)+1;
	}

	@Override
	public String getQuizMsg() {
		// ��� ����
		// ������ �� 2���� ������ �ͼ�
		// 2+3=
		return ("QUIZ :: "+num1+" + "+num2+" = ");
	}

	@Override
	public boolean checkAnswer(int answer) {
		// �������� �ƴ��� ���θ� üũ
		if(answer == num1+num2)
			return true;
		else						
			return false;
	}

	
}
