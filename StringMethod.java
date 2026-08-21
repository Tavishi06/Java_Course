import java.util.Scanner;

public class StringMethod {

  static int StrLen(String str) {

    int count = 0;
    
    for (int i = 0; i < str.length(); i++) 
    {
      count++;
    }
    return count;
  }

  static int CountVowels(String str)
  {
    int count = 0;
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) 
    {
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
      {
        count++;
      }
    }
    return count;
  }

  static String RevStr(String str)
  {
    char end;
    String rev = "";

    for (int i = 0; i < str.length() ; i++) 
    {
      end = str.charAt(str.length() - 1 - i);
      rev = rev + end;
    }
    return rev;
  }

  static String palindrome(String str)
  {
    String rev = RevStr(str);
    if(str.equals(rev))
    {
      return "The string is a palindrome.";
    }
    else
    {
      return "The string is not a palindrome.";
    }
  }

  static int Freq(String str, char ch)
  {
    int count = 0;
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == ch)
      {
        count++;
      }
    }
    return count;
  }

  static int FirstOccur(String str, char ch)
  {
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == ch)
      {
        return i;
      }
    }
    return -1;
  }

  static String trim(String str)
  {
    String Trim = "";

    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) != ' ')
      {
        Trim = Trim + str.charAt(i);
      }
      else
      {
        continue;
      }

    }
    return Trim;
  }

  static char maxoccur(String str)
  {
    int max = 0;
    char ch = ' ';
    for(int i = 0; i < str.length(); i++)
    {
      int count = Freq(str, str.charAt(i));

      if(count > max)
      {
        max = count;
        ch = str.charAt(i);
      }
    }
    return ch;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");

    String str = sc.next();
    System.out.println("You entered: " + str);

    System.out.println("Number of characters in the string: "+StrLen(str));
    System.out.println("Number of vowels in the string: "+CountVowels(str));
    System.out.println("Reversed string: "+RevStr(str));
    System.out.println(palindrome(str));

    System.out.print("Enter a character to find its frequency: ");
    char ch = sc.next().charAt(0);
    System.out.println("Frequency of '" + ch + "': " + Freq(str, ch));
    System.out.println("First occurrence of '" + ch + "': " + FirstOccur(str, ch));
    System.out.println("String after trimming spaces: " + trim(str));
    System.out.println("Character that occurs most frequently: " + maxoccur(str));
    
    sc.close();
  }

}