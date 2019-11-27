/**
 * @author AKPATA Kodjo pierre
 */
public interface IntList {

    int getHead();

    InductiveIntList getTail();

    boolean isEmpty();

    IntList cons(int n);

    int length();

    int sum();

    boolean equals(InductiveIntList list);
}
