package exception.sem3;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
    public static void writeInFile(String[] userInfo) throws IOException{
        String str = String.format("<%s><%s><%s><%s><%s><%s>\r\n", userInfo[0], userInfo[1], userInfo[2], userInfo[3],
        userInfo[4], userInfo[5]);
        FileOutputStream fos =  new FileOutputStream(userInfo[0], true);
        fos.write(str.getBytes());
        fos.close();
    }
}
