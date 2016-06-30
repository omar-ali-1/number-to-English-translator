public class NumbertoEnglish {
  public static void main(String[] args) {
    long y = Long.parseLong(args[0]);
    if(y < 0) System.out.print("negative");
    if(y == 0) System.out.print(" zero");
    long ya = Math.abs(y);
    int i = 8;
    long[] x = new long[9];
    while (ya > 0) {
      x[i] = ya % 10;
      ya = ya / 10;
      i--;
    }
    for(int m = 0; m < 9; m +=3){
      if(x[m] > 0){
        if(x[m] == 1) System.out.print(" one");
        if(x[m] == 2) System.out.print(" two");
        if(x[m] == 3) System.out.print(" three");
        if(x[m] == 4) System.out.print(" four");
        if(x[m] == 5) System.out.print(" five");
        if(x[m] == 6) System.out.print(" six");
        if(x[m] == 7) System.out.print(" seven");
        if(x[m] == 8) System.out.print(" eight");
        if(x[m] == 9) System.out.print(" nine");
        System.out.print(" hundred");
      }
      if(x[m+1] == 1){
        if(x[m+2] == 0) System.out.print(" ten");
        if(x[m+2] == 1) System.out.print(" eleven");
        if(x[m+2] == 2) System.out.print(" twelve");
        if(x[m+2] == 3) System.out.print(" thirteen");
        if(x[m+2] == 4) System.out.print(" fourteen");
        if(x[m+2] == 5) System.out.print(" fifteen");
        if(x[m+2] == 6) System.out.print(" sixteen");
        if(x[m+2] == 7) System.out.print(" seventeen");
        if(x[m+2] == 8) System.out.print(" eighteen");
        if(x[m+2] == 9) System.out.print(" nineteen");
      }
      if(x[m+1] == 2) System.out.print(" twenty");
      if(x[m+1] == 3) System.out.print(" thirty");
      if(x[m+1] == 4) System.out.print(" fourty");
      if(x[m+1] == 5) System.out.print(" fifty");
      if(x[m+1] == 6) System.out.print(" sixty");
      if(x[m+1] == 7) System.out.print(" seventy");
      if(x[m+1] == 8) System.out.print(" eighty");
      if(x[m+1] == 9) System.out.print(" ninety");
      
      if(x[m+2] == 1) System.out.print(" one");
      if(x[m+2] == 2) System.out.print(" two");
      if(x[m+2] == 3) System.out.print(" three");
      if(x[m+2] == 4) System.out.print(" four");
      if(x[m+2] == 5) System.out.print(" five");
      if(x[m+2] == 6) System.out.print(" six");
      if(x[m+2] == 7) System.out.print(" seven");
      if(x[m+2] == 8) System.out.print(" eight");
      if(x[m+2] == 9) System.out.print(" nine");
      if((m == 0)&&(x[m] > 0 || x[m+1] > 0 || x[m+2] > 0)) 
        System.out.print(" million");
      if((m == 3)&&(x[m] > 0 || x[m+1] > 0 || x[m+2] > 0)) 
        System.out.print(" thousand");
    }
    System.out.println();
  }
}