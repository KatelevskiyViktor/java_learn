package exception.sem3;

import java.io.IOException;
import java.util.Scanner;

public class UserInfoCollector {

    public void EnterInfo() {

        String[] userInfo = new String[] {};
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your data(format: secondName name patronymic birthday phone sex): ");
        String str = console.nextLine();
        console.close();

        userInfo = str.split(" ");
        int errInfo = uIChecker(userInfo);
        if (errInfo != 0){
            ErrorHandler.errMessage(errInfo);
            System.out.println("Try again");
        } else{
            try {
                WriteInFile.writeInFile(userInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            

    }

    public int uIChecker(String[] userInfo) {
        int errorCode = 0;
        if (userInfo.length > 6 || userInfo.length < 6)
            errorCode = 1;
        else if (!userInfo[0].matches("^[a-zA-Z]{3,}$") ||
                !userInfo[1].matches("^[a-zA-Z]{3,}$") ||
                !userInfo[2].matches("^[a-zA-Z]{3,}$"))
            errorCode = 2;
        else if (!userInfo[3].matches("^\\d{2}.\\d{2}.\\d{4}$"))
            errorCode = 3;
        else if (!userInfo[4].matches("^\\d{10}$"))
            errorCode = 4;
        else if (!userInfo[5].matches("^[f,m]{1}$"))
            errorCode = 5;
        return errorCode;
    }

}
