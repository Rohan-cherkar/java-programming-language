import java.util.*;
public class Array2D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=sc.nextInt();
        System.out.println("enter the no of columns");
        int m=sc.nextInt();
        int arr2D[][]=new int[n][m];
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.println("enter the elements for "+i+" "+j);
                arr2D[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                System.out.print(arr2D[i][j]+" ");
                
            }
            System.out.println();
        }

        // Search(arr2D,45);
        // SpiralMatrix(arr2D);
        // if(n==m){
        // DiagonalSum(arr2D);
        // }
        // else {
        //     System.out.println("Enter the same values of rows and columns");
        // }

        StareCaseSearch(arr2D,45);
        
    }


    // search element in 2D array
    public static boolean Search(int arr2D[][],int key){
        for(int i=0;i<=arr2D.length-1;i++){
            for(int j=0;j<=arr2D[0].length-1;j++){
                if(arr2D[i][j]==key){
                    System.out.println("the element is present at index ("+i+" "+j+")");
                    return true;
                }
                
            }
        }

        return false;
    }

    // spiral matrix
    public static void SpiralMatrix(int matrix[][]){
        int SR=0;
        int ER=matrix.length-1;
        int SC=0;
        int EC=matrix[0].length-1;
        while(SR<=ER && SC<=EC){
            for(int j=SC;j<=EC;j++){
                System.out.print(matrix[SR][j]+" ");

            }
            for(int i=SR+1;i<=ER;i++){
                System.out.print(matrix[i][EC]+" ");
            }
            for(int j=EC-1;j>=SC;j--){
                System.out.print(matrix[ER][j]+" ");
            }
            for(int i=ER-1;i>=SR+1;i--){
                System.out.print(matrix[i][SC]+" ");
            }
            SC++;
            EC--;
            SR++;
            EC--;

        }
        System.out.println();
    }

    // sum of diagonal of matrix
    public static void DiagonalSum(int matrix[][]){
        int sum=0;
        
        for(int i=0;i<=matrix.length-1;i++){
            sum=sum + matrix[i][i]; 
            int j=matrix.length-1-i;
            if(i==j){
                continue;
            }
            sum=sum+ matrix[i][j];
            
        }
        System.out.println(sum);
    }

    // stairCase search in matrix
    public static void StareCaseSearch(int matrix[][], int key){
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<=matrix[0].length){
            if(key==matrix[row][col]){
                System.out.println("the element is present on index ("+row +"," +col+")");
                break;
            }else if(matrix[row][col]>key){
                row--;
            }else{
                col++;
            }
        }
    }
}