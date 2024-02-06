package p040o;

import p040o.CustomConcurrentHashMap;
import p040o.ImageLabeler;

/* renamed from: o.SwipeDismissBehavior */
public final class SwipeDismissBehavior extends IndoorBuilding {
    getAncestor IconCompatParcelizer;
    private refreshIfEmpty write;

    @HmlPinActivity
    public SwipeDismissBehavior(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = getancestor;
        this.write = refreshifempty;
    }

    /* renamed from: o.SwipeDismissBehavior$5 */
    static /* synthetic */ class C38325 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.zzct$zza[] r0 = p040o.zzct.zza.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.zzct$zza r1 = p040o.zzct.zza.CONSUMER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzct$zza r1 = p040o.zzct.zza.BUSINESS_OWNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SwipeDismissBehavior.C38325.<clinit>():void");
        }
    }

    public final DebitCardResetOtpActivity<Void> read(CustomConcurrentHashMap.SoftExpirableEntry softExpirableEntry) {
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity;
        int i = C38325.MediaBrowserCompat$CustomActionResultReceiver[this.write.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1) {
            debitCardResetOtpActivity = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(softExpirableEntry).flatMap(new ImageLabeler.Builder(this));
        } else if (i != 2) {
            debitCardResetOtpActivity = null;
        } else {
            debitCardResetOtpActivity = this.write.MediaBrowserCompat$ItemReceiver(softExpirableEntry).flatMap(new ImageLabeler(this));
        }
        write(debitCardResetOtpActivity);
        return debitCardResetOtpActivity;
    }
}
