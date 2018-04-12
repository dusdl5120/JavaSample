package day8;

public interface LottoInterface {
	
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception;		// 내가 원하는 사이즈만큼
	public int randomInteger(int min, int max) throws Exception;	
	public void createLottoArr(int[] arr, int min, int max) throws Exception;		
	public int rank(int[] win, int[] arr) throws Exception;
	

}
