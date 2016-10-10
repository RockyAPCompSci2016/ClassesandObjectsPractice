
public class Student {
	private String studentName;
	private double totalTestScore;
	
public Student(String name, double score)
{
	studentName=name;
	totalTestScore=score;
}
public String getName()
{
	return studentName;
}
public void addQuiz(double addedScore)
{
	totalTestScore+=addedScore;
	
}
public double getTotalScore()
{
	return totalTestScore;
}
public double getAverageScore(double numberofScores)
{
	double zz=(totalTestScore)/(numberofScores);
	return zz;
}

}
