package Day3.Assignment3;

public class JaggedArray
{
    public static void main(String[] args)
    {
        String [][] array = new String[4][4];
        array[0][0]="Tony";
        array[0][1]="JAVA";
        array[0][2]="C";
        array[0][3]="C++";
        array[1][0]="Thomas";
        array[1][1]="JAVA";
        array[1][2]="UNX";
        //array[1][3]=[][];
        array[2][0]="Dinil";
        array[2][1]="Linux";
        array[2][2]="Oracle";
        //array[2][3]="";
        array[3][0]="Delvin";
        array[3][1]="RDBMS";
        array[3][2]="C#";
        array[3][3]="ORACLE";

        for(int i=0;i< array[3].length;i++)
        {
            System.out.print(array[3][i]+" ");
           // System.out.println(array[3][0]+ " is taking "+ array[3][1]+" ,"+array[3][2]+", and"+array[3][3]+".");
        }
    }
}