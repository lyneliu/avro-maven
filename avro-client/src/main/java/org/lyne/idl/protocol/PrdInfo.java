/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.lyne.idl.protocol;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface PrdInfo {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"PrdInfo\",\"namespace\":\"org.lyne.idl.protocol\",\"types\":[{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"city\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"PrdIdentity\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"PrdInfoType\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"UserIdentity\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"UserInfoType\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"addr\",\"type\":{\"type\":\"array\",\"items\":\"Address\"}}]}],\"messages\":{\"queryPrdInfo\":{\"request\":[{\"name\":\"prdIdentity\",\"type\":\"PrdIdentity\"}],\"response\":\"PrdInfoType\"},\"queryUserInfo\":{\"request\":[{\"name\":\"userIdentity\",\"type\":\"UserIdentity\"}],\"response\":\"UserInfoType\"}}}");
  /**
   */
  org.lyne.idl.protocol.PrdInfoType queryPrdInfo(org.lyne.idl.protocol.PrdIdentity prdIdentity) throws org.apache.avro.AvroRemoteException;
  /**
   */
  org.lyne.idl.protocol.UserInfoType queryUserInfo(org.lyne.idl.protocol.UserIdentity userIdentity) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends PrdInfo {
    public static final org.apache.avro.Protocol PROTOCOL = org.lyne.idl.protocol.PrdInfo.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void queryPrdInfo(org.lyne.idl.protocol.PrdIdentity prdIdentity, org.apache.avro.ipc.Callback<org.lyne.idl.protocol.PrdInfoType> callback) throws java.io.IOException;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void queryUserInfo(org.lyne.idl.protocol.UserIdentity userIdentity, org.apache.avro.ipc.Callback<org.lyne.idl.protocol.UserInfoType> callback) throws java.io.IOException;
  }
}