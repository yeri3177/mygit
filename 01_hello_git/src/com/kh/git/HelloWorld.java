package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;
/**
 * 
 * 
 * 원격저장소 등록후 push 할수있다.
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck");
		
		new Foo().sayFoo();
		new Foo().sayFoo(); // #sayFoo에서 추가 
		System.out.println("Luck you~"); // #master에서 추가 
		
		new Cat().say();
		new Dog().say();
	}
	
	/**
	 * 원격 저장소에서 수정된 내용 
	 */
	public void hello(){
		System.out.println("저를 fetch 해주세요!");
	}
}
