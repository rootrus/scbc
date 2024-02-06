package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.Sets;
import p040o.StandardRowSortedTable;
import p040o.WscRequest;

/* renamed from: o.getAbortedReason */
public class getAbortedReason extends writeUInt64NoTag<getMicrAmount$MediaBrowserCompat$ItemReceiver> {
    /* access modifiers changed from: private */
    public final Sets.SetView IconCompatParcelizer;
    public List<doBackgroundInitializationAsync> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final StandardRowSortedTable.RowKeySortedSet MediaMetadataCompat;
    public markInitializationComplete read;
    public final StreetViewPanoramaLink write;

    @HmlPinActivity
    public getAbortedReason(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, Sets.SetView setView, RegularImmutableBiMap regularImmutableBiMap, StandardRowSortedTable.RowKeySortedSet rowKeySortedSet) {
        super(regularImmutableBiMap);
        this.write = streetViewPanoramaLink;
        this.MediaBrowserCompat$MediaItem = setFromMap;
        this.MediaMetadataCompat = rowKeySortedSet;
        this.IconCompatParcelizer = setView;
    }

    public final int MediaBrowserCompat$ItemReceiver(String str) {
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            if (this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final doBackgroundInitializationAsync read(String str) {
        return this.MediaBrowserCompat$ItemReceiver.get(MediaBrowserCompat$ItemReceiver(str));
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.write;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.getAbortedReason$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private read() {
        }

        public /* synthetic */ read(getAbortedReason getabortedreason, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            boolean z = true;
            if (getAbortedReason.this.RatingCompat != null) {
                getAbortedReason getabortedreason = getAbortedReason.this;
                markInitializationComplete unused = getabortedreason.read = getabortedreason.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, getAbortedReason.this.write.IconCompatParcelizer.setItemInvoker());
                StandardRowSortedTable.RowKeySortedSet MediaBrowserCompat$SearchResultReceiver = getAbortedReason.this.MediaMetadataCompat;
                List<getGeofenceTransition> list = gettriggeringlocation.MediaBrowserCompat$CustomActionResultReceiver;
                MediaBrowserCompat$SearchResultReceiver.read = 0;
                ArrayList arrayList = new ArrayList();
                for (getGeofenceTransition write : list) {
                    MediaBrowserCompat$SearchResultReceiver.write(write, arrayList);
                }
                List<DisplayOut> MediaBrowserCompat$ItemReceiver = getAbortedReason.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(gettriggeringlocation.MediaBrowserCompat$CustomActionResultReceiver);
                getAbortedReason getabortedreason2 = getAbortedReason.this;
                WscRequest.FIELD_INDEXES field_indexes = new WscRequest.FIELD_INDEXES(MediaBrowserCompat$ItemReceiver);
                if (getabortedreason2.RatingCompat != null) {
                    field_indexes.IconCompatParcelizer(getabortedreason2.RatingCompat);
                }
                getAbortedReason getabortedreason3 = getAbortedReason.this;
                setEncryptedPassword setencryptedpassword = new setEncryptedPassword(arrayList);
                if (getabortedreason3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setencryptedpassword.IconCompatParcelizer(getabortedreason3.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            getAbortedReason.MediaBrowserCompat$ItemReceiver(getAbortedReason.this);
            getAbortedReason.read(getAbortedReason.this);
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if ((getAbortedReason.this.RatingCompat != null) && !getAbortedReason.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getAbortedReason.IconCompatParcelizer(getAbortedReason.this);
                getAbortedReason getabortedreason = getAbortedReason.this;
                initBaseFields initbasefields = initBaseFields.write;
                if (getabortedreason.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    initbasefields.IconCompatParcelizer(getabortedreason.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getAbortedReason getabortedreason) {
        if (getabortedreason.RatingCompat != null) {
            getabortedreason.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(getAbortedReason getabortedreason) {
        if (getabortedreason.RatingCompat != null) {
            getabortedreason.RatingCompat.az_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getAbortedReason getabortedreason) {
        if (getabortedreason.RatingCompat != null) {
            getabortedreason.RatingCompat.az_();
        }
    }
}
