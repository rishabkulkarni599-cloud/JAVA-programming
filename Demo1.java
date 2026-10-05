public class Demo1 {
	int a = 10;
	int b = 20;

		void add(int a, int b) {
			System.out.println(this.a+this.b);
			System.out.println(a+b);
		}

		public static void main(String[] args) {
			Demo1 ff = new Demo1();
			ff.add(2, 3);

		}
	}

