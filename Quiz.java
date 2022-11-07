class Quiz implements Measurable {
  private double score;
  private String grade;

  public Quiz(double aScore, String aGrade) {
    this.score = aScore;
    this.grade = aGrade;
  }

  public double getMeasure() {
    return score;
  }

  public String getGradeString() {
    return grade;
  }
}

class QuizTester {
  public static void main(String[] args) {
    DataSet quizData = new DataSet();

    Quiz q1 = new Quiz(85, "B");
    Quiz q2 = new Quiz(93, "A-");
    Quiz q3 = new Quiz(78, "C+");

    quizData.add(q1);
    quizData.add(q2);
    quizData.add(q3);
    System.out
        .println("Maximum: " + quizData.getMaximum().getMeasure() + ",  " + quizData.getMaximum().getGradeString());
    System.out.print("Average: ");
    System.out.printf("%.2f\n", quizData.getAverage());
  }
}
