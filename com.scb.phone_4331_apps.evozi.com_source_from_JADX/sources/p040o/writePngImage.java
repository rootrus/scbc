package p040o;

import p040o.CheckExtractor_MembersInjector;
import p040o.RegularImmutableMap;

/* renamed from: o.writePngImage */
public class writePngImage extends writeUInt64NoTag<CheckExtractor_MembersInjector.IconCompatParcelizer> {
    private final Polyline MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final RegularImmutableMap.TerminalEntry read;

    @HmlPinActivity
    public writePngImage(Polyline polyline, RegularImmutableMap.TerminalEntry terminalEntry, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = polyline;
        this.read = terminalEntry;
    }

    public void onDestroy() {
        super.onDestroy();
        Polyline polyline = this.MediaBrowserCompat$ItemReceiver;
        if (!polyline.MediaBrowserCompat$MediaItem.isDisposed()) {
            polyline.MediaBrowserCompat$MediaItem.dispose();
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read();
    }

    static /* synthetic */ void IconCompatParcelizer(writePngImage writepngimage) {
        if (writepngimage.RatingCompat != null) {
            writepngimage.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(writePngImage writepngimage) {
        if (writepngimage.RatingCompat != null) {
            writepngimage.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(writePngImage writepngimage) {
        if (writepngimage.RatingCompat != null) {
            writepngimage.RatingCompat.ay_();
        }
    }

    public final void write(double d, double d2, double d3, double d4, String str, boolean z) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        Polyline polyline = this.MediaBrowserCompat$ItemReceiver;
        runLockedCleanup read2 = runLockedCleanup.read();
        read2.read = d;
        read2.IconCompatParcelizer = d2;
        read2.MediaBrowserCompat$ItemReceiver = d3;
        read2.RatingCompat = d4;
        read2.write = str;
        read2.MediaBrowserCompat$CustomActionResultReceiver = z ? 1 : 0;
        polyline.read(read2);
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new writePngImage$MediaBrowserCompat$CustomActionResultReceiver(this, z));
    }
}
