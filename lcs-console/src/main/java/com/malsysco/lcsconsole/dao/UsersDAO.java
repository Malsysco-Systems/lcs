package com.malsysco.lcsconsole.dao;

import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import com.malsysco.lcsconsole.dto.UsersDTO;

public class UsersDAO extends AbstractDAO<UsersDTO> {
	
	public UsersDAO(SessionFactory factory) {
        super(factory);
    }

}
