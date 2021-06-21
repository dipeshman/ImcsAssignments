package Day3.Assignmen2;

public class DemoArray
{
    public static void main(String[] args)
    {

        int firstArrayMatrix[][]={{1,1,1},
                                  {1,1,1}};    //  {firstArrayMatrix[0].length=3,firstArrayMatrix[1].length=3}
                                                        // firstArrayMatrix.length=2

        int secondArrayMatrix[][]={{2,2,2},
                                   {2,2,2}};
        System.out.println(firstArrayMatrix.length);
        System.out.println(firstArrayMatrix[0].length);
        printArray(firstArrayMatrix);
        printArray(secondArrayMatrix);
        printArray(addArray(firstArrayMatrix,secondArrayMatrix,2,3));
    }

    public static void printArray(int arr[][])

    {
        for (int i =0; i< arr.length;i++)
        {
            for (int j=0; j< arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }}

        public static int[][] addArray(int[][]arr1,int [][] arr2, int row, int column)
        {
            int sumArray[][] = new int[row][column];
            for(int i=0; i< arr1.length;i++){
                for(int j=0; j< arr1[i].length; j++)
                {
                    sumArray[i][j]=arr1[i][j]+arr2[i][j];
                }
        }return sumArray;
    }}
