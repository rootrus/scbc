package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C5361xd79df389 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setRequestUserName MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5361xd79df389(setRequestUserName setrequestusername) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = setrequestusername;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        setRequestUserName setrequestusername = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportExtractor>(this) {
            private /* synthetic */ C5361xd79df389 write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                PassportExtractor passportExtractor = (PassportExtractor) obj;
                passportExtractor.IconCompatParcelizer(false);
                if (!this.write.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token && this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
                    this.write.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = true;
                    passportExtractor.write(this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }
        };
        if (setrequestusername.RatingCompat != null) {
            r1.IconCompatParcelizer(setrequestusername.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
