package p040o;

import p040o.Image;
import p040o.access$2300;

/* renamed from: o.setTargetFrameAspectRatio */
public final /* synthetic */ class setTargetFrameAspectRatio implements FundFactSheetActivity {
    private final /* synthetic */ Image.FileIOEngine IconCompatParcelizer;

    public /* synthetic */ setTargetFrameAspectRatio(Image.FileIOEngine fileIOEngine) {
        this.IconCompatParcelizer = fileIOEngine;
    }

    public final Object invoke(Object obj) {
        Image.FileIOEngine fileIOEngine = this.IconCompatParcelizer;
        access$2300.write write = access$2300.write.NAVIGATE_BACK;
        fileIOEngine.MediaBrowserCompat$ItemReceiver(fileIOEngine.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, write));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
