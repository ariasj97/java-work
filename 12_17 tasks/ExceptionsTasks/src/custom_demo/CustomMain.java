package custom_demo;

public class CustomMain {

	public static void main(String[] args) {
		
		Validation v=new Validation();
		try {
			if(v.isValidAge(-1)) {
				System.out.println("Age Validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidMobileNumber("+1-9123456780")) {
			System.out.println("Mobile Number Validated");
		}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidDL("A12345678913111")) {
				System.out.println("Drivers License Validated");
			}
		} catch (InvalidDLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidPN("123451789")) {
				System.out.println("Passport Number Validated");
			}
			}catch(PassportException e) {
				System.out.println(e.getMessage());
			}
	}

}

//Create a Custom Checked exception if the entered DL is valid or not. DONE
//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not. DONE