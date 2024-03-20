package com.helloworld.babel.endpoint;

import com.helloworld.babel.types.AddTaskRequest;
import com.helloworld.babel.types.AddTaskResponse;
import com.helloworld.babel.types.GetAllTasksResponse;
import com.helloworld.babel.types.MarkTaskCompleteRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndPoint {
    private static final String NAMESPACE_URI = "http://www.neesis.es/soapserver/ws/user";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTasksRequest")
    @ResponsePayload
    public GetAllTasksResponse getAllTasksResponse() {
        GetAllTasksResponse response = new GetAllTasksResponse();
        // TODO FAKE DB IMPL
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "markTaskComlpeted")
    @ResponsePayload
    public GetAllTasksResponse markTaskCompleteRequest(@RequestPayload int taskId) {
        MarkTaskCompleteRequest markTaskCompleteRequest = new MarkTaskCompleteRequest();
        markTaskCompleteRequest.setTaskId(taskId);
        // TODO FAKE DB IMPL
        GetAllTasksResponse response = new GetAllTasksResponse();
        // TODO FAKE DB IMPL
        return response;
    }

    public AddTaskResponse addTaskRequest(@RequestPayload AddTaskRequest request) {
        AddTaskResponse addTaskResponse = new AddTaskResponse();
        // TODO FAKE DB IMPL
        return addTaskResponse;
    }
}
