
public class Grade {
   public static String getLetterGrade(int mark) {
      // assume that mark is between 0 and 100 (inclusive)
      assert (mark >= 0 && mark <= 100) : "mark is out-of-range: " + mark;
      if (mark >= 75) {
         return "Very good"; 
      } else if (mark >= 60) {
         return "Good";
      } else if (mark > 50) {   // an logical error here
         return "Average";
      } else if(mark > 40){
         return "Below Average";
      }else{
    	  return "Unclassified";
      }
   }
}
