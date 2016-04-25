package com.appealprocess.appeals.model;

import javax.xml.bind.annotation.XmlEnumValue;

public enum SubCategory {
    @XmlEnumValue(value="one")
    ONE,
    @XmlEnumValue(value="two")
    TWO,
    @XmlEnumValue(value="three")
    THREE,
    @XmlEnumValue(value="four")
    FOUR;
}
