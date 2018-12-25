/**
 * FileName:   StackOOMTest.java
 * @Description TODO
 * All rights Reserved, Code by Muskteer
 * Copyright MuskteerAthos@gmail.com
 * @author MuskteerAthos
 */
package com.muskteer.java.jvm.oom;

/**
 * @author wanglei
 *
 */
public class StackOOMTest {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread(){
        while(true){
            Thread thread=new Thread(new Runnable(){
                @Override
                public void run(){
                    dontStop();
                }
                
            });
            thread.start();
         }
       }

    public static void main(String[] args) {
        new StackOOMTest().stackLeakByThread();
    }
}
