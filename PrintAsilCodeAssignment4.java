
public class PrintAsilCodeAssignment4 {

	public static void main(String[] args) {
		int i;
		for (i=65;i<90;i++)
		{
		int code = i;//i is intiated as asci code of its specific charector
		char asci = (char) code;//typecasting
		System.out.println(asci + "-" +i);
		}
	}

}
