package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.Values */
public final /* synthetic */ class Values implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ averageLightness IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ Values(averageLightness averagelightness, String str) {
        this.IconCompatParcelizer = averagelightness;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        averageLightness averagelightness = this.IconCompatParcelizer;
        ((IdParameters.IdState.IconCompatParcelizer) obj).write(averagelightness.IconCompatParcelizer.mo26549c_(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
