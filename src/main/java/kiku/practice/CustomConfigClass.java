package kiku.practice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CustomConfig")
public class CustomConfigClass {
    @XmlElement(name = "Config")
    ConfigClass config;

    public CustomConfigClass() {

    }

    public CustomConfigClass(ConfigClass config) {
        this.config = config;
    }

    public ConfigClass getConfig() {
        return config;
    }

    public void setConfig(ConfigClass config) {
        this.config = config;
    }
}