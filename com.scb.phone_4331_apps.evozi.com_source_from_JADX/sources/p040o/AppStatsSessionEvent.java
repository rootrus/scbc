package p040o;

import java.util.List;
import p040o.CharMatcher;
import p040o.ICheckExtractorListener;
import p040o.TransformedImmutableList;

/* renamed from: o.AppStatsSessionEvent */
public class AppStatsSessionEvent extends writeUInt64NoTag<ICheckExtractorListener.MediaDescriptionCompat> {
    public boolean IconCompatParcelizer = false;
    public List<doWriteToLog> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final TransformedImmutableList.C38711 MediaMetadataCompat;
    public GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder read = GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd");
    public final CharMatcher.C315410 write;

    @HmlPinActivity
    public AppStatsSessionEvent(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C315410 r2, TransformedImmutableList.C38711 r3) {
        super(regularImmutableBiMap);
        this.write = r2;
        this.MediaMetadataCompat = r3;
    }

    public void onDestroy() {
        CharMatcher.C315410 r0 = this.write;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
