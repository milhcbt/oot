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
    static Angka j;
    static Angka loadClass (String className){
        Object anInstance = null;
        try {
            //ada banyak pilihan class loader termasuk load dari url/file/jar
            //mengunakan URLClassLoader contoh
            //File file = new File("c:\\myclasses\\");
            // Convert File to a URL
            //URL url = file.toURL();          // file:/c:/myclasses/
            //URL[] urls = new URL[]{url};
            //ClassLoader aClassLoader = new URLClassLoader(url);
            //menggunakan SystemClassLoader harus dipastikan file class ada di
            //class path jvm (https://docs.oracle.com/cd/E19830-01/819-4712/ablwm/)
            ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
            
            String classNameToBeLoaded = className;
            
            Class aClass = myClassLoader.loadClass(classNameToBeLoaded);      
            anInstance = aClass.newInstance();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(UserReflection.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(anInstance instanceof Angka)
               return (Angka)anInstance;
       return null;
    }
    public static void main(String [] args){
        j = loadClass("com.codencare.oot.samples.inherintance.satu.AngkaEn");
        System.out.println(j.satu());
        System.out.println(j.dua());
         j = loadClass("com.codencare.oot.samples.inherintance.satu.AngkaId");
        System.out.println(j.satu());
        System.out.println(j.dua());
    }
}
