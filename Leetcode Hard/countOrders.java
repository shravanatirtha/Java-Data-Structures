/*
Given n orders, each order consist in pickup and delivery services. 

Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i). 

Since the answer may be too large, return it modulo 10^9 + 7.

*/  
public class countOrders {
    public int countorders(int n) {
        long res = 1;
        long mod = (long)1e9 + 7;
       for (int i = 1; i <= n; ++i)
           res = res * (i * 2 - 1) * i % mod;
       return (int)res;
   }
}
