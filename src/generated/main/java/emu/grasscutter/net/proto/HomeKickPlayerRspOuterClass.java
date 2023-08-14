// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeKickPlayerRsp.proto

package emu.grasscutter.net.proto;

public final class HomeKickPlayerRspOuterClass {
  private HomeKickPlayerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeKickPlayerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeKickPlayerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_kick_all = 10;</code>
     * @return The isKickAll.
     */
    boolean getIsKickAll();

    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 1719
   * Obf: PEDCPFBACNG
   * </pre>
   *
   * Protobuf type {@code HomeKickPlayerRsp}
   */
  public static final class HomeKickPlayerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeKickPlayerRsp)
      HomeKickPlayerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeKickPlayerRsp.newBuilder() to construct.
    private HomeKickPlayerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeKickPlayerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeKickPlayerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeKickPlayerRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 80: {

              isKickAll_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.class, emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.Builder.class);
    }

    public static final int IS_KICK_ALL_FIELD_NUMBER = 10;
    private boolean isKickAll_;
    /**
     * <code>bool is_kick_all = 10;</code>
     * @return The isKickAll.
     */
    @java.lang.Override
    public boolean getIsKickAll() {
      return isKickAll_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 9;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(9, targetUid_);
      }
      if (isKickAll_ != false) {
        output.writeBool(10, isKickAll_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, targetUid_);
      }
      if (isKickAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isKickAll_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp other = (emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp) obj;

      if (getIsKickAll()
          != other.getIsKickAll()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_KICK_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsKickAll());
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 1719
     * Obf: PEDCPFBACNG
     * </pre>
     *
     * Protobuf type {@code HomeKickPlayerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeKickPlayerRsp)
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.class, emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isKickAll_ = false;

        targetUid_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.internal_static_HomeKickPlayerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp build() {
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp buildPartial() {
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp result = new emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp(this);
        result.isKickAll_ = isKickAll_;
        result.targetUid_ = targetUid_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp other) {
        if (other == emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp.getDefaultInstance()) return this;
        if (other.getIsKickAll() != false) {
          setIsKickAll(other.getIsKickAll());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isKickAll_ ;
      /**
       * <code>bool is_kick_all = 10;</code>
       * @return The isKickAll.
       */
      @java.lang.Override
      public boolean getIsKickAll() {
        return isKickAll_;
      }
      /**
       * <code>bool is_kick_all = 10;</code>
       * @param value The isKickAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsKickAll(boolean value) {
        
        isKickAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_kick_all = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsKickAll() {
        
        isKickAll_ = false;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeKickPlayerRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeKickPlayerRsp)
    private static final emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp();
    }

    public static emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeKickPlayerRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeKickPlayerRsp>() {
      @java.lang.Override
      public HomeKickPlayerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeKickPlayerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeKickPlayerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeKickPlayerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeKickPlayerRspOuterClass.HomeKickPlayerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeKickPlayerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeKickPlayerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeKickPlayerRsp.proto\"M\n\021HomeKickPla" +
      "yerRsp\022\023\n\013is_kick_all\030\n \001(\010\022\022\n\ntarget_ui" +
      "d\030\t \001(\r\022\017\n\007retcode\030\010 \001(\005B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeKickPlayerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeKickPlayerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeKickPlayerRsp_descriptor,
        new java.lang.String[] { "IsKickAll", "TargetUid", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
