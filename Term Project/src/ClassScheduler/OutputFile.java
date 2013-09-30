package ClassScheduler;

import java.io.*;

public class OutputFile {
	private BufferedWriter writer = null;
	public OutputFile(String fileName){
		try{
		    writer = new BufferedWriter(new FileWriter(fileName));
		}
		catch ( IOException e){
		}	
	}
	
	public void writeString(String outString){
	    try{
	    	writer.newLine();
	    	writer.write(outString);
	    }
	    catch(IOException e) {
	    }
	}
	
	public void doneWriting(){
		try{
	        if ( writer != null)
	        writer.close( );
	    }
	    catch ( IOException e){
	    }
	}
}
