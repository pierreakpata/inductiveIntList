/**
 * @author AKPATA Kodjo pierre
 */
public class NonEmptyIntList extends InductiveIntList {

    private int head;
    private InductiveIntList tail;

    public NonEmptyIntList(int head, InductiveIntList tail){
        this.head=head;
        this.tail=tail;
    }

    @Override
    public int getHead() {
        return this.head;
    }

    @Override
    public InductiveIntList getTail() {
        return this.tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntList cons(int n) {
        return new NonEmptyIntList(n, this);
    }

    @Override
    public int length() {
        return 1+tail.length();
    }

    @Override
    public int sum() {
        return head+tail.sum();
    }

    public boolean equals(InductiveIntList list){
        if(list.isEmpty()) {
            return false;
        }
        else{
            if(this.head == list.getHead() && this.getTail().equals(list.getTail()) ){
                return true ;
            }
            return false;
        }
    }
}
