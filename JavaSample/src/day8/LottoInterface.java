package day8;

public interface LottoInterface {
	
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception;		// ���� ���ϴ� �����ŭ
	public int randomInteger(int min, int max) throws Exception;	
	public void createLottoArr(int[] arr, int min, int max) throws Exception;		
	public int rank(int[] win, int[] arr) throws Exception;
	

}
