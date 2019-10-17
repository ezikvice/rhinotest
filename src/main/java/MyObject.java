import lombok.Data;

import java.util.Map;

@Data
public class MyObject {
    private String string;
    private int myInt;
    private Map<String, Object> myMap;
}
