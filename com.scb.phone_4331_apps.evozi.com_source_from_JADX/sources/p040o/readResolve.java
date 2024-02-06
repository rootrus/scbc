package p040o;

/* renamed from: o.readResolve */
public final class readResolve extends frequency<minZoomPreference, write> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public readResolve(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultiset abstractMultiset) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<write, BScanCNotificationDeepLinkActivity<minZoomPreference>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                write write = (write) obj;
                onGetStartedClick.write((Object) write, "param");
                return abstractMultiset.read(write.write);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) abstractMultiset, "repository");
    }

    /* renamed from: o.readResolve$write */
    public static final class write implements C4602xca7af99c {
        final orderedBy write;

        public write(orderedBy orderedby) {
            onGetStartedClick.write((Object) orderedby, "request");
            this.write = orderedby;
        }
    }
}
