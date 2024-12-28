
import java.nio.ByteBuffer;
import DeviceData.*;

public class FlatBufferExample {
    public static void main(String[] args) {
        // Your byte array (ensure this is the correct data you're working with)
        byte[] byteArray = {
           (byte) 0x10,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x0a,(byte) 0x00,(byte) 0x0c,(byte) 0x00,(byte) 0x04,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x08,(byte) 0x00,(byte) 0x0a,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x01,(byte) 0x00,(byte) 0x01,(byte) 0x00,(byte) 0x04,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x02,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x30,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x04,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0xe2,(byte) 0xff,(byte) 0xff,(byte) 0xff,(byte) 0x00,(byte) 0x00,(byte) 0x01,(byte) 0x02,(byte) 0x0c,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x0a,(byte) 0x00,(byte) 0x04,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x02,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x0a,(byte) 0x00,(byte) 0x0e,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x07,(byte) 0x00,(byte) 0x08,(byte) 0x00,(byte) 0x0a,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x01,(byte) 0x02,(byte) 0x0c,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x08,(byte) 0x00,(byte) 0x04,(byte) 0x00,(byte) 0x06,(byte) 0x00,(byte) 0x00,(byte) 0x00,(byte) 0x02,(byte) 0x00,(byte) 0x00,(byte) 0x00        };

        // Wrap the byte array into a ByteBuffer
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        buffer.rewind();

        // Get the root object from the buffer
        Data data = Data.getRootAsData(buffer);

        // Access readings
        SensorReading reading = data.readings(0);

        if (reading != null) {
            System.out.println("Sensor ID: " + reading.sensorId());
             switch (reading.valueType()) {
                case SensorValue.FloatValue:
                    FloatValue floatValue = (FloatValue) reading.value(new FloatValue());
                    System.out.println("Float Value: " + floatValue.value());
                    break;

                case SensorValue.IntValue:
                    IntValue intValue = (IntValue) reading.value(new IntValue());
                    System.out.println("Int Value: " + intValue.value());
                    break;

                case SensorValue.StringValue:
                    StringValue stringValue = (StringValue) reading.value(new StringValue());
                    System.out.println("String Value: " + stringValue.value());
                    break;

                case SensorValue.BoolValue:
                    BoolValue boolValue = (BoolValue) reading.value(new BoolValue());
                    System.out.println("Bool Value: " + boolValue.value());
                    break;

                default:
                    System.out.println("Unknown or unsupported SensorValue type.");
            } 
        }
    }
}

