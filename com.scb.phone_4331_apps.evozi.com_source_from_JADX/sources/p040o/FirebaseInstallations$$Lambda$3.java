package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallations$$Lambda$3 */
public final /* synthetic */ class FirebaseInstallations$$Lambda$3 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SimpleTimeLimiter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FirebaseInstallations$$Lambda$3(SimpleTimeLimiter simpleTimeLimiter) {
        this.MediaBrowserCompat$ItemReceiver = simpleTimeLimiter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1422x86f1bdff) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
