package com.maven.MavenTest;

/**
 * Hello world!
 *
 */
public class App {
	public  int max(int a, int b) {
		
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		return 1;
	}
	public  int min(int a, int b) {
		
		if (a > b) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
		return 1;
	}
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
}
