public class oddFactorsMethod
{
  public static void main (String[] args)
  {
    System.out.println(anyOddFactors(1));
    System.out.println(anyOddFactors(0));
    System.out.println(anyOddFactors(8));
    System.out.println(anyOddFactors(10));
    System.out.println(anyOddFactors(17));
    System.out.println(anyOddFactors(-12));
    System.out.println(anyOddFactors(81));
  }
  
  static boolean anyOddFactors(int num)
  {
    num = Math.abs(num);
    int i = 3;
    while(i <= num)
    {
      if (num % i == 0)
        return true;
      i += 2;
    }
    return false;
  }
}