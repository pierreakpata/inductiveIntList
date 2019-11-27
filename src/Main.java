/**
 * @author AKPATA Kodjo pierre
 */
public class Main {

    public static void main(String[] args) {
	    InductiveIntList myList= (InductiveIntList) new EmptyIntList().cons(3).cons(2).cons(1);
		InductiveIntList myList2= (InductiveIntList) new EmptyIntList().cons(3).cons(2).cons(1);

	    int result=myList.sum();
	    System.out.println(result);

	    InductiveIntList myLongerList= (InductiveIntList) myList.cons(8);
	    result=myLongerList.sum();
	    System.out.println(result);
	    result=myList.sum();
	    System.out.println(result);

		//Test d'égaliter
		System.out.println(myList.equals(myList2));
    }
}
