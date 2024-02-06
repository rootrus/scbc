package p040o;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: o.CreditCardDetailPurchaseViewPagerAdapter$ItemViewHolder */
public final class CreditCardDetailPurchaseViewPagerAdapter$ItemViewHolder {
    private final int read;

    private CreditCardDetailPurchaseViewPagerAdapter$ItemViewHolder(byte b) {
        this.read = DepositTransactionAdapter$GroupItemViewHolder.write(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, "Wait for continue time");
    }

    public CreditCardDetailPurchaseViewPagerAdapter$ItemViewHolder() {
        this((byte) 0);
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
        int MediaBrowserCompat$CustomActionResultReceiver;
        if ("HEAD".equalsIgnoreCase(privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver()) || (MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver()) < 200 || MediaBrowserCompat$CustomActionResultReceiver == 204 || MediaBrowserCompat$CustomActionResultReceiver == 304 || MediaBrowserCompat$CustomActionResultReceiver == 205) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f A[Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.ScbPrivacyPolicyActivity IconCompatParcelizer(p040o.PrivacyConsentActivity r8, p040o.PrepaidRequestSuccessActivity r9, p040o.CreditCardBilledDetailAdapter$ParentViewHolder r10) throws java.io.IOException, org.apache.http.HttpException {
        /*
            r7 = this;
            java.lang.String r0 = "http.request_sent"
            java.lang.String r1 = "HTTP request"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r8, (java.lang.String) r1)
            java.lang.String r2 = "Client connection"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r9, (java.lang.String) r2)
            java.lang.String r3 = "HTTP context"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r10, (java.lang.String) r3)
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r8, (java.lang.String) r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r9, (java.lang.String) r2)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r10, (java.lang.String) r3)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            java.lang.String r1 = "http.connection"
            r10.write(r1, r9)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r10.write(r0, r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r9.MediaBrowserCompat$ItemReceiver(r8)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            boolean r1 = r8 instanceof p040o.PrepaidResetPinSuccessActivity_ViewBinding     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r2 = 0
            if (r1 == 0) goto L_0x0094
            o.ManageNotificationsActivity r1 = r8.MediaBrowserCompat$MediaItem()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            o.ReviewAccountsActivity r1 = r1.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r3 = r8
            o.PrepaidResetPinSuccessActivity_ViewBinding r3 = (p040o.PrepaidResetPinSuccessActivity_ViewBinding) r3     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            boolean r4 = r3.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r5 = 1
            if (r4 == 0) goto L_0x008c
            o.ManageAccountInboundActivity r4 = p040o.ManageAccountInboundActivity.write     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            boolean r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            if (r1 != 0) goto L_0x008c
            r9.write()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            int r1 = r7.read     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            boolean r1 = r9.write((int) r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            if (r1 == 0) goto L_0x008c
            o.ScbPrivacyPolicyActivity r1 = r9.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            boolean r4 = MediaBrowserCompat$CustomActionResultReceiver(r8, r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            if (r4 == 0) goto L_0x005e
            r9.write((p040o.ScbPrivacyPolicyActivity) r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
        L_0x005e:
            o.VerifyIdentityActivity r4 = r1.IconCompatParcelizer()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            int r4 = r4.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 >= r6) goto L_0x008a
            r6 = 100
            if (r4 != r6) goto L_0x006f
            goto L_0x008c
        L_0x006f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r8.<init>()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            java.lang.String r10 = "Unexpected response: "
            r8.append(r10)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            o.VerifyIdentityActivity r10 = r1.IconCompatParcelizer()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r8.append(r10)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            org.apache.http.ProtocolException r10 = new org.apache.http.ProtocolException     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r10.<init>(r8)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            throw r10     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
        L_0x008a:
            r5 = 0
            goto L_0x008d
        L_0x008c:
            r1 = r2
        L_0x008d:
            if (r5 == 0) goto L_0x0093
            r9.read(r3)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            goto L_0x0094
        L_0x0093:
            r2 = r1
        L_0x0094:
            r9.write()     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            r10.write(r0, r1)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
            if (r2 != 0) goto L_0x00a2
            o.ScbPrivacyPolicyActivity r2 = write(r8, r9, r10)     // Catch:{ IOException -> 0x00a7, HttpException -> 0x00a5, RuntimeException -> 0x00a3 }
        L_0x00a2:
            return r2
        L_0x00a3:
            r8 = move-exception
            goto L_0x00a9
        L_0x00a5:
            r8 = move-exception
            goto L_0x00ad
        L_0x00a7:
            r8 = move-exception
            goto L_0x00b1
        L_0x00a9:
            r9.close()     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            throw r8
        L_0x00ad:
            r9.close()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            throw r8
        L_0x00b1:
            r9.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CreditCardDetailPurchaseViewPagerAdapter$ItemViewHolder.IconCompatParcelizer(o.PrivacyConsentActivity, o.PrepaidRequestSuccessActivity, o.CreditCardBilledDetailAdapter$ParentViewHolder):o.ScbPrivacyPolicyActivity");
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, PrivacyManagementLandingViewHolder_ViewBinding privacyManagementLandingViewHolder_ViewBinding, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder_ViewBinding, "HTTP processor");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        creditCardBilledDetailAdapter$ParentViewHolder.write("http.request", privacyConsentActivity);
        privacyManagementLandingViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
    }

    private static ScbPrivacyPolicyActivity write(PrivacyConsentActivity privacyConsentActivity, PrepaidRequestSuccessActivity prepaidRequestSuccessActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestSuccessActivity, "Client connection");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        ScbPrivacyPolicyActivity scbPrivacyPolicyActivity = null;
        int i = 0;
        while (true) {
            if (scbPrivacyPolicyActivity != null && i >= 200) {
                return scbPrivacyPolicyActivity;
            }
            scbPrivacyPolicyActivity = prepaidRequestSuccessActivity.MediaBrowserCompat$ItemReceiver();
            i = scbPrivacyPolicyActivity.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver();
            if (i < 100) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid response: ");
                sb.append(scbPrivacyPolicyActivity.IconCompatParcelizer());
                throw new ProtocolException(sb.toString());
            } else if (MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity, scbPrivacyPolicyActivity)) {
                prepaidRequestSuccessActivity.write(scbPrivacyPolicyActivity);
            }
        }
    }

    public static void IconCompatParcelizer(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, PrivacyManagementLandingViewHolder_ViewBinding privacyManagementLandingViewHolder_ViewBinding, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder_ViewBinding, "HTTP processor");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        creditCardBilledDetailAdapter$ParentViewHolder.write("http.response", scbPrivacyPolicyActivity);
        privacyManagementLandingViewHolder_ViewBinding.IconCompatParcelizer(scbPrivacyPolicyActivity, creditCardBilledDetailAdapter$ParentViewHolder);
    }
}
