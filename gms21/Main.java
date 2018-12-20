package gms21;

import javax.swing.JOptionPane;

public class Main {
 public static void main(String[] args) {
	 Studentbean studentbean = null;
	 StudentbeenService service = null;
	 Subjectbean subjectbean  = null;
	 SubjectService service2 = null;
	while(true) {
		/**
		 * 성정표에 표시될 내용
		 * 학번(student)
		 * 학생이름(student)
		 * 과목명(subject)
		 * 점수(subject)
		 * 
		 * */
		
		switch(JOptionPane.showInputDialog("0.종료"
				+ "1.학생부 등록\n"
				+ "2.비밀번호 변경\n"
				+ "3,학생정보보기\n"
				+ "4.수강과목,교수,점수\n"
				+ "5.성적표 보기\n"
				
				)) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다");
				return;
			case "1":
				service = new StudentbeenService();
				
				String name =	JOptionPane.showInputDialog("학생이름");
				String ssn	=	JOptionPane.showInputDialog("주민등록번호");
				String pass =	JOptionPane.showInputDialog("비밀번호 ");
				studentbean = new Studentbean();
				studentbean.setName(name);
				studentbean.setSsn(ssn);
				studentbean.setPass(pass);
				studentbean.setHakbun(service.hakbun());
				break;
			case "2":
				String pass1  = JOptionPane.showInputDialog("비밀번호를 변경하시오");
				JOptionPane.showMessageDialog(null,studentbean.getPass());
				break;
			case "3":
				JOptionPane.showMessageDialog(null,
						studentbean.toString());
				break;
			case "4":
				subjectbean = new Subjectbean();
				String subject = JOptionPane.showInputDialog("과목을 입력하세요");
				String profName = JOptionPane.showInputDialog("교수");
				String score = JOptionPane.showInputDialog("점수");
				subjectbean.setSubjName(subject);
				subjectbean.setProfName(profName);
				subjectbean.setScore(Integer.parseInt(score));
				break;
			case "5":
				service2 = new SubjectService();
				
				
				String res =  service2.res(studentbean.getHakbun(),
						studentbean.getNamea(),
						subjectbean.getSubjName(),
						subjectbean.getScore());
				JOptionPane.showMessageDialog(null,res);
				break;
		}
	}
}
}
