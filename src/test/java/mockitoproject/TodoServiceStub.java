package mockitoproject;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}
	

}
