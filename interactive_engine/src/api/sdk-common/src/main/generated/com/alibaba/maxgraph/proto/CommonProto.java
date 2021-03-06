// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/common.proto

package com.alibaba.maxgraph.proto;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EndpointProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EndpointProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricInfoProto_MetricInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricInfoProto_MetricInfoEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerMetricValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerMetricValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DiskMetricProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DiskMetricProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllMetricsInfoResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllMetricsInfoResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AllMetricsInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AllMetricsInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricInfoResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricInfoResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020sdk/common.proto\"{\n\rEndpointProto\022\014\n\004h" +
      "ost\030\001 \001(\t\022\014\n\004port\030\002 \001(\005\022\031\n\021gremlinServer" +
      "Port\030\003 \001(\005\022\023\n\013runtimePort\030\004 \001(\005\022\036\n\026runti" +
      "mCtrlAndAsyncPort\030\005 \001(\005\"\032\n\007Request\022\017\n\007tr" +
      "aceId\030\001 \001(\t\"+\n\010Response\022\017\n\007errCode\030\001 \001(\005" +
      "\022\016\n\006errMsg\030\002 \001(\t\"\007\n\005Empty\"\241\001\n\017MetricInfo" +
      "Proto\0224\n\nmetricInfo\030\001 \003(\0132 .MetricInfoPr" +
      "oto.MetricInfoEntry\022%\n\013diskMetrics\030\002 \003(\013" +
      "2\020.DiskMetricProto\0321\n\017MetricInfoEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"|\n\021ServerM",
      "etricValue\022\020\n\010serverId\030\001 \001(\005\022\021\n\ttimestam" +
      "p\030\002 \001(\003\022\r\n\005value\030\003 \001(\t\022#\n\tdiskValue\030\004 \003(" +
      "\0132\020.DiskMetricProto\022\016\n\006nodeId\030\005 \001(\005\"P\n\017D" +
      "iskMetricProto\022\014\n\004path\030\001 \001(\t\022\r\n\005usage\030\002 " +
      "\001(\003\022\021\n\tavailable\030\003 \001(\003\022\r\n\005total\030\004 \001(\003\"\'\n" +
      "\021MetricInfoRequest\022\022\n\nmetricName\030\001 \001(\t\"Q" +
      "\n\022AllMetricsInfoResp\022\"\n\004info\030\001 \003(\0132\024.All" +
      "MetricsInfoProto\022\027\n\004resp\030\002 \001(\0132\t.Respons" +
      "e\"M\n\023AllMetricsInfoProto\022\022\n\nmetricName\030\001" +
      " \001(\t\022\"\n\006values\030\002 \003(\0132\022.ServerMetricValue",
      "\"M\n\016MetricInfoResp\022\"\n\006values\030\001 \003(\0132\022.Ser" +
      "verMetricValue\022\027\n\004resp\030\002 \001(\0132\t.Response*" +
      "\375\001\n\rOperationType\022\033\n\027INSERT_OVERWRITE_VE" +
      "RTEX\020\000\022$\n INSERT_OVERWRITE_VERTEX_PROPER" +
      "TY\020\001\022\021\n\rDELETE_VERTEX\020\002\022\031\n\025INSERT_OVERWR" +
      "ITE_EDGE\020\003\022\"\n\036INSERT_OVERWRITE_EDGE_PROP" +
      "ERTY\020\004\022\017\n\013DELETE_EDGE\020\005\022\022\n\016BARRIER_MARKE" +
      "R\020\006\022\031\n\025INSERT_REPLACE_VERTEX\020\007\022\027\n\023INSERT" +
      "_REPLACE_EDGE\020\010B1\n\032com.alibaba.maxgraph." +
      "protoB\013CommonProtoP\001\210\001\001\240\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EndpointProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EndpointProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EndpointProto_descriptor,
        new java.lang.String[] { "Host", "Port", "GremlinServerPort", "RuntimePort", "RuntimCtrlAndAsyncPort", });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "TraceId", });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "ErrCode", "ErrMsg", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_MetricInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MetricInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricInfoProto_descriptor,
        new java.lang.String[] { "MetricInfo", "DiskMetrics", });
    internal_static_MetricInfoProto_MetricInfoEntry_descriptor =
      internal_static_MetricInfoProto_descriptor.getNestedTypes().get(0);
    internal_static_MetricInfoProto_MetricInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricInfoProto_MetricInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ServerMetricValue_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ServerMetricValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerMetricValue_descriptor,
        new java.lang.String[] { "ServerId", "Timestamp", "Value", "DiskValue", "NodeId", });
    internal_static_DiskMetricProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DiskMetricProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DiskMetricProto_descriptor,
        new java.lang.String[] { "Path", "Usage", "Available", "Total", });
    internal_static_MetricInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_MetricInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricInfoRequest_descriptor,
        new java.lang.String[] { "MetricName", });
    internal_static_AllMetricsInfoResp_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_AllMetricsInfoResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllMetricsInfoResp_descriptor,
        new java.lang.String[] { "Info", "Resp", });
    internal_static_AllMetricsInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_AllMetricsInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AllMetricsInfoProto_descriptor,
        new java.lang.String[] { "MetricName", "Values", });
    internal_static_MetricInfoResp_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_MetricInfoResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricInfoResp_descriptor,
        new java.lang.String[] { "Values", "Resp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
