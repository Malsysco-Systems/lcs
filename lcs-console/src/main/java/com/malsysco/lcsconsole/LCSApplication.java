package com.malsysco.lcsconsole;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.malsysco.lcsconsole.dao.UsersDAO;
import com.malsysco.lcsconsole.dto.UsersDTO;
import com.malsysco.lcsconsole.resources.UsersResource;

public class LCSApplication extends Application<LCSConfiguration> {
	
	private final HibernateBundle<LCSConfiguration> hibernate = new HibernateBundle<LCSConfiguration>(UsersDTO.class) {
	    @Override
	    public DataSourceFactory getDataSourceFactory(LCSConfiguration configuration) {
	        return configuration.getDataSourceFactory();
	    }
	};

	@Override
	public void initialize(Bootstrap<LCSConfiguration> bootstrap) {
		bootstrap.addBundle(hibernate);
		
	}

	@Override
	public void run(LCSConfiguration config, Environment environment) throws ClassNotFoundException {
		final UsersDAO dao = new UsersDAO(hibernate.getSessionFactory());
	    environment.jersey().register(new UsersResource(dao));		
	}

}
