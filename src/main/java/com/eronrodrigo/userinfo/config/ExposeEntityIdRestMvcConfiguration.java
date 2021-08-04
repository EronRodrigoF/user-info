package com.eronrodrigo.userinfo.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.eronrodrigo.userinfo.model.User;

@Component
class ExposeEntityIdRestMvcConfiguration implements RepositoryRestConfigurer { 
   @Override
   public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
      config.exposeIdsFor(User.class);
   }
}