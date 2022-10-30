public class Q68 {
    

    static int[][] arr;
    static int[] arr1={133,88,92,221,174,208,259,106};
    static int[] arr2={100,133,174,106};
    public static void Initialize(int size)
    {
        arr=new int[size][10];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<10;j++)
            {
                arr[i][j]=0;
            }
        }
    }
    public static void Hashing(int size,int length)
    {
        for(int i=0;i<length;i++)
        {
            int p=arr1[i];
            int x=(p)%size;
            if(arr[x][0]==0)
            {
                arr[x][0]=arr1[i];
            }
            else
            {
                int j=0;
                while(arr[x][j]!=0)
                {
                    j++;
                }
                arr[x][j]=arr1[i];
            }
        }
    }
    public static void Rehash(int size,int new_size)
    {
        for(int i=13;i<size;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(arr[i][j]!=0)
                {
                    int p=arr[i][j];
                    arr[i][j]=0;
                    int x=p%new_size;
                    if(arr[x][0]==0)
                    {
                        arr[x][0]=p;
                    }
                    else
                    {
                        int t=0;
                        while(arr[x][t]!=0)
                        {
                            t++;
                        }
                        arr[x][t]=p;
                    }
                }
            }
        }
    }
    public static void check(int size,int new_size)
    {
        for(int i=0;i<arr2.length;i++)
        {
            int p=arr2[i];
            int z=(p)%size;
            int t=0;
            if(z<13)
            {
                int j=0;
                if(arr[z][0]==p)
                {
                    System.out.println(p+"--YES");
                    t=1;
                }
                else
                {
                    while(arr[z][j]!=0)
                    {
                        if(arr[z][j]==p)
                        {
                            t=1;
                            System.out.println(p+"--YES");
                        }
                        j++;
                    }
                }
            }
            else
            {
                z=p%new_size;
                int j=0;
                if(arr[z][0]==p)
                {
                    System.out.println(p+"--YES");
                    t=1;
                }
                else
                {
                    while(arr[z][j]!=0)
                    {
                        if(arr[z][j]==p)
                        {
                            t=1;
                            System.out.println(p+"--YES");
                        }
                        j++;
                    }
                }
            }
            if(t==0)
            {
                System.out.println(p+"--NO");
            }
        }
    }
    public static void main()
    {
        Initialize(17);
        Hashing(17,8);
        Rehash(17,13);
        for(int j=0;j<17;j++)
        {
            for(int i=0;i<10;i++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        check(17,13);
    }
}

