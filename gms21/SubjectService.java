package gms21;

public class SubjectService {

	public String res(String hakbun,
			String namea,
			String subjName,
			int score) {
		
		return String.format("�й� :%s\n"
				+ "�̸� :%s\n"
				+ "�����̸�: %s\n"
				+ "���� :%s\n",hakbun,namea,subjName,score); 
	}

}
