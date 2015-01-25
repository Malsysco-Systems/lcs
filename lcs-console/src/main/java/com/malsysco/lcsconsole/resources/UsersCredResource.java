package com.malsysco.lcsconsole.resources;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.malsysco.lcsconsole.dao.UsersCredDAO;
import com.malsysco.lcsconsole.dto.UsersCredDTO;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class UsersCredResource 
{
	private UsersCredDAO userCredDAO;
		
	public UsersCredResource(final UsersCredDAO userCredDAO) {
		this.userCredDAO = userCredDAO;
	}
		
	@POST
	@UnitOfWork
	public UsersCredDTO createUser(UsersCredDTO userCredDTO)
	{
		return new UsersCredDTO();
	}

	public UsersCredDAO getUserCredDAO() {
		return userCredDAO;
	}


}
