package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DetectionModule */
public final /* synthetic */ class DetectionModule implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DetectionModule(String str, int i) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPercentAverageImageBrightness) obj).read(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
    }
}
