package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.r$MediaBrowserCompat$CustomActionResultReceiver */
public final class r$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C5186r read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r$MediaBrowserCompat$CustomActionResultReceiver(C5186r rVar) {
        super(1);
        this.read = rVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        C5186r rVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<Check>(this) {
            private /* synthetic */ r$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                Check check = (Check) obj;
                check.write(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new newIsgDocumentDetector(new FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>(check) {
                    public final String getName() {
                        return "navigateBackSetResult";
                    }

                    public final CheckSCBSEligibilityActivity getOwner() {
                        return FundOnboardingLandingActivity_ViewBinding.write(Check.class);
                    }

                    public final String getSignature() {
                        return "navigateBackSetResult()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        ((Check) this.receiver).MediaBrowserCompat$CustomActionResultReceiver();
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                })));
            }
        };
        if (rVar.RatingCompat != null) {
            r1.IconCompatParcelizer(rVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
