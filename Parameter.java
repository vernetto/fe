import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameter {

    private String name;
    private Value value;

    // Standard getters and setters

    @JsonCreator
    public Parameter(@JsonProperty("name") String name,
                     @JsonProperty("value") Value value) {
        this.name = name;
        this.value = value;
    }
}
