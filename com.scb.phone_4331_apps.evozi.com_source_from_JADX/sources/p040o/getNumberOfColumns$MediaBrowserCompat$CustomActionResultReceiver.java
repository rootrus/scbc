package p040o;

import com.scb.phone.domain.errors.RetrofitException;

/* renamed from: o.getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver */
public class getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getNumberOfColumns IconCompatParcelizer;

    private getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver(getNumberOfColumns getnumberofcolumns) {
        this.IconCompatParcelizer = getnumberofcolumns;
    }

    public /* synthetic */ getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver(getNumberOfColumns getnumberofcolumns, byte b) {
        this(getnumberofcolumns);
    }

    public final void onComplete() {
        getNumberOfColumns.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        getNumberOfColumns getnumberofcolumns = this.IconCompatParcelizer;
        Serializer serializer = Serializer.write;
        if (getnumberofcolumns.RatingCompat != null) {
            serializer.IconCompatParcelizer(getnumberofcolumns.RatingCompat);
        }
        boolean unused = this.IconCompatParcelizer.read = false;
    }

    public final void onError(Throwable th) {
        getNumberOfColumns.write(this.IconCompatParcelizer);
        boolean z = false;
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            getNumberOfColumns getnumberofcolumns = this.IconCompatParcelizer;
            nativeGetName nativegetname = new nativeGetName(this, th);
            if (getnumberofcolumns.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativegetname.IconCompatParcelizer(getnumberofcolumns.RatingCompat);
            }
        } else if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getNumberOfColumns getnumberofcolumns2 = this.IconCompatParcelizer;
            nativeGetPages nativegetpages = new nativeGetPages(this, th);
            if (getnumberofcolumns2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativegetpages.IconCompatParcelizer(getnumberofcolumns2.RatingCompat);
            }
        }
        boolean unused = this.IconCompatParcelizer.read = false;
    }
}
