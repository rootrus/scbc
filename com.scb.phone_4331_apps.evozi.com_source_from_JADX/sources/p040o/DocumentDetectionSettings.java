package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentDetectionSettings */
public final /* synthetic */ class DocumentDetectionSettings implements FundFactSheetActivity {
    private final /* synthetic */ clearBitmapWithoutRecycle write;

    public /* synthetic */ DocumentDetectionSettings(clearBitmapWithoutRecycle clearbitmapwithoutrecycle) {
        this.write = clearbitmapwithoutrecycle;
    }

    /* renamed from: o.DocumentDetectionSettings$DocumentEdgeDetection */
    public final /* synthetic */ class DocumentEdgeDetection implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ clearBitmapWithoutRecycle read;

        public /* synthetic */ DocumentEdgeDetection(clearBitmapWithoutRecycle clearbitmapwithoutrecycle, getLegacySharedPrefs getlegacysharedprefs) {
            this.read = clearbitmapwithoutrecycle;
            this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.setShortcut.read) obj).MediaBrowserCompat$CustomActionResultReceiver(clearBitmapWithoutRecycle.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public final Object invoke(Object obj) {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.write;
        boolean z = true;
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            clearbitmapwithoutrecycle.RatingCompat.aj_();
        }
        imageReadFromFileBuffer imagereadfromfilebuffer = imageReadFromFileBuffer.MediaBrowserCompat$CustomActionResultReceiver;
        if (clearbitmapwithoutrecycle.RatingCompat == null) {
            z = false;
        }
        if (z) {
            imagereadfromfilebuffer.IconCompatParcelizer(clearbitmapwithoutrecycle.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
