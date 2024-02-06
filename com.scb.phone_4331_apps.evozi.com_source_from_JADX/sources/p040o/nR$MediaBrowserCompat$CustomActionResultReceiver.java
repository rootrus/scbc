package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nR$MediaBrowserCompat$CustomActionResultReceiver */
public final class nR$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C5019nR MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nR$MediaBrowserCompat$CustomActionResultReceiver(C5019nR nRVar) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = nRVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "it");
        C5019nR.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        if (writeUInt64NoTag.IconCompatParcelizer(th)) {
            C5019nR nRVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C100693.read;
            if (nRVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nRVar.RatingCompat);
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ nR$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final void run() {
                    C5019nR nRVar = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C100711.IconCompatParcelizer;
                    if (nRVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(nRVar.RatingCompat);
                    }
                }
            }));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
