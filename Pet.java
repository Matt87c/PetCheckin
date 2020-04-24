public class Pet {
	//variable declaration within pet class
	public static void main(String[] args) {}
		private String petType;
		private String petName;
		private int petAge;		
		private int dogSpace;
		private int catSpace;
		private int daysStay;
		private double amountDue;
	
	// Default constructor
	public Pet() {
	}
	
	// User inputs
	public Pet(String petType, String petName, int petAge, int daysStay) {
		setPetType(petType);
		setPetName(petName);
		setPetAge(petAge);
		setDogSpace(30);
		setCatSpace(12);
		setDaysStay(daysStay);
    }

	private void setPetAge(int petAge2) {
		// TODO Auto-generated method stub
		
	}
// Mutators and accessors for user input
//user check in/out methods for Pet class
	public String checkIn() {
		return "checkedIn";
	}
	
	public String checkOut() {
		return "checkedOut";
	}
	
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
		
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void getPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public int getDogSpace() {
		return dogSpace;
	}
	
	public void setDogSpace(int dogSpace) {
		this.dogSpace = dogSpace;
	}
	
	public int getCatSpace() {
		return catSpace;
	}
	
	public void setCatSpace(int catSpace) {
		this.catSpace = catSpace;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	public void createPet(String petName) {
	}
	
	public void updatePet() {
	}
}

//Dog subclass with the methods of Pet superclass
class Dog extends Pet {
	public int dogSpaceNbr;
	public double dogWeight;
	public boolean grooming;
//Assignment of determined pet services
public Dog(String petType, String petName, int petAge, int dogSpaceNbr, double dogWeight, int daysStay, boolean grooming) {
	// object-oriented programming principle inheritance
	super(petType, petName, petAge, daysStay);
}
	
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
	// accessors to get the value set by mutator
	public boolean getGrooming() {
		return grooming;
	}
	
	public void setDogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
	}
		
	public int getDogSpaceNbr() {
		return dogSpaceNbr;
	}
	
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	
	public double getDogWeight() {
		return dogWeight;
	}
}



	