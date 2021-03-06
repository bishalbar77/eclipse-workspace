package hackerrank;

import java.io.*;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
        year -= (month < 3) ? 1 : 0; 
        int count = ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        String dayName;
        switch(count)
        {
            case 1:
            dayName = "MONDAY";
            break;
            case 2:
            dayName = "TUESDAY";
            break;
            case 3:
            dayName = "WEDNESDAY";
            break;
            case 4:
            dayName = "THRUSDAY";
            break;
            case 5:
            dayName = "FRIDAY";
            break;
            case 6:
            dayName = "SATURDAY";
            break;
            case 7:
            dayName = "SUNDAY";
            break;
            default:
            dayName = "" + count;
        }
        return dayName;
    }

}

public class CalenderLogicBased {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}