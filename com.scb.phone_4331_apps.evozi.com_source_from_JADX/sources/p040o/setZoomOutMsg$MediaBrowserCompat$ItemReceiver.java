package p040o;

import android.text.TextUtils;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.access$2300;

/* renamed from: o.setZoomOutMsg$MediaBrowserCompat$ItemReceiver */
public class setZoomOutMsg$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnStreetViewPanoramaLongClickListener> {
    final /* synthetic */ setZoomOutMsg write;

    public final void onComplete() {
    }

    private setZoomOutMsg$MediaBrowserCompat$ItemReceiver(setZoomOutMsg setzoomoutmsg) {
        this.write = setzoomoutmsg;
    }

    public /* synthetic */ setZoomOutMsg$MediaBrowserCompat$ItemReceiver(setZoomOutMsg setzoomoutmsg, byte b) {
        this(setzoomoutmsg);
    }

    public final /* synthetic */ void onNext(Object obj) {
        setOnStreetViewPanoramaLongClickListener setonstreetviewpanoramalongclicklistener = (setOnStreetViewPanoramaLongClickListener) obj;
        setZoomOutMsg.write(this.write);
        SquareCap IconCompatParcelizer = this.write.read;
        closePinLocation$MediaBrowserCompat$ItemReceiver closepinlocation_mediabrowsercompat_itemreceiver = new closePinLocation$MediaBrowserCompat$ItemReceiver();
        closepinlocation_mediabrowsercompat_itemreceiver.IconCompatParcelizer = this.write.MediaBrowserCompat$MediaItem;
        closepinlocation_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = String.valueOf(this.write.MediaBrowserCompat$ItemReceiver.RatingCompat);
        closepinlocation_mediabrowsercompat_itemreceiver.read = this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        String str = setonstreetviewpanoramalongclicklistener.write;
        String str2 = setonstreetviewpanoramalongclicklistener.IconCompatParcelizer;
        if (!this.write.read.IconCompatParcelizer.setCheckable().equals("th") ? !TextUtils.isEmpty(str2) : TextUtils.isEmpty(str)) {
            str = str2;
        }
        closepinlocation_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem = str;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder unused = this.write.write;
        closepinlocation_mediabrowsercompat_itemreceiver.write = this.write.write.MediaBrowserCompat$ItemReceiver;
        closepinlocation_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = this.write.write.read;
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(closepinlocation_mediabrowsercompat_itemreceiver);
        setZoomOutMsg setzoomoutmsg = this.write;
        C10112qK qKVar = new C10112qK(this, setonstreetviewpanoramalongclicklistener);
        if (setzoomoutmsg.RatingCompat != null) {
            qKVar.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
