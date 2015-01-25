package com.malsysco.lcsconsole.resources;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.malsysco.lcsconsole.dao.UsersDAO;
import com.malsysco.lcsconsole.dto.UsersDTO;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {
	
	private final UsersDAO userDAO;
	
	public UsersResource(final UsersDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@POST
	@UnitOfWork
	public UsersDTO createUser(UsersDTO userDTO)
	{
		return new UsersDTO();
	}

	/**
	 * @return the userDAO
	 */
	public UsersDAO getUserDAO() {
		return userDAO;
	}

}
