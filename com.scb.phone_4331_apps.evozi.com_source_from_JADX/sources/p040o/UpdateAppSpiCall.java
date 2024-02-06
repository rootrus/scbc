package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.UpdateAppSpiCall */
public final class UpdateAppSpiCall extends writeUInt64NoTag<C6379x9b5721a5> {
    public final consumingIterator IconCompatParcelizer;
    public final toLongArray read;
    public final String write = "BANKING_AGENT";

    /* renamed from: o.UpdateAppSpiCall$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ UpdateAppSpiCall write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(UpdateAppSpiCall updateAppSpiCall) {
            super(1);
            this.write = updateAppSpiCall;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "e");
            UpdateAppSpiCall updateAppSpiCall = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C6379x9b5721a5>(this) {
                private /* synthetic */ IconCompatParcelizer read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    C6379x9b5721a5 checkCaptureModule_GetExtractionParametersFactory$MediaBrowserCompat$CustomActionResultReceiver = (C6379x9b5721a5) obj;
                    checkCaptureModule_GetExtractionParametersFactory$MediaBrowserCompat$CustomActionResultReceiver.write(this.read.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    checkCaptureModule_GetExtractionParametersFactory$MediaBrowserCompat$CustomActionResultReceiver.aj_();
                }
            };
            if (updateAppSpiCall.RatingCompat != null) {
                r1.IconCompatParcelizer(updateAppSpiCall.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.UpdateAppSpiCall$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C6379x9b5721a5> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6379x9b5721a5) obj).AlertController$RecycleListView();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UpdateAppSpiCall(consumingIterator consumingiterator, RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) consumingiterator, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConditionsMapper");
        this.IconCompatParcelizer = consumingiterator;
        this.read = tolongarray;
    }

    /* renamed from: o.UpdateAppSpiCall$read */
    public static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ UpdateAppSpiCall IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(UpdateAppSpiCall updateAppSpiCall) {
            super(0);
            this.IconCompatParcelizer = updateAppSpiCall;
        }

        public final /* synthetic */ Object invoke() {
            UpdateAppSpiCall updateAppSpiCall = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C39274.write;
            if (updateAppSpiCall.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(updateAppSpiCall.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
