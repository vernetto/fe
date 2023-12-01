import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class PropertyRef {

    @JacksonXmlText
    private String value;

    // Standard getters and setters

    @JsonCreator
    public PropertyRef(@JacksonXmlText String value) {
        this.value = value;
    }
}
