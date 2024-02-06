package p040o;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.DecoderException;
import org.spongycastle.util.encoders.EncoderException;

/* renamed from: o.MoreOptionsAdapter$MoreOptionsHolder_ViewBinding */
public final class MoreOptionsAdapter$MoreOptionsHolder_ViewBinding {
    private static final MwMarketMallSearchAdapter$MwSearchMarketMallViewHolder IconCompatParcelizer = new MoneyActionAdapter$CustomViewHolder_ViewBinding();

    public static byte[] read(byte[] bArr) {
        return read(bArr, bArr.length);
    }

    private static byte[] read(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i + 2) / 3) << 2);
        try {
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception encoding base64 string: ");
            sb.append(e.getMessage());
            throw new EncoderException(sb.toString(), e);
        }
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            IconCompatParcelizer.write(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unable to decode base64 string: ");
            sb.append(e.getMessage());
            throw new DecoderException(sb.toString(), e);
        }
    }
}
