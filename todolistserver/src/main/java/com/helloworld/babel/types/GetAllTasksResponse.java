//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.20 a las 12:46:03 PM CET 
//


package com.helloworld.babel.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tasks" type="{http://example.com/task-service/types}TaskList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tasks"
})
@XmlRootElement(name = "GetAllTasksResponse")
public class GetAllTasksResponse {

    @XmlElement(required = true)
    protected TaskList tasks;

    /**
     * Obtiene el valor de la propiedad tasks.
     * 
     * @return
     *     possible object is
     *     {@link TaskList }
     *     
     */
    public TaskList getTasks() {
        return tasks;
    }

    /**
     * Define el valor de la propiedad tasks.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskList }
     *     
     */
    public void setTasks(TaskList value) {
        this.tasks = value;
    }

}
