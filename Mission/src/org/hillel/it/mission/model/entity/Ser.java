package org.hillel.it.mission.model.entity;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.lang3.SerializationUtils;

public class Ser {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("SerializationToFile.hillel");
//      User userSer = new User();

      SerializationUtils.serialize("test", fos);
      fos.close();

      FileInputStream fis = new FileInputStream("SerializationToFile.hillel");
      String ser = (String) SerializationUtils.deserialize(fis);
      System.out.println(ser);
      fis.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}