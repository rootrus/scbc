package p040o;

import p040o.access$2300;
import p040o.getSmilingProbability;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseModelDownloadConditions */
public final /* synthetic */ class FirebaseModelDownloadConditions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ getSmilingProbability.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FirebaseModelDownloadConditions(getSmilingProbability.read read, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSmilingProbability.read read = this.MediaBrowserCompat$ItemReceiver;
        Throwable th = this.IconCompatParcelizer;
        ConventionBasedJsonIdDeserializer conventionBasedJsonIdDeserializer = (ConventionBasedJsonIdDeserializer) obj;
        conventionBasedJsonIdDeserializer.IconCompatParcelizer();
        conventionBasedJsonIdDeserializer.write(getSmilingProbability.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
