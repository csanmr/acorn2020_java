package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap<Key 값의 type,value 값의 type>
		 */
		Map<String, Object> map1=new HashMap<>();
		map1.put("num",1); //map.put(Key,Value);
		map1.put("name","김구라");
		map1.put("addr","노량진");
		/*
		 *  value의 Generic클래스가 Object로 지정되어있기 때문에
		 *  리턴되는 Object type을 원래 type으로 casting 해야한다.
		 */
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		String addr=(String)map1.get("addr");
	}
}
