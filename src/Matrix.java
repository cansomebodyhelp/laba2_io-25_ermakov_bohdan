import java.util.Scanner;
public class Matrix {
    private long [][] matrix;
    private long[][] transmatrix;
    public int stovp, ryadki;
    public void setMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків: ");
        stovp = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        ryadki = scanner.nextInt();
        matrix = new long[stovp][ryadki];
        for(short i = 0; i < stovp ; i ++){
            String stovpstr = String.valueOf((short) (i + 1));
            System.out.print("Введіть элементи стовпця №" + stovpstr +": ");
            for (short j = 0;j <ryadki;j++ ){
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public void printMatrix() {
        for(short i = 0; i < stovp ; i ++){
            for (short j = 0;j <ryadki;j++ ){
                if(j == ryadki-1 ){
                    System.out.print(matrix[i][j] +"\n");
                }
                else{
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
    public void setTransmatrix(){
        transmatrix = new long[ryadki][stovp];
        for(short i = 0; i < ryadki ; i ++){
            for (short j = 0;j <stovp;j++ ){
                transmatrix[i][j] = matrix[j][i];
            }
        }
    }
    public void printTransMatrix() {
        System.out.print("Транспонована матриця: \n");
        for(short i = 0; i < ryadki ; i ++){
            for (short j = 0;j <stovp;j++ ){
                if(j == stovp-1 ){
                    System.out.print(transmatrix[i][j] +"\n");
                }
                else{
                    System.out.print(transmatrix[i][j]+" ");
                }
            }
        }
    }
    public void summStovp(){
        int result = 0;
        for(int i = 0;i < stovp;i++){
            int dodan = 0;
            for (int j = 0;j < ryadki;j++){
                if (j == 0 || transmatrix[j][i] < dodan) {
                    dodan = (int) transmatrix[j][i];
                }
                if(j == ryadki - 1){
                    if (transmatrix[j][i] < dodan){
                        dodan = (int) transmatrix[j][i];
                    }
                    result += dodan;
                }
            }
        }
        System.out.print("Сумма найменших членів кожного стовпця дорівнює " + result);
    }
}
