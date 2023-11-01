package serviceimpl;

import supplythis.MyServiceIF;

import java.time.LocalTime;

public class MyServiceImpl implements MyServiceIF {
  @Override
  public String getMessage() {
    return "Service message time is " + LocalTime.now();
  }
}
