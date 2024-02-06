package p040o;

import p040o.access$2300;

/* renamed from: o.getRectTop */
public final /* synthetic */ class getRectTop implements FundFactSheetActivity {
    private final /* synthetic */ setMicrData read;

    public /* synthetic */ getRectTop(setMicrData setmicrdata) {
        this.read = setmicrdata;
    }

    public final Object invoke(Object obj) {
        setMicrData setmicrdata = this.read;
        access$2300.write write = access$2300.write.NAVIGATE_BACK;
        setmicrdata.MediaBrowserCompat$ItemReceiver(setmicrdata.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, write));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
