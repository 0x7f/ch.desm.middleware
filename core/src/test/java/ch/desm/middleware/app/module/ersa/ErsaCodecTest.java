package ch.desm.middleware.app.module.ersa;

import ch.desm.middleware.app.common.utility.UtilityHex;
import org.junit.Assert;
import org.junit.Test;

public class ErsaCodecTest {

    private final ErsaCodec codec = new ErsaCodec();

    @Test
    public void shouldEncodeTiuDataMessageWithNoDataSet() {
        final byte[] expected = UtilityHex.getByteStream("023042303030303030373203");
        final byte[] actual = codec.encode(new ErsaMessageTiuData(false, false, false));
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEncodeTiuDataMessageWithAllDataSet() {
        final byte[] expected = UtilityHex.getByteStream("023042303130313031373303");
        final byte[] actual = codec.encode(new ErsaMessageTiuData(true, true, true));
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEncodeTiuDataMessageWithTractionCutOffSet() {
        final byte[] expected = UtilityHex.getByteStream("023042303130303030373303");
        final byte[] actual = codec.encode(new ErsaMessageTiuData(true, false, false));
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEncodeTiuDataMessageWithEmergencyBrakeSet() {
        final byte[] expected = UtilityHex.getByteStream("023042303030313030373303");
        final byte[] actual = codec.encode(new ErsaMessageTiuData(false, true, false));
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEncodeTiuDataMessageWithServiceBrakeSet() {
        final byte[] expected = UtilityHex.getByteStream("023042303030303031373303");
        final byte[] actual = codec.encode(new ErsaMessageTiuData(false, false, true));
        Assert.assertArrayEquals(expected, actual);
    }

}
