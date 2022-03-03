public class Runner {
    public static boolean isDuplicate(int[][] array)
    {
        int temp = 0;
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                for (int k = 1; k < row; k++)
                {
                    temp = array[k][i];
                    if (temp == array[i][j] && j != k)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main (String[] args )
    {
        int[][] test =
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(isDuplicate(test));

        int[][] test1 =
                {{1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}};
        System.out.println(isDuplicate(test1));
    }
}
