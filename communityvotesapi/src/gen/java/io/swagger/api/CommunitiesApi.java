package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CommunitiesApiService;
import io.swagger.api.factories.CommunitiesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Community;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/communities")


@io.swagger.annotations.Api(description = "the communities API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T18:15:09.730Z")
public class CommunitiesApi  {
   private final CommunitiesApiService delegate = CommunitiesApiServiceFactory.getCommunitiesApi();

    @GET
    
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Community.class, responseContainer = "List", tags={ "Community", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Community.class, responseContainer = "List") })
    public Response communitiesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.communitiesGet(securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Community.class, responseContainer = "List", tags={ "Community", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Community.class, responseContainer = "List") })
    public Response communitiesGetById(@ApiParam(value = "",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.communitiesGetById(id,securityContext);
    }
}
