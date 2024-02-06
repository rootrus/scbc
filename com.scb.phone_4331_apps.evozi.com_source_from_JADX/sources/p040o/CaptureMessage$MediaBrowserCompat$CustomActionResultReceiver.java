package p040o;

import p040o.access$2300;

/* renamed from: o.CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver */
public class CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ CaptureMessage write;

    private CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver(CaptureMessage captureMessage) {
        this.write = captureMessage;
    }

    public /* synthetic */ CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver(CaptureMessage captureMessage, byte b) {
        this(captureMessage);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((Boolean) obj);
        CaptureMessage.write(this.write);
        CaptureMessage captureMessage = this.write;
        LicenseCaptureView_MembersInjector licenseCaptureView_MembersInjector = LicenseCaptureView_MembersInjector.MediaBrowserCompat$ItemReceiver;
        if (captureMessage.RatingCompat != null) {
            licenseCaptureView_MembersInjector.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
