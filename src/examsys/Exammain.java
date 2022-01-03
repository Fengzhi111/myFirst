package examsys;

import java.io.File;
import java.io.IOException;
/**
 * ¥Ã‚œµÕ≥main
 * @author 86186
 *
 */
public class Exammain {
	public static void main(String[] args) throws IOException{
        File examFile=new File("examsystem.txt");
        Examm exam=new Examm();
        exam.setTestFile(examFile);
        exam.startExam();
    }

}
