package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;

/* renamed from: o.getCropLineColor$MediaBrowserCompat$ItemReceiver */
public final class getCropLineColor$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTypeFilter> {
    final /* synthetic */ getCropLineColor write;

    private getCropLineColor$MediaBrowserCompat$ItemReceiver(getCropLineColor getcroplinecolor) {
        this.write = getcroplinecolor;
    }

    public /* synthetic */ getCropLineColor$MediaBrowserCompat$ItemReceiver(getCropLineColor getcroplinecolor, byte b) {
        this(getcroplinecolor);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getCropLineColor.write(this.write);
        getCropLineColor getcroplinecolor = this.write;
        C9843aB aBVar = new C9843aB(this, (getTypeFilter) obj);
        if (getcroplinecolor.RatingCompat != null) {
            aBVar.IconCompatParcelizer(getcroplinecolor.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        getCropLineColor.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        boolean z = false;
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            getCropLineColor getcroplinecolor = this.write;
            C9842aA aAVar = new C9842aA(this, th);
            if (getcroplinecolor.RatingCompat != null) {
                z = true;
            }
            if (z) {
                aAVar.IconCompatParcelizer(getcroplinecolor.RatingCompat);
                return;
            }
            return;
        }
        getCropLineColor getcroplinecolor2 = this.write;
        getcroplinecolor2.MediaBrowserCompat$ItemReceiver(getcroplinecolor2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
