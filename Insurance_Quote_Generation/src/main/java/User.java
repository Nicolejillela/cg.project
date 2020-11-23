import com.cg.Exception.QGSException;
import com.cg.dao.AdminDAO;
import com.cg.model.UserRole;

public class User {
	
	
	public static void main(String[] args) throws QGSException{
		
		AdminDAO ob=new AdminDAO();
		UserRole obj=new UserRole("nick","nick123","nic@");
		int a=ob.addUser(obj);
		System.out.println(a);
		
	}

}
