package io.swagger.api.factories;

import io.swagger.api.CommunitiesApiService;
import io.swagger.api.impl.CommunitiesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T18:15:09.730Z")
public class CommunitiesApiServiceFactory {
    private final static CommunitiesApiService service = new CommunitiesApiServiceImpl();

    public static CommunitiesApiService getCommunitiesApi() {
        return service;
    }
}
