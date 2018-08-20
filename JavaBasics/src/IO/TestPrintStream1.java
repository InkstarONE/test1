package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream1 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("/Users/zhanghao/Desktop/JAVA视频/src/printLog1.log");
            ps = new PrintStream(fos);

            if (ps != null){
                System.setOut(ps);
            }
            int ln = 0;
            for (char c = 0; c < 6000; c++){
                ps.print(c);
                if (ln++ >= 100){
                    System.out.println();
                    ln = 0;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
