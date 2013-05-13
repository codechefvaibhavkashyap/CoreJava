/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MutationAndCloning;

/**
 *
 * @author vaibhav
 */
public class CallImmutable {
    
    public static void main(String... w)
    {
        String s = "String class test";
        s.concat(" immutable test");
System.out.println(s);
String v = s.concat("immutable test"); // value getting re-assigned
System.out.println(v);
System.out.println(s);
  System.out.println("///////////////");        
        
       MutableClass mc = new MutableClass();
       mc.setName("anvesh");
       mc.setName("shyam lal");
       System.out.println(mc.getName());
       String name = "VAIBHAV";
       name.toLowerCase();
       System.out.println(name);
//       MyImmutable mi = new MyImmutable("baba", 1000);
//       new MyImmutable("kaba", 1000);
//       System.out.println(mi.getName());
       
       MyImmutable mi = MyImmutable.getInstance("tom", 1000);
       MyImmutable mi2 = MyImmutable.getInstance("harry", 2000);
       System.out.println(mi.getName()+" %%% "+ mi.getAge());
       System.out.println(mi2.getName()+" %%% "+ mi2.getAge());
       MyImmutable.releaseObject();
       mi2 = MyImmutable.getInstance("mickey", 2000);   
       System.out.println(mi2.getName()+" %%% "+ mi2.getAge());
    }
    
}
