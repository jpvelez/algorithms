import StdOut;

class GpaCalc {
  // Define keys and values for the symbol table.
  private String[] letter_grades = ['A+','A','A-','B+','B','B-','C+','C','C-','D','F']; // IS THIS VALID? IF NOT, READ FROM FILE?
  private String[] grade_points = ['4.33','4.00','3.67','3.00','2.67','2.33','2.00','1.67','1.00','0.00'];

  private void setTable(ArrayST table, String[] keys, String[] values){
    if (keys.length == values.length) {
      for (int i = 1; i < keys.length; i++){
        table.set(keys[i], values[i]);
      }
    } else {
      StdOut.println("You don't have the same number of keys and values!");
      throw new IOException; // WILL THIS WORK?
    }
  }

  public void main(){
    // Initialize symbol-table.
    table = ArrayST();
    // Insert key-value pairs into symbol table.
    setTable(table, keys, values); // IS THIS HOW YOU ACCESS ATTRS?
    // Compute GPA of letter grades streamed in from StdIn.
    float sum = 0;
    float count = 0;
    while (!StdIn.isEmpty()){
      String grade = StdIn.readString();
      sum += table.get(grade);
      count++;
    }
    float gpa = sum / count;
    StdOut.println('Your GPA is' + gpa) // CONVERT TO FLOAT!
  }

}
