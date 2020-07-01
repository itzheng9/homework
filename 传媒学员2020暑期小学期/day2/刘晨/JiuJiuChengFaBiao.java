public class JiuJiuChengFaBiao {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (a = 1;a < 10; ++a)//决定行数
        {
            for (b = 1; b <= a; ++b)//决定每一行的列数
            {
                if ((a*b) < 10)
                {
                    System.out.print(a + "*" + b + "=" + " " + (a*b) + " ");
                }
                else if ((a*b) >= 10)
                {
                    System.out.print(a + "*" + b + "=" + (a*b) + " ");
                }
            }
            System.out.println();//换行，在a变化时进行换行
        }
    }
}
