package okhttp3.internal.p089ws;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.C7043xa484e06c;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final void toggleMask(SCBUniversalWebViewActivity.IconCompatParcelizer iconCompatParcelizer, byte[] bArr) {
        long j;
        onGetStartedClick.write((Object) iconCompatParcelizer, "cursor");
        onGetStartedClick.write((Object) bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            int i3 = iconCompatParcelizer.read;
            boolean z = true;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = iconCompatParcelizer.IconCompatParcelizer;
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (sCBUniversalWebViewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (j2 == sCBUniversalWebViewActivity.read) {
                z = false;
            }
            if (z) {
                j = iconCompatParcelizer.IconCompatParcelizer;
            } else {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (iconCompatParcelizer.IconCompatParcelizer(j == -1 ? 0 : j + ((long) (iconCompatParcelizer.read - iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver))) != -1);
    }

    public final String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
            return sb.toString();
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            return sb2.toString();
        }
    }

    public final void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (!(closeCodeExceptionMessage == null)) {
            if (closeCodeExceptionMessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
        }
    }

    public final String acceptHeader(String str) {
        onGetStartedClick.write((Object) str, "key");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(ACCEPT_MAGIC);
        String obj = sb.toString();
        onGetStartedClick.write((Object) obj, "$receiver");
        return PinChangeSuccessActivity.read(obj).IconCompatParcelizer(McElieceCCA2KeyGenParameterSpec.SHA1).MediaBrowserCompat$ItemReceiver();
    }
}
