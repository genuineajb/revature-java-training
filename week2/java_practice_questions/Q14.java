package questions;

public class Q14 {

	public static void main(String[] args) throws InterruptedException {
		StringBuilder builder = new StringBuilder();
		StringBuffer buffer = new StringBuffer();
		
		// append 1000 words to both
		for (int i = 0; i < 1000; ++i) {
			builder.append("word");
			buffer.append("word");
		}
		
		// compare builder and buffer output
		String builderOutput = builder.toString();
		String bufferOutput = buffer.toString();
		boolean match = builderOutput.equals(bufferOutput);
		System.out.println("Does the StringBuilder and StringBuffer output match: " + match);
		
		// create two threads that append strings to Builder
		StringBuilder threadBuilder = new StringBuilder();
		Thread thread1 = new Thread(() -> {
			for (int j = 0; j < 500; ++j) {
				threadBuilder.append("thread1");
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int k = 0; k < 500; ++k) {
				threadBuilder.append("thread2");
			}
		});
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println("Builder Expected length: 7000");
		System.out.println("Builder Actual length: " + threadBuilder.length());
		
		// Create two strings that append words to Buffer
		StringBuffer threadBuffer = new StringBuffer();
		Thread thread3 = new Thread (() -> {
			for (int l = 0; l < 500; ++l) {
				threadBuffer.append("thread3");
			}
		});
		Thread thread4 = new Thread(() -> {
			for (int m = 0; m < 500; ++m) {
				threadBuffer.append("thread4");
			}
		});
		
		thread3.start();
		thread4.start();
		thread3.join();
		thread4.join();
		
		System.out.println("Thread buffer Expected length: 7000");
		System.out.println("Thread buffer Actual length: " + threadBuffer.length());
		
	}

}
