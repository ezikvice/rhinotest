import java.util.HashMap;
import java.util.Map;
import javax.script.*;

public class Main {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.setMyInt(1);
        obj.setString("str");
        Map<String, Object> m = new HashMap<>();

        obj.setMyMap(m);

        // Enter the Rhino!
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine rhino = factory.getEngineByName("JavaScript");
        try {
            rhino.put("myJsObj", obj);
            Object x = rhino.eval("print(myJsObj)");
            System.out.println(x);
        } catch (ScriptException e) {
            e.printStackTrace();
        }


    }
}
