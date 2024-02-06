package p040o;

import p040o.Futures;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.purge */
public final /* synthetic */ class purge implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34051 read;

    public /* synthetic */ purge(Futures.C34051 r1) {
        this.read = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).read(this.read.setPopupCallback, this.read.PlaybackStateCompat, this.read.setCheckable.intValue());
    }
}
