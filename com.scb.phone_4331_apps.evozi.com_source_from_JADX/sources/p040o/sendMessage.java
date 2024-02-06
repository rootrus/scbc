package p040o;

import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.PassportService;
import p040o.RenderScript;

/* renamed from: o.sendMessage */
public class sendMessage {
    private static sendMessage[] MediaBrowserCompat$SearchResultReceiver = {new sendMessage(false, 3, 5, 8, 8, 1), new sendMessage(false, 5, 7, 10, 10, 1), new sendMessage(true, 5, 7, 16, 6, 1), new sendMessage(false, 8, 10, 12, 12, 1), new sendMessage(true, 10, 11, 14, 6, 2), new sendMessage(false, 12, 12, 14, 14, 1), new sendMessage(true, 16, 14, 24, 10, 1), new sendMessage(false, 18, 14, 16, 16, 1), new sendMessage(false, 22, 18, 18, 18, 1), new sendMessage(true, 22, 18, 16, 10, 2), new sendMessage(false, 30, 20, 20, 20, 1), new sendMessage(true, 32, 24, 16, 14, 2), new sendMessage(false, 36, 24, 22, 22, 1), new sendMessage(false, 44, 28, 24, 24, 1), new sendMessage(true, 49, 28, 22, 14, 2), new sendMessage(false, 62, 36, 14, 14, 4), new sendMessage(false, 86, 42, 16, 16, 4), new sendMessage(false, 114, 48, 18, 18, 4), new sendMessage(false, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 56, 20, 20, 4), new sendMessage(false, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68, 22, 22, 4), new sendMessage(false, 204, 84, 24, 24, 4, 102, 42), new sendMessage(false, 280, 112, 14, 14, 16, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 56), new sendMessage(false, 368, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 16, 16, 16, 92, 36), new sendMessage(false, 456, 192, 18, 18, 16, 114, 48), new sendMessage(false, 576, PassportService.DEFAULT_MAX_BLOCKSIZE, 20, 20, 16, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 56), new sendMessage(false, 696, 272, 22, 22, 16, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 68), new sendMessage(false, 816, 336, 24, 24, 16, 136, 56), new sendMessage(false, 1050, 408, 18, 18, 36, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 68), new sendMessage(false, 1304, 496, 20, 20, 36, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 62), new rsnTypeGetNativeData()};
    final int IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    final int MediaBrowserCompat$ItemReceiver;
    private final int MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final int RatingCompat;
    public final int read;
    public final int write;

    private sendMessage(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    sendMessage(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.MediaMetadataCompat = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.read = i3;
        this.write = i4;
        this.RatingCompat = i5;
        this.MediaDescriptionCompat = i6;
        this.IconCompatParcelizer = i7;
    }

    public static sendMessage MediaBrowserCompat$CustomActionResultReceiver(int i, RenderScript.ContextType contextType, rsnIncContextFinish rsninccontextfinish, rsnIncContextFinish rsninccontextfinish2) {
        for (sendMessage sendmessage : MediaBrowserCompat$SearchResultReceiver) {
            if ((contextType != RenderScript.ContextType.FORCE_SQUARE || !sendmessage.MediaMetadataCompat) && ((contextType != RenderScript.ContextType.FORCE_RECTANGLE || sendmessage.MediaMetadataCompat) && ((rsninccontextfinish == null || ((sendmessage.write() * sendmessage.read) + (sendmessage.write() << 1) >= rsninccontextfinish.read && (sendmessage.IconCompatParcelizer() * sendmessage.write) + (sendmessage.IconCompatParcelizer() << 1) >= rsninccontextfinish.IconCompatParcelizer)) && ((rsninccontextfinish2 == null || ((sendmessage.write() * sendmessage.read) + (sendmessage.write() << 1) <= rsninccontextfinish2.read && (sendmessage.IconCompatParcelizer() * sendmessage.write) + (sendmessage.IconCompatParcelizer() << 1) <= rsninccontextfinish2.IconCompatParcelizer)) && i <= sendmessage.MediaBrowserCompat$CustomActionResultReceiver)))) {
                return sendmessage;
            }
        }
        StringBuilder sb = new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int write() {
        int i = this.RatingCompat;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int IconCompatParcelizer() {
        int i = this.RatingCompat;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver / this.MediaDescriptionCompat;
    }

    public int MediaBrowserCompat$ItemReceiver(int i) {
        return this.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaMetadataCompat ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.read);
        sb.append('x');
        sb.append(this.write);
        sb.append(", symbol size ");
        sb.append((write() * this.read) + (write() << 1));
        sb.append('x');
        sb.append((IconCompatParcelizer() * this.write) + (IconCompatParcelizer() << 1));
        sb.append(", symbol data size ");
        sb.append(write() * this.read);
        sb.append('x');
        sb.append(IconCompatParcelizer() * this.write);
        sb.append(", codewords ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('+');
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }
}
