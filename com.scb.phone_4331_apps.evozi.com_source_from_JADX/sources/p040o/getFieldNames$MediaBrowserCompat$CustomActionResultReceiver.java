package p040o;

import com.scb.phone.domain.errors.RetrofitException;

/* renamed from: o.getFieldNames$MediaBrowserCompat$CustomActionResultReceiver */
public class getFieldNames$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getFieldNames MediaBrowserCompat$CustomActionResultReceiver;

    private getFieldNames$MediaBrowserCompat$CustomActionResultReceiver(getFieldNames getfieldnames) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfieldnames;
    }

    public /* synthetic */ getFieldNames$MediaBrowserCompat$CustomActionResultReceiver(getFieldNames getfieldnames, byte b) {
        this(getfieldnames);
    }

    public final void onComplete() {
        getFieldNames.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getFieldNames getfieldnames = this.MediaBrowserCompat$CustomActionResultReceiver;
        getTypeAdapter gettypeadapter = getTypeAdapter.IconCompatParcelizer;
        if (getfieldnames.RatingCompat != null) {
            gettypeadapter.IconCompatParcelizer(getfieldnames.RatingCompat);
        }
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = false;
    }

    public final void onError(Throwable th) {
        getFieldNames.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = false;
        if (removeIfFromRandomAccessList.IconCompatParcelizer(th, RetrofitException.read.OTP_FAILED, RetrofitException.read.OTP_REACH_MAX_LIMIT, RetrofitException.read.OTP_EXPIRED)) {
            getFieldNames getfieldnames = this.MediaBrowserCompat$CustomActionResultReceiver;
            getUSDateTimeFormat getusdatetimeformat = new getUSDateTimeFormat(this, th);
            if (getfieldnames.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getusdatetimeformat.IconCompatParcelizer(getfieldnames.RatingCompat);
            }
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(th, "3004")) {
            getFieldNames getfieldnames2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            Streams streams = new Streams(this, th);
            if (getfieldnames2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                streams.IconCompatParcelizer(getfieldnames2.RatingCompat);
            }
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(th, "6000", "7001", "9000", "3003", "3011")) {
            getFieldNames getfieldnames3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            writerForAppendable writerforappendable = new writerForAppendable(this, th);
            if (getfieldnames3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                writerforappendable.IconCompatParcelizer(getfieldnames3.RatingCompat);
            }
        } else {
            getFieldNames getfieldnames4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getUSDateFormat getusdateformat = new getUSDateFormat(this, th);
            if (getfieldnames4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getusdateformat.IconCompatParcelizer(getfieldnames4.RatingCompat);
            }
        }
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = false;
    }
}
