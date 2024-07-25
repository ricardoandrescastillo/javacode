package com.practice.java8;

import com.practice.java8.interfaces.IPersona;
import com.practice.java8.interfaces.IPersonaS;
import com.practice.java8.interfaces.Persona;

import java.util.Arrays;

public class RefMethod {


    public static void staticMethod() {
        System.out.println("reference to static method");
    }

    public void arbitraryMethod() {
        String[] names = { "Ricardo", "Andres", "Jaime" };
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println("Arbitrary "+ Arrays.toString(names));
    }

    public void particularMethod() {
        System.out.println("reference to particular method");
    }

    public void constructorMethod() {
       /* IPersona ipersona = new IPersona() {
            @Override
            public Persona create (int id, String name) {
                return new Persona(id, "Andres");
            }
        };
        Persona per = ipersona.create(1, "Ricardo");
        System.out.println(per.getId()+"  "+ per.getName());*/

       /* IPersona ipersona = (id, name) -> new Persona(id, name);
        Persona persona = ipersona.create(1,"Ricardo");
        System.out.println(persona.getId() +" " +persona.getName());*/
        IPersona ipersona = Persona::new;
        Persona persona = ipersona.create(1,"Ricardo");
        System.out.println("constructor " + persona.getId() +" " +persona.getName());
    }


    public static void main(String[] args) {
        // Referring static method
        //IPerson person = () -> RefMethod.staticMethod();
        IPersonaS person = RefMethod::staticMethod;
        // Calling interface method
        person.say();
        // Referring arbitrary method
        RefMethod refMethod = new RefMethod();
        //refMethod.arbitraryMethod();
        IPersonaS person1 = refMethod::particularMethod;
        person1.say();
        IPersonaS person2 = refMethod::arbitraryMethod;
        person2.say();
        refMethod.constructorMethod();
    }
}
