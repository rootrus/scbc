package p040o;

import p040o.CreditCardParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver */
public final class HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<zzxn> {
    final /* synthetic */ HeartBeatInfoStorage MediaBrowserCompat$ItemReceiver;

    public HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver(HeartBeatInfoStorage heartBeatInfoStorage) {
        this.MediaBrowserCompat$ItemReceiver = heartBeatInfoStorage;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final zzxn zzxn = (zzxn) obj;
        HeartBeatInfoStorage.write(this.MediaBrowserCompat$ItemReceiver);
        HeartBeatInfoStorage heartBeatInfoStorage = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters.CardStyle>(this) {
            private /* synthetic */ HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                MapMaker unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.read;
                zzxn zzxn = zzxn;
                onGetStartedClick.IconCompatParcelizer((Object) zzxn, "qrBScanC");
                isShutdown write = MapMaker.write(zzxn);
                zzxn zzxn2 = zzxn;
                onGetStartedClick.IconCompatParcelizer((Object) zzxn2, "qrBScanC");
                zzvj IconCompatParcelizer2 = zzxn2.IconCompatParcelizer();
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "qrBScanC.status");
                String str = IconCompatParcelizer2.write;
                onGetStartedClick.IconCompatParcelizer((Object) str, "qrBScanC.status.code");
                ((CreditCardParameters.CardStyle) obj).read(write, str);
            }
        };
        if (heartBeatInfoStorage.RatingCompat != null) {
            r1.IconCompatParcelizer(heartBeatInfoStorage.RatingCompat);
        }
    }
}
