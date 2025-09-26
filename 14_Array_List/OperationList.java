
import java.util.ArrayList;


public class OperationList {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Boolean> list2=new ArrayList<>();

    // add operation ... TC = 0(1)

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.add(0,100);
     
    System.out.println(list);

    // get operation ... TC = 0(1)

    int element =list.get(2);
    System.out.println(element);
    System.out.println(list.get(1));

    // delete operation ... TC = 0(n)

    list.remove(2);
    System.out.println(list);

    // set operation .. TC = 0(n)

    list.set(1, 20);
    System.out.println(list);

  // Contaion opearation .. TC=0(n)

System.out.println(list.contains(10));
System.out.println(list.contains(1));

System.out.println(list.size());

for(int i=0 ; i<list.size() ; i++){
  System.out.print(list.get(i)+" ");
}
System.out.println();
  }
}
