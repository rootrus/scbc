package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.MwMarketMallSearchAdapter$MwSearchMarketMallViewHolder_ViewBinding */
public class C6961xbba4702b {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String RatingCompat;
    public final String read;

    public C6961xbba4702b() {
    }

    public static int MediaBrowserCompat$ItemReceiver(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read2 = inputStream.read(bArr, i2, i - i2);
            if (read2 < 0) {
                break;
            }
            i2 += read2;
        }
        return i2;
    }

    public static void read(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read2 = inputStream.read(bArr, 0, 4096);
            if (read2 >= 0) {
                outputStream.write(bArr, 0, read2);
            } else {
                return;
            }
        }
    }

    public C6961xbba4702b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        onGetStartedClick.write((Object) str, "accountName");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountSubType");
        onGetStartedClick.write((Object) str4, "accountSubTypeDesc");
        onGetStartedClick.write((Object) str5, "accountType");
        onGetStartedClick.write((Object) str6, "accountTypeDesc");
        onGetStartedClick.write((Object) str7, "nickname");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.RatingCompat = str7;
    }
}
