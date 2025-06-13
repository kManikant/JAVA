public class transpose {
    public static void main(String[] args) {
        int[][] arr={{21,34,52,60},
                    {23,12,54,66},
                    {26,67,34,87},
                    {58,99,83,51}};
        transpose_(arr);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose_(int[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=row+1;col<arr[0].length;col++){
                int temp= arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }

    }
}
