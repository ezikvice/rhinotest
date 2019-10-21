import org.mozilla.javascript.*;

public class EmbedRhino {
    public static void main(String[] args) {
        try {
            Context cx = Context.enter();
            Scriptable scope = cx.initStandardObjects();
//            scope
        } finally {
            Context.exit();
        }
    }
}
