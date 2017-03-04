
import java.io.FileReader;

import java.io.IOException;



import java.util.InputMismatchException;

import javax.script.*;

public class JS_Compiler 
{
	public static void main(String args[])throws IOException,ScriptException, NoSuchMethodException,ArrayIndexOutOfBoundsException,InputMismatchException
	{
		// Instance of ScriptEngineManager
		ScriptEngineManager engine_manager=new ScriptEngineManager();
		// Interface of that object
		ScriptEngine engine=engine_manager.getEngineByName("javascript");
		System.out.print("    ");
		//demo of evaluation 
		engine.eval("var x = 'Starting';");
		//sample js code to try can be directly inserted here
		engine.eval("print(x);");
		engine.eval("print ('JS code Evaluator')");
		//FileReader fr =new FileReader("C:/Users/tarun.s/Desktop/testing.js");
		System.out.print("    ");
		long startTime = System.currentTimeMillis();
		engine.eval(new FileReader("C:/Users/tarun.s/Desktop/test4.js"));
		//Result after evaluation;
		long endTime = System.currentTimeMillis();
		long eval_time= endTime-startTime;
		System.out.print("Time taken for evaluation is:"+ eval_time);
		//engine.eval("load('C:/Users/tarun.s/Desktop/testing.js')");
		//engine.eval("var x = 10; var y = 20 ; var z = x+y; print (z);");
	}
}
