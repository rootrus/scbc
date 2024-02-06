package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCorrectCaseUserName$MediaBrowserCompat$ItemReceiver */
public final class getCorrectCaseUserName$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getCorrectCaseUserName write;

    public getCorrectCaseUserName$MediaBrowserCompat$ItemReceiver(getCorrectCaseUserName getcorrectcaseusername) {
        this.write = getcorrectcaseusername;
    }

    public final void onComplete() {
        super.onComplete();
        getCorrectCaseUserName.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        getCorrectCaseUserName getcorrectcaseusername = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C9963x44c6ad2.MediaBrowserCompat$ItemReceiver;
        if (getcorrectcaseusername.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getcorrectcaseusername.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
