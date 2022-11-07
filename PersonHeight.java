public class PersonHeight {
  public static void main(String[] args) {
    DataSet personData = new DataSet();
    Quiz[] quiz = new Quiz[3];
    quiz[0] = new Quiz(165, "Sakib");
    quiz[1] = new Quiz(175, "Aziz");
    quiz[2] = new Quiz(180, "Masuk");

    personData.add(quiz[0]);
    personData.add(quiz[1]);
    personData.add(quiz[2]);

    System.out.println("Person : " + personData.getMaximum().getGradeString() + " , Maximum Height: "
        + personData.getMaximum().getMeasure());
    System.out.print("Average: ");
    System.out.printf("%.2f\n", personData.getAverage());
  }
}