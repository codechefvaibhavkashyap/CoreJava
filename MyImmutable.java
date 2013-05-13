/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MutationAndCloning;

/**
 *
 * @author vaibhav
 */
public class MyImmutable {
    private final String name;
    private final int age ;
    private static MyImmutable abc;

    private MyImmutable(String name , int age)
    {
        this.name = name; 
        this.age = age; 
    }
    
    public static MyImmutable getInstance(String name , int age)
    {
        if(abc == null)
        {
            abc = new MyImmutable(name, age);
        }
        
        return abc;
    }
    
    public static void releaseObject()
    {
        abc = null;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
}
