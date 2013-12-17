package org.zeroturnaround.demoapps.swing;

public class InfiniteLoop {

  private int counter = 0;
  
  public InfiniteLoop() {
    
  }
  
  public void start() {
    while (true) {
      try {
        Thread.currentThread().sleep(1000);
      }
      catch (Exception e) {  
      }
      
      System.out.println("--- this is cycle # " + counter);
      counter++;
    }
  }
  
}