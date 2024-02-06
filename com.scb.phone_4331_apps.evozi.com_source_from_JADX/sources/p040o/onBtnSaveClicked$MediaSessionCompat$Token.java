package p040o;

import java.util.concurrent.TimeUnit;
import p040o.onBtnSaveClicked;

/* renamed from: o.onBtnSaveClicked$MediaSessionCompat$Token */
final class onBtnSaveClicked$MediaSessionCompat$Token<T> extends onBtnSaveClicked.write<T> {
    private int IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private TimeUnit write;

    onBtnSaveClicked$MediaSessionCompat$Token(int i, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.write = timeUnit;
    }

    /* access modifiers changed from: package-private */
    public final Object IconCompatParcelizer(Object obj) {
        return new HmlETBLoanReviewActivity(obj, BankingAgentDeepLinkActivity.IconCompatParcelizer(this.write), this.write);
    }

    /* access modifiers changed from: package-private */
    public final Object read(Object obj) {
        return ((HmlETBLoanReviewActivity) obj).read;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        onBtnSaveClicked.RatingCompat ratingCompat;
        long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.write);
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        onBtnSaveClicked.RatingCompat ratingCompat2 = (onBtnSaveClicked.RatingCompat) get();
        onBtnSaveClicked.RatingCompat ratingCompat3 = (onBtnSaveClicked.RatingCompat) ratingCompat2.get();
        int i = 0;
        while (true) {
            onBtnSaveClicked.RatingCompat ratingCompat4 = ratingCompat3;
            ratingCompat = ratingCompat2;
            ratingCompat2 = ratingCompat4;
            if (ratingCompat2 == null) {
                break;
            } else if (this.MediaBrowserCompat$ItemReceiver <= this.IconCompatParcelizer || this.MediaBrowserCompat$ItemReceiver <= 1) {
                if (((HmlETBLoanReviewActivity) ratingCompat2.write).MediaBrowserCompat$ItemReceiver > IconCompatParcelizer2 - j) {
                    break;
                }
                i++;
                this.MediaBrowserCompat$ItemReceiver--;
                ratingCompat3 = (onBtnSaveClicked.RatingCompat) ratingCompat2.get();
            } else {
                i++;
                this.MediaBrowserCompat$ItemReceiver--;
                ratingCompat3 = (onBtnSaveClicked.RatingCompat) ratingCompat2.get();
            }
        }
        if (i != 0) {
            set(ratingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver() {
        /*
            r14 = this;
            java.util.concurrent.TimeUnit r0 = r14.write
            long r0 = p040o.BankingAgentDeepLinkActivity.IconCompatParcelizer(r0)
            long r2 = r14.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r4 = r14.get()
            o.onBtnSaveClicked$RatingCompat r4 = (p040o.onBtnSaveClicked.RatingCompat) r4
            java.lang.Object r5 = r4.get()
            o.onBtnSaveClicked$RatingCompat r5 = (p040o.onBtnSaveClicked.RatingCompat) r5
            r6 = 0
        L_0x0015:
            r13 = r5
            r5 = r4
            r4 = r13
            if (r4 == 0) goto L_0x0039
            int r7 = r14.MediaBrowserCompat$ItemReceiver
            r8 = 1
            if (r7 <= r8) goto L_0x0039
            java.lang.Object r7 = r4.write
            o.HmlETBLoanReviewActivity r7 = (p040o.HmlETBLoanReviewActivity) r7
            long r9 = r7.MediaBrowserCompat$ItemReceiver
            long r11 = r0 - r2
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x0039
            int r6 = r6 + 1
            int r5 = r14.MediaBrowserCompat$ItemReceiver
            int r5 = r5 - r8
            r14.MediaBrowserCompat$ItemReceiver = r5
            java.lang.Object r5 = r4.get()
            o.onBtnSaveClicked$RatingCompat r5 = (p040o.onBtnSaveClicked.RatingCompat) r5
            goto L_0x0015
        L_0x0039:
            if (r6 == 0) goto L_0x003e
            r14.set(r5)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onBtnSaveClicked$MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver():void");
    }

    /* access modifiers changed from: package-private */
    public final onBtnSaveClicked.RatingCompat read() {
        onBtnSaveClicked.RatingCompat ratingCompat;
        long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.write);
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        onBtnSaveClicked.RatingCompat ratingCompat2 = (onBtnSaveClicked.RatingCompat) get();
        Object obj = ratingCompat2.get();
        while (true) {
            onBtnSaveClicked.RatingCompat ratingCompat3 = (onBtnSaveClicked.RatingCompat) obj;
            ratingCompat = ratingCompat2;
            ratingCompat2 = ratingCompat3;
            if (ratingCompat2 == null) {
                break;
            }
            HmlETBLoanReviewActivity hmlETBLoanReviewActivity = (HmlETBLoanReviewActivity) ratingCompat2.write;
            if (HmlCaptureDocumentActivity.read(hmlETBLoanReviewActivity.read) || HmlCaptureDocumentActivity.write((Object) hmlETBLoanReviewActivity.read) || hmlETBLoanReviewActivity.MediaBrowserCompat$ItemReceiver > IconCompatParcelizer2 - j) {
                break;
            }
            obj = ratingCompat2.get();
        }
        return ratingCompat;
    }
}
