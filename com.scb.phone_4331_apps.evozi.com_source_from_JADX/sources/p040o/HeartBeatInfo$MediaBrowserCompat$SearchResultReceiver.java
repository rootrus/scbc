package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfo$MediaBrowserCompat$SearchResultReceiver */
public final class HeartBeatInfo$MediaBrowserCompat$SearchResultReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ HeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;

    public HeartBeatInfo$MediaBrowserCompat$SearchResultReceiver(HeartBeatInfo heartBeatInfo) {
        this.MediaBrowserCompat$CustomActionResultReceiver = heartBeatInfo;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Throwable th = (Throwable) obj;
        HeartBeatInfo.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.IconCompatParcelizer != null) {
                ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "throwable.response");
                if (iLocationSourceDelegate.write != null) {
                    ILocationSourceDelegate iLocationSourceDelegate2 = retrofitException.IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate2, "throwable.response");
                    ILocationSourceDelegate.zza zza = iLocationSourceDelegate2.write;
                    onGetStartedClick.IconCompatParcelizer((Object) zza, "error");
                    String str = zza.IconCompatParcelizer;
                    if (str == null || str.hashCode() != 1567011 || !str.equals("3006")) {
                        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                        return;
                    }
                    HeartBeatInfo heartBeatInfo = this.MediaBrowserCompat$CustomActionResultReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C97522.MediaBrowserCompat$ItemReceiver;
                    if (heartBeatInfo.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(heartBeatInfo.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
