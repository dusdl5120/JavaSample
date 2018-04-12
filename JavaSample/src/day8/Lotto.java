package day8;

public class Lotto implements LottoInterface {

	@Override
	public boolean isDuplicated(int[] arr, int num, int size) throws Exception {
		
		if(size < 0) throw new Exception("Ž���� ������ ������ �� ����.");
		
		if(size > arr.length) throw new Exception("Ž���� ������ �迭�� ũ�⺸�� Ŭ �� ����.");

		for (int i=0; i<size; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int randomInteger(int min, int max) throws Exception {
		
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		if (min < 0 || max < 0) throw new Exception("������ �������� ������ �� ����");
		
		return (int) (Math.random()*(max-min+1)+min);
		
	}

	@Override
	public void createLottoArr(int[] arr, int min, int max) throws Exception {
		
		if(arr.length > Math.abs(max-min))
			throw new Exception("������������ �迭�� ũ�Ⱑ ŭ");
		
		for (int cnt=0; cnt<arr.length;) {
			int tmp = randomInteger(min, max);
			
			if(!isDuplicated(arr, tmp, cnt)) {
				arr[cnt] = tmp;
				cnt++;
			}
		}
	}

	public int rank(int[] win, int[] arr) throws Exception {
		int cnt = 0;//���� ����
		boolean isBonus = false;
		
		if(win.length != 7 || arr.length != 6)
			throw new Exception("��÷ ��ȣ �Ǵ� ���� ��ȣ ������ �߸��Ǿ����ϴ�.");
		for(int i=0; i<arr.length; i++) {
			if(isDuplicated(arr,win[i],arr.length)) {
				cnt++;
			}
		}
		if(isDuplicated(arr,win[6],arr.length))
			isBonus = true;
		if(cnt == 6)			return 1;
		else if(cnt == 5) {
			if(isBonus)			return 2;
			else				return 3;
		}
		else if(cnt == 4)		return 4;
		else if(cnt == 3)		return 5;
		else					return -1;
	}

	public void printArr(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	
}
