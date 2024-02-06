package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.MapConstraints;

/* renamed from: o.getExpiresAtFrom */
public class getExpiresAtFrom extends writeUInt64NoTag<CheckCaptureModule$a$MediaBrowserCompat$MediaItem> implements getAboveMaxFrontImageSize {
    public final transparency IconCompatParcelizer;
    public final count MediaBrowserCompat$ItemReceiver;
    public makeUninterruptible MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public final matchesAnyOf MediaMetadataCompat;
    public final MapConstraints.ConstrainedMultimap.C36372 read;
    public ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

    @HmlPinActivity
    public getExpiresAtFrom(matchesAnyOf matchesanyof, transparency transparency, MapConstraints.ConstrainedMultimap.C36372 r3, RegularImmutableBiMap regularImmutableBiMap, count count) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = matchesanyof;
        this.IconCompatParcelizer = transparency;
        this.read = r3;
        this.MediaBrowserCompat$ItemReceiver = count;
    }

    public void onDestroy() {
        transparency transparency = this.IconCompatParcelizer;
        if (!transparency.MediaBrowserCompat$MediaItem.isDisposed()) {
            transparency.MediaBrowserCompat$MediaItem.dispose();
        }
        this.IconCompatParcelizer.IconCompatParcelizer.read();
        this.write.dispose();
        super.onDestroy();
    }

    public final void read(int i) {
        deleteReport deletereport = new deleteReport(this, i);
        if (this.RatingCompat != null) {
            deletereport.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.getExpiresAtFrom$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsj> {
        private boolean MediaBrowserCompat$CustomActionResultReceiver;

        public final /* synthetic */ void onNext(Object obj) {
            List list;
            immediateFuture immediatefuture;
            zzsj zzsj = (zzsj) obj;
            boolean unused = getExpiresAtFrom.this.MediaDescriptionCompat = false;
            getExpiresAtFrom getexpiresatfrom = getExpiresAtFrom.this;
            MapConstraints.ConstrainedMultimap.C36372 MediaDescriptionCompat = getexpiresatfrom.read;
            zzvf RatingCompat = getExpiresAtFrom.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.RatingCompat();
            if (RatingCompat != null) {
                list = RatingCompat.MediaBrowserCompat$ItemReceiver;
            } else {
                list = new ArrayList();
            }
            boolean itemInvoker = getExpiresAtFrom.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setItemInvoker();
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            makeUninterruptible read = makeUninterruptible.write().read(MapConstraints.ConstrainedMultimap.C36372.write(zzsj.write)).read(MediaDescriptionCompat.read.read(zzsj.MediaBrowserCompat$CustomActionResultReceiver, list, itemInvoker));
            if (zzsj.MediaBrowserCompat$ItemReceiver != null) {
                immediatefuture = MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(zzsj.MediaBrowserCompat$ItemReceiver, z);
            } else {
                immediatefuture = null;
            }
            read.IconCompatParcelizer = immediatefuture;
            makeUninterruptible unused2 = getexpiresatfrom.MediaBrowserCompat$SearchResultReceiver = read;
            getExpiresAtFrom getexpiresatfrom2 = getExpiresAtFrom.this;
            WireFormat wireFormat = new WireFormat(this);
            if (getexpiresatfrom2.RatingCompat != null) {
                wireFormat.IconCompatParcelizer(getexpiresatfrom2.RatingCompat);
            }
        }

        public read(boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final void onComplete() {
            getExpiresAtFrom.MediaBrowserCompat$CustomActionResultReceiver(getExpiresAtFrom.this);
            getExpiresAtFrom.MediaBrowserCompat$ItemReceiver(getExpiresAtFrom.this);
        }

        public final void onError(Throwable th) {
            boolean unused = getExpiresAtFrom.this.MediaDescriptionCompat = false;
            boolean z = true;
            if ((getExpiresAtFrom.this.RatingCompat != null) && !getExpiresAtFrom.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getExpiresAtFrom.write(getExpiresAtFrom.this);
                getExpiresAtFrom getexpiresatfrom = getExpiresAtFrom.this;
                makeTag maketag = makeTag.write;
                if (getexpiresatfrom.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    maketag.IconCompatParcelizer(getexpiresatfrom.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getExpiresAtFrom getexpiresatfrom) {
        if (getexpiresatfrom.RatingCompat != null) {
            getexpiresatfrom.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getExpiresAtFrom getexpiresatfrom) {
        if (getexpiresatfrom.RatingCompat != null) {
            getexpiresatfrom.RatingCompat.az_();
        }
    }

    static /* synthetic */ void write(getExpiresAtFrom getexpiresatfrom) {
        if (getexpiresatfrom.RatingCompat != null) {
            getexpiresatfrom.RatingCompat.az_();
        }
    }
}
