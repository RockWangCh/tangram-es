/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mapzen.tangram;

public class tangramJNI {
  public final static native long new_Properties();
  public final static native void Properties_clear(long jarg1, Properties jarg1_);
  public final static native boolean Properties_contains(long jarg1, Properties jarg1_, String jarg2);
  public final static native float Properties_getNumeric(long jarg1, Properties jarg1_, String jarg2);
  public final static native String Properties_getString(long jarg1, Properties jarg1_, String jarg2);
  public final static native void Properties_add__SWIG_0(long jarg1, Properties jarg1_, String jarg2, String jarg3);
  public final static native void Properties_add__SWIG_1(long jarg1, Properties jarg1_, String jarg2, float jarg3);
  public final static native void delete_Properties(long jarg1);
  public final static native long getProp();
}
