package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver */
public final class getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getDisplayValue MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_KtaExceptionResponseDeserializer_Factory> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportCaptureModule_KtaExceptionResponseDeserializer_Factory passportCaptureModule_KtaExceptionResponseDeserializer_Factory = (PassportCaptureModule_KtaExceptionResponseDeserializer_Factory) obj;
            passportCaptureModule_KtaExceptionResponseDeserializer_Factory.aj_();
            passportCaptureModule_KtaExceptionResponseDeserializer_Factory.MediaBrowserCompat$ItemReceiver();
        }
    }

    public getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver(getDisplayValue getdisplayvalue) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdisplayvalue;
    }

    public final void onError(Throwable th) {
        ILocationSourceDelegate iLocationSourceDelegate;
        ILocationSourceDelegate.zza zza;
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        String str = null;
        RetrofitException retrofitException = (RetrofitException) (!(th instanceof RetrofitException) ? null : th);
        if (!(retrofitException == null || (iLocationSourceDelegate = retrofitException.IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null)) {
            str = zza.IconCompatParcelizer;
        }
        if (str == null || str.hashCode() != 1746712 || !str.equals("9100")) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return;
        }
        getDisplayValue getdisplayvalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (getdisplayvalue.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getdisplayvalue.RatingCompat);
        }
    }

    public final void onComplete() {
        super.onComplete();
        getDisplayValue getdisplayvalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4550x3fb7362e.MediaBrowserCompat$ItemReceiver;
        if (getdisplayvalue.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getdisplayvalue.RatingCompat);
        }
        getDisplayValue.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
