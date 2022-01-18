package collection;

public class ArrayList<E> {

    private static final int SIZE_FACTOR=5;

    private Object[] data;

    private int index;

    private int size;

    public ArrayList(){
        this.data=new Object[SIZE_FACTOR];
        this.size=SIZE_FACTOR;
    }

    public void add(Object obj){
        if(this.index==this.size-1){
            increaseSizeAndReallocate();
        }
        data[this.index]=obj;
        this.index++;

    }

    private void increaseSizeAndReallocate() {
        this.size=this.size+SIZE_FACTOR;
        Object[] newData =new Object[this.size];
        System.arraycopy(data, 0, newData, 0, data.length);
        this.data=newData;
    }

    public Object get(int i) throws Exception {
        if (i > this.index-1) {
            throw new Exception("ArrayIndexOutOfBound");
        }
        if (i < 0) {
            throw new Exception("Negative Value");
        }
        return this.data[i];

    }

    public void remove(int i) throws Exception{
        if( i > this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        }
        if(i < 0){
            throw new Exception("Negative Value");
        }
        if (this.data.length - 1 - i >= 0) System.arraycopy(data, i + 1, data, i, this.data.length - 1 - i);
        this.index--;
    }
}