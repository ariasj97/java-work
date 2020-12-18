package custom_demo;

public class Validation {

	public boolean isValidAge(int age) throws InvalidAgeException {
		
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be zero or -ve");
		}
		
		if(age<18 || age >40) {
			throw new InvalidAgeException("Only users between age 18 and 40 are acceptable");
		}
		
		return true;
	}
	
	
	public boolean isValidMobileNumber(String mobileNumber) throws BusinessException {
	
		if(!mobileNumber.matches("\\+1-[0-9]{10}")) {
			throw new BusinessException("Entered Mobile Number "+mobileNumber+" is INVALID");
		}
		
		return true;
	}
	
	//Custom Checked exception if the entered DL is valid or not
	public boolean isValidDL(String dl) throws InvalidDLException {
	
		
		//In NJ a valid dl numbers is a capital letter followed by 14 digits
		if (!dl.matches("[A-Z]{1}[0-9]{14}")) {
			throw new InvalidDLException("This is an invalid Driverse License #");
		}
		
		return true;
	}
	
	
	 //Custom Unchecked exception for checking if the entered Passport number is valid or not
	public boolean isValidPN(String passportNumber) throws PassportException {
		
		//United States passport # is 9 numbers 0-9
		if(!passportNumber.matches("[0-9]{9}")) {
			throw new PassportException("Entered Passport Number "+passportNumber+" is INVALID");
		}
		
		return true;
		
		
		
	}
	
	
}
