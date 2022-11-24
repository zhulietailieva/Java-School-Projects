
public class EGNtest {

	public static void main(String[] args) {
		EGN egn=new EGN("0346127733");
		System.out.println(egn.getBirthDate());
		System.out.println(egn.getGender());
		System.out.println(egn.isIDcorrect());

	}

}
