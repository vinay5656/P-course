package nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;


import javax.script.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		FileReader fr;
        try {
        	 fr = new FileReader("C:\\Users\\chauh\\Desktop\\Java Script\\demo.js");
			engine.eval(fr);
			Invocable incocable = (Invocable)engine;
			incocable.invokeFunction("isPrime", 56);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
