package p040o;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.DecoderException;
import org.spongycastle.util.encoders.EncoderException;

/* renamed from: o.onSelectType */
public final class onSelectType {
    private static final MwMarketMallSearchAdapter$MwSearchMarketMallViewHolder IconCompatParcelizer = new MwPlaceAdapter$PredictionHolder();

    public static byte[] write(byte[] bArr) {
        return MediaBrowserCompat$ItemReceiver(bArr, 0, bArr.length);
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception encoding Hex string: ");
            sb.append(e.getMessage());
            throw new EncoderException(sb.toString(), e);
        }
    }

    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IconCompatParcelizer.write(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception decoding Hex string: ");
            sb.append(e.getMessage());
            throw new DecoderException(sb.toString(), e);
        }
    }
}
