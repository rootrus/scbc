package p040o;

import com.scb.phone.data.network.service.BulkTransferService;
import com.scb.phone.view.activity.ErrorPageActivity;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity;
import java.util.List;
import p040o.CharMatcher;
import p040o.IIdImageProcessingListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.bd */
public final class C4093bd extends writeUInt64NoTag<IIdImageProcessingListener.IconCompatParcelizer> {
    public final CharMatcher.And IconCompatParcelizer;
    public newLatLngZoom MediaBrowserCompat$ItemReceiver;
    final UsingToStringOrdering read;
    public final CharMatcher.LookupTable write;

    /* renamed from: o.bd$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<IIdImageProcessingListener.IconCompatParcelizer> {
        private /* synthetic */ ErrorPageActivity.read IconCompatParcelizer;

        public MediaDescriptionCompat(ErrorPageActivity.read read) {
            this.IconCompatParcelizer = read;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((r0 = r0.MediaBrowserCompat$ItemReceiver));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r5) {
            /*
                r4 = this;
                o.IIdImageProcessingListener$IconCompatParcelizer r5 = (p040o.IIdImageProcessingListener.IconCompatParcelizer) r5
                r5.MediaBrowserCompat$CustomActionResultReceiver()
                com.scb.phone.view.activity.ErrorPageActivity$read r0 = r4.IconCompatParcelizer
                if (r0 == 0) goto L_0x0018
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0018
                java.lang.Double r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)
                if (r0 == 0) goto L_0x0018
                double r0 = r0.doubleValue()
                goto L_0x001d
            L_0x0018:
                r0 = 4623933948976829586(0x402b836d8da21492, double:13.7566952)
            L_0x001d:
                com.scb.phone.view.activity.ErrorPageActivity$read r2 = r4.IconCompatParcelizer
                if (r2 == 0) goto L_0x0030
                java.lang.String r2 = r2.read
                if (r2 == 0) goto L_0x0030
                java.lang.Double r2 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r2)
                if (r2 == 0) goto L_0x0030
                double r2 = r2.doubleValue()
                goto L_0x0035
            L_0x0030:
                r2 = 4636772581293915135(0x40592018944b7bff, double:100.5015002)
            L_0x0035:
                r5.IconCompatParcelizer(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4093bd.MediaDescriptionCompat.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* renamed from: o.bd$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<IIdImageProcessingListener.IconCompatParcelizer> {
        private /* synthetic */ String read;
        private /* synthetic */ String write;

        public MediaMetadataCompat(String str, String str2) {
            this.write = str;
            this.read = str2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IIdImageProcessingListener.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write, this.read);
        }
    }

    /* renamed from: o.bd$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IIdImageProcessingListener.IconCompatParcelizer> {
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ ErrorPageActivity.read read;

        read(boolean z, ErrorPageActivity.read read2) {
            this.IconCompatParcelizer = z;
            this.read = read2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((r0 = r0.MediaBrowserCompat$ItemReceiver));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r5) {
            /*
                r4 = this;
                o.IIdImageProcessingListener$IconCompatParcelizer r5 = (p040o.IIdImageProcessingListener.IconCompatParcelizer) r5
                boolean r0 = r4.IconCompatParcelizer
                if (r0 == 0) goto L_0x003a
                com.scb.phone.view.activity.ErrorPageActivity$read r0 = r4.read
                if (r0 == 0) goto L_0x0019
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0019
                java.lang.Double r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)
                if (r0 == 0) goto L_0x0019
                double r0 = r0.doubleValue()
                goto L_0x001e
            L_0x0019:
                r0 = 4623933948976829586(0x402b836d8da21492, double:13.7566952)
            L_0x001e:
                com.scb.phone.view.activity.ErrorPageActivity$read r2 = r4.read
                if (r2 == 0) goto L_0x0031
                java.lang.String r2 = r2.read
                if (r2 == 0) goto L_0x0031
                java.lang.Double r2 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r2)
                if (r2 == 0) goto L_0x0031
                double r2 = r2.doubleValue()
                goto L_0x0036
            L_0x0031:
                r2 = 4636772581293915135(0x40592018944b7bff, double:100.5015002)
            L_0x0036:
                r5.IconCompatParcelizer(r0, r2)
                return
            L_0x003a:
                r5.moveCameraToCurrentLocation()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4093bd.read.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* renamed from: o.bd$RatingCompat */
    public static final class RatingCompat<T> implements DebitCardMarketConductDeepLinkActivity<newLatLng> {
        final /* synthetic */ C4093bd read;

        public RatingCompat(C4093bd bdVar) {
            this.read = bdVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final newLatLng newlatlng = (newLatLng) obj;
            C4093bd.MediaBrowserCompat$ItemReceiver(this.read);
            C4093bd bdVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IIdImageProcessingListener.IconCompatParcelizer>(this) {
                private /* synthetic */ RatingCompat IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    UsingToStringOrdering usingToStringOrdering = this.IconCompatParcelizer.read.read;
                    newLatLng newlatlng = newlatlng;
                    onGetStartedClick.IconCompatParcelizer((Object) newlatlng, "merchant");
                    ((IIdImageProcessingListener.IconCompatParcelizer) obj).read(usingToStringOrdering.MediaBrowserCompat$CustomActionResultReceiver(newlatlng));
                }
            };
            if (bdVar.RatingCompat != null) {
                r1.IconCompatParcelizer(bdVar.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4093bd(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, CharMatcher.And and, UsingToStringOrdering usingToStringOrdering) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) lookupTable, "mwWalletCase");
        onGetStartedClick.write((Object) and, "mwLocationCase");
        onGetStartedClick.write((Object) usingToStringOrdering, "merchantDisplayMapper");
        this.write = lookupTable;
        this.IconCompatParcelizer = and;
        this.read = usingToStringOrdering;
    }

    /* renamed from: o.bd$write */
    public static final class write {
        public final BulkTransferService MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(BulkTransferService bulkTransferService) {
            this.MediaBrowserCompat$ItemReceiver = bulkTransferService;
        }
    }

    public final void write(boolean z) {
        ErrorPageActivity.read read2;
        List<MwPinShopLocationActivity.IconCompatParcelizer> list;
        MwPinShopLocationActivity.IconCompatParcelizer iconCompatParcelizer;
        MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver2 = this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        boolean z2 = false;
        if (MediaBrowserCompat$ItemReceiver2 == null || (list = MediaBrowserCompat$ItemReceiver2.ParcelableVolumeInfo) == null || (iconCompatParcelizer = list.get(0)) == null) {
            read2 = null;
        } else {
            read2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        }
        writeUInt64NoTag.IconCompatParcelizer read3 = new read(z, read2);
        if (this.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            read3.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.bd$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<newLatLng> {
        private /* synthetic */ C4093bd read;

        public IconCompatParcelizer(C4093bd bdVar) {
            this.read = bdVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C4093bd.MediaBrowserCompat$ItemReceiver(this.read);
            C4093bd bdVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C40942.write;
            if (bdVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(bdVar.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4093bd bdVar) {
        if (bdVar.RatingCompat != null) {
            bdVar.RatingCompat.aj_();
        }
    }
}
