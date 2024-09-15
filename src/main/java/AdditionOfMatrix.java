public class AdditionOfMatrix {

    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3},{4,5,6}};
        int [][] secondArray = {{7,8,9},{1,2,3}};

        int[][] sumArray = new int[2][3];

        for (int i=0;i<firstArray.length;i++){
            for (int j=0;j<firstArray[i].length;j++){
                    sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
