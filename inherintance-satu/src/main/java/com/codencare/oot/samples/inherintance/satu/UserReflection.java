/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codencare.oot.samples.inherintance.satu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milh__000
 */
public class UserReflection {
    static Janji j;
    static{
        try {
            //ada banyak pilihan class loader termasuk load dari url/file
            // gunakan URLClassLoader
            //File file = new File("c:\\myclasses\\");
            // Convert File to a URL
            //URL url = file.toURL();          // file:/c:/myclasses/
            //URL[] urls = new URL[]{url};
            //ClassLoader aClassLoader = new URLClassLoader(url);
            ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
            
            String classNameToBeLoaded = "com.codencare.oot.samples.inherintance.satu.KenyataanIni";
            
            Class aClass = myClassLoader.loadClass(classNameToBeLoaded);      
            Object anInstance = aClass.newInstance();
            if(anInstance instanceof Janji)
                j = (Janji)anInstance;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(UserReflection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String [] args){
        System.out.println(j.satu());
        System.out.println(j.dua());
    }
}
