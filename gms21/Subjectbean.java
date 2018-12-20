package gms21;

public class Subjectbean {
	private String subjName,profName;
	private int score;
 
	public String getSubjName() {
		return subjName;
	}
	public String getProfName() {
		return profName;
	}
	public void setSubjName(String sub) {
		this.subjName  = sub;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}




 	
 	public String toString(String hakbun) {
 		return String.format("해당과목 : %s\n"
 				+ "%s\n"
 				+ "%s\n"
 				+ "%s"
 				,subjName,profName,score,hakbun);
 	}

}
