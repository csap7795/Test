package com.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("/todo")
public class TodoResource {
  // This method is called if JSON is request
  @GET
  @Produces({MediaType.APPLICATION_JSON })
  public String getJson() {
    Place test = new Place(1,"image_src",true,1,0,"Goldenes Dachl","http://de.wikipedia.org/wiki/Goldenes_Dachl");
    Gson gson = new Gson();
    String json = gson.toJson(test);
    return json;
  }
  
  // This can be used to test the integration with the browser
  @GET
  @Produces({ MediaType.TEXT_XML })
  public Todo getHTML() {
    Todo todo = new Todo();
    todo.setSummary("This is my first todo");
    todo.setDescription("This is my first todo");
    return todo;
  }

} 