package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Community;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T18:15:09.730Z")
public abstract class CommunitiesApiService {
    public abstract Response communitiesGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response communitiesGetById(Integer id,SecurityContext securityContext) throws NotFoundException;
}
