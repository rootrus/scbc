package p040o;

import p040o.zzfe;

/* renamed from: o.TextRecognizer$MediaBrowserCompat$CustomActionResultReceiver */
final class TextRecognizer$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
    private /* synthetic */ TextRecognizer MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ zzfe.zza write;

    TextRecognizer$MediaBrowserCompat$CustomActionResultReceiver(TextRecognizer textRecognizer, zzfe.zza zza) {
        this.MediaBrowserCompat$ItemReceiver = textRecognizer;
        this.write = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "productType");
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(this.write, str);
    }
}
