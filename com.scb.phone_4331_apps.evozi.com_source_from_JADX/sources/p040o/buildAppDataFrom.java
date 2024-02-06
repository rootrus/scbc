package p040o;

import p040o.CheckCaptureModule;
import p040o.MapConstraints;

/* renamed from: o.buildAppDataFrom */
public class buildAppDataFrom extends writeUInt64NoTag<CheckCaptureModule.C6375a.MediaDescriptionCompat> {
    public boolean IconCompatParcelizer;
    public final setUnboundedRippleResource MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final MapConstraints.ConstrainedMap MediaBrowserCompat$MediaItem;
    public final matchesAnyOf MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final MapConstraints.NotNullMapConstraint MediaMetadataCompat;
    public ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
    public final count write;

    @HmlPinActivity
    public buildAppDataFrom(matchesAnyOf matchesanyof, setUnboundedRippleResource setunboundedrippleresource, MapConstraints.NotNullMapConstraint notNullMapConstraint, MapConstraints.ConstrainedMap constrainedMap, RegularImmutableBiMap regularImmutableBiMap, count count) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = matchesanyof;
        this.MediaBrowserCompat$ItemReceiver = setunboundedrippleresource;
        this.MediaMetadataCompat = notNullMapConstraint;
        this.MediaBrowserCompat$MediaItem = constrainedMap;
        this.write = count;
    }

    public void onDestroy() {
        setUnboundedRippleResource setunboundedrippleresource = this.MediaBrowserCompat$ItemReceiver;
        if (!setunboundedrippleresource.MediaBrowserCompat$MediaItem.isDisposed()) {
            setunboundedrippleresource.MediaBrowserCompat$MediaItem.dispose();
        }
        this.read.dispose();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (!this.IconCompatParcelizer) {
            boolean z = true;
            this.IconCompatParcelizer = true;
            writeSessionAppClsId writesessionappclsid = writeSessionAppClsId.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writesessionappclsid.IconCompatParcelizer(this.RatingCompat);
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver(this, str.equalsIgnoreCase("en")));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(buildAppDataFrom buildappdatafrom) {
        if (buildappdatafrom.RatingCompat != null) {
            buildappdatafrom.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(buildAppDataFrom buildappdatafrom) {
        if (buildappdatafrom.RatingCompat != null) {
            buildappdatafrom.RatingCompat.az_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(buildAppDataFrom buildappdatafrom) {
        if (buildappdatafrom.RatingCompat != null) {
            buildappdatafrom.RatingCompat.az_();
        }
    }
}
