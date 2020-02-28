# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
   When we create an objects, we will see new.
   1. dogs
   2. Dog("Fido",4)
   3. Dog("Fido",3)
   4. Dog("Alfie",4)
   5. Comparator<Annimal>()

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

   Comparator constructor is created new Comparator<Animal>()
   
   Class definition for the Comparator is
   	 public int compare(Animal a, Animal b){
	 	 return a.getLegs() - b.getLegs();
	}


