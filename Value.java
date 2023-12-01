import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Value {

    @JacksonXmlProperty(localName = "property-ref")
    private PropertyRef propertyRef;

    @JacksonXmlProperty(isCData = false)
    private String text;

    // Standard getters and setters

    @JsonCreator
    public Value(@JacksonXmlProperty(localName = "property-ref") PropertyRef propertyRef,
                 @JacksonXmlProperty(isCData = false) String text) {
        this.propertyRef = propertyRef;
        this.text = text;
    }

    public boolean hasPropertyRef() {
        return propertyRef != null;
    }
}
