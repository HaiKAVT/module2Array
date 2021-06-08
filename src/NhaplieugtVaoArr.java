import java.util.Scanner;

public class NhaplieugtVaoArr {
    public static void main(String[] args) {
        //nhập vào từng giá trị của mảng 2 chiều
//        int matrix[][] = new int[3][3];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter " + matrix.length + "rows and " + matrix[0].length + "columns : ");
//        for(int row = 0 ; row < matrix.length ; row++){
//            for(int column = 0; column < matrix[row].length; column++){
//                System.out.println();
//                matrix[row][column] = input.nextInt();
//            }
//        }
        //nhập vào giá trị phần tử của mảng từ bàn phím
//        int m,n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap dong:");
//        m = scanner.nextInt();
//        System.out.println("nhap cot:");
//        n = scanner.nextInt();
//        int arr[][] = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("arr["+i+"]["+j+"]=");
//                arr[i][j]=scanner.nextInt();
//            }
//        }
        //Nhập các giá trị ngẫu nhiên vào mảng
//        Scanner scanner = new Scanner(System.in);
//        int m, n;
//        System.out.println("nhap dong:");
//        m = scanner.nextInt();
//        System.out.println("nhap cot:");
//        n = scanner.nextInt();
//
//        int arr[][] = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = (int)(Math.random()*100);
//            }
//        }

        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap dong:");
        m = scanner.nextInt();
        System.out.println("nhap cot:");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]=");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            int total = 0;
            for (int i = 0; i < m; i++) {
                total += arr[i][j];

            }
            System.out.println("Sum for column " + n + " is "
                    + total);
        }

    }
}
