import supplythis.MyServiceIF;

module SubProjectConsumer {
//  requires java.base; // implicitly required
  // this causes us to "read" the module (i.e. have permissions)
  // AND mandates that it must be present at code start
  requires SubProjectSupplier;
  uses MyServiceIF;
}
