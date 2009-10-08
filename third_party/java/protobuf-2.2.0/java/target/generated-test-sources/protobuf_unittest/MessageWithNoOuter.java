// Generated by the protocol buffer compiler.  DO NOT EDIT!

package protobuf_unittest;

public  final class MessageWithNoOuter extends
    com.google.protobuf.GeneratedMessage {
  // Use MessageWithNoOuter.newBuilder() to construct.
  private MessageWithNoOuter() {}
  
  private static final MessageWithNoOuter defaultInstance = new MessageWithNoOuter();
  public static MessageWithNoOuter getDefaultInstance() {
    return defaultInstance;
  }
  
  public MessageWithNoOuter getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf_unittest.MultipleFilesTestProto.internal_static_protobuf_unittest_MessageWithNoOuter_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.MultipleFilesTestProto.internal_static_protobuf_unittest_MessageWithNoOuter_fieldAccessorTable;
  }
  
  public enum NestedEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    BAZ(0, 3),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static NestedEnum valueOf(int value) {
      switch (value) {
        case 3: return BAZ;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<NestedEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<NestedEnum>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NestedEnum>() {
            public NestedEnum findValueByNumber(int number) {
              return NestedEnum.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return protobuf_unittest.MessageWithNoOuter.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final NestedEnum[] VALUES = {
      BAZ, 
    };
    public static NestedEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private NestedEnum(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      protobuf_unittest.MultipleFilesTestProto.getDescriptor();
    }
  }
  
  public static final class NestedMessage extends
      com.google.protobuf.GeneratedMessage {
    // Use NestedMessage.newBuilder() to construct.
    private NestedMessage() {}
    
    private static final NestedMessage defaultInstance = new NestedMessage();
    public static NestedMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public NestedMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.MultipleFilesTestProto.internal_static_protobuf_unittest_MessageWithNoOuter_NestedMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.MultipleFilesTestProto.internal_static_protobuf_unittest_MessageWithNoOuter_NestedMessage_fieldAccessorTable;
    }
    
    // optional int32 i = 1;
    public static final int I_FIELD_NUMBER = 1;
    private boolean hasI;
    private int i_ = 0;
    public boolean hasI() { return hasI; }
    public int getI() { return i_; }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (hasI()) {
        output.writeInt32(1, getI());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasI()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getI());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.MessageWithNoOuter.NestedMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf_unittest.MessageWithNoOuter.NestedMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private protobuf_unittest.MessageWithNoOuter.NestedMessage result;
      
      // Construct using protobuf_unittest.MessageWithNoOuter.NestedMessage.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new protobuf_unittest.MessageWithNoOuter.NestedMessage();
        return builder;
      }
      
      protected protobuf_unittest.MessageWithNoOuter.NestedMessage internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new protobuf_unittest.MessageWithNoOuter.NestedMessage();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.MessageWithNoOuter.NestedMessage.getDescriptor();
      }
      
      public protobuf_unittest.MessageWithNoOuter.NestedMessage getDefaultInstanceForType() {
        return protobuf_unittest.MessageWithNoOuter.NestedMessage.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public protobuf_unittest.MessageWithNoOuter.NestedMessage build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private protobuf_unittest.MessageWithNoOuter.NestedMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public protobuf_unittest.MessageWithNoOuter.NestedMessage buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        protobuf_unittest.MessageWithNoOuter.NestedMessage returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf_unittest.MessageWithNoOuter.NestedMessage) {
          return mergeFrom((protobuf_unittest.MessageWithNoOuter.NestedMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(protobuf_unittest.MessageWithNoOuter.NestedMessage other) {
        if (other == protobuf_unittest.MessageWithNoOuter.NestedMessage.getDefaultInstance()) return this;
        if (other.hasI()) {
          setI(other.getI());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setI(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional int32 i = 1;
      public boolean hasI() {
        return result.hasI();
      }
      public int getI() {
        return result.getI();
      }
      public Builder setI(int value) {
        result.hasI = true;
        result.i_ = value;
        return this;
      }
      public Builder clearI() {
        result.hasI = false;
        result.i_ = 0;
        return this;
      }
    }
    
    static {
      protobuf_unittest.MultipleFilesTestProto.getDescriptor();
    }
    
    static {
      protobuf_unittest.MultipleFilesTestProto.internalForceInit();
    }
  }
  
  // optional .protobuf_unittest.MessageWithNoOuter.NestedMessage nested = 1;
  public static final int NESTED_FIELD_NUMBER = 1;
  private boolean hasNested;
  private protobuf_unittest.MessageWithNoOuter.NestedMessage nested_ = protobuf_unittest.MessageWithNoOuter.NestedMessage.getDefaultInstance();
  public boolean hasNested() { return hasNested; }
  public protobuf_unittest.MessageWithNoOuter.NestedMessage getNested() { return nested_; }
  
  // repeated .protobuf_unittest.TestAllTypes foreign = 2;
  public static final int FOREIGN_FIELD_NUMBER = 2;
  private java.util.List<protobuf_unittest.UnittestProto.TestAllTypes> foreign_ =
    java.util.Collections.emptyList();
  public java.util.List<protobuf_unittest.UnittestProto.TestAllTypes> getForeignList() {
    return foreign_;
  }
  public int getForeignCount() { return foreign_.size(); }
  public protobuf_unittest.UnittestProto.TestAllTypes getForeign(int index) {
    return foreign_.get(index);
  }
  
  // optional .protobuf_unittest.MessageWithNoOuter.NestedEnum nested_enum = 3;
  public static final int NESTED_ENUM_FIELD_NUMBER = 3;
  private boolean hasNestedEnum;
  private protobuf_unittest.MessageWithNoOuter.NestedEnum nestedEnum_ = protobuf_unittest.MessageWithNoOuter.NestedEnum.BAZ;
  public boolean hasNestedEnum() { return hasNestedEnum; }
  public protobuf_unittest.MessageWithNoOuter.NestedEnum getNestedEnum() { return nestedEnum_; }
  
  // optional .protobuf_unittest.EnumWithNoOuter foreign_enum = 4;
  public static final int FOREIGN_ENUM_FIELD_NUMBER = 4;
  private boolean hasForeignEnum;
  private protobuf_unittest.EnumWithNoOuter foreignEnum_ = protobuf_unittest.EnumWithNoOuter.FOO;
  public boolean hasForeignEnum() { return hasForeignEnum; }
  public protobuf_unittest.EnumWithNoOuter getForeignEnum() { return foreignEnum_; }
  
  public final boolean isInitialized() {
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (hasNested()) {
      output.writeMessage(1, getNested());
    }
    for (protobuf_unittest.UnittestProto.TestAllTypes element : getForeignList()) {
      output.writeMessage(2, element);
    }
    if (hasNestedEnum()) {
      output.writeEnum(3, getNestedEnum().getNumber());
    }
    if (hasForeignEnum()) {
      output.writeEnum(4, getForeignEnum().getNumber());
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    if (hasNested()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNested());
    }
    for (protobuf_unittest.UnittestProto.TestAllTypes element : getForeignList()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, element);
    }
    if (hasNestedEnum()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, getNestedEnum().getNumber());
    }
    if (hasForeignEnum()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, getForeignEnum().getNumber());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }
  
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeDelimitedFrom(input).buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.MessageWithNoOuter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(protobuf_unittest.MessageWithNoOuter prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }
  
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> {
    private protobuf_unittest.MessageWithNoOuter result;
    
    // Construct using protobuf_unittest.MessageWithNoOuter.newBuilder()
    private Builder() {}
    
    private static Builder create() {
      Builder builder = new Builder();
      builder.result = new protobuf_unittest.MessageWithNoOuter();
      return builder;
    }
    
    protected protobuf_unittest.MessageWithNoOuter internalGetResult() {
      return result;
    }
    
    public Builder clear() {
      if (result == null) {
        throw new IllegalStateException(
          "Cannot call clear() after build().");
      }
      result = new protobuf_unittest.MessageWithNoOuter();
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(result);
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.MessageWithNoOuter.getDescriptor();
    }
    
    public protobuf_unittest.MessageWithNoOuter getDefaultInstanceForType() {
      return protobuf_unittest.MessageWithNoOuter.getDefaultInstance();
    }
    
    public boolean isInitialized() {
      return result.isInitialized();
    }
    public protobuf_unittest.MessageWithNoOuter build() {
      if (result != null && !isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return buildPartial();
    }
    
    private protobuf_unittest.MessageWithNoOuter buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      if (!isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return buildPartial();
    }
    
    public protobuf_unittest.MessageWithNoOuter buildPartial() {
      if (result == null) {
        throw new IllegalStateException(
          "build() has already been called on this Builder.");
      }
      if (result.foreign_ != java.util.Collections.EMPTY_LIST) {
        result.foreign_ =
          java.util.Collections.unmodifiableList(result.foreign_);
      }
      protobuf_unittest.MessageWithNoOuter returnMe = result;
      result = null;
      return returnMe;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf_unittest.MessageWithNoOuter) {
        return mergeFrom((protobuf_unittest.MessageWithNoOuter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(protobuf_unittest.MessageWithNoOuter other) {
      if (other == protobuf_unittest.MessageWithNoOuter.getDefaultInstance()) return this;
      if (other.hasNested()) {
        mergeNested(other.getNested());
      }
      if (!other.foreign_.isEmpty()) {
        if (result.foreign_.isEmpty()) {
          result.foreign_ = new java.util.ArrayList<protobuf_unittest.UnittestProto.TestAllTypes>();
        }
        result.foreign_.addAll(other.foreign_);
      }
      if (other.hasNestedEnum()) {
        setNestedEnum(other.getNestedEnum());
      }
      if (other.hasForeignEnum()) {
        setForeignEnum(other.getForeignEnum());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder(
          this.getUnknownFields());
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              return this;
            }
            break;
          }
          case 10: {
            protobuf_unittest.MessageWithNoOuter.NestedMessage.Builder subBuilder = protobuf_unittest.MessageWithNoOuter.NestedMessage.newBuilder();
            if (hasNested()) {
              subBuilder.mergeFrom(getNested());
            }
            input.readMessage(subBuilder, extensionRegistry);
            setNested(subBuilder.buildPartial());
            break;
          }
          case 18: {
            protobuf_unittest.UnittestProto.TestAllTypes.Builder subBuilder = protobuf_unittest.UnittestProto.TestAllTypes.newBuilder();
            input.readMessage(subBuilder, extensionRegistry);
            addForeign(subBuilder.buildPartial());
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            protobuf_unittest.MessageWithNoOuter.NestedEnum value = protobuf_unittest.MessageWithNoOuter.NestedEnum.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              setNestedEnum(value);
            }
            break;
          }
          case 32: {
            int rawValue = input.readEnum();
            protobuf_unittest.EnumWithNoOuter value = protobuf_unittest.EnumWithNoOuter.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(4, rawValue);
            } else {
              setForeignEnum(value);
            }
            break;
          }
        }
      }
    }
    
    
    // optional .protobuf_unittest.MessageWithNoOuter.NestedMessage nested = 1;
    public boolean hasNested() {
      return result.hasNested();
    }
    public protobuf_unittest.MessageWithNoOuter.NestedMessage getNested() {
      return result.getNested();
    }
    public Builder setNested(protobuf_unittest.MessageWithNoOuter.NestedMessage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.hasNested = true;
      result.nested_ = value;
      return this;
    }
    public Builder setNested(protobuf_unittest.MessageWithNoOuter.NestedMessage.Builder builderForValue) {
      result.hasNested = true;
      result.nested_ = builderForValue.build();
      return this;
    }
    public Builder mergeNested(protobuf_unittest.MessageWithNoOuter.NestedMessage value) {
      if (result.hasNested() &&
          result.nested_ != protobuf_unittest.MessageWithNoOuter.NestedMessage.getDefaultInstance()) {
        result.nested_ =
          protobuf_unittest.MessageWithNoOuter.NestedMessage.newBuilder(result.nested_).mergeFrom(value).buildPartial();
      } else {
        result.nested_ = value;
      }
      result.hasNested = true;
      return this;
    }
    public Builder clearNested() {
      result.hasNested = false;
      result.nested_ = protobuf_unittest.MessageWithNoOuter.NestedMessage.getDefaultInstance();
      return this;
    }
    
    // repeated .protobuf_unittest.TestAllTypes foreign = 2;
    public java.util.List<protobuf_unittest.UnittestProto.TestAllTypes> getForeignList() {
      return java.util.Collections.unmodifiableList(result.foreign_);
    }
    public int getForeignCount() {
      return result.getForeignCount();
    }
    public protobuf_unittest.UnittestProto.TestAllTypes getForeign(int index) {
      return result.getForeign(index);
    }
    public Builder setForeign(int index, protobuf_unittest.UnittestProto.TestAllTypes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.foreign_.set(index, value);
      return this;
    }
    public Builder setForeign(int index, protobuf_unittest.UnittestProto.TestAllTypes.Builder builderForValue) {
      result.foreign_.set(index, builderForValue.build());
      return this;
    }
    public Builder addForeign(protobuf_unittest.UnittestProto.TestAllTypes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (result.foreign_.isEmpty()) {
        result.foreign_ = new java.util.ArrayList<protobuf_unittest.UnittestProto.TestAllTypes>();
      }
      result.foreign_.add(value);
      return this;
    }
    public Builder addForeign(protobuf_unittest.UnittestProto.TestAllTypes.Builder builderForValue) {
      if (result.foreign_.isEmpty()) {
        result.foreign_ = new java.util.ArrayList<protobuf_unittest.UnittestProto.TestAllTypes>();
      }
      result.foreign_.add(builderForValue.build());
      return this;
    }
    public Builder addAllForeign(
        java.lang.Iterable<? extends protobuf_unittest.UnittestProto.TestAllTypes> values) {
      if (result.foreign_.isEmpty()) {
        result.foreign_ = new java.util.ArrayList<protobuf_unittest.UnittestProto.TestAllTypes>();
      }
      super.addAll(values, result.foreign_);
      return this;
    }
    public Builder clearForeign() {
      result.foreign_ = java.util.Collections.emptyList();
      return this;
    }
    
    // optional .protobuf_unittest.MessageWithNoOuter.NestedEnum nested_enum = 3;
    public boolean hasNestedEnum() {
      return result.hasNestedEnum();
    }
    public protobuf_unittest.MessageWithNoOuter.NestedEnum getNestedEnum() {
      return result.getNestedEnum();
    }
    public Builder setNestedEnum(protobuf_unittest.MessageWithNoOuter.NestedEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.hasNestedEnum = true;
      result.nestedEnum_ = value;
      return this;
    }
    public Builder clearNestedEnum() {
      result.hasNestedEnum = false;
      result.nestedEnum_ = protobuf_unittest.MessageWithNoOuter.NestedEnum.BAZ;
      return this;
    }
    
    // optional .protobuf_unittest.EnumWithNoOuter foreign_enum = 4;
    public boolean hasForeignEnum() {
      return result.hasForeignEnum();
    }
    public protobuf_unittest.EnumWithNoOuter getForeignEnum() {
      return result.getForeignEnum();
    }
    public Builder setForeignEnum(protobuf_unittest.EnumWithNoOuter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.hasForeignEnum = true;
      result.foreignEnum_ = value;
      return this;
    }
    public Builder clearForeignEnum() {
      result.hasForeignEnum = false;
      result.foreignEnum_ = protobuf_unittest.EnumWithNoOuter.FOO;
      return this;
    }
  }
  
  static {
    protobuf_unittest.MultipleFilesTestProto.getDescriptor();
  }
  
  static {
    protobuf_unittest.MultipleFilesTestProto.internalForceInit();
  }
}

