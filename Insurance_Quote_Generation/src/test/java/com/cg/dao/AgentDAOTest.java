package com.cg.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.Exception.QGSException;

public class AgentDAOTest {

	
		 

	    @Test
	    public void testUserExist() throws QGSException {
	        AgentDAO obj=new AgentDAO();
	        boolean f=obj.isUserExists("Sahi12345");
	        assertEquals(true,f);
	        
	        
	    }
	    @Test
	    public void testAccountValidation()throws QGSException
	    {
	        AgentDAO obj=new AgentDAO();
	        boolean f=obj.accountValidation("Sahi12345");
	        assertEquals(true,f);
	    }
	    @Test
	    public void testAccountExist()throws QGSException
	    {
	        AgentDAO obj=new AgentDAO();
	        boolean f=obj.isAccountExists(10000000);
	        assertEquals(true,f);
	    }

	 

	}


