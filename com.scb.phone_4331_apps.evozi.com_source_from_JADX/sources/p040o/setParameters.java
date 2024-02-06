package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setParameters */
public final class setParameters extends writeUInt64NoTag<C1229xe1b6193a> {
    public final equalsImpl write;

    /* renamed from: o.setParameters$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ setParameters write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(setParameters setparameters) {
            super(1);
            this.write = setparameters;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            if (writeUInt64NoTag.write(th) || writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th) || writeUInt64NoTag.read(th)) {
                setParameters.IconCompatParcelizer(this.write);
                setParameters setparameters = this.write;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1229xe1b6193a>(this) {
                    private /* synthetic */ IconCompatParcelizer write;

                    {
                        this.write = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        access$2200 MediaBrowserCompat$ItemReceiver = this.write.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplayMapper.transform(throwable)");
                        ((C1229xe1b6193a) obj).mo13730i_(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                    }
                };
                if (setparameters.RatingCompat != null) {
                    r1.IconCompatParcelizer(setparameters.RatingCompat);
                }
            } else {
                this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setParameters$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zzuk, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setParameters read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(setParameters setparameters) {
            super(1);
            this.read = setparameters;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (zzuk) obj, "it");
            setParameters.IconCompatParcelizer(this.read);
            setParameters setparameters = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C53505.MediaBrowserCompat$ItemReceiver;
            if (setparameters.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setparameters.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setParameters(RegularImmutableBiMap regularImmutableBiMap, equalsImpl equalsimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) equalsimpl, "prepaidOtpConfirmController");
        this.write = equalsimpl;
    }

    public static final /* synthetic */ void IconCompatParcelizer(setParameters setparameters) {
        if (setparameters.RatingCompat != null) {
            setparameters.RatingCompat.aj_();
        }
    }
}
