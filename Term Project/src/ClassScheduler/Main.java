package ClassScheduler;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ExcelInput testInput = new ExcelInput();
		testInput.setInputFile("schedule.xls");
		testInput.read();
		OutputFile file = new OutputFile("C:\\Users\\CraigNetbook\\Desktop\\test.txt");
		for (int i=1;i<testInput.rowCount();i++){
			Section section = new Section(testInput.passRow(i));
			file.writeString("Class Code: "+section.getClassCode());
			file.writeString("Instructor: "+section.getInstructor());
			file.writeString("--------------");
		}
		file.doneWriting();
	}
}
