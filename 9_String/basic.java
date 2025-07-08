


public class basic {
  public static void main(String[] args) {
    // char ch[]={'a,'b,'c','d','e'};
    // String str="Tirtha ";
    // System.out.println("String is: "+str);
    // Scanner sc=new Scanner(System.in);
    // String name=sc.nextLine();
    // System.out.println("My name is "+name);
    // System.out.println(name.length());
    String firstName="Tirtha ";
    String secondName="Ghosh";
    String fullName=firstName+" "+secondName;
    System.out.println("Full Name is: "+fullName);
    System.out.println(fullName.charAt(0));
    for(int i=0;i<fullName.length();i++){
      System.out.print(fullName.charAt(i)+" ");
    }

  }
}
