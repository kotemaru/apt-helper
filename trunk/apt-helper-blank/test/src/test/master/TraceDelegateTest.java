package test.master;
import  sample.annotation.*;
import  java.io.*;

@TraceDelegate
public class TraceDelegateTest {
	public String getString(Object obj) {
		return obj.toString();
	}
	
	@TraceOption(errorStack=true)
	public void println(String msg) throws IOException {
		System.out.println(msg);
	}
}
