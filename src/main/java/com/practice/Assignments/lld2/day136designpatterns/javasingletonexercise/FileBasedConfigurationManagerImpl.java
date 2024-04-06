package com.practice.Assignments.lld2.day136designpatterns.javasingletonexercise;



public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
  private static FileBasedConfigurationManager instance;
  private FileBasedConfigurationManagerImpl(){

  }
  @Override
  public String getConfiguration(String key) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    return properties.getProperty(key);
  }

  @Override
  public <T> T getConfiguration(String key, Class<T> type) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    String value=properties.getProperty(key);
    if(value!=null)
    {
      return instance.convert(value,type);
    }
    return null;

  }

  @Override
  public void setConfiguration(String key, String value) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    properties.put(key,value);
  }

  @Override
  public <T> void setConfiguration(String key, T value) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    properties.put(key,value.toString());
  }

  @Override
  public void removeConfiguration(String key) {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    properties.remove(key);
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    //  throw new UnsupportedOperationException("Unimplemented method 'clear'");
    properties.clear();
  }

  public static FileBasedConfigurationManager getInstance() {
    // TODO Auto-generated method stub
    if(instance==null){
      synchronized(FileBasedConfigurationManagerImpl.class){
        if(instance==null){
          instance=new FileBasedConfigurationManagerImpl();
        }
      }

    }
    return instance;
  }

  public static void resetInstance() {
    // TODO Auto-generated method stub
    instance=null;
  }

}
