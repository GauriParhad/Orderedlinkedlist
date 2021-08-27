public class OrderedList<T implements Comparable<T>> extends MyLinkedList<T>{
public void insert(T d){
        if(empty()){
        push_front(d);
        }
        else{
        MyList<T>.MyListIter it=begin();
        int i=0;
        //This won't work obviously
        for(;i<size()||it.current().compareTo(it.next())==-1;++i,it.next()){
        //find node to place the new node before it
        it.prev(); //Need to go back one since we went forward in the loopcheck.
        }
        }


