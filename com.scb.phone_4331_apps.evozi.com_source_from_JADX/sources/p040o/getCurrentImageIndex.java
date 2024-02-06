package p040o;

import p040o.AppMeasurementSdk;
import p040o.zzct;

/* renamed from: o.getCurrentImageIndex */
public class getCurrentImageIndex extends writeUInt64NoTag<getMRZ2> {
    public final setScrimVisibleHeightTrigger IconCompatParcelizer;
    public final setExpandedTitleMarginBottom MediaBrowserCompat$ItemReceiver;
    private final AppMeasurementSdk.EventInterceptor MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final setItemIconTintList MediaDescriptionCompat;
    private final ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
    /* access modifiers changed from: private */
    public RegularImmutableSortedSet write;

    @HmlPinActivity
    public getCurrentImageIndex(setExpandedTitleMarginBottom setexpandedtitlemarginbottom, RegularImmutableSortedSet regularImmutableSortedSet, RegularImmutableBiMap regularImmutableBiMap, setScrimVisibleHeightTrigger setscrimvisibleheighttrigger, AppMeasurementSdk.EventInterceptor eventInterceptor, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = setexpandedtitlemarginbottom;
        this.write = regularImmutableSortedSet;
        this.IconCompatParcelizer = setscrimvisibleheighttrigger;
        this.MediaBrowserCompat$MediaItem = eventInterceptor;
        this.MediaDescriptionCompat = setitemicontintlist;
    }

    public void onDestroy() {
        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = this.IconCompatParcelizer;
        if (!setscrimvisibleheighttrigger.MediaBrowserCompat$MediaItem.isDisposed()) {
            setscrimvisibleheighttrigger.MediaBrowserCompat$MediaItem.dispose();
        }
        setExpandedTitleMarginBottom setexpandedtitlemarginbottom = this.MediaBrowserCompat$ItemReceiver;
        if (!setexpandedtitlemarginbottom.MediaBrowserCompat$MediaItem.isDisposed()) {
            setexpandedtitlemarginbottom.MediaBrowserCompat$MediaItem.dispose();
        }
        AppMeasurementSdk.EventInterceptor eventInterceptor = this.MediaBrowserCompat$MediaItem;
        if (!eventInterceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            eventInterceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        this.read.dispose();
        super.onDestroy();
    }

    static /* synthetic */ void write(getCurrentImageIndex getcurrentimageindex) {
        if (getcurrentimageindex.RatingCompat != null) {
            getcurrentimageindex.RatingCompat.aj_();
        }
    }

    static /* synthetic */ Boolean read(getCurrentImageIndex getcurrentimageindex) {
        return Boolean.valueOf(zzct.zza.BUSINESS_OWNER == getcurrentimageindex.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver());
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCurrentImageIndex getcurrentimageindex) {
        if (getcurrentimageindex.RatingCompat != null) {
            getcurrentimageindex.RatingCompat.aj_();
        }
    }
}
