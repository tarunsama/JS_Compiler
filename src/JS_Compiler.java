import java.io.IOException;

import javax.script.*;

public class JS_Compiler 
{
	public static void main(String args[])throws IOException,ScriptException, NoSuchMethodException
	{
		ScriptEngineManager engine_manager=new ScriptEngineManager();
		ScriptEngine engine=engine_manager.getEngineByName("nashorn");
		engine.eval("var x = 10;");
		engine.eval("print(x);");
	}

}
