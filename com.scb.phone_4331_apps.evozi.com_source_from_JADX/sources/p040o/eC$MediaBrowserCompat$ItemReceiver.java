package p040o;

import p040o.C10887sdkVersion;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.eC$MediaBrowserCompat$ItemReceiver */
public final class eC$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4332eC write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eC$MediaBrowserCompat$ItemReceiver(C4332eC eCVar) {
        super(1);
        this.write = eCVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th) || writeUInt64NoTag.write(th)) {
            C4332eC.IconCompatParcelizer(this.write);
            C4332eC eCVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C10887sdkVersion.write>(this) {
                private /* synthetic */ eC$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    access$2200 MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplayMapper.transform(throwable)");
                    String str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(throwable).message");
                    ((C10887sdkVersion.write) obj).write(str);
                }
            };
            if (eCVar.RatingCompat != null) {
                r1.IconCompatParcelizer(eCVar.RatingCompat);
            }
        } else if (writeUInt64NoTag.read(th)) {
            C4332eC eCVar2 = this.write;
            eCVar2.MediaBrowserCompat$ItemReceiver(eCVar2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ eC$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final void run() {
                    C4332eC eCVar = this.IconCompatParcelizer.write;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99053.MediaBrowserCompat$CustomActionResultReceiver;
                    if (eCVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(eCVar.RatingCompat);
                    }
                }
            }));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
