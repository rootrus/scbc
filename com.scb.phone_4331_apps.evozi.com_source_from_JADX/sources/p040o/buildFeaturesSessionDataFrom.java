package p040o;

import java.util.List;
import p040o.MapConstraints;

/* renamed from: o.buildFeaturesSessionDataFrom */
public class buildFeaturesSessionDataFrom extends writeUInt64NoTag<CheckCaptureModule$a$MediaBrowserCompat$ItemReceiver> {
    public final count IconCompatParcelizer;
    public List<chain> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver = "";
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final MapConstraints.ConstrainedMultimap.C36361 f2800x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public final matchesAnyOf MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final MapConstraints.ConstrainedMap MediaSessionCompat$Token;
    public ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
    public final transparency write;

    @HmlPinActivity
    public buildFeaturesSessionDataFrom(matchesAnyOf matchesanyof, transparency transparency, MapConstraints.ConstrainedMultimap.C36361 r3, MapConstraints.ConstrainedMap constrainedMap, RegularImmutableBiMap regularImmutableBiMap, count count) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = matchesanyof;
        this.write = transparency;
        this.f2800x50fd9e4a = r3;
        this.MediaSessionCompat$Token = constrainedMap;
        this.IconCompatParcelizer = count;
    }

    public final void write(String str) {
        if (!this.MediaDescriptionCompat) {
            boolean z = true;
            this.MediaDescriptionCompat = true;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.Keep();
            }
            this.write.read.MediaBrowserCompat$CustomActionResultReceiver();
            this.write.write();
            this.write.IconCompatParcelizer(new buildFeaturesSessionDataFrom$MediaBrowserCompat$ItemReceiver(this, str.equalsIgnoreCase("en")));
        }
    }

    public void onDestroy() {
        transparency transparency = this.write;
        if (!transparency.MediaBrowserCompat$MediaItem.isDisposed()) {
            transparency.MediaBrowserCompat$MediaItem.dispose();
        }
        this.read.dispose();
        super.onDestroy();
    }

    static /* synthetic */ void read(buildFeaturesSessionDataFrom buildfeaturessessiondatafrom) {
        if (buildfeaturessessiondatafrom.RatingCompat != null) {
            buildfeaturessessiondatafrom.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(buildFeaturesSessionDataFrom buildfeaturessessiondatafrom) {
        if (buildfeaturessessiondatafrom.RatingCompat != null) {
            buildfeaturessessiondatafrom.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(buildFeaturesSessionDataFrom buildfeaturessessiondatafrom) {
        if (buildfeaturessessiondatafrom.RatingCompat != null) {
            buildfeaturessessiondatafrom.RatingCompat.az_();
        }
    }
}
