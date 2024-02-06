package p040o;

import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import java.util.concurrent.TimeUnit;

/* renamed from: o.infoWindowAnchor */
public final class infoWindowAnchor extends IndoorBuilding {
    public final getFrontException MediaBrowserCompat$CustomActionResultReceiver;
    public final getBundleVersion write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public infoWindowAnchor(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, getFrontException getfrontexception, getBundleVersion getbundleversion) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getfrontexception, "appConfigRepositoryContractor");
        onGetStartedClick.write((Object) getbundleversion, "delayLoadingContractor");
        this.MediaBrowserCompat$CustomActionResultReceiver = getfrontexception;
        this.write = getbundleversion;
    }

    /* renamed from: o.infoWindowAnchor$write */
    public static final class write implements BitmapDisplayer {
        private write() {
        }

        public write(byte b) {
        }
    }

    public final DebitCardResetOtpActivity<?> write() {
        DebitCardResetOtpActivity<?> write2 = write(DebitCardResetOtpActivity.timer((long) MediaBrowserCompat$CustomActionResultReceiver(), TimeUnit.SECONDS));
        onGetStartedClick.IconCompatParcelizer((Object) write2, "withObservable(Observabl…ong(), TimeUnit.SECONDS))");
        return write2;
    }

    private final int MediaBrowserCompat$MediaItem() {
        zzwm zzwm;
        Integer num;
        zzwi write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write2 != null) {
            zzwm = write2.MediaSessionCompat$Token;
        } else {
            zzwm = null;
        }
        if (zzwm == null || (num = zzwm.MediaBrowserCompat$ItemReceiver) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        Boolean bool;
        Integer num;
        zzrp MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            bool = MediaBrowserCompat$ItemReceiver.read;
        } else {
            bool = null;
        }
        int i = 0;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
            return 0;
        }
        zzrp MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver();
        if (!(MediaBrowserCompat$ItemReceiver2 == null || (num = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver) == null)) {
            i = num.intValue();
        }
        int pow = (int) Math.pow(2.0d, (double) (i - 1));
        int MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem();
        return (MediaBrowserCompat$MediaItem > 0 && pow > MediaBrowserCompat$MediaItem) ? MediaBrowserCompat$MediaItem() : pow;
    }

    public final int IconCompatParcelizer() {
        Integer num;
        zzrp MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == null || (num = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        Long l;
        zzrp MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == null || (l = MediaBrowserCompat$ItemReceiver.write) == null) {
            return 0;
        }
        return l.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r7 = this;
            o.getFrontException r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.zzwi r0 = r0.write()
            if (r0 == 0) goto L_0x000b
            o.zzwm r0 = r0.MediaSessionCompat$Token
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Boolean r0 = r0.write
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.booleanValue()
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 == 0) goto L_0x0060
            o.getBundleVersion r0 = r7.write
            o.zzrp r0 = r0.MediaBrowserCompat$ItemReceiver()
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.read = r2
            java.lang.Integer r2 = r0.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x004d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 32
            if (r2 >= r3) goto L_0x004d
            int r3 = r2 + -1
            double r3 = (double) r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r5, r3)
            int r3 = (int) r3
            int r4 = r7.MediaBrowserCompat$MediaItem()
            if (r3 >= r4) goto L_0x004d
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.MediaBrowserCompat$ItemReceiver = r2
        L_0x004d:
            if (r0 != 0) goto L_0x005b
        L_0x004f:
            o.zzrp r0 = new o.zzrp
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 4
            r0.<init>((java.lang.Boolean) r2, (java.lang.Integer) r1, (int) r3)
        L_0x005b:
            o.getBundleVersion r1 = r7.write
            r1.IconCompatParcelizer(r0)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.infoWindowAnchor.read():void");
    }
}
