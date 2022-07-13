package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class ByteExample {
	public static void main(String[] args) {	
	long start = System.nanoTime();

		
       try {
			FileOutputStream fis = new FileOutputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image3.png");
			byte[] arr = new byte[100];
			
			
			while(true) {
				int buf = fis.read(arr);
				if(buf == -1) {
					break;
				}
			
				fos.write(arr);
			}
			fos.flush();
			fos.close();
			fis.close();
			
			
			
			
		} catch (IOException e) {	
			e.printStackTrace();
		}
		long end = System.nanoTime();
       
       System.out.println("처리시간: " + (end - start) + "나노");	
	}


public static void read2() {

    try {
       FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
       byte[] arr = new byte[2]; //
       while (true) {
          int buf = fis.read(arr); // 3byte(10,20,30) -> 2byte
          if (buf == -1) {
             break;
          }
          for (int i = 0; i < buf; i++) {
             System.out.println(arr[i]);
          }
          System.out.println();
       }
       fis.close();
    } catch (IOException e) {
       e.printStackTrace();
    }
    System.out.println("실행.");

}

	public static void write2() {
		
		byte[ ] arr = new byte[] {10,20,30} ;
		
       try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr);
			fos.flush();
			fos.close();
			
		} catch (IOException e) {	
			e.printStackTrace();
		}
		System.out.println("실행.");	
	}
			
			
			
			



	//byte 기반 입력스트림.
	public static void read1() {

		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			
			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}

	public static void write1( ) {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20,c = 30;
			
			fos.write(a);
			fos.write(b);
			fos.write(c);
			
			fos.flush();
			fos.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
		
	}
	
	
	
}