package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRecognizedLanguages */
public final /* synthetic */ class getRecognizedLanguages implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C9880x49974ce read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getRecognizedLanguages(C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.read = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver = this.read;
        ((getExpirationDate) obj).IconCompatParcelizer(checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
