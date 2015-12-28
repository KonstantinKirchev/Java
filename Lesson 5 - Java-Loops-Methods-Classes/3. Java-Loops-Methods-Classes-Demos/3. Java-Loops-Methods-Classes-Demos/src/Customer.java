public class Customer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) { // ако няма set, firstName може
						 // само да се чете. Не мога да
						 // го променя. Със set мога да
						 // проверявам за валидност на
						 // данните.
	if (firstName==null) {
	    throw new NullPointerException("firstName cannot be null");
	}
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

}
