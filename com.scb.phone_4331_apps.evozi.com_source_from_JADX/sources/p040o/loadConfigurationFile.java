package p040o;

import p040o.C10827Iterators;
import p040o.IdCaptureModule_GetIIdExtractionServerRttiFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadConfigurationFile */
public final class loadConfigurationFile extends writeUInt64NoTag<IdCaptureModule_GetIIdExtractionServerRttiFactory.read> {
    public final C10827Iterators.C35341 IconCompatParcelizer;

    /* renamed from: o.loadConfigurationFile$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zzuk, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ loadConfigurationFile write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(loadConfigurationFile loadconfigurationfile) {
            super(1);
            this.write = loadconfigurationfile;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (zzuk) obj, "it");
            loadConfigurationFile.read(this.write);
            loadConfigurationFile loadconfigurationfile = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C49413.MediaBrowserCompat$CustomActionResultReceiver;
            if (loadconfigurationfile.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(loadconfigurationfile.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public loadConfigurationFile(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C35341 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "debitOtpConfirmController");
        this.IconCompatParcelizer = r3;
    }

    public final void onDestroy() {
        this.IconCompatParcelizer.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void read(loadConfigurationFile loadconfigurationfile) {
        if (loadconfigurationfile.RatingCompat != null) {
            loadconfigurationfile.RatingCompat.aj_();
        }
    }
}
