package p040o;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.TransferActivity */
public final class TransferActivity implements RegistrationDeadCardActivity {
    private final ConcurrentHashMap<PromptPayTermsAndConditionsActivity, PurchaseReviewActivity> MediaBrowserCompat$ItemReceiver = new ConcurrentHashMap<>();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r6.write != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        if (r11 != -1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r6.MediaBrowserCompat$CustomActionResultReceiver != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x001a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.PurchaseReviewActivity IconCompatParcelizer(p040o.PromptPayTermsAndConditionsActivity r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Authentication scope"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r13, (java.lang.String) r0)
            java.util.concurrent.ConcurrentHashMap<o.PromptPayTermsAndConditionsActivity, o.PurchaseReviewActivity> r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.Object r1 = r0.get(r13)
            o.PurchaseReviewActivity r1 = (p040o.PurchaseReviewActivity) r1
            if (r1 != 0) goto L_0x009e
            r2 = 0
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = -1
            r5 = r4
        L_0x001a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r3.next()
            o.PromptPayTermsAndConditionsActivity r6 = (p040o.PromptPayTermsAndConditionsActivity) r6
            java.lang.String r7 = r13.IconCompatParcelizer
            java.lang.String r8 = r6.IconCompatParcelizer
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L_0x0034
            if (r8 != 0) goto L_0x0032
            r7 = r9
            goto L_0x0038
        L_0x0032:
            r7 = r10
            goto L_0x0038
        L_0x0034:
            boolean r7 = r7.equals(r8)
        L_0x0038:
            if (r7 == 0) goto L_0x003c
            r7 = r9
            goto L_0x0047
        L_0x003c:
            java.lang.String r7 = r13.IconCompatParcelizer
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r6.IconCompatParcelizer
            if (r7 == 0) goto L_0x0046
        L_0x0044:
            r7 = r4
            goto L_0x0090
        L_0x0046:
            r7 = r10
        L_0x0047:
            java.lang.String r8 = r13.write
            java.lang.String r11 = r6.write
            if (r8 != 0) goto L_0x0053
            if (r11 != 0) goto L_0x0051
            r8 = r9
            goto L_0x0057
        L_0x0051:
            r8 = r10
            goto L_0x0057
        L_0x0053:
            boolean r8 = r8.equals(r11)
        L_0x0057:
            if (r8 == 0) goto L_0x005c
            int r7 = r7 + 2
            goto L_0x0065
        L_0x005c:
            java.lang.String r8 = r13.write
            if (r8 == 0) goto L_0x0065
            java.lang.String r8 = r6.write
            if (r8 == 0) goto L_0x0065
            goto L_0x0044
        L_0x0065:
            int r8 = r13.MediaBrowserCompat$ItemReceiver
            int r11 = r6.MediaBrowserCompat$ItemReceiver
            if (r8 != r11) goto L_0x006e
            int r7 = r7 + 4
            goto L_0x0073
        L_0x006e:
            if (r8 == r4) goto L_0x0073
            if (r11 == r4) goto L_0x0073
            goto L_0x0044
        L_0x0073:
            java.lang.String r8 = r13.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 != 0) goto L_0x007e
            if (r11 != 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            r9 = r10
            goto L_0x0082
        L_0x007e:
            boolean r9 = r8.equals(r11)
        L_0x0082:
            if (r9 == 0) goto L_0x0087
            int r7 = r7 + 8
            goto L_0x0090
        L_0x0087:
            java.lang.String r8 = r13.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x0090
            java.lang.String r8 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x0090
            goto L_0x0044
        L_0x0090:
            if (r7 <= r5) goto L_0x001a
            r2 = r6
            r5 = r7
            goto L_0x001a
        L_0x0095:
            if (r2 == 0) goto L_0x009e
            java.lang.Object r13 = r0.get(r2)
            r1 = r13
            o.PurchaseReviewActivity r1 = (p040o.PurchaseReviewActivity) r1
        L_0x009e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.TransferActivity.IconCompatParcelizer(o.PromptPayTermsAndConditionsActivity):o.PurchaseReviewActivity");
    }

    public final String toString() {
        return this.MediaBrowserCompat$ItemReceiver.toString();
    }
}
