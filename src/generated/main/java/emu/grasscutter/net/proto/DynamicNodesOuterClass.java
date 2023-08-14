// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DynamicNodes.proto

package emu.grasscutter.net.proto;

public final class DynamicNodesOuterClass {
  private DynamicNodesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DynamicNodesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DynamicNodes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> 
        getNodesList();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index);
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    int getNodesCount();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
        getNodesOrBuilderList();
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: OPEOGJDEIKG
   * </pre>
   *
   * Protobuf type {@code DynamicNodes}
   */
  public static final class DynamicNodes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DynamicNodes)
      DynamicNodesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DynamicNodes.newBuilder() to construct.
    private DynamicNodes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DynamicNodes() {
      nodes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DynamicNodes();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DynamicNodes(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nodes_ = new java.util.ArrayList<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes>();
                mutable_bitField0_ |= 0x00000001;
              }
              nodes_.add(
                  input.readMessage(emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DynamicNodesOuterClass.internal_static_DynamicNodes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.class, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder.class);
    }

    public static final int NODES_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> nodes_;
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> getNodesList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
        getNodesOrBuilderList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    @java.lang.Override
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     * <code>repeated .DynamicLayerNodes nodes = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
        int index) {
      return nodes_.get(index);
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
      for (int i = 0; i < nodes_.size(); i++) {
        output.writeMessage(15, nodes_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, nodes_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes other = (emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes) obj;

      if (!getNodesList()
          .equals(other.getNodesList())) return false;
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
      if (getNodesCount() > 0) {
        hash = (37 * hash) + NODES_FIELD_NUMBER;
        hash = (53 * hash) + getNodesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes prototype) {
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
     * Obf: OPEOGJDEIKG
     * </pre>
     *
     * Protobuf type {@code DynamicNodes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DynamicNodes)
        emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DynamicNodesOuterClass.internal_static_DynamicNodes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.class, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.newBuilder()
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
          getNodesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nodesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DynamicNodesOuterClass.internal_static_DynamicNodes_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes build() {
        emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes buildPartial() {
        emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes result = new emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes(this);
        int from_bitField0_ = bitField0_;
        if (nodesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nodes_ = java.util.Collections.unmodifiableList(nodes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodes_ = nodes_;
        } else {
          result.nodes_ = nodesBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes) {
          return mergeFrom((emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes other) {
        if (other == emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance()) return this;
        if (nodesBuilder_ == null) {
          if (!other.nodes_.isEmpty()) {
            if (nodes_.isEmpty()) {
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodesIsMutable();
              nodes_.addAll(other.nodes_);
            }
            onChanged();
          }
        } else {
          if (!other.nodes_.isEmpty()) {
            if (nodesBuilder_.isEmpty()) {
              nodesBuilder_.dispose();
              nodesBuilder_ = null;
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNodesFieldBuilder() : null;
            } else {
              nodesBuilder_.addAllMessages(other.nodes_);
            }
          }
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
        emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> nodes_ =
        java.util.Collections.emptyList();
      private void ensureNodesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nodes_ = new java.util.ArrayList<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes>(nodes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> nodesBuilder_;

      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> getNodesList() {
        if (nodesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodes_);
        } else {
          return nodesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public int getNodesCount() {
        if (nodesBuilder_ == null) {
          return nodes_.size();
        } else {
          return nodesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes getNodes(int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);
        } else {
          return nodesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.set(index, value);
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder addNodes(emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(index, value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder addNodes(
          emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder addAllNodes(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes> values) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodes_);
          onChanged();
        } else {
          nodesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder clearNodes() {
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public Builder removeNodes(int index) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.remove(index);
          onChanged();
        } else {
          nodesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder getNodesBuilder(
          int index) {
        return getNodesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder getNodesOrBuilder(
          int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);  } else {
          return nodesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
           getNodesOrBuilderList() {
        if (nodesBuilder_ != null) {
          return nodesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodes_);
        }
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder addNodesBuilder() {
        return getNodesFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder addNodesBuilder(
          int index) {
        return getNodesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicLayerNodes nodes = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder> 
           getNodesBuilderList() {
        return getNodesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder> 
          getNodesFieldBuilder() {
        if (nodesBuilder_ == null) {
          nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder, emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder>(
                  nodes_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nodes_ = null;
        }
        return nodesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DynamicNodes)
    }

    // @@protoc_insertion_point(class_scope:DynamicNodes)
    private static final emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes();
    }

    public static emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DynamicNodes>
        PARSER = new com.google.protobuf.AbstractParser<DynamicNodes>() {
      @java.lang.Override
      public DynamicNodes parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DynamicNodes(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DynamicNodes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicNodes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DynamicNodes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DynamicNodes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022DynamicNodes.proto\032\027DynamicLayerNodes." +
      "proto\"1\n\014DynamicNodes\022!\n\005nodes\030\017 \003(\0132\022.D" +
      "ynamicLayerNodesB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.getDescriptor(),
        });
    internal_static_DynamicNodes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DynamicNodes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DynamicNodes_descriptor,
        new java.lang.String[] { "Nodes", });
    emu.grasscutter.net.proto.DynamicLayerNodesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
