package mockitoproject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class FirstMockitoTestwithMock {

	@Test
	public void test() {
		TodoService todoServiceMock = Mockito.mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
		
		Mockito.when(todoServiceMock.retriveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
				
	}

}
