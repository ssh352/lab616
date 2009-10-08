// Generated by the protocol buffer compiler.  DO NOT EDIT!

package protobuf_unittest;

public final class UnittestOptimizeFor {
  private UnittestOptimizeFor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.testExtension);
    registry.add(protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.testExtension2);
  }
  public static final class TestOptimizedForSize extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
        TestOptimizedForSize> {
    // Use TestOptimizedForSize.newBuilder() to construct.
    private TestOptimizedForSize() {}
    
    private static final TestOptimizedForSize defaultInstance = new TestOptimizedForSize();
    public static TestOptimizedForSize getDefaultInstance() {
      return defaultInstance;
    }
    
    public TestOptimizedForSize getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestOptimizedForSize_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestOptimizedForSize_fieldAccessorTable;
    }
    
    public static final int TEST_EXTENSION_FIELD_NUMBER = 1234;
    public static
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize,
        java.lang.Integer> testExtension;
    public static final int TEST_EXTENSION2_FIELD_NUMBER = 1235;
    public static
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize,
        protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize> testExtension2;
    // optional int32 i = 1;
    public static final int I_FIELD_NUMBER = 1;
    private boolean hasI;
    private int i_ = 0;
    public boolean hasI() { return hasI; }
    public int getI() { return i_; }
    
    // optional .protobuf_unittest.ForeignMessage msg = 19;
    public static final int MSG_FIELD_NUMBER = 19;
    private boolean hasMsg;
    private protobuf_unittest.UnittestProto.ForeignMessage msg_ = protobuf_unittest.UnittestProto.ForeignMessage.getDefaultInstance();
    public boolean hasMsg() { return hasMsg; }
    public protobuf_unittest.UnittestProto.ForeignMessage getMsg() { return msg_; }
    
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
          protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize, Builder> {
      private protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize result;
      
      // Construct using protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize();
        return builder;
      }
      
      protected protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.getDescriptor();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize getDefaultInstanceForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize returnMe = result;
        result = null;
        return returnMe;
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
      
      // optional .protobuf_unittest.ForeignMessage msg = 19;
      public boolean hasMsg() {
        return result.hasMsg();
      }
      public protobuf_unittest.UnittestProto.ForeignMessage getMsg() {
        return result.getMsg();
      }
      public Builder setMsg(protobuf_unittest.UnittestProto.ForeignMessage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasMsg = true;
        result.msg_ = value;
        return this;
      }
      public Builder setMsg(protobuf_unittest.UnittestProto.ForeignMessage.Builder builderForValue) {
        result.hasMsg = true;
        result.msg_ = builderForValue.build();
        return this;
      }
      public Builder mergeMsg(protobuf_unittest.UnittestProto.ForeignMessage value) {
        if (result.hasMsg() &&
            result.msg_ != protobuf_unittest.UnittestProto.ForeignMessage.getDefaultInstance()) {
          result.msg_ =
            protobuf_unittest.UnittestProto.ForeignMessage.newBuilder(result.msg_).mergeFrom(value).buildPartial();
        } else {
          result.msg_ = value;
        }
        result.hasMsg = true;
        return this;
      }
      public Builder clearMsg() {
        result.hasMsg = false;
        result.msg_ = protobuf_unittest.UnittestProto.ForeignMessage.getDefaultInstance();
        return this;
      }
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.getDescriptor();
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.internalForceInit();
    }
  }
  
  public static final class TestRequiredOptimizedForSize extends
      com.google.protobuf.GeneratedMessage {
    // Use TestRequiredOptimizedForSize.newBuilder() to construct.
    private TestRequiredOptimizedForSize() {}
    
    private static final TestRequiredOptimizedForSize defaultInstance = new TestRequiredOptimizedForSize();
    public static TestRequiredOptimizedForSize getDefaultInstance() {
      return defaultInstance;
    }
    
    public TestRequiredOptimizedForSize getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestRequiredOptimizedForSize_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestRequiredOptimizedForSize_fieldAccessorTable;
    }
    
    // required int32 x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private boolean hasX;
    private int x_ = 0;
    public boolean hasX() { return hasX; }
    public int getX() { return x_; }
    
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize result;
      
      // Construct using protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize();
        return builder;
      }
      
      protected protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.getDescriptor();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize getDefaultInstanceForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // required int32 x = 1;
      public boolean hasX() {
        return result.hasX();
      }
      public int getX() {
        return result.getX();
      }
      public Builder setX(int value) {
        result.hasX = true;
        result.x_ = value;
        return this;
      }
      public Builder clearX() {
        result.hasX = false;
        result.x_ = 0;
        return this;
      }
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.getDescriptor();
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.internalForceInit();
    }
  }
  
  public static final class TestOptionalOptimizedForSize extends
      com.google.protobuf.GeneratedMessage {
    // Use TestOptionalOptimizedForSize.newBuilder() to construct.
    private TestOptionalOptimizedForSize() {}
    
    private static final TestOptionalOptimizedForSize defaultInstance = new TestOptionalOptimizedForSize();
    public static TestOptionalOptimizedForSize getDefaultInstance() {
      return defaultInstance;
    }
    
    public TestOptionalOptimizedForSize getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestOptionalOptimizedForSize_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.UnittestOptimizeFor.internal_static_protobuf_unittest_TestOptionalOptimizedForSize_fieldAccessorTable;
    }
    
    // optional .protobuf_unittest.TestRequiredOptimizedForSize o = 1;
    public static final int O_FIELD_NUMBER = 1;
    private boolean hasO;
    private protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize o_ = protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.getDefaultInstance();
    public boolean hasO() { return hasO; }
    public protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize getO() { return o_; }
    
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeDelimitedFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize result;
      
      // Construct using protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize();
        return builder;
      }
      
      protected protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize.getDescriptor();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize getDefaultInstanceForType() {
        return protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // optional .protobuf_unittest.TestRequiredOptimizedForSize o = 1;
      public boolean hasO() {
        return result.hasO();
      }
      public protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize getO() {
        return result.getO();
      }
      public Builder setO(protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasO = true;
        result.o_ = value;
        return this;
      }
      public Builder setO(protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.Builder builderForValue) {
        result.hasO = true;
        result.o_ = builderForValue.build();
        return this;
      }
      public Builder mergeO(protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize value) {
        if (result.hasO() &&
            result.o_ != protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.getDefaultInstance()) {
          result.o_ =
            protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.newBuilder(result.o_).mergeFrom(value).buildPartial();
        } else {
          result.o_ = value;
        }
        result.hasO = true;
        return this;
      }
      public Builder clearO() {
        result.hasO = false;
        result.o_ = protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.getDefaultInstance();
        return this;
      }
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.getDescriptor();
    }
    
    static {
      protobuf_unittest.UnittestOptimizeFor.internalForceInit();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_TestOptimizedForSize_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_unittest_TestOptimizedForSize_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_TestRequiredOptimizedForSize_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_unittest_TestRequiredOptimizedForSize_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_TestOptionalOptimizedForSize_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_unittest_TestOptionalOptimizedForSize_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/protobuf/unittest_optimize_for." +
      "proto\022\021protobuf_unittest\032\036google/protobu" +
      "f/unittest.proto\"\222\002\n\024TestOptimizedForSiz" +
      "e\022\t\n\001i\030\001 \001(\005\022.\n\003msg\030\023 \001(\0132!.protobuf_uni" +
      "ttest.ForeignMessage*\t\010\350\007\020\200\200\200\200\0022@\n\016test_" +
      "extension\022\'.protobuf_unittest.TestOptimi" +
      "zedForSize\030\322\t \001(\0052r\n\017test_extension2\022\'.p" +
      "rotobuf_unittest.TestOptimizedForSize\030\323\t" +
      " \001(\0132/.protobuf_unittest.TestRequiredOpt" +
      "imizedForSize\")\n\034TestRequiredOptimizedFo",
      "rSize\022\t\n\001x\030\001 \002(\005\"Z\n\034TestOptionalOptimize" +
      "dForSize\022:\n\001o\030\001 \001(\0132/.protobuf_unittest." +
      "TestRequiredOptimizedForSizeB\002H\002"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_unittest_TestOptimizedForSize_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_unittest_TestOptimizedForSize_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_unittest_TestOptimizedForSize_descriptor,
              new java.lang.String[] { "I", "Msg", },
              protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.class,
              protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.Builder.class);
          protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.testExtension =
            com.google.protobuf.GeneratedMessage.newGeneratedExtension(
              protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.getDescriptor().getExtensions().get(0),
              java.lang.Integer.class);
          protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.testExtension2 =
            com.google.protobuf.GeneratedMessage.newGeneratedExtension(
              protobuf_unittest.UnittestOptimizeFor.TestOptimizedForSize.getDescriptor().getExtensions().get(1),
              protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.class);
          internal_static_protobuf_unittest_TestRequiredOptimizedForSize_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_protobuf_unittest_TestRequiredOptimizedForSize_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_unittest_TestRequiredOptimizedForSize_descriptor,
              new java.lang.String[] { "X", },
              protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.class,
              protobuf_unittest.UnittestOptimizeFor.TestRequiredOptimizedForSize.Builder.class);
          internal_static_protobuf_unittest_TestOptionalOptimizedForSize_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_protobuf_unittest_TestOptionalOptimizedForSize_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_unittest_TestOptionalOptimizedForSize_descriptor,
              new java.lang.String[] { "O", },
              protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize.class,
              protobuf_unittest.UnittestOptimizeFor.TestOptionalOptimizedForSize.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protobuf_unittest.UnittestProto.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
}
