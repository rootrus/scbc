package p040o;

import p040o.zzbt;

/* renamed from: o.setRequestedPreviewSize */
public final class setRequestedPreviewSize extends frequency<zzbt.zzf.zzb, read> {

    /* renamed from: o.setRequestedPreviewSize$read */
    public static final class read implements C4602xca7af99c {
        final newEntryArray read;

        public read(newEntryArray newentryarray) {
            onGetStartedClick.write((Object) newentryarray, "request");
            this.read = newentryarray;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setRequestedPreviewSize(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final comparator comparator) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, BScanCNotificationDeepLinkActivity<zzbt.zzf.zzb>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "param");
                return comparator.MediaBrowserCompat$ItemReceiver(read.read);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) comparator, "easycashCardInfoContractor");
    }
}
