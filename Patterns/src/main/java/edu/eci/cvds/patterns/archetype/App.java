package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        if (args.length > 0) {
            System.out.print("Hola,");
            for(String i: args){
                System.out.print(" " + i);
            }
            System.out.print("!");
        } else {
            System.out.print("Hello, world!");
        }
    }
}
