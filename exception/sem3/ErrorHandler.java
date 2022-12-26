package exception.sem3;

public class ErrorHandler {
    public static void errMessage(int errorCode){
           if(errorCode == 1)System.out.println("Your enter is to short or long, please enter like in exemple, in format");
           if(errorCode == 2)System.out.println("Your secondName or name or patronymic will be >= 3 and include latin letters");
           if(errorCode == 3)System.out.println("Your date not a format, format is: dd.mm.yyyy");
           if(errorCode == 4)System.out.println("Your phone not a format, format is: 9997776655");
           if(errorCode == 5)System.out.println("Your sex not a format, format is: m or f");  
    }
}
