package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaBrowserCompat$MediaItem */
final class setRequestUserName$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ int IconCompatParcelizer;
    final /* synthetic */ setRequestUserName read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setRequestUserName$MediaBrowserCompat$MediaItem(setRequestUserName setrequestusername, int i) {
        super(1);
        this.read = setrequestusername;
        this.IconCompatParcelizer = i;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        setRequestUserName setrequestusername = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PassportExtractor>(this) {
            private /* synthetic */ setRequestUserName$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                PassportExtractor passportExtractor = (PassportExtractor) obj;
                setRequestUserName setrequestusername = this.MediaBrowserCompat$ItemReceiver.read;
                int i = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                boolean z = false;
                setrequestusername.MediaMetadataCompat = false;
                writeUInt64NoTag.IconCompatParcelizer setrequestusername_mediabrowsercompat_itemreceiver = new setRequestUserName$MediaBrowserCompat$ItemReceiver(i);
                if (setrequestusername.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setrequestusername_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setrequestusername.RatingCompat);
                }
                if (this.MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$Token || !this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
                    passportExtractor.IconCompatParcelizer();
                    return;
                }
                this.MediaBrowserCompat$ItemReceiver.read.MediaSessionCompat$Token = true;
                passportExtractor.write(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        };
        if (setrequestusername.RatingCompat != null) {
            r1.IconCompatParcelizer(setrequestusername.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
