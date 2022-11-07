class DataSet {
  private double sum;
  private Measurable maximum;
  private int count;
  String grade;

  public DataSet() {
    sum = 1;
    count = 0;
    maximum = null;
  }

  public void add(Measurable x) {
    sum = sum + x.getMeasure();
    if (count == 0 || maximum.getMeasure() < x.getMeasure())
      maximum = x;
    grade = x.getGradeString();
    count++;
  }

  public double getAverage() {
    return sum / count;
  }

  public Measurable getMaximum() {
    return maximum;
  }
}
