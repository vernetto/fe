import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "link")
public class Link {

    @JacksonXmlProperty(isAttribute = true)
    private String name;

    private List<Parameter> parameter;

    // Standard getters and setters

    @JsonCreator
    public Link(@JacksonXmlProperty(isAttribute = true, localName = "name") String name,
                @JsonProperty("parameter") List<Parameter> parameter) {
        this.name = name;
        this.parameter = parameter;
    }
}
