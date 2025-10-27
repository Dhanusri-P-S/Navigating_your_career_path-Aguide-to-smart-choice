package CareerRecommendation;
public class StudentEvaluationDTO {
    private Integer psychometricScore;
    private String chosenGroup;
    private Integer groupScore;
    private String chosenInterest;
    private Integer interestScore;
	public Integer getPsychometricScore() {
		return psychometricScore;
	}
	public void setPsychometricScore(Integer psychometricScore) {
		this.psychometricScore = psychometricScore;
	}
	public String getChosenGroup() {
		return chosenGroup;
	}
	public void setChosenGroup(String chosenGroup) {
		this.chosenGroup = chosenGroup;
	}
	public Integer getGroupScore() {
		return groupScore;
	}
	public void setGroupScore(Integer groupScore) {
		this.groupScore = groupScore;
	}
	public String getChosenInterest() {
		return chosenInterest;
	}
	public void setChosenInterest(String chosenInterest) {
		this.chosenInterest = chosenInterest;
	}
	public Integer getInterestScore() {
		return interestScore;
	}
	public void setInterestScore(Integer interestScore) {
		this.interestScore = interestScore;
	}
    
}
