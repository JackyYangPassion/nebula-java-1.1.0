/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AddPartReq implements TBase, java.io.Serializable, Cloneable, Comparable<AddPartReq> {
  private static final TStruct STRUCT_DESC = new TStruct("AddPartReq");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PART_ID_FIELD_DESC = new TField("part_id", TType.I32, (short)2);
  private static final TField AS_LEARNER_FIELD_DESC = new TField("as_learner", TType.BOOL, (short)3);
  private static final TField PEERS_FIELD_DESC = new TField("peers", TType.LIST, (short)4);

  public int space_id;
  public int part_id;
  public boolean as_learner;
  public List<com.vesoft.nebula.HostAddr> peers;
  public static final int SPACE_ID = 1;
  public static final int PART_ID = 2;
  public static final int AS_LEARNER = 3;
  public static final int PEERS = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __PART_ID_ISSET_ID = 1;
  private static final int __AS_LEARNER_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PART_ID, new FieldMetaData("part_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(AS_LEARNER, new FieldMetaData("as_learner", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(PEERS, new FieldMetaData("peers", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AddPartReq.class, metaDataMap);
  }

  public AddPartReq() {
  }

  public AddPartReq(
    int space_id,
    int part_id,
    boolean as_learner,
    List<com.vesoft.nebula.HostAddr> peers)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.part_id = part_id;
    setPart_idIsSet(true);
    this.as_learner = as_learner;
    setAs_learnerIsSet(true);
    this.peers = peers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddPartReq(AddPartReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    this.part_id = TBaseHelper.deepCopy(other.part_id);
    this.as_learner = TBaseHelper.deepCopy(other.as_learner);
    if (other.isSetPeers()) {
      this.peers = TBaseHelper.deepCopy(other.peers);
    }
  }

  public AddPartReq deepCopy() {
    return new AddPartReq(this);
  }

  @Deprecated
  public AddPartReq clone() {
    return new AddPartReq(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public AddPartReq setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public int  getPart_id() {
    return this.part_id;
  }

  public AddPartReq setPart_id(int part_id) {
    this.part_id = part_id;
    setPart_idIsSet(true);
    return this;
  }

  public void unsetPart_id() {
    __isset_bit_vector.clear(__PART_ID_ISSET_ID);
  }

  // Returns true if field part_id is set (has been assigned a value) and false otherwise
  public boolean isSetPart_id() {
    return __isset_bit_vector.get(__PART_ID_ISSET_ID);
  }

  public void setPart_idIsSet(boolean value) {
    __isset_bit_vector.set(__PART_ID_ISSET_ID, value);
  }

  public boolean  isAs_learner() {
    return this.as_learner;
  }

  public AddPartReq setAs_learner(boolean as_learner) {
    this.as_learner = as_learner;
    setAs_learnerIsSet(true);
    return this;
  }

  public void unsetAs_learner() {
    __isset_bit_vector.clear(__AS_LEARNER_ISSET_ID);
  }

  // Returns true if field as_learner is set (has been assigned a value) and false otherwise
  public boolean isSetAs_learner() {
    return __isset_bit_vector.get(__AS_LEARNER_ISSET_ID);
  }

  public void setAs_learnerIsSet(boolean value) {
    __isset_bit_vector.set(__AS_LEARNER_ISSET_ID, value);
  }

  public List<com.vesoft.nebula.HostAddr>  getPeers() {
    return this.peers;
  }

  public AddPartReq setPeers(List<com.vesoft.nebula.HostAddr> peers) {
    this.peers = peers;
    return this;
  }

  public void unsetPeers() {
    this.peers = null;
  }

  // Returns true if field peers is set (has been assigned a value) and false otherwise
  public boolean isSetPeers() {
    return this.peers != null;
  }

  public void setPeersIsSet(boolean value) {
    if (!value) {
      this.peers = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PART_ID:
      if (value == null) {
        unsetPart_id();
      } else {
        setPart_id((Integer)value);
      }
      break;

    case AS_LEARNER:
      if (value == null) {
        unsetAs_learner();
      } else {
        setAs_learner((Boolean)value);
      }
      break;

    case PEERS:
      if (value == null) {
        unsetPeers();
      } else {
        setPeers((List<com.vesoft.nebula.HostAddr>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PART_ID:
      return new Integer(getPart_id());

    case AS_LEARNER:
      return new Boolean(isAs_learner());

    case PEERS:
      return getPeers();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case PART_ID:
      return isSetPart_id();
    case AS_LEARNER:
      return isSetAs_learner();
    case PEERS:
      return isSetPeers();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddPartReq)
      return this.equals((AddPartReq)that);
    return false;
  }

  public boolean equals(AddPartReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_part_id = true;
    boolean that_present_part_id = true;
    if (this_present_part_id || that_present_part_id) {
      if (!(this_present_part_id && that_present_part_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.part_id, that.part_id))
        return false;
    }

    boolean this_present_as_learner = true;
    boolean that_present_as_learner = true;
    if (this_present_as_learner || that_present_as_learner) {
      if (!(this_present_as_learner && that_present_as_learner))
        return false;
      if (!TBaseHelper.equalsNobinary(this.as_learner, that.as_learner))
        return false;
    }

    boolean this_present_peers = true && this.isSetPeers();
    boolean that_present_peers = true && that.isSetPeers();
    if (this_present_peers || that_present_peers) {
      if (!(this_present_peers && that_present_peers))
        return false;
      if (!TBaseHelper.equalsNobinary(this.peers, that.peers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_part_id = true;
    builder.append(present_part_id);
    if (present_part_id)
      builder.append(part_id);

    boolean present_as_learner = true;
    builder.append(present_as_learner);
    if (present_as_learner)
      builder.append(as_learner);

    boolean present_peers = true && (isSetPeers());
    builder.append(present_peers);
    if (present_peers)
      builder.append(peers);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(AddPartReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPart_id()).compareTo(other.isSetPart_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(part_id, other.part_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAs_learner()).compareTo(other.isSetAs_learner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(as_learner, other.as_learner);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPeers()).compareTo(other.isSetPeers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(peers, other.peers);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PART_ID:
          if (field.type == TType.I32) {
            this.part_id = iprot.readI32();
            setPart_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case AS_LEARNER:
          if (field.type == TType.BOOL) {
            this.as_learner = iprot.readBool();
            setAs_learnerIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PEERS:
          if (field.type == TType.LIST) {
            {
              TList _list113 = iprot.readListBegin();
              this.peers = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list113.size));
              for (int _i114 = 0; 
                   (_list113.size < 0) ? iprot.peekList() : (_i114 < _list113.size); 
                   ++_i114)
              {
                com.vesoft.nebula.HostAddr _elem115;
                _elem115 = new com.vesoft.nebula.HostAddr();
                _elem115.read(iprot);
                this.peers.add(_elem115);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PART_ID_FIELD_DESC);
    oprot.writeI32(this.part_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(AS_LEARNER_FIELD_DESC);
    oprot.writeBool(this.as_learner);
    oprot.writeFieldEnd();
    if (this.peers != null) {
      oprot.writeFieldBegin(PEERS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.peers.size()));
        for (com.vesoft.nebula.HostAddr _iter116 : this.peers)        {
          _iter116.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AddPartReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("part_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getPart_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("as_learner");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isAs_learner(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("peers");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getPeers() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getPeers(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
