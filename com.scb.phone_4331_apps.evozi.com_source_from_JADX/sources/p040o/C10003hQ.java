package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.showIndicators;
import p040o.writeUInt64NoTag;

/* renamed from: o.hQ */
public final /* synthetic */ class C10003hQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ showIndicators.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ setZoomGesturesEnabled write;

    public /* synthetic */ C10003hQ(showIndicators.IconCompatParcelizer iconCompatParcelizer, setZoomGesturesEnabled setzoomgesturesenabled) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.write = setzoomgesturesenabled;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write, (getTopLeftCornerWidth.AppCompatActivity) obj);
    }
}
