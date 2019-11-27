/**
 * @author AKPATA Kodjo pierre
 */
public abstract class InductiveIntList implements IntList{

    @Override
    public abstract int getHead();

    @Override
    public abstract InductiveIntList getTail();

    @Override
    public abstract boolean isEmpty();

    @Override
    public abstract IntList cons(int n);

    @Override
    public abstract int length();

    @Override
    public abstract int sum();

    @Override
    public abstract boolean equals(InductiveIntList list);

}
