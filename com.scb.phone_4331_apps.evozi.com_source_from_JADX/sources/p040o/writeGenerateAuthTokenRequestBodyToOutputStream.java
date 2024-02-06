package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeGenerateAuthTokenRequestBodyToOutputStream */
public final /* synthetic */ class writeGenerateAuthTokenRequestBodyToOutputStream implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ writeGenerateAuthTokenRequestBodyToOutputStream(isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver isenforcecertfingerprintmatch_mediabrowsercompat_itemreceiver, Throwable th) {
        this.read = isenforcecertfingerprintmatch_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver isenforcecertfingerprintmatch_mediabrowsercompat_itemreceiver = this.read;
        ((CreditCardParameters) obj).write(isenforcecertfingerprintmatch_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.NAVIGATE_BACK));
    }
}
