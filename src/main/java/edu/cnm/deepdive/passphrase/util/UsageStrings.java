package edu.cnm.deepdive.passphrase.util;

import java.util.ResourceBundle;

public class UsageStrings {

  private final ResourceBundle bundle;
  private static class Singleton{
    private static final UsageStrings INSTANCE = new UsageStrings();
  }
  private UsageStrings() {
    bundle = ResourceBundle.getBundle(Constants. USAGE_BUNDLE);

  }
  //how other class can get instance of method
  public static ResourceBundle getBundle(){
    return Singleton.INSTANCE.bundle;
  }




}
