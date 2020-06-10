package test.main;

import test.mypac.Drill;
import test.mypac.MultiPlayer;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//MultiPlayer객체는 3가지 type 모두가 될 수 있다
		MultiPlayer mp=new MultiPlayer();
		//아래의 3개 메소드 호출하면서 인자로 전달할 수 있다.
		useRemocon(mp);
		useDrill(mp);
		useMultiPlayer(mp);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
	public static void useMultiPlayer(MultiPlayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
}
