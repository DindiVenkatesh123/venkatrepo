package hashMap;

import java.util.*;

class check extends Thread {
	void m() {
		System.out.println("methos m");
	}

	void m1() {
		System.out.println("methos m1");
	}
}

class threadddd implements Runnable {

	@Override
	public void run() {
		System.out.println("threasdd run");

	}

	void m() {
		System.out.println("methos m");
	}

	void m1() {
		System.out.println("methos m1");
	}
}

public class HashMapExample {

	public static void main(String[] args) {
		check c = new check();

		Thread t = new Thread(new threadddd());
		t.start();
		HashMap<Integer, String> data = new HashMap<>();

		data.put(1, "venkay");
		data.put(2, "venkay");
		data.put(3, "venkay");
		data.put(4, "venkay");
		data.put(5, "venkay");
		data.put(9, "venkay");
		data.put(7, "venkay");
		data.put(8, "venkay");
		data.put(9, "venkay");
		System.out.println(data.keySet());

		Set<Map.Entry<Integer, String>> set = data.entrySet();
		set.forEach(entry -> {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		});
		set.stream().forEach(action -> {
			System.out.println(action.getKey() + "chek " + action.getValue());
		});
		Set<Integer> key = data.keySet();
		System.out.println(key);

		Collection<String> value = data.values();
		System.out.println(value);
		LinkedList<String> link = new LinkedList<>();

		link.add(0, "verrnkay");

		link.add(1, "venkay");
		link.add(2, "venkay");
		link.add(3, "venkay");
		link.add(3, "venkay");
		link.add(4, "venkay");
		link.add(5, "venkay");
		link.add(6, "venkay");
		link.add(7, "venkay");
		System.out.println(link);
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("Aman");
		ll.add("BB");
		ll.add("d");
		ll.add("D");
		System.out.println(ll.hashCode());
		ll.forEach(action -> {
			System.out.println(action.hashCode());
		});

	

	}

}
