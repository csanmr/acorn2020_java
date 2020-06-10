package test.mypac;
/* [ Generic Class ]
 *  Class 클래스명<Generic type>
 *  
 *  -클래스를 정의할 때 Generic type을 지정해서 특정 type을 동적으로 지정할 수 있다.
 *  아래는 <T>로 써놨지만 변수처럼 아무거나 적어도 된다. <a>, <b>, <c> 등
 *  특정 type을 써넣을 수도 있다 <String>, <Integer> 등
 *  Generic클래스 자리를 비우두면 Object type으로 정해짐
 */
public class FruitBox<T> {
	//필드
	private T item;
	//메소드
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
}
