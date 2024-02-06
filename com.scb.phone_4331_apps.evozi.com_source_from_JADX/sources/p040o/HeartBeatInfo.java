package p040o;

import java.math.BigDecimal;
import p040o.C7507tQ;
import p040o.CrashlyticsReport;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfo */
public final class HeartBeatInfo extends writeUInt64NoTag<C7507tQ.read> {
    public CrashlyticsReport.FilesPayload.File.Builder IconCompatParcelizer;
    public final getKeepAlive MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public isShutdown MediaBrowserCompat$MediaItem;
    public double MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final MapMaker MediaDescriptionCompat;
    public CrashlyticsReport.FilesPayload.File.Builder read;
    public double write;

    /* renamed from: o.HeartBeatInfo$HeartBeat */
    public class HeartBeat extends writeUInt64NoTag<CreditCardCaptureModule_GetExtractionParametersFactory> {
        @HmlPinActivity
        public HeartBeat(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
        }
    }

    /* renamed from: o.HeartBeatInfo$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
        private /* synthetic */ HeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ isShutdown MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(HeartBeatInfo heartBeatInfo, isShutdown isshutdown) {
            this.MediaBrowserCompat$CustomActionResultReceiver = heartBeatInfo;
            this.MediaBrowserCompat$ItemReceiver = isshutdown;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7507tQ.read read = (C7507tQ.read) obj;
            read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            read.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    /* renamed from: o.HeartBeatInfo$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ HeartBeatInfo write;

        public MediaDescriptionCompat(HeartBeatInfo heartBeatInfo) {
            this.write = heartBeatInfo;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, access$2300.write.NAVIGATE_BACK));
        }
    }

    /* renamed from: o.HeartBeatInfo$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
        private /* synthetic */ HeartBeatInfo IconCompatParcelizer;

        public RatingCompat(HeartBeatInfo heartBeatInfo) {
            this.IconCompatParcelizer = heartBeatInfo;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7507tQ.read) obj).read(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    /* renamed from: o.HeartBeatInfo$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
        private /* synthetic */ HeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;

        public read(HeartBeatInfo heartBeatInfo) {
            this.MediaBrowserCompat$CustomActionResultReceiver = heartBeatInfo;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7507tQ.read) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    /* renamed from: o.HeartBeatInfo$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
        public static final MediaMetadataCompat read = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7507tQ.read) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public static final /* synthetic */ isShutdown write(HeartBeatInfo heartBeatInfo) {
        isShutdown isshutdown = heartBeatInfo.MediaBrowserCompat$MediaItem;
        if (isshutdown == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrBScanCDisplay");
        }
        return isshutdown;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public HeartBeatInfo(RegularImmutableBiMap regularImmutableBiMap, getKeepAlive getkeepalive, MapMaker mapMaker) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getkeepalive, "bScanCCase");
        onGetStartedClick.write((Object) mapMaker, "qrBScanCDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = getkeepalive;
        this.MediaDescriptionCompat = mapMaker;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read != null) {
            isShutdown isshutdown = this.MediaBrowserCompat$MediaItem;
            if (isshutdown == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrBScanCDisplay");
            }
            if (MediaBrowserCompat$CustomActionResultReceiver(isshutdown, this.write)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean MediaBrowserCompat$CustomActionResultReceiver(isShutdown isshutdown, double d) {
        double d2;
        double d3;
        BigDecimal valueOf = BigDecimal.valueOf(d);
        if (isshutdown != null) {
            d2 = isshutdown.MediaBrowserCompat$ItemReceiver;
        } else {
            d2 = 100.0d;
        }
        if (valueOf.compareTo(BigDecimal.valueOf(d2)) >= 0) {
            BigDecimal valueOf2 = BigDecimal.valueOf(d);
            if (isshutdown != null) {
                d3 = isshutdown.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                d3 = 5000.0d;
            }
            if (valueOf2.compareTo(BigDecimal.valueOf(d3)) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.HeartBeatInfo$write */
    public static final class write<T> implements DebitCardMarketConductDeepLinkActivity<zzxn> {
        final /* synthetic */ HeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;

        public write(HeartBeatInfo heartBeatInfo) {
            this.MediaBrowserCompat$CustomActionResultReceiver = heartBeatInfo;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            HeartBeatInfo.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            HeartBeatInfo heartBeatInfo = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read>(this) {
                private /* synthetic */ write write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    String str;
                    C7507tQ.read read = (C7507tQ.read) obj;
                    double IconCompatParcelizer = this.write.MediaBrowserCompat$CustomActionResultReceiver.write;
                    CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver.read;
                    if (MediaBrowserCompat$ItemReceiver != null) {
                        str = MediaBrowserCompat$ItemReceiver.f2695x50fd9e4a;
                    } else {
                        str = null;
                    }
                    read.MediaBrowserCompat$CustomActionResultReceiver(String.valueOf(IconCompatParcelizer), str);
                }
            };
            if (heartBeatInfo.RatingCompat != null) {
                r0.IconCompatParcelizer(heartBeatInfo.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void read(HeartBeatInfo heartBeatInfo) {
        if (heartBeatInfo.RatingCompat != null) {
            heartBeatInfo.RatingCompat.aj_();
        }
    }
}
