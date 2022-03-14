class Power
{
  public static int xpowern(int x,int n)
  {
    if(n==1)
     return x;
    if(n==0)
      return 1;
    return xpowern(x,n-1)*x ;
  }
 public static void main(String [] args)
 {
  int x=2;
  int n=0;
  System.out.print(xpowern(x,n));
 }
}