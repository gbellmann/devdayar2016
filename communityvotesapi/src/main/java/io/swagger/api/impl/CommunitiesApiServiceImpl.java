package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Community;

import java.util.*;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-12-01T18:15:09.730Z")
public class CommunitiesApiServiceImpl extends CommunitiesApiService {

    private ArrayList<Community> loadCmmunities()
    {
        ArrayList<Community> list = new ArrayList<Community>();
        list.add(new Community(1, "Free Code Camp Buenos Aires", "http://devday-ar.com/assets/images/communities/freecodecampba.png"));
        list.add(new Community(2, "Meetup.js Argentina", "http://devday-ar.com/assets/images/communities/meetupjs.png"));
        list.add(new Community(3, "Node Buenos Aires", "http://devday-ar.com/assets/images/communities/banodejs.png"));
        list.add(new Community(4, "NodeSchool BA", "http://devday-ar.com/assets/images/communities/nodeschoolba.png"));
        list.add(new Community(5, "Net-Baires", "http://devday-ar.com/assets/images/communities/netbaires.png"));
        list.add(new Community(6, "Buenos Aires Cloud Computing", "http://devday-ar.com/assets/images/communities/cloudcomputing.png"));
        list.add(new Community(7, "Ruby Argentina", "http://devday-ar.com/assets/images/communities/rubyargentina.png"));
        list.add(new Community(8, "mumuki", "http://devday-ar.com/assets/images/communities/mumuki.png"));
        list.add(new Community(9, "sysarmy", "http://devday-ar.com/assets/images/communities/sysarmy.png"));
        list.add(new Community(10, "Baires Web", "http://devday-ar.com/assets/images/communities/bairesweb.png"));
        list.add(new Community(11, "Geek Out Argentina", "http://devday-ar.com/assets/images/communities/geekoutargentina.png"));
        list.add(new Community(12, "Chicas Poderosas Argentina", "http://devday-ar.com/assets/images/communities/chicaspoderosasargentina.png"));
        list.add(new Community(13, "Nómades Digitales Buenos Aires", "http://devday-ar.com/assets/images/communities/nomadasdigitales.png"));
        list.add(new Community(14, "Ng-Baires", "http://devday-ar.com/assets/images/communities/ngbaires.png"));
        list.add(new Community(15, "TestingAR", "http://devday-ar.com/assets/images/communities/testingarg.png"));
        list.add(new Community(16, "AWS Users Group argentina", "http://devday-ar.com/assets/images/communities/aws.png"));
        list.add(new Community(17, "Buenos Aires Front-end Meetup", "http://devday-ar.com/assets/images/communities/bafrontend.png"));
        list.add(new Community(18, "React.js en Buenos Aires", "http://devday-ar.com/assets/images/communities/reactjs.png"));
        list.add(new Community(19, "Club Arduino Argentina", "http://devday-ar.com/assets/images/communities/clubarduino.png"));
        list.add(new Community(20, "C++ Buenos Aires", "http://devday-ar.com/assets/images/communities/c++ba.png"));
        list.add(new Community(21, "Inteligencia Artificial Argentina", "http://devday-ar.com/assets/images/communities/iaar.png"));
        list.add(new Community(22, "GDG Río de la Plata", "http://devday-ar.com/assets/images/communities/gdgrdlp.png"));
        list.add(new Community(23, "Nardoz", "http://devday-ar.com/assets/images/communities/nardoz.png"));
        list.add(new Community(24, "GDG Buenos Aires", "http://devday-ar.com/assets/images/communities/gdgba.png"));
        list.add(new Community(25, "LinuxChix Argentina", "http://devday-ar.com/assets/images/communities/linuxchixar.jpeg"));
        list.add(new Community(26, "Buenos Aires Tech", "http://devday-ar.com/assets/images/communities/buenosairestech.jpeg"));
        list.add(new Community(27, "Java User Group Argentina", "http://devday-ar.com/assets/images/communities/jugar.jpeg"));
        return list;
    }

    @Override
    public Response communitiesGet(SecurityContext securityContext) throws NotFoundException {
        ArrayList<Community> list = loadCmmunities();
        return Response.ok().entity(list).build();
    }
    
    @Override
    public Response communitiesGetById(Integer id, SecurityContext securityContext) throws NotFoundException {
        ArrayList<Community> list = loadCmmunities();
         Community ret = null;

         for(int i=0; i<list.size(); i++)
         {
             if(list.get(i).getId() == id)
                 {
                     ret = list.get(i);
                 }
         }
         return Response.ok().entity(ret).build();
    }
}
