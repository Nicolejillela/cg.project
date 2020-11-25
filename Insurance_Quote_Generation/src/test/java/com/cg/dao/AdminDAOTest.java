package com.cg.dao;

import static org.junit.Assert.*;
import com.cg.Exception.*;
import com.cg.dao.AdminDAO;

import org.junit.Test;
import com.cg.service.*;
public class AdminDAOTest {

 

    @Test
    public void testUserExists() throws QGSException{
        AdminDAO obj=new AdminDAO();
        boolean f=obj.isUserExists("Nicole123");
        assertEquals(true, f);
        
        
        
    }
    @Test
    public void testLogin()throws QGSException
    {
        AdminDAO obj =new AdminDAO();
        boolean f=obj.loginValidation("Nicole123", "Nicole123");
        assertEquals(true,f);
    }
   @Test
   public void testGetRoleCode() throws QGSException
   {
       AdminDAO obj=new AdminDAO();
       String ans=obj.getRoleCode("Nicole123", "Nicole123");
       assertEquals("UW",ans);
   }
   

 

}