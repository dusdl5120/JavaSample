package day10;

public class Memo {

	public static void main(String[] args) {

		String a = "mp4";
		
		if (a.endsWith("mp4") || a.endsWith("wmv") || a.endsWith("avi")) {
			
			System.out.println("동영상파일");
			
		} else {
			
			System.out.println("동영상파일 아님");
		}
	}
}

