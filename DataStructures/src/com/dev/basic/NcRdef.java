package com.dev.basic;

public class NcRdef {
    public static void main(String[] args) {
        int n=10;
        int r=3;
       int ans = ncR(n,r);
       System.out.println(ans);
    }

    private static int ncR(int n, int r) {
       /* nCr = n! / (r! * (n-r)!)
        Algorithm / Intuition
        We can optimize this calculation by the following observation.
                Assume, given r = 7, c = 4.
        Now, n = r-1 = 7-1 = 6 and r = c-1 = 4-1 = 3
        Let’s calculate 6C3 = 6! / (3! *(6-3)!) = (6*5*4*3*2*1) / ((3*2*1)*(3*2*1))
        This will boil down to (6*5*4) / (3*2*1)
        So, nCr = (n*(n-1)*(n-2)*.....*(n-r+1)) / (r*(r-1)*(r-2)*....1)*/
        
        int res=1;
        for(int i=0;i<r;i++){
            res=res+(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
