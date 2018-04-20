package day11;

import java.util.HashSet;

public class Manager {


	/*
	 * 1. ������� : HashSet
	 * 
	 * 2. getter / setter ? 
	 * 
	 * 3. ������ : ����Ʈ �����ڿ��� HashSet�� ��ü����
	 * 
	 * 4. ����޼ҵ�
	 *   1) �л��߰� HashSet�� add�޼ҵ�
	 *   2) �л����� Ž���� �ؼ� �ִ��� Ȯ�� �� ������ ����, ������ ������ �� ����   :  HashSet�� remove() �� ��,  HashSet�� add() �̿�
	 *   3) �л� ����Ž���� �ؼ� �ִ��� Ȯ�� �� ������ ����, ������ ������ �� ����   :  HashSet�� remove() �̿�
	 *   	
	 *   4) �л����Ž���� �ϸ鼭 �л� ������ ���
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


























