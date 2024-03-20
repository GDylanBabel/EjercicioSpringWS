//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.20 a las 12:46:03 PM CET 
//


package com.helloworld.babel.types;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.task_service.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllTasksRequest_QNAME = new QName("http://example.com/task-service/types", "GetAllTasksRequest");
    private final static QName _MarkTaskCompleteResponse_QNAME = new QName("http://example.com/task-service/types", "MarkTaskCompleteResponse");
    private final static QName _DeleteTaskResponse_QNAME = new QName("http://example.com/task-service/types", "DeleteTaskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.task_service.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddTaskRequest }
     * 
     */
    public AddTaskRequest createAddTaskRequest() {
        return new AddTaskRequest();
    }

    /**
     * Create an instance of {@link AddTaskResponse }
     * 
     */
    public AddTaskResponse createAddTaskResponse() {
        return new AddTaskResponse();
    }

    /**
     * Create an instance of {@link GetAllTasksResponse }
     * 
     */
    public GetAllTasksResponse createGetAllTasksResponse() {
        return new GetAllTasksResponse();
    }

    /**
     * Create an instance of {@link TaskList }
     * 
     */
    public TaskList createTaskList() {
        return new TaskList();
    }

    /**
     * Create an instance of {@link MarkTaskCompleteRequest }
     * 
     */
    public MarkTaskCompleteRequest createMarkTaskCompleteRequest() {
        return new MarkTaskCompleteRequest();
    }

    /**
     * Create an instance of {@link DeleteTaskRequest }
     * 
     */
    public DeleteTaskRequest createDeleteTaskRequest() {
        return new DeleteTaskRequest();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/task-service/types", name = "GetAllTasksRequest")
    public JAXBElement<Object> createGetAllTasksRequest(Object value) {
        return new JAXBElement<Object>(_GetAllTasksRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/task-service/types", name = "MarkTaskCompleteResponse")
    public JAXBElement<Object> createMarkTaskCompleteResponse(Object value) {
        return new JAXBElement<Object>(_MarkTaskCompleteResponse_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/task-service/types", name = "DeleteTaskResponse")
    public JAXBElement<Object> createDeleteTaskResponse(Object value) {
        return new JAXBElement<Object>(_DeleteTaskResponse_QNAME, Object.class, null, value);
    }

}
