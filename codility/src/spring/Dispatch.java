package spring;

import java.util.Arrays;
import java.util.List;

public class Dispatch {

	static abstract class Service {
		abstract void run();
	}

	static class MySvc extends Service {

		@Override
		void run() {
			System.out.println("run1");
		}
	}

	static class MySvc2 extends Service {

		@Override
		void run() {
			System.out.println("run2");

		}

	}

	public static void main(String[] args) {
		List<Service> list = Arrays.asList(new MySvc(), new MySvc2());
		
		list.forEach(Service::run);
	}
	

}
