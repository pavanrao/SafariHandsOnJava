import supplythis.MyServiceIF;

// should be lowercase, dotted, name (like a package)
// but dots in the name are reflected in a SINGLE directory name :)
/*open*/ module SubProjectSupplier {
  exports supplythis;
  opens supplythis;

  provides MyServiceIF with serviceimpl.MyServiceImpl;
}