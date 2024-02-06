package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getShortcutName$MediaBrowserCompat$CustomActionResultReceiver */
public final class getShortcutName$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getShortcutName IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getShortcutName$MediaBrowserCompat$CustomActionResultReceiver(getShortcutName getshortcutname) {
        super(1);
        this.IconCompatParcelizer = getshortcutname;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        getShortcutName getshortcutname = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer>(this) {
            private /* synthetic */ getShortcutName$MediaBrowserCompat$CustomActionResultReceiver read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        };
        if (getshortcutname.RatingCompat != null) {
            r1.IconCompatParcelizer(getshortcutname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
