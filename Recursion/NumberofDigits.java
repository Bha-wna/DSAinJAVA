class NumberofDigits
{
  public static int Noofdigits(int n)
  {
    if(n/10==0)
      return 1;
    return Noofdigits(n/10) + 1;
  }
  
  public static void main(String[] args)
  {
    int n= -1000;
    System.out.println(Noofdigits(n));
  }
}