// automatically generated by the FlatBuffers compiler, do not modify

package DeviceData;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class SensorReading extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_24_3_25(); }
  public static SensorReading getRootAsSensorReading(ByteBuffer _bb) { return getRootAsSensorReading(_bb, new SensorReading()); }
  public static SensorReading getRootAsSensorReading(ByteBuffer _bb, SensorReading obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SensorReading __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int sensorId() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public byte valueType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table value(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createSensorReading(FlatBufferBuilder builder,
      int sensorId,
      byte valueType,
      int valueOffset) {
    builder.startTable(3);
    SensorReading.addValue(builder, valueOffset);
    SensorReading.addValueType(builder, valueType);
    SensorReading.addSensorId(builder, sensorId);
    return SensorReading.endSensorReading(builder);
  }

  public static void startSensorReading(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addSensorId(FlatBufferBuilder builder, int sensorId) { builder.addByte(0, (byte) sensorId, (byte) 0); }
  public static void addValueType(FlatBufferBuilder builder, byte valueType) { builder.addByte(1, valueType, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(2, valueOffset, 0); }
  public static int endSensorReading(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SensorReading get(int j) { return get(new SensorReading(), j); }
    public SensorReading get(SensorReading obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

