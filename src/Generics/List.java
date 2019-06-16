package Generics;

public class List<T> {
    private T [] datastore;    //and array because of []
    private int size;
    private int pos;
    List (int numberOfElements){
        size= numberOfElements;
        pos = 0;
        datastore = (T[])  new Object[size];
    }
public void add(T element) {
        datastore[pos] = element;
        ++pos;
}
public String toString () {
        String elements = "";
        for(int i = 0; i <pos; ++i){
            elements += datastore[i] + " ";
        }
        return elements;
}
}
