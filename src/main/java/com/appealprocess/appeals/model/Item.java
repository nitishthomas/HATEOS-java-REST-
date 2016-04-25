package com.appealprocess.appeals.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.appealprocess.appeals.representations.Representation;

@XmlRootElement
public class Item {
    @XmlElement(namespace = Representation.APPEALS_NAMESPACE)
    private SubCategory subcategory;
    @XmlElement(namespace = Representation.APPEALS_NAMESPACE)
    private Size size;
    @XmlElement(namespace = Representation.APPEALS_NAMESPACE)
    private Exam exam;
    
    /**
     * For JAXB :-(
     */
    Item(){}
    
    public Item(Size size, SubCategory subcategory, Exam exam) {
        this.subcategory = subcategory;
        this.size = size;
        this.exam = exam;       
    }
    
    public SubCategory getSubCategory() {
        return subcategory;
    }

    public Size getSize() {
        return size;
    }

    public Exam getExam() {
        return exam;
    }
    
    @Override
    public String toString() {
        return size + " " + subcategory + " " + exam;
    }
}