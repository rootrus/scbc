package p040o;

/* renamed from: o.setBackgroundTintMode */
public final class setBackgroundTintMode extends any<read> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setBackgroundTintMode(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getAncestor getancestor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, DebitCardCoachMarkActivity>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "params");
                DebitCardCoachMarkActivity write = getancestor.write(Boolean.valueOf(read.read));
                onGetStartedClick.IconCompatParcelizer((Object) write, "hmlRepositoryContractor.saveNcbConsent(params.b)");
                return write;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
    }

    /* renamed from: o.setBackgroundTintMode$read */
    public static final class read implements C4602xca7af99c {
        final boolean read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && this.read == ((read) obj).read;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.read;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BooleanParams(b=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public read(boolean z) {
            this.read = z;
        }
    }
}
