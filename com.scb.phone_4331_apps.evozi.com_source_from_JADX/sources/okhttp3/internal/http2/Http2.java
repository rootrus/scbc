package okhttp3.internal.http2;

import okhttp3.internal.Util;
import p040o.C7043xa484e06c;
import p040o.GoodToKnowActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Http2 {
    private static final String[] BINARY;
    public static final SCBUniversalWebViewActivity_ViewBinding CONNECTION_PREFACE = PinChangeSuccessActivity.read("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FLAGS = new String[64];
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n", "$receiver");
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            onGetStartedClick.IconCompatParcelizer((Object) binaryString, "Integer.toBinaryString(it)");
            String format = Util.format("%8s", binaryString);
            onGetStartedClick.write((Object) format, "$this$replace");
            String replace = format.replace(' ', '0');
            onGetStartedClick.IconCompatParcelizer((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i] = replace;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[0];
            String[] strArr3 = FLAGS;
            strArr3[i3 | 8] = onGetStartedClick.write(strArr3[i3], (Object) "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = FLAGS;
                int i8 = i7 | i5;
                StringBuilder sb = new StringBuilder();
                sb.append(FLAGS[i7]);
                sb.append("|");
                sb.append(FLAGS[i5]);
                strArr5[i8] = sb.toString();
                String[] strArr6 = FLAGS;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(FLAGS[i7]);
                sb2.append("|");
                sb2.append(FLAGS[i5]);
                sb2.append("|PADDED");
                strArr6[i8 | 8] = sb2.toString();
            }
        }
        int length = FLAGS.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr7 = FLAGS;
            if (strArr7[i9] == null) {
                strArr7[i9] = BINARY[i9];
            }
        }
    }

    private Http2() {
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        String[] strArr = FRAME_NAMES;
        return Util.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), i3 < strArr.length ? strArr[i3] : Util.format("0x%02x", Integer.valueOf(i3)), formatFlags(i3, i4));
    }

    public final String formatFlags(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : BINARY[i2];
            }
            if (!(i == 7 || i == 8)) {
                String[] strArr = FLAGS;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    if (str == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                } else {
                    str = BINARY[i2];
                }
                if (i == 5 && (i2 & 4) != 0) {
                    return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "HEADERS", "PUSH_PROMISE", false);
                }
                if (i != 0 || (i2 & 32) == 0) {
                    return str;
                }
                return GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "PRIORITY", "COMPRESSED", false);
            }
        }
        return BINARY[i2];
    }
}
