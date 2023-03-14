
import java.io.* ;
import java.lang.Math;
import java.util.Scanner ;
import java.util.Random;


 class Employee
{
    String Email, first, last;
    char[] password = new char[8];
     Employee(String a,String b)
    {
        first=a;
        last=b;
    }
    public static char[] generatePassword()
    {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[8];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i<8 ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
    public void credentialService(int c)
    {
        if(c==1)
        {
            Email=first+last+"@"+"tech.mmr.com";
            password =generatePassword();
        }
        if(c==2)
        {
            Email=first+last+"@"+"admin.mmr.com";
            password =generatePassword();
        }
        if(c==3)
        {
            Email=first+last+"@"+"Hr.mmr.com";
            password =generatePassword();
        }
        if(c==4)
        {
            Email=first+last+"@"+"legal.mmr.com";
            password =generatePassword();
        }

    }


    public void showCredentials()
    {
        System.out.println("Dear " + first+ " your Generated credentials are as follows");
        System.out.println("E-mail -->"+Email);
        System.out.println("password -->"+password);
    }



}

public class Main
{
    public static void main(String[] args)
    {

        int depart;
        String First;
        String last;
        Scanner department = new Scanner(System.in);
        System.out.println("Please enter the department from the following\n 1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");


        depart = department.nextInt();
        System.out.println("Enter Your First Name");
        First = department.next();
        System.out.println("Enter Your Last Name");
        last = department.next();

        Employee obj = new Employee(First,last);
        obj.credentialService(depart);
        obj.showCredentials();


    }
}



