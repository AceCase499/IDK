package csc252;
/**
Revised class for basic pet data: name, age, and weight.
*/
public class Pet3
{
	public static String owner;
    private String name;
    private int age; //in years
    private double weight; //in pounds
    

    public Pet3 (String initialName, int initialAge, double initialWeight)
    {
        this(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }


    public Pet3 (int initialAge)
    {
        this ("To be determined.", initialAge, 0);
    }


    public Pet3 (double initialWeight)
    {
        this("To be determined",0,initialWeight);
    }

    public Pet3 (String initialName){
    	
    	setName(initialName);
        setAge(0);
        setWeight(0);
    }
    
    public Pet3 ()
    {
        setName("To be determined");
        setAge(0);
        setWeight(0);
    }

    
    public void setName (String newName){
        if(newName.equals("")) {
        	System.out.println ("Error: Name cannot be blank.");
        	System.exit(0);
        	
    } else{
    	name = newName;
    	
    }
    }
    public void setAge (int newAge)
    {
        if(newAge < 0)
    	set (name, newAge, weight); //name and weight unchanged
        System.out.println ("Error: Negative age.");
    }


    public void setWeight (double newWeight)
    {
    	if ((newWeight < 0)) {
            System.out.println ("Error: Negative weight.");
            System.exit (0);
        }
        else
        {
            weight = newWeight;
    }
    }


    private void set (String newName, int newAge,
            double newWeight)
    {
        name = newName;
        if ((newWeight < 0))
        {
            System.out.println ("Error: Negative weight.");
            System.exit (0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }
    
    public void writeOutput(){
    	System.out.println("Pet's name is " + name);
    	System.out.println("Pet's age is " + age);
    	System.out.println("Pet's weight is " + weight);
    	System.out.println("Pet owner is " + owner);

    }
    
    public boolean equals(Pet3 otherPet) {
    	return (this.name.equalsIgnoreCase(otherPet.name) && (this.age==otherPet.age) 
    			&& (this.weight==otherPet.weight));
    }

    /*  The rest of the class is like Pet2 in Listing 6.3.  */
}