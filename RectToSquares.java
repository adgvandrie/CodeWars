import java.util.List;
import java.util.ArrayList;

public class SqInRect {

	public static List<Integer> sqInRect(int lng, int wdth) {
		//Return null if length is equal to width
    if (lng == wdth) {
      return null;
    }
    
    //Initital variables set to default values
    List<Integer> answer = new ArrayList<Integer>();
    int rectSquares = lng * wdth;
    int currentSquare = 0;
    int currentSqrt = 0;
    int currentLng = lng;
    int currentWdth = wdth;
    boolean lngLonger = false;

    for (int i = rectSquares; i > 0;) {
    //Find the first square to start at, i.e. 9 in the example given, then the current square thereafter
    //Also find the sqrt of the current square and determine whether the length or the width is longer.
		  if (currentLng < currentWdth) {
        currentSquare = currentLng * currentLng;
        currentSqrt = currentLng;
        lngLonger = false;
      } else {
        currentSquare = currentWdth * currentWdth;
        currentSqrt = currentWdth;
        lngLonger = true;
      }

      //Subtract the square from the remaining number of 1 x 1 squares in the rectangle.
      i -= currentSquare;
      answer.add(currentSqrt);

      //If true, we changed the length, but not the width. If false, we changed the width, but not the length.
      if (lngLonger) {
        currentLng = i / currentWdth;
      } else {
        currentWdth = i / currentLng;
      }

    }
    return answer;
	}
}
