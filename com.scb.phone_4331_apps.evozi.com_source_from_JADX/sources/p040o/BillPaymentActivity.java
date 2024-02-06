package p040o;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.impl.auth.UnsupportedDigestAlgorithmException;

/* renamed from: o.BillPaymentActivity */
public final class BillPaymentActivity extends CardlessATMCoachMarkActivity_ViewBinding {
    private static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private boolean RatingCompat;
    private String read;
    private String write;

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return false;
    }

    public final String read() {
        return "digest";
    }

    public BillPaymentActivity(Charset charset) {
        super(charset);
        this.RatingCompat = false;
    }

    public BillPaymentActivity() {
        this(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) throws MalformedChallengeException {
        super.MediaBrowserCompat$CustomActionResultReceiver(prepaidRequestMarketConductActivity);
        this.RatingCompat = true;
        if (MediaBrowserCompat$SearchResultReceiver().isEmpty()) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if ("true".equalsIgnoreCase(read("stale"))) {
            return false;
        }
        return this.RatingCompat;
    }

    @Deprecated
    public final PrepaidRequestMarketConductActivity IconCompatParcelizer(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity) throws AuthenticationException {
        return read(purchaseReviewActivity, privacyConsentActivity, new RadioButtonGroupAdapter$RadioButtonViewGroup_ViewBinding());
    }

    public final PrepaidRequestMarketConductActivity read(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws AuthenticationException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(purchaseReviewActivity, "Credentials");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        if (read("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        } else if (read("nonce") != null) {
            MediaBrowserCompat$SearchResultReceiver().put("methodname", privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver());
            MediaBrowserCompat$SearchResultReceiver().put("uri", privacyConsentActivity.MediaBrowserCompat$MediaItem().read());
            if (read("charset") == null) {
                MediaBrowserCompat$SearchResultReceiver().put("charset", MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity));
            }
            return write(purchaseReviewActivity, privacyConsentActivity);
        } else {
            throw new AuthenticationException("missing nonce in challenge");
        }
    }

    private static MessageDigest IconCompatParcelizer(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported algorithm in HTTP Digest authentication: ");
            sb.append(str);
            throw new UnsupportedDigestAlgorithmException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0358  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.PrepaidRequestMarketConductActivity write(p040o.PurchaseReviewActivity r29, p040o.PrivacyConsentActivity r30) throws org.apache.http.auth.AuthenticationException {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            java.lang.String r2 = "uri"
            java.lang.String r3 = r1.read(r2)
            java.lang.String r4 = "realm"
            java.lang.String r5 = r1.read(r4)
            java.lang.String r6 = "nonce"
            java.lang.String r7 = r1.read(r6)
            java.lang.String r8 = "opaque"
            java.lang.String r9 = r1.read(r8)
            java.lang.String r10 = "methodname"
            java.lang.String r10 = r1.read(r10)
            java.lang.String r11 = "algorithm"
            java.lang.String r12 = r1.read(r11)
            java.lang.String r13 = "MD5"
            if (r12 != 0) goto L_0x002d
            r12 = r13
        L_0x002d:
            java.util.HashSet r14 = new java.util.HashSet
            r15 = 8
            r14.<init>(r15)
            java.lang.String r15 = "qop"
            r16 = r13
            java.lang.String r13 = r1.read(r15)
            r17 = r8
            java.lang.String r8 = "auth-int"
            r19 = r9
            java.lang.String r9 = "auth"
            r20 = r11
            if (r13 == 0) goto L_0x0083
            java.util.StringTokenizer r11 = new java.util.StringTokenizer
            r21 = r15
            java.lang.String r15 = ","
            r11.<init>(r13, r15)
        L_0x0051:
            boolean r15 = r11.hasMoreTokens()
            if (r15 == 0) goto L_0x006d
            java.lang.String r15 = r11.nextToken()
            java.lang.String r15 = r15.trim()
            r22 = r11
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r11 = r15.toLowerCase(r11)
            r14.add(r11)
            r11 = r22
            goto L_0x0051
        L_0x006d:
            boolean r11 = r0 instanceof p040o.PrepaidResetPinSuccessActivity_ViewBinding
            if (r11 == 0) goto L_0x0079
            boolean r11 = r14.contains(r8)
            if (r11 == 0) goto L_0x0079
            r11 = 1
            goto L_0x0086
        L_0x0079:
            boolean r11 = r14.contains(r9)
            if (r11 == 0) goto L_0x0081
            r11 = 2
            goto L_0x0086
        L_0x0081:
            r11 = -1
            goto L_0x0086
        L_0x0083:
            r21 = r15
            r11 = 0
        L_0x0086:
            r15 = -1
            if (r11 == r15) goto L_0x03a5
            java.lang.String r13 = "charset"
            java.lang.String r13 = r1.read(r13)
            if (r13 != 0) goto L_0x0093
            java.lang.String r13 = "ISO-8859-1"
        L_0x0093:
            java.lang.String r15 = "MD5-sess"
            boolean r18 = r12.equalsIgnoreCase(r15)
            if (r18 != 0) goto L_0x00a0
            r16 = r8
            r18 = r12
            goto L_0x00a4
        L_0x00a0:
            r18 = r16
            r16 = r8
        L_0x00a4:
            java.security.MessageDigest r8 = IconCompatParcelizer(r18)     // Catch:{ UnsupportedDigestAlgorithmException -> 0x038c }
            java.security.Principal r18 = r29.MediaBrowserCompat$ItemReceiver()
            r22 = r2
            java.lang.String r2 = r18.getName()
            r23 = r6
            java.lang.String r6 = r29.write()
            r24 = r4
            java.lang.String r4 = r1.MediaDescriptionCompat
            boolean r4 = r7.equals(r4)
            r26 = r9
            r25 = r10
            if (r4 == 0) goto L_0x00d0
            long r9 = r1.MediaBrowserCompat$SearchResultReceiver
            r27 = r3
            r3 = 1
            long r9 = r9 + r3
            r1.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x00db
        L_0x00d0:
            r27 = r3
            r3 = 1
            r1.MediaBrowserCompat$SearchResultReceiver = r3
            r3 = 0
            r1.write = r3
            r1.MediaDescriptionCompat = r7
        L_0x00db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 256(0x100, float:3.59E-43)
            r3.<init>(r4)
            java.util.Formatter r4 = new java.util.Formatter
            java.util.Locale r9 = java.util.Locale.US
            r4.<init>(r3, r9)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r9 = r7
            r18 = r8
            long r7 = r1.MediaBrowserCompat$SearchResultReceiver
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r10[r8] = r7
            java.lang.String r7 = "%08x"
            r4.format(r7, r10)
            r4.close()
            java.lang.String r4 = r3.toString()
            java.lang.String r7 = r1.write
            if (r7 != 0) goto L_0x011a
            java.security.SecureRandom r7 = new java.security.SecureRandom
            r7.<init>()
            r8 = 8
            byte[] r8 = new byte[r8]
            r7.nextBytes(r8)
            java.lang.String r7 = read(r8)
            r1.write = r7
        L_0x011a:
            r7 = 0
            r1.read = r7
            r1.MediaBrowserCompat$CustomActionResultReceiver = r7
            boolean r8 = r12.equalsIgnoreCase(r15)
            r10 = 58
            if (r8 == 0) goto L_0x0167
            r8 = 0
            r3.setLength(r8)
            r3.append(r2)
            r3.append(r10)
            r3.append(r5)
            r3.append(r10)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            byte[] r6 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r6, (java.lang.String) r13)
            r15 = r18
            byte[] r6 = r15.digest(r6)
            java.lang.String r6 = read(r6)
            r3.setLength(r8)
            r3.append(r6)
            r3.append(r10)
            r3.append(r9)
            r3.append(r10)
            java.lang.String r6 = r1.write
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.read = r6
            goto L_0x0182
        L_0x0167:
            r15 = r18
            r8 = 0
            r3.setLength(r8)
            r3.append(r2)
            r3.append(r10)
            r3.append(r5)
            r3.append(r10)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.read = r6
        L_0x0182:
            java.lang.String r6 = r1.read
            byte[] r6 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r6, (java.lang.String) r13)
            byte[] r6 = r15.digest(r6)
            java.lang.String r6 = read(r6)
            r8 = 2
            if (r11 != r8) goto L_0x01af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r7 = r25
            r0.append(r7)
            r0.append(r10)
            r7 = r27
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.MediaBrowserCompat$CustomActionResultReceiver = r0
            r10 = r26
            goto L_0x0245
        L_0x01af:
            r8 = r25
            r7 = r27
            r10 = 1
            if (r11 != r10) goto L_0x022d
            boolean r10 = r0 instanceof p040o.PrepaidResetPinSuccessActivity_ViewBinding
            if (r10 == 0) goto L_0x01c1
            o.PrepaidResetPinSuccessActivity_ViewBinding r0 = (p040o.PrepaidResetPinSuccessActivity_ViewBinding) r0
            o.PrepaidResetOtpActivity r0 = r0.IconCompatParcelizer()
            goto L_0x01c2
        L_0x01c1:
            r0 = 0
        L_0x01c2:
            if (r0 == 0) goto L_0x01f2
            boolean r10 = r0.MediaBrowserCompat$SearchResultReceiver()
            if (r10 != 0) goto L_0x01f2
            r10 = r26
            boolean r0 = r14.contains(r10)
            if (r0 == 0) goto L_0x01ea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r8 = 58
            r0.append(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.MediaBrowserCompat$CustomActionResultReceiver = r0
            r8 = 2
            goto L_0x0246
        L_0x01ea:
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException
            java.lang.String r2 = "Qop auth-int cannot be used with a non-repeatable entity"
            r0.<init>(r2)
            throw r0
        L_0x01f2:
            r10 = r26
            o.BillPaymentSearchCoachMarkActivity_ViewBinding r14 = new o.BillPaymentSearchCoachMarkActivity_ViewBinding
            r14.<init>(r15)
            if (r0 == 0) goto L_0x01fe
            r0.MediaBrowserCompat$CustomActionResultReceiver(r14)     // Catch:{ IOException -> 0x0224 }
        L_0x01fe:
            r14.close()     // Catch:{ IOException -> 0x0224 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r8 = 58
            r0.append(r8)
            r0.append(r7)
            r0.append(r8)
            byte[] r8 = r14.write
            java.lang.String r8 = read(r8)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1.MediaBrowserCompat$CustomActionResultReceiver = r0
            goto L_0x0245
        L_0x0224:
            r0 = move-exception
            org.apache.http.auth.AuthenticationException r2 = new org.apache.http.auth.AuthenticationException
            java.lang.String r3 = "I/O error reading entity content"
            r2.<init>(r3, r0)
            throw r2
        L_0x022d:
            r10 = r26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r8 = 58
            r0.append(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r1.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x0245:
            r8 = r11
        L_0x0246:
            java.lang.String r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            byte[] r0 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r0, (java.lang.String) r13)
            byte[] r0 = r15.digest(r0)
            java.lang.String r0 = read(r0)
            if (r8 != 0) goto L_0x0270
            r11 = 0
            r3.setLength(r11)
            r3.append(r6)
            r13 = 58
            r3.append(r13)
            r3.append(r9)
            r3.append(r13)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x02a4
        L_0x0270:
            r11 = 0
            r13 = 58
            r3.setLength(r11)
            r3.append(r6)
            r3.append(r13)
            r3.append(r9)
            r3.append(r13)
            r3.append(r4)
            r3.append(r13)
            java.lang.String r6 = r1.write
            r3.append(r6)
            r3.append(r13)
            r6 = 1
            if (r8 != r6) goto L_0x0296
            r6 = r16
            goto L_0x0297
        L_0x0296:
            r6 = r10
        L_0x0297:
            r3.append(r6)
            r3.append(r13)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x02a4:
            java.lang.String r3 = "Input"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r0, (java.lang.String) r3)
            java.nio.charset.Charset r3 = p040o.PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver
            byte[] r0 = r0.getBytes(r3)
            byte[] r0 = r15.digest(r0)
            java.lang.String r0 = read(r0)
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r3 = new o.DepositTransactionAdapter$ChildViewHolder_ViewBinding
            r6 = 128(0x80, float:1.794E-43)
            r3.<init>(r6)
            boolean r6 = r28.write()
            if (r6 == 0) goto L_0x02ca
            java.lang.String r6 = "Proxy-Authorization"
            r3.read((java.lang.String) r6)
            goto L_0x02cf
        L_0x02ca:
            java.lang.String r6 = "Authorization"
            r3.read((java.lang.String) r6)
        L_0x02cf:
            java.lang.String r6 = ": Digest "
            r3.read((java.lang.String) r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r13 = 20
            r6.<init>(r13)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r13 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            java.lang.String r14 = "username"
            r13.<init>(r14, r2)
            r6.add(r13)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r13 = r24
            r2.<init>(r13, r5)
            r6.add(r2)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r5 = r23
            r2.<init>(r5, r9)
            r6.add(r2)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r5 = r22
            r2.<init>(r5, r7)
            r6.add(r2)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            java.lang.String r5 = "response"
            r2.<init>(r5, r0)
            r6.add(r2)
            java.lang.String r0 = "nc"
            if (r8 == 0) goto L_0x0337
            r2 = 1
            if (r8 != r2) goto L_0x0317
            r8 = r16
            goto L_0x0318
        L_0x0317:
            r8 = r10
        L_0x0318:
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r5 = r21
            r2.<init>(r5, r8)
            r6.add(r2)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r2.<init>(r0, r4)
            r6.add(r2)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            java.lang.String r4 = r1.write
            java.lang.String r7 = "cnonce"
            r2.<init>(r7, r4)
            r6.add(r2)
            goto L_0x0339
        L_0x0337:
            r5 = r21
        L_0x0339:
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r4 = r20
            r2.<init>(r4, r12)
            r6.add(r2)
            if (r19 == 0) goto L_0x0351
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = new o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding
            r8 = r17
            r7 = r19
            r2.<init>(r8, r7)
            r6.add(r2)
        L_0x0351:
            r8 = r11
        L_0x0352:
            int r2 = r6.size()
            if (r8 >= r2) goto L_0x0386
            java.lang.Object r2 = r6.get(r8)
            o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding r2 = (p040o.PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding) r2
            if (r8 <= 0) goto L_0x0365
            java.lang.String r7 = ", "
            r3.read((java.lang.String) r7)
        L_0x0365:
            java.lang.String r7 = r2.MediaBrowserCompat$CustomActionResultReceiver
            boolean r9 = r0.equals(r7)
            if (r9 != 0) goto L_0x037b
            boolean r9 = r5.equals(r7)
            if (r9 != 0) goto L_0x037b
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x037b
            r9 = r11
            goto L_0x037c
        L_0x037b:
            r9 = 1
        L_0x037c:
            o.ProductListAdapter$ProductViewHolder r7 = p040o.ProductListAdapter$ProductViewHolder.MediaBrowserCompat$CustomActionResultReceiver
            r10 = 1
            r9 = r9 ^ r10
            r7.write(r3, r2, r9)
            int r8 = r8 + 1
            goto L_0x0352
        L_0x0386:
            o.AmountDetailsAdapter$SuccessRow r0 = new o.AmountDetailsAdapter$SuccessRow
            r0.<init>(r3)
            return r0
        L_0x038c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsuppported digest algorithm: "
            r0.append(r2)
            r12 = r18
            r0.append(r12)
            org.apache.http.auth.AuthenticationException r2 = new org.apache.http.auth.AuthenticationException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x03a5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "None of the qop methods is supported: "
            r0.append(r2)
            r0.append(r13)
            org.apache.http.auth.AuthenticationException r2 = new org.apache.http.auth.AuthenticationException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BillPaymentActivity.write(o.PurchaseReviewActivity, o.PrivacyConsentActivity):o.PrepaidRequestMarketConductActivity");
    }

    private static String read(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            byte b2 = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = IconCompatParcelizer;
            cArr[i2] = cArr2[(b2 & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DIGEST [complete=");
        sb.append(this.RatingCompat);
        sb.append(", nonce=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", nc=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append("]");
        return sb.toString();
    }
}
