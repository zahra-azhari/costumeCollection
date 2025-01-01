package interfacee;

import java.util.List;

public interface ListInterface {

    //    void remove(int  val);
    List<Integer> add(int val);

    void remove(int index);

    int size();

    int get(int index);
}
