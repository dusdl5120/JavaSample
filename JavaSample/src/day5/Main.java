package day5;

public class Main {

	public static void main(String[] args) {

		Circle cl = new Circle();		// Circle 適掘什税 梓端持失
		cl.printCircle();				// printCircle 持失切 硲窒 -> 益軍 古鯵痕呪 蒸澗 Circle持失切研 硲窒敗引 疑獣拭 梓端 持失拝暗績
										// circle() 持失切澗 奄沙葵生稽 掻宿疎妊 0,0 / 鋼走硯葵 5.0生稽 早奄 凶庚拭 壱企稽 戚係惟 窒径 森雌 
		
		cl.moveCenter(10, 10);			// moveCenter() 持失切 硲窒 -> 剰亀 須採拭辞 掻宿疎妊葵 (10, 10)生稽 閤焼辞 穿含. 鋼走硯精 須採拭辞 閤精葵戚 蒸奄 凶庚拭 奄沙葵 益企稽 5.0
		cl.printCircle();				// 益 板 窒径馬檎 掻宿疎妊 10, 10 / 鋼走硯葵 5.0生稽 窒径 森雌
		
		cl.resize(20.1);				// resize() 持失切 硲窒 -> 剰亀 須採拭辞 鋼走硯葵 (20.1)稽 閤焼辞 穿含. 掻宿疎妊葵精 須採拭辞 閤精葵戚 蒸奄 凶庚拭 焼猿 益企稽 10, 10
		cl.printCircle();				// 益 板 窒径馬檎 掻宿疎妊 10, 10 / 鋼走硯 : 20.1 生稽 窒径 森雌
		
		System.out.println();

	/********************************************************************************************************************************************************************************/	
		
		Rect r = new Rect();				// 古鯵痕呪 蒸澗 Rect() 持失切 梓端持失
		r.print();							// print() 硲窒
		
		Rect r2 = new Rect(0,0,10,-10);		// 古鯵痕呪 4鯵促軒 Rect() 持失切 梓端持失
		r2.print();							// print() 硲窒 <-- Rect 適掘什 凧壱
		
		Rect r3 = new Rect(new Point(0,0), new Point(10,-10)); 		// Point適掘什税  せせせせ 杭社軒醤せせせせ
		r3.print();
		
	}

}
