package p040o;

import p040o.FloatingActionButton;
import p040o.PassportCaptureModule;
import p040o.access$2300;

/* renamed from: o.createPropertyInfo */
public class createPropertyInfo extends writeUInt64NoTag<PassportCaptureModule.C6976c> {
    public handleUncaughtException IconCompatParcelizer;
    final width MediaBrowserCompat$ItemReceiver;
    public final setNavigationItemSelectedListener MediaBrowserCompat$SearchResultReceiver;
    public final FloatingActionButton.Behavior MediaMetadataCompat;
    final setItemIconTintList read;
    public ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

    @HmlPinActivity
    public createPropertyInfo(FloatingActionButton.Behavior behavior, setItemIconTintList setitemicontintlist, width width, setNavigationItemSelectedListener setnavigationitemselectedlistener, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = behavior;
        this.read = setitemicontintlist;
        this.MediaBrowserCompat$ItemReceiver = width;
        this.MediaBrowserCompat$SearchResultReceiver = setnavigationitemselectedlistener;
    }

    static /* synthetic */ CharSequence IconCompatParcelizer(getIdentifierUtf8Bytes getidentifierutf8bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" ");
        sb.append(getidentifierutf8bytes.read);
        return sb.toString();
    }

    /* renamed from: o.createPropertyInfo$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        public /* synthetic */ read(createPropertyInfo createpropertyinfo, byte b) {
            this();
        }

        public final void onComplete() {
            createPropertyInfo.write(createPropertyInfo.this);
            createPropertyInfo createpropertyinfo = createPropertyInfo.this;
            getRegion getregion = getRegion.read;
            if (createpropertyinfo.RatingCompat != null) {
                getregion.IconCompatParcelizer(createpropertyinfo.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            createPropertyInfo.this.MediaBrowserCompat$ItemReceiver(createPropertyInfo.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public void onDestroy() {
        FloatingActionButton.Behavior behavior = this.MediaMetadataCompat;
        if (!behavior.MediaBrowserCompat$MediaItem.isDisposed()) {
            behavior.MediaBrowserCompat$MediaItem.dispose();
        }
        this.write.dispose();
        super.onDestroy();
    }

    static /* synthetic */ void IconCompatParcelizer(createPropertyInfo createpropertyinfo) {
        if (createpropertyinfo.RatingCompat != null) {
            createpropertyinfo.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(createPropertyInfo createpropertyinfo) {
        if (createpropertyinfo.RatingCompat != null) {
            createpropertyinfo.RatingCompat.aj_();
        }
    }
}
