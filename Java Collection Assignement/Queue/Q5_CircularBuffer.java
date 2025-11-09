
import java.util.*;
public class Q5_CircularBuffer {
    static class CircularBuffer<T>{
        private Object[] data; int head=0,size=0;
        CircularBuffer(int cap){ data=new Object[cap]; }
        void add(T x){
            if(size==data.length){ head=(head+1)%data.length; size--; }
            data[(head+size)%data.length]=x; size++;
        }
        List<T> snapshot(){ List<T> r=new ArrayList<>(); for(int i=0;i<size;i++) r.add((T)data[(head+i)%data.length]); return r;}
    }
    public static void main(String[] args){
        CircularBuffer<Integer> cb=new CircularBuffer<>(3);
        cb.add(1); cb.add(2); cb.add(3); cb.add(4);
        System.out.println("basic/advanced snapshot: "+cb.snapshot());
    }
}
