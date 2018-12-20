package gms21;

public class SubjectService {

	public String res(String hakbun,
			String namea,
			String subjName,
			int score) {
		
		return String.format("학번 :%s\n"
				+ "이름 :%s\n"
				+ "강사이름: %s\n"
				+ "점수 :%s\n",hakbun,namea,subjName,score); 
	}

}
