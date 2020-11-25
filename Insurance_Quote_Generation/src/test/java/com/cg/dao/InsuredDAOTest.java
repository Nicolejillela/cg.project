package com.cg.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.Exception.QGSException;

public class InsuredDAOTest {


    @Test
    public void testUserExist() throws QGSException {
        InsuredDAO obj=new InsuredDAO();
        boolean f=obj.isUserExists("Soumya123");
        assertEquals(true,f);
       
       
    }
    @Test
    public void testAccountValidation()throws QGSException
    {
        InsuredDAO obj=new InsuredDAO();
        boolean f=obj.accountValidation("Soumya123");
        assertEquals(true,f);
    }
    
    @Test
    public void testGetAccountNumber()throws QGSException
    {
        InsuredDAO obj=new InsuredDAO();
        int ans=obj.getAccountNumber("Soumya123");
        assertEquals(10000001,ans);
    }
}

