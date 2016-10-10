
public class StudentTester {

	public static void main(String[] args) {
		Student Adrian= new Student("Adrian Kley", 93.1);
		Adrian.addQuiz(93.3);
		System.out.println(Adrian.getName());
		//System.out.println(Adrian.addQuiz(93.3));
		System.out.println(Adrian.getTotalScore());
		System.out.println(Adrian.getAverageScore(2));
	}

}
