import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,2,10,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị cần xóa : ");
        int x = scanner.nextInt();
       int indexDel = 0;
        for(int i =  0; i < arr.length ; i++){
            if(arr[i] == x){
              indexDel = i ;
               break;
            }
        }
        for(int i = indexDel; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=0;

        System.out.println("số phần từ còn lại khi xóa " + x + " là : ");
        for(int i =0; i < arr.length ; i++){
            System.out.print(arr[i] + " \t " );
        }
    }

}
