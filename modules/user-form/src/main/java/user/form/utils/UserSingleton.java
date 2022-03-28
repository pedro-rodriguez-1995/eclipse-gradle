package user.form.utils;

import java.util.ArrayList;
import java.util.List;

import user.form.model.User;

public class UserSingleton {

	  private static List<User> instance;
	 
	  private UserSingleton()
	  {
	   
	  }
	 
	 
	  synchronized public static List<User> getInstance()
	  {
	    if (instance == null)
	    {
	     
	      instance = new ArrayList<User>();
	    }
	    return instance;
	  }

}
