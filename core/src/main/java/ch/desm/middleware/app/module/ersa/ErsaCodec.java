package ch.desm.middleware.app.module.ersa;

import java.util.Arrays;

public class ErsaCodec {

    public static final byte HEADER = 0x02;
    public static final byte FOOTER = 0x03;

    public static final byte PKT_TIU_SET_TIU_DATA_FROM_TRAIN_ID = 10;
    public static final byte PKT_TIU_SET_TIU_DATA_TO_TRAIN_ID = 11;

    public static final byte PKT_TIU_SET_TIU_DATA_FROM_TRAIN_SIZE = (1 + 9);   // BYTE - ID = 1 - CONTENT = 9
    public static final byte PKT_TIU_SET_TIU_DATA_TO_TRAIN_SIZE = 12; //(1 + 3);   // BYTE - ID = 1 - CONTENT = 3

    private static final byte[] HEX_TABLE = new byte[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public byte[] encode(ErsaMessageTiuData message) {
        byte[] result = prepareRawMessage(PKT_TIU_SET_TIU_DATA_TO_TRAIN_SIZE);

        addWordToBuffer(result, 1, encodeWord(PKT_TIU_SET_TIU_DATA_TO_TRAIN_ID));
        addWordToBuffer(result, 3, encodeWord(message.isTractionCutOff()));
        addWordToBuffer(result, 5, encodeWord(message.isEmergencybrake()));
        addWordToBuffer(result, 7, encodeWord(message.isServiceBrake()));
        addWordToBuffer(result, 9, encodeWord(calculateCrc(result, 1, 9)));

        return result;
    }

    private byte[] prepareRawMessage(int len) {
        final byte[] result = new byte[len];
        Arrays.fill(result, (byte) 0x00);
        result[0] = HEADER;
        result[len - 1] = FOOTER;
        return result;
    }

    // TODO: int vs byte? damn signed java...
    public int calculateCrc(byte[] buffer, int offset, int length) {
        int crc = 0;
        for (int i = 0; i < length; ++i) {
            final int index = offset + i;
            crc ^= (int) buffer[index] & 0xFF;
        }
        return crc;
    }

    // NOTE: little endian byte order vs network byte order
    private void addWordToBuffer(byte[] buffer, int offset, byte[] word) {
        buffer[offset + 0] = word[0];
        buffer[offset + 1] = word[1];
    }

    private byte[] encodeWord(boolean b) {
        return new byte[]{
                byteToHexChar((byte) 0),
                byteToHexChar((byte) (b ? 1 : 0))
        };
    }

    private byte[] encodeWord(byte b) {
        return new byte[]{
                byteToHexChar((byte) 0),
                byteToHexChar(b)
        };
    }

    private byte[] encodeWord(int i) {
        return new byte[]{
                byteToHexChar((byte) ((i >> 4) & 0x0f)),
                byteToHexChar((byte) (i & 0x0f))
        };
    }

    private byte byteToHexChar(byte b) {
        int unsignedByte = (int) b & 0xff;
        return HEX_TABLE[unsignedByte];
    }

}
