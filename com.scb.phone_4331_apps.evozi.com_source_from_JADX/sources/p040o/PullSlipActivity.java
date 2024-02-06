package p040o;

/* renamed from: o.PullSlipActivity */
public final class PullSlipActivity implements PrepaidRequestMailingAddressActivity {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (java.lang.Integer.parseInt(r10[0].MediaBrowserCompat$ItemReceiver()) < 0) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(p040o.ScbPrivacyPolicyActivity r9, p040o.CreditCardBilledDetailAdapter$ParentViewHolder r10) {
        /*
            r8 = this;
            java.lang.String r0 = "HTTP response"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r9, (java.lang.String) r0)
            java.lang.String r0 = "HTTP context"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r10, (java.lang.String) r0)
            o.VerifyIdentityActivity r0 = r9.IconCompatParcelizer()
            int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            java.lang.String r1 = "Transfer-Encoding"
            java.lang.String r2 = "Content-Length"
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            if (r0 != r3) goto L_0x0033
            o.PrepaidRequestMarketConductActivity r0 = r9.MediaBrowserCompat$CustomActionResultReceiver(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ NumberFormatException -> 0x002c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002c }
            if (r0 <= 0) goto L_0x002c
            return r4
        L_0x002c:
            o.PrepaidRequestMarketConductActivity r0 = r9.MediaBrowserCompat$CustomActionResultReceiver(r1)
            if (r0 == 0) goto L_0x0033
            return r4
        L_0x0033:
            java.lang.String r0 = "http.request"
            java.lang.Object r10 = r10.MediaBrowserCompat$ItemReceiver(r0)
            o.PrivacyConsentActivity r10 = (p040o.PrivacyConsentActivity) r10
            java.lang.String r0 = "Close"
            java.lang.String r5 = "Connection"
            if (r10 == 0) goto L_0x005b
            o.AccountTargetAdapter$AccountViewHolder r6 = new o.AccountTargetAdapter$AccountViewHolder     // Catch:{ ParseException -> 0x005a }
            o.PrepaidResetPinSuccessActivity r7 = r10.write(r5)     // Catch:{ ParseException -> 0x005a }
            r6.<init>(r7)     // Catch:{ ParseException -> 0x005a }
        L_0x004a:
            boolean r7 = r6.hasNext()     // Catch:{ ParseException -> 0x005a }
            if (r7 == 0) goto L_0x005b
            java.lang.String r7 = r6.MediaBrowserCompat$ItemReceiver()     // Catch:{ ParseException -> 0x005a }
            boolean r7 = r0.equalsIgnoreCase(r7)     // Catch:{ ParseException -> 0x005a }
            if (r7 == 0) goto L_0x004a
        L_0x005a:
            return r4
        L_0x005b:
            o.VerifyIdentityActivity r6 = r9.IconCompatParcelizer()
            o.ReviewAccountsActivity r6 = r6.write()
            o.PrepaidRequestMarketConductActivity r1 = r9.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r7 = 1
            if (r1 == 0) goto L_0x0077
            java.lang.String r10 = r1.MediaBrowserCompat$ItemReceiver()
            java.lang.String r1 = "chunked"
            boolean r10 = r1.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x00b8
            return r4
        L_0x0077:
            if (r10 == 0) goto L_0x008b
            o.ManageNotificationsActivity r10 = r10.MediaBrowserCompat$MediaItem()
            java.lang.String r10 = r10.MediaBrowserCompat$ItemReceiver()
            java.lang.String r1 = "HEAD"
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 == 0) goto L_0x008b
        L_0x0089:
            r10 = r4
            goto L_0x00a2
        L_0x008b:
            o.VerifyIdentityActivity r10 = r9.IconCompatParcelizer()
            int r10 = r10.MediaBrowserCompat$CustomActionResultReceiver()
            r1 = 200(0xc8, float:2.8E-43)
            if (r10 < r1) goto L_0x0089
            if (r10 == r3) goto L_0x0089
            r1 = 304(0x130, float:4.26E-43)
            if (r10 == r1) goto L_0x0089
            r1 = 205(0xcd, float:2.87E-43)
            if (r10 == r1) goto L_0x0089
            r10 = r7
        L_0x00a2:
            if (r10 == 0) goto L_0x00b8
            o.PrepaidRequestMarketConductActivity[] r10 = r9.MediaBrowserCompat$ItemReceiver((java.lang.String) r2)
            int r1 = r10.length
            if (r1 != r7) goto L_0x00b7
            r10 = r10[r4]
            java.lang.String r10 = r10.MediaBrowserCompat$ItemReceiver()     // Catch:{ NumberFormatException -> 0x00b7 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x00b7 }
            if (r10 >= 0) goto L_0x00b8
        L_0x00b7:
            return r4
        L_0x00b8:
            o.PrepaidResetPinSuccessActivity r10 = r9.write(r5)
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L_0x00c8
            java.lang.String r10 = "Proxy-Connection"
            o.PrepaidResetPinSuccessActivity r10 = r9.write(r10)
        L_0x00c8:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L_0x00f3
            o.AccountTargetAdapter$AccountViewHolder r9 = new o.AccountTargetAdapter$AccountViewHolder     // Catch:{ ParseException -> 0x00f2 }
            r9.<init>(r10)     // Catch:{ ParseException -> 0x00f2 }
            r10 = r4
        L_0x00d4:
            boolean r1 = r9.hasNext()     // Catch:{ ParseException -> 0x00f2 }
            if (r1 == 0) goto L_0x00ef
            java.lang.String r1 = r9.MediaBrowserCompat$ItemReceiver()     // Catch:{ ParseException -> 0x00f2 }
            boolean r2 = r0.equalsIgnoreCase(r1)     // Catch:{ ParseException -> 0x00f2 }
            if (r2 == 0) goto L_0x00e5
            return r4
        L_0x00e5:
            java.lang.String r2 = "Keep-Alive"
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ ParseException -> 0x00f2 }
            if (r1 == 0) goto L_0x00d4
            r10 = r7
            goto L_0x00d4
        L_0x00ef:
            if (r10 == 0) goto L_0x00f3
            return r7
        L_0x00f2:
            return r4
        L_0x00f3:
            o.ManageAccountInboundActivity r9 = p040o.ManageAccountInboundActivity.write
            boolean r9 = r6.MediaBrowserCompat$CustomActionResultReceiver(r9)
            r9 = r9 ^ r7
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PullSlipActivity.read(o.ScbPrivacyPolicyActivity, o.CreditCardBilledDetailAdapter$ParentViewHolder):boolean");
    }
}
