package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.FloatingActionButton;

/* renamed from: o.KofaxWebServiceObjectBase */
public class KofaxWebServiceObjectBase extends writeUInt64NoTag<C6978x206b8e03> {
    final setItemIconTintList IconCompatParcelizer;
    final width MediaBrowserCompat$ItemReceiver;
    private final FloatingActionButton.Behavior MediaDescriptionCompat;
    public getNonFatalSessionFilesDir read;
    final newTreeSet write;

    @HmlPinActivity
    public KofaxWebServiceObjectBase(FloatingActionButton.Behavior behavior, newTreeSet newtreeset, setItemIconTintList setitemicontintlist, width width, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaDescriptionCompat = behavior;
        this.write = newtreeset;
        this.IconCompatParcelizer = setitemicontintlist;
        this.MediaBrowserCompat$ItemReceiver = width;
    }

    static /* synthetic */ CharSequence MediaBrowserCompat$CustomActionResultReceiver(getIdentifierUtf8Bytes getidentifierutf8bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" ");
        sb.append(getidentifierutf8bytes.read);
        return sb.toString();
    }

    static /* synthetic */ CharSequence IconCompatParcelizer(getIdentifierUtf8Bytes getidentifierutf8bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" ");
        sb.append(getidentifierutf8bytes.read);
        return sb.toString();
    }

    public void onDestroy() {
        FloatingActionButton.Behavior behavior = this.MediaDescriptionCompat;
        if (!behavior.MediaBrowserCompat$MediaItem.isDisposed()) {
            behavior.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void read(KofaxWebServiceObjectBase kofaxWebServiceObjectBase) {
        if (kofaxWebServiceObjectBase.RatingCompat != null) {
            kofaxWebServiceObjectBase.RatingCompat.aj_();
        }
    }

    public void read(String str) {
        String str2;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        FloatingActionButton.Behavior behavior = this.MediaDescriptionCompat;
        if (str.equals(DiskLruCache.VERSION_1)) {
            str2 = this.read.read.MediaMetadataCompat;
        } else {
            str2 = null;
        }
        this.MediaDescriptionCompat.write(behavior.MediaBrowserCompat$CustomActionResultReceiver(str, str2), new KofaxWebServiceObjectBase$MediaBrowserCompat$ItemReceiver(this, str, (byte) 0));
    }
}
