package p040o;

import p040o.C7507tQ;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfo$MediaBrowserCompat$MediaItem */
public final class HeartBeatInfo$MediaBrowserCompat$MediaItem<T> implements DebitCardMarketConductDeepLinkActivity<zzxn> {
    final /* synthetic */ HeartBeatInfo read;

    public HeartBeatInfo$MediaBrowserCompat$MediaItem(HeartBeatInfo heartBeatInfo) {
        this.read = heartBeatInfo;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        zzxn zzxn = (zzxn) obj;
        HeartBeatInfo.read(this.read);
        HeartBeatInfo heartBeatInfo = this.read;
        MapMaker unused = heartBeatInfo.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) zzxn, "qrBScanC");
        heartBeatInfo.MediaBrowserCompat$MediaItem = MapMaker.write(zzxn);
        HeartBeatInfo heartBeatInfo2 = this.read;
        heartBeatInfo2.MediaBrowserCompat$SearchResultReceiver = HeartBeatInfo.write(heartBeatInfo2).IconCompatParcelizer;
        HeartBeatInfo heartBeatInfo3 = this.read;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read>(this) {
            private /* synthetic */ HeartBeatInfo$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C7507tQ.read read = (C7507tQ.read) obj;
                read.IconCompatParcelizer(HeartBeatInfo.write(this.MediaBrowserCompat$ItemReceiver.read));
                read.read(HeartBeatInfo.write(this.MediaBrowserCompat$ItemReceiver.read));
            }
        };
        if (heartBeatInfo3.RatingCompat != null) {
            r0.IconCompatParcelizer(heartBeatInfo3.RatingCompat);
        }
    }
}
