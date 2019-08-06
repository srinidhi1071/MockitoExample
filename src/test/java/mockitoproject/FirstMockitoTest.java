package mockitoproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FirstMockitoTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(3,filteredTodos.size());
				
	}

}
