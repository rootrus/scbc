package p040o;

import p040o.Futures;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeAppStatsExportListener */
public final /* synthetic */ class removeAppStatsExportListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34051 write;

    public /* synthetic */ removeAppStatsExportListener(Futures.C34051 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).IconCompatParcelizer(this.write);
    }
}
