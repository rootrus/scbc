package p040o;

/* renamed from: o.matchesAnyOf */
public final class matchesAnyOf extends any<write> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public matchesAnyOf(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getFrontException getfrontexception) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<write, DebitCardCoachMarkActivity>() {
            public final /* synthetic */ Object invoke(Object obj) {
                final write write = (write) obj;
                onGetStartedClick.write((Object) write, "params");
                DebitCardCoachMarkActivity read = DebitCardCoachMarkActivity.read((DataPrivacyManagementDeepLinkActivity) new DataPrivacyManagementDeepLinkActivity(this) {
                    private /* synthetic */ C49662 MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final void read() {
                        getfrontexception.IconCompatParcelizer(write.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                });
                onGetStartedClick.IconCompatParcelizer((Object) read, "Completable.fromAction {…dSummaryAd(params.adId) }");
                return read;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getfrontexception, "repository");
    }

    /* renamed from: o.matchesAnyOf$write */
    public static final class write implements C4602xca7af99c {
        final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((write) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(adId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public write(String str) {
            onGetStartedClick.write((Object) str, "adId");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }
}
