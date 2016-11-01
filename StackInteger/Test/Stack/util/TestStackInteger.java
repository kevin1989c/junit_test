package Stack.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestStackInteger {
	StackInteger stackint;
	
	@Before
	
	public void setUp(){
		stackint = new StackInteger();	
	}
	@Test
	public void TestCreate(){
		stackint.create();
	    int create_value=stackint.push();
	    Assert.assertEquals("problems in create", 0, create_value);	
	}
	@Test
	public void TestPush1(){
		stackint.create();
	    int push_value=stackint.push();
	    Assert.assertEquals("problems in push", 0, push_value);	
	}
	@Test
	public void TestPush2(){
	    int push_value=stackint.push();
	    Assert.assertEquals("problems in push", 0, push_value);	
	}
	@Test
	public void TestPop1(){
		stackint.create();
	    int push_value=stackint.push();
	    Assert.assertEquals("problems in push", 0, push_value);	
	    int pop_value=stackint.pop();
	    Assert.assertEquals("problems in pop", 0, pop_value);	
	}
	@Test
	public void TestPop2(){
		stackint.create();
	    int pop_value=stackint.pop();
	    Assert.assertEquals("problems in pop", 0, pop_value);	
	}
	@Test
	public void TestIsEmpty1(){
		stackint.create();
	    int push_value=stackint.push();
	    Assert.assertEquals("problems in push", 0, push_value);	
	    int pop_value=stackint.pop();
	    Assert.assertEquals("problems in pop", 0, pop_value);
	    int isempty_value=stackint.isEmpty();
	    Assert.assertEquals("problems in isempty", 0, isempty_value);
	}
	@Test
	public void TestIsEmpty2(){
		stackint.create();
	    int push_value=stackint.push();
	    Assert.assertEquals("problems in push", 0, push_value);	
	    int pop_value=stackint.pop();
	    Assert.assertEquals("problems in pop", 0, pop_value);
	    int isempty_value=stackint.isEmpty();
	    Assert.assertEquals("problems in isempty", 1, isempty_value);
	}
	
}

