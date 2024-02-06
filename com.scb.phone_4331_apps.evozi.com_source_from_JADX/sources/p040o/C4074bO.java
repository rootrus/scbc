package p040o;

import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bO */
public final /* synthetic */ class C4074bO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute.Builder write;

    public /* synthetic */ C4074bO(String str, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.MediaDescriptionCompat) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
