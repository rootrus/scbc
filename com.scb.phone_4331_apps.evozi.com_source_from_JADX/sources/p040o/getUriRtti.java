package p040o;

import p040o.IBillExtractorListener;
import p040o.Synchronized;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUriRtti */
public final /* synthetic */ class getUriRtti implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias IconCompatParcelizer;
    private final /* synthetic */ IBillExtractorListener.IconCompatParcelizer write;

    public /* synthetic */ getUriRtti(IBillExtractorListener.IconCompatParcelizer iconCompatParcelizer, setBoundsBias setboundsbias) {
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        double d;
        IBillExtractorListener.IconCompatParcelizer iconCompatParcelizer = this.write;
        setBoundsBias setboundsbias = this.IconCompatParcelizer;
        getTopLeftCornerWidth.setIcon seticon = (getTopLeftCornerWidth.setIcon) obj;
        seticon.ay_();
        Synchronized.SynchronizedSet unused = IBillExtractorListener.this.MediaSessionCompat$QueueItem;
        double d2 = 0.0d;
        if (setboundsbias != null) {
            d = setboundsbias.read.doubleValue();
        } else {
            d = 0.0d;
        }
        seticon.write(String.format(Synchronized.SynchronizedSet.write(Double.valueOf(d)), new Object[0]));
        Synchronized.SynchronizedSet unused2 = IBillExtractorListener.this.MediaSessionCompat$QueueItem;
        if (setboundsbias != null) {
            d2 = setboundsbias.MediaBrowserCompat$MediaItem.doubleValue();
        }
        seticon.read(String.format(Synchronized.SynchronizedSet.write(Double.valueOf(d2)), new Object[0]));
    }
}
