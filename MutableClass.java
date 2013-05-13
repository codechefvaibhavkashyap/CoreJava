/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MutationAndCloning;

/**
 *
 * @author vaibhav
 */
public class MutableClass{
     
    private String name;
    private int age;
 
    public MutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    MutableClass() {
   
    }
 
    public String getName() {
        return name;
    }

   public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
