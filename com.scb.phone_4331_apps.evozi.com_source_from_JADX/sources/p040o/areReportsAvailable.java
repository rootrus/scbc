package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.MapConstraints;
import p040o.writeUInt64NoTag;

/* renamed from: o.areReportsAvailable */
public final /* synthetic */ class areReportsAvailable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzsj MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getExpiresAtFrom MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ areReportsAvailable(getExpiresAtFrom getexpiresatfrom, zzsj zzsj) {
        this.MediaBrowserCompat$ItemReceiver = getexpiresatfrom;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzsj;
    }

    public final void IconCompatParcelizer(Object obj) {
        List list;
        getExpiresAtFrom getexpiresatfrom = this.MediaBrowserCompat$ItemReceiver;
        zzsj zzsj = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckCaptureModule$a$MediaBrowserCompat$MediaItem checkCaptureModule$a$MediaBrowserCompat$MediaItem = (CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj;
        MapConstraints.ConstrainedMultimap.C36372 r2 = getexpiresatfrom.read;
        zzvf RatingCompat = getexpiresatfrom.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.MediaBrowserCompat$ItemReceiver;
        } else {
            list = new ArrayList();
        }
        checkCaptureModule$a$MediaBrowserCompat$MediaItem.read(r2.IconCompatParcelizer(zzsj, list, getexpiresatfrom.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setItemInvoker()));
    }
}
