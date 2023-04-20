// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.5
// source: bookmakers.proto

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

// all bookmakers should be suffixed _BOOKMAKER to avoid collisions with other enums in proto
type Bookmaker int32

const (
	Bookmaker_UNKNOWN_BOOKMAKER       Bookmaker = 0
	Bookmaker_BETWAY_BOOKMAKER        Bookmaker = 1
	Bookmaker_BET365_BOOKMAKER        Bookmaker = 2
	Bookmaker_BETWAY_AFRICA_BOOKMAKER Bookmaker = 3
)

// Enum value maps for Bookmaker.
var (
	Bookmaker_name = map[int32]string{
		0: "UNKNOWN_BOOKMAKER",
		1: "BETWAY_BOOKMAKER",
		2: "BET365_BOOKMAKER",
		3: "BETWAY_AFRICA_BOOKMAKER",
	}
	Bookmaker_value = map[string]int32{
		"UNKNOWN_BOOKMAKER":       0,
		"BETWAY_BOOKMAKER":        1,
		"BET365_BOOKMAKER":        2,
		"BETWAY_AFRICA_BOOKMAKER": 3,
	}
)

func (x Bookmaker) Enum() *Bookmaker {
	p := new(Bookmaker)
	*p = x
	return p
}

func (x Bookmaker) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Bookmaker) Descriptor() protoreflect.EnumDescriptor {
	return file_bookmakers_proto_enumTypes[0].Descriptor()
}

func (Bookmaker) Type() protoreflect.EnumType {
	return &file_bookmakers_proto_enumTypes[0]
}

func (x Bookmaker) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Bookmaker.Descriptor instead.
func (Bookmaker) EnumDescriptor() ([]byte, []int) {
	return file_bookmakers_proto_rawDescGZIP(), []int{0}
}

var File_bookmakers_proto protoreflect.FileDescriptor

var file_bookmakers_proto_rawDesc = []byte{
	0x0a, 0x10, 0x62, 0x6f, 0x6f, 0x6b, 0x6d, 0x61, 0x6b, 0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c,
	0x69, 0x62, 0x2a, 0x6b, 0x0a, 0x09, 0x42, 0x6f, 0x6f, 0x6b, 0x6d, 0x61, 0x6b, 0x65, 0x72, 0x12,
	0x15, 0x0a, 0x11, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x5f, 0x42, 0x4f, 0x4f, 0x4b, 0x4d,
	0x41, 0x4b, 0x45, 0x52, 0x10, 0x00, 0x12, 0x14, 0x0a, 0x10, 0x42, 0x45, 0x54, 0x57, 0x41, 0x59,
	0x5f, 0x42, 0x4f, 0x4f, 0x4b, 0x4d, 0x41, 0x4b, 0x45, 0x52, 0x10, 0x01, 0x12, 0x14, 0x0a, 0x10,
	0x42, 0x45, 0x54, 0x33, 0x36, 0x35, 0x5f, 0x42, 0x4f, 0x4f, 0x4b, 0x4d, 0x41, 0x4b, 0x45, 0x52,
	0x10, 0x02, 0x12, 0x1b, 0x0a, 0x17, 0x42, 0x45, 0x54, 0x57, 0x41, 0x59, 0x5f, 0x41, 0x46, 0x52,
	0x49, 0x43, 0x41, 0x5f, 0x42, 0x4f, 0x4f, 0x4b, 0x4d, 0x41, 0x4b, 0x45, 0x52, 0x10, 0x03, 0x42,
	0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_bookmakers_proto_rawDescOnce sync.Once
	file_bookmakers_proto_rawDescData = file_bookmakers_proto_rawDesc
)

func file_bookmakers_proto_rawDescGZIP() []byte {
	file_bookmakers_proto_rawDescOnce.Do(func() {
		file_bookmakers_proto_rawDescData = protoimpl.X.CompressGZIP(file_bookmakers_proto_rawDescData)
	})
	return file_bookmakers_proto_rawDescData
}

var file_bookmakers_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_bookmakers_proto_goTypes = []interface{}{
	(Bookmaker)(0), // 0: com.sts.rpclib.Bookmaker
}
var file_bookmakers_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_bookmakers_proto_init() }
func file_bookmakers_proto_init() {
	if File_bookmakers_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_bookmakers_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_bookmakers_proto_goTypes,
		DependencyIndexes: file_bookmakers_proto_depIdxs,
		EnumInfos:         file_bookmakers_proto_enumTypes,
	}.Build()
	File_bookmakers_proto = out.File
	file_bookmakers_proto_rawDesc = nil
	file_bookmakers_proto_goTypes = nil
	file_bookmakers_proto_depIdxs = nil
}