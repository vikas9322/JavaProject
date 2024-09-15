import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {

        int totalStudent = 4;
        int totalMarks = 6;

        String[][] studentMarks = new String[totalStudent][totalMarks];

        studentMarks[0][0] = "Ganesh";
        studentMarks[0][1] = "1";
        studentMarks[0][2] = "2";
        studentMarks[0][3] = "3";
        studentMarks[0][4] = "4";
        studentMarks[0][5] = "5";

        studentMarks[1][0] = "Yash";
        studentMarks[1][1] = "1";
        studentMarks[1][2] = "2";
        studentMarks[1][3] = "3";
        studentMarks[1][4] = "4";
        studentMarks[1][5] = "5";

        studentMarks[2][0] = "Sameer";
        studentMarks[2][1] = "1";
        studentMarks[2][2] = "2";
        studentMarks[2][3] = "3";
        studentMarks[2][4] = "4";
        studentMarks[2][5] = "5";

        Arrays.deepToString(studentMarks);
        for (int i=0;i<studentMarks.length;i++){
            for (int j=0;j<studentMarks[i].length;j++){
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }


    }
}
