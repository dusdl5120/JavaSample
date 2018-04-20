package day11;

import java.util.HashSet;

public class Manager {


	/*
	 * 1. 멤버변수 : HashSet
	 * 
	 * 2. getter / setter ? 
	 * 
	 * 3. 생성자 : 디폴트 생성자에서 HashSet에 객체생성
	 * 
	 * 4. 멤버메소드
	 *   1) 학생추가 HashSet의 add메소드
	 *   2) 학생수정 탐색을 해서 있는지 확인 후 있으면 수정, 없으면 수정할 수 없음   :  HashSet의 remove() 한 후,  HashSet의 add() 이용
	 *   3) 학생 삭제탐색을 해서 있는지 확인 후 있으면 삭제, 없으면 삭제할 수 없음   :  HashSet의 remove() 이용
	 *   	
	 *   4) 학생출력탐색을 하면서 학생 정보를 출력
	 * 
	 * 
	 */
	
	
	private HashSet<Students> hs;
	
	public Manager() {
		
		hs = new HashSet<Students>();
	}
	
	public void insert(Students std, String name, int kor, int eng, int math) {
		std.setName(name).setKor(kor).setEng(eng).setMath(math);
	      hs.add(std);
	 }
	   
	 public void print() {
	     for(Students tmp : hs) {
	         System.out.println(tmp);
	     }
	 }
	   
	 public void delete(Students std) {
	      hs.remove(std);      
	 }
	
	 public void update(Students std, String name, int kor, int eng, int math) {
	     std.setName(name).setKor(kor).setEng(eng).setMath(math);
	     if(hs.remove(std))
	    	 hs.add(std);
		 
	 }
	
	
	
	
	
	
	
}


























