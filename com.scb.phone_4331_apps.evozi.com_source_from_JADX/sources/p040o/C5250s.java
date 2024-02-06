package p040o;

import p040o.C10827Iterators;
import p040o.writeUInt64NoTag;

/* renamed from: o.s */
public final class C5250s extends IsgDetectionModule_GetDocumentDetectorFactory<RttiIdExtractor_Factory> {
    private final C10827Iterators.C35467 MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.s$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C5250s write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(C5250s sVar) {
            super(1);
            this.write = sVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C5250s sVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<RttiIdExtractor_Factory>(this) {
                private /* synthetic */ IconCompatParcelizer write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    RttiIdExtractor_Factory rttiIdExtractor_Factory = (RttiIdExtractor_Factory) obj;
                    rttiIdExtractor_Factory.write(this.write.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IsgPassportDetector(new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(rttiIdExtractor_Factory) {
                        public final String getName() {
                            return "navigateBackSetResult";
                        }

                        public final CheckSCBSEligibilityActivity getOwner() {
                            return FundOnboardingLandingActivity_ViewBinding.write(RttiIdExtractor_Factory.class);
                        }

                        public final String getSignature() {
                            return "navigateBackSetResult()V";
                        }

                        public final /* synthetic */ Object invoke() {
                            ((RttiIdExtractor_Factory) this.receiver).MediaBrowserCompat$CustomActionResultReceiver();
                            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                        }
                    })));
                }
            };
            if (sVar.RatingCompat != null) {
                r1.IconCompatParcelizer(sVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5250s(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C35467 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "easycashEligibilityController");
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "flowType");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new s$MediaBrowserCompat$CustomActionResultReceiver(this, str2), new IconCompatParcelizer(this), str, str2);
    }
}
