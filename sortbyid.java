
import java.util.Objects;
import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
import java.util.*;

class User{
	    
		public User(){

	    }
	    public User(int id, String name,int salary) {
	        this.id = id;
	        this.name = name;
	        //this.email = email;
	        this.salary=salary;
	    }

	    private int id;
	    private String name;
	    //private String email;
	    private int salary;


//	    public String getEmail() {
//	        return email;
//	    }
//
//	    public void setEmail(String email) {
//	        this.email = email;
//	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return this.id +" ,"+ this.name +" ,"+ this.salary;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        User user = (User) o;
	        return id == user.id &&
	                name.equals(user.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name);
	    }
	}

	class sortbyid
	{
		public static void main(String args[])
		{
			ArrayList<User> uu=new ArrayList<>();
			uu.add(new User(1,"User1",1000));
			uu.add(new User(4,"User3",400));
			uu.add(new User(2,"User2",600));
			
//        Map<User,String> userStringMap = new HashMap<>();
//        userStringMap.put(user1,"User1");
//        userStringMap.put(user2,"User2");
//        userStringMap.put(user3,"User1");
//
//        for(Map.Entry<User,String> entry: userStringMap.entrySet()){
//            System.out.println("Key : "+entry.getKey()+" Value:  "+entry.getValue()+"Hash "+entry.getKey().hashCode());
	
			Collections.sort(uu, new Sortbyname());
			
			for (int i=0; i<uu.size(); i++)
	            System.out.println(uu.get(i));
		}
	}
	
	class Sortbyname implements Comparator<User>
	{
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(User a, User b)
	    {
	        return a.getId() - b.getId();
	    }
	}
