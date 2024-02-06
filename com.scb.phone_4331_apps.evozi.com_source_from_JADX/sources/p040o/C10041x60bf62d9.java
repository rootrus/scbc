package p040o;

import p040o.IdCaptureModule_GetIIdExtractionServerRttiFactory;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadConfigurationFile$MediaBrowserCompat$CustomActionResultReceiver */
public final class C10041x60bf62d9 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ loadConfigurationFile MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10041x60bf62d9(loadConfigurationFile loadconfigurationfile) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = loadconfigurationfile;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        if (writeUInt64NoTag.write(th) || writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
            loadConfigurationFile.read(this.MediaBrowserCompat$ItemReceiver);
            loadConfigurationFile loadconfigurationfile = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetIIdExtractionServerRttiFactory.read>(this) {
                private /* synthetic */ C10041x60bf62d9 MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(throwable)");
                    ((IdCaptureModule_GetIIdExtractionServerRttiFactory.read) obj).mo13730i_(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer);
                }
            };
            if (loadconfigurationfile.RatingCompat != null) {
                r1.IconCompatParcelizer(loadconfigurationfile.RatingCompat);
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ C10041x60bf62d9 read;

                {
                    this.read = r1;
                }

                public final void run() {
                    loadConfigurationFile loadconfigurationfile = this.read.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C100435.MediaBrowserCompat$ItemReceiver;
                    if (loadconfigurationfile.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(loadconfigurationfile.RatingCompat);
                    }
                }
            }));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
