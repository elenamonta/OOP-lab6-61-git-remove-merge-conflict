public final class HelloWorld {

	private static final String AUTHOR = "Danilo Pianini";

	private static int procNumber(){
		return Runtime.getRuntime().availableProcessors()
	}

	public static void main(final String[] args) {
		System.out.println("This program is runninf in a PC with " + procNumber() + "logic processor!");
		System.out.println("This program has been realised by " + AUTHOR);
	}

}
