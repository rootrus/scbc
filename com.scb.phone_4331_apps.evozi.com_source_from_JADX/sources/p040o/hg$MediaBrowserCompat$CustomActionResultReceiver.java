package p040o;

import p040o.GoogleMap;
import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hg$MediaBrowserCompat$CustomActionResultReceiver */
public final class hg$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.CancelableCallback, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4750hg IconCompatParcelizer;
    private /* synthetic */ setModel MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ isSimulator read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hg$MediaBrowserCompat$CustomActionResultReceiver(C4750hg hgVar, isSimulator issimulator, setModel setmodel) {
        super(1);
        this.IconCompatParcelizer = hgVar;
        this.read = issimulator;
        this.MediaBrowserCompat$ItemReceiver = setmodel;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        GoogleMap.CancelableCallback cancelableCallback = (GoogleMap.CancelableCallback) obj;
        onGetStartedClick.write((Object) cancelableCallback, "prepaidOtp");
        C4750hg.read(this.IconCompatParcelizer);
        final standardStartAndWait MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.MediaBrowserCompat$ItemReceiver, cancelableCallback);
        C4750hg hgVar = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.VersionTable.VersionList.read>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((LocalProjectProvider.VersionTable.VersionList.read) obj).write(MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
        if (hgVar.RatingCompat != null) {
            r1.IconCompatParcelizer(hgVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
