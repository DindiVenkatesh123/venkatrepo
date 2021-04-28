package hashMap;

class checking implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread());
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}

}

class multiThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new checking());
		Thread t2 = new Thread(new checking());
		Thread t3 = new Thread(new checking());

		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t3.start();

	}
}
