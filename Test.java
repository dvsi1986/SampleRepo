
//Hello welcome!



public class Test {

<<<<<<< HEAD
	public static void   main(String[] args) {
=======
	public static void main(String[] args  ) {
>>>>>>> b2
		String now = "2016-11-09 10:30:00";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);

		System.out.println("Before : " + now);

		System.out.println("After : " + formatDateTime);

		System.out.println("After : " + formatDateTime.format(formatter));

	}

}
