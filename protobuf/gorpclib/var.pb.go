// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.5
// source: var.proto

package gorpclib

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type VarStatusMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id        string    `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Status    VarStatus `protobuf:"varint,2,opt,name=status,proto3,enum=com.sts.rpclib.VarStatus" json:"status,omitempty"`
	Timestamp int64     `protobuf:"varint,3,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
}

func (x *VarStatusMessage) Reset() {
	*x = VarStatusMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_var_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VarStatusMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VarStatusMessage) ProtoMessage() {}

func (x *VarStatusMessage) ProtoReflect() protoreflect.Message {
	mi := &file_var_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VarStatusMessage.ProtoReflect.Descriptor instead.
func (*VarStatusMessage) Descriptor() ([]byte, []int) {
	return file_var_proto_rawDescGZIP(), []int{0}
}

func (x *VarStatusMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *VarStatusMessage) GetStatus() VarStatus {
	if x != nil {
		return x.Status
	}
	return VarStatus_VAR_STARTED
}

func (x *VarStatusMessage) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

type VarReasonMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id        string    `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Reason    VarReason `protobuf:"varint,2,opt,name=reason,proto3,enum=com.sts.rpclib.VarReason" json:"reason,omitempty"`
	Timestamp int64     `protobuf:"varint,3,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
}

func (x *VarReasonMessage) Reset() {
	*x = VarReasonMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_var_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VarReasonMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VarReasonMessage) ProtoMessage() {}

func (x *VarReasonMessage) ProtoReflect() protoreflect.Message {
	mi := &file_var_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VarReasonMessage.ProtoReflect.Descriptor instead.
func (*VarReasonMessage) Descriptor() ([]byte, []int) {
	return file_var_proto_rawDescGZIP(), []int{1}
}

func (x *VarReasonMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *VarReasonMessage) GetReason() VarReason {
	if x != nil {
		return x.Reason
	}
	return VarReason_VAR_REASON_UNKNOWN
}

func (x *VarReasonMessage) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

var File_var_proto protoreflect.FileDescriptor

var file_var_proto_rawDesc = []byte{
	0x0a, 0x09, 0x76, 0x61, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x63, 0x6f, 0x6d,
	0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0b, 0x65, 0x6e, 0x75,
	0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x73, 0x0a, 0x10, 0x56, 0x61, 0x72, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x31, 0x0a, 0x06,
	0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x19, 0x2e, 0x63,
	0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x56, 0x61,
	0x72, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12,
	0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x03, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x22, 0x73, 0x0a,
	0x10, 0x56, 0x61, 0x72, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x12, 0x31, 0x0a, 0x06, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x19, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c,
	0x69, 0x62, 0x2e, 0x56, 0x61, 0x72, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x52, 0x06, 0x72, 0x65,
	0x61, 0x73, 0x6f, 0x6e, 0x12, 0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x67, 0x72, 0x6f, 0x75,
	0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63,
	0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_var_proto_rawDescOnce sync.Once
	file_var_proto_rawDescData = file_var_proto_rawDesc
)

func file_var_proto_rawDescGZIP() []byte {
	file_var_proto_rawDescOnce.Do(func() {
		file_var_proto_rawDescData = protoimpl.X.CompressGZIP(file_var_proto_rawDescData)
	})
	return file_var_proto_rawDescData
}

var file_var_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_var_proto_goTypes = []interface{}{
	(*VarStatusMessage)(nil), // 0: com.sts.rpclib.VarStatusMessage
	(*VarReasonMessage)(nil), // 1: com.sts.rpclib.VarReasonMessage
	(VarStatus)(0),           // 2: com.sts.rpclib.VarStatus
	(VarReason)(0),           // 3: com.sts.rpclib.VarReason
}
var file_var_proto_depIdxs = []int32{
	2, // 0: com.sts.rpclib.VarStatusMessage.status:type_name -> com.sts.rpclib.VarStatus
	3, // 1: com.sts.rpclib.VarReasonMessage.reason:type_name -> com.sts.rpclib.VarReason
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_var_proto_init() }
func file_var_proto_init() {
	if File_var_proto != nil {
		return
	}
	file_enums_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_var_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VarStatusMessage); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_var_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VarReasonMessage); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_var_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_var_proto_goTypes,
		DependencyIndexes: file_var_proto_depIdxs,
		MessageInfos:      file_var_proto_msgTypes,
	}.Build()
	File_var_proto = out.File
	file_var_proto_rawDesc = nil
	file_var_proto_goTypes = nil
	file_var_proto_depIdxs = nil
}
