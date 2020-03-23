import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        int[] asset;

        do{
            System.out.print("Nhap vao so luong nguoi : ");
            size = input.nextInt();
            if (size>20){
                System.out.println("Vui long nhap it hon 20");
            }
        } while (size>20);

        asset = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.printf("Vui long tai san nguoi %d (don vi : Ty USD)",i+1);
            asset[i] = input.nextInt();
        }
        int max = findMax(asset);
        int index = findIndexOfMax(asset);

        System.out.printf("Tai san lon nhat la %d Ty USD, tai vi tri %d",max,index);
    }

    static int findMax (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int findIndexOfMax (int[] array){
        int max = findMax(array);
        int index=0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == max){
                index = i+1;
                break;
            }
        }
        return index;
    }
}


//comment cua binh