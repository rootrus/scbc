package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaBrowserCompat$ItemReceiver */
public final class typeToString$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ typeToString write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public typeToString$MediaBrowserCompat$ItemReceiver(typeToString typetostring) {
        super(1);
        this.write = typetostring;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        int hashCode;
        ILocationSourceDelegate.zza zza;
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
        if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
            str = null;
        } else {
            str = zza.IconCompatParcelizer;
        }
        if (str == null || ((hashCode = str.hashCode()) == 1515399 ? !str.equals("1899") : hashCode != 1567011 || !str.equals("3006"))) {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ typeToString$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final void run() {
                    typeToString typetostring = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C101674.read;
                    if (typetostring.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(typetostring.RatingCompat);
                    }
                }
            }));
        } else {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
