import java.util.NoSuchElementException;

/**
 * @author AKPATA Kodjo pierre
 */
public class EmptyIntList extends InductiveIntList {

    @Override
    public int getHead() throws NoSuchElementException {
        throw new NoSuchElementException();
    }

    @Override
    public InductiveIntList getTail() throws NoSuchElementException{
        throw new NoSuchElementException();
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public IntList cons(int n) {
        return new NonEmptyIntList(n,this);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int sum() {
        return 0;
    }

    public boolean equals(InductiveIntList list){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
}
