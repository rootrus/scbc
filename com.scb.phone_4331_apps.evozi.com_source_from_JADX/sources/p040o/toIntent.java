package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.toIntent */
public final /* synthetic */ class toIntent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FirebaseAnalytics MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ toIntent(FirebaseAnalytics firebaseAnalytics) {
        this.MediaBrowserCompat$CustomActionResultReceiver = firebaseAnalytics;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setResultDeserializer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
