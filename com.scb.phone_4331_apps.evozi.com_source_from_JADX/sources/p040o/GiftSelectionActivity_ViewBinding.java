package p040o;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
/* renamed from: o.GiftSelectionActivity_ViewBinding */
public abstract class GiftSelectionActivity_ViewBinding implements GiftingPresentReviewActivity {
    private static String[] read;
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PrepaidOtpActivity.write((Class) getClass());

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        read = strArr;
        Arrays.sort(strArr);
    }

    public final void read(String str, SSLSocket sSLSocket) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Host");
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        write(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            write(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(e.getMessage(), e);
            }
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(java.lang.String r6, java.security.cert.X509Certificate r7) throws javax.net.ssl.SSLException {
        /*
            r5 = this;
            java.util.List r0 = p040o.GiftingOpenedActivity.MediaBrowserCompat$ItemReceiver(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = p040o.GiftingSelectRecipientActivity.read(r6)
            if (r2 != 0) goto L_0x0030
            boolean r2 = p040o.GiftingSelectRecipientActivity.IconCompatParcelizer(r6)
            if (r2 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r0.next()
            o.GiftingOpenedActivity_ViewBinding r2 = (p040o.GiftingOpenedActivity_ViewBinding) r2
            int r3 = r2.IconCompatParcelizer
            r4 = 2
            if (r3 != r4) goto L_0x0019
            java.lang.String r2 = r2.read
            r1.add(r2)
            goto L_0x0019
        L_0x0030:
            java.util.Iterator r0 = r0.iterator()
        L_0x0034:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r0.next()
            o.GiftingOpenedActivity_ViewBinding r2 = (p040o.GiftingOpenedActivity_ViewBinding) r2
            int r3 = r2.IconCompatParcelizer
            r4 = 7
            if (r3 != r4) goto L_0x0034
            java.lang.String r2 = r2.read
            r1.add(r2)
            goto L_0x0034
        L_0x004b:
            javax.security.auth.x500.X500Principal r7 = r7.getSubjectX500Principal()
            java.lang.String r0 = "RFC2253"
            java.lang.String r7 = r7.getName(r0)
            java.lang.String r7 = p040o.GiftingOpenedActivity.write(r7)
            r0 = 0
            if (r7 == 0) goto L_0x0063
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r7
            goto L_0x0064
        L_0x0063:
            r2 = r0
        L_0x0064:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x0077
            int r7 = r1.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r1.toArray(r7)
            r0 = r7
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0077:
            r5.write(r6, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.GiftSelectionActivity_ViewBinding.write(java.lang.String, java.security.cert.X509Certificate):void");
    }

    public static void IconCompatParcelizer(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        List<String> list = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            list = Arrays.asList(strArr2);
        }
        String MediaBrowserCompat$CustomActionResultReceiver2 = GiftingSelectRecipientActivity.IconCompatParcelizer(str) ? GiftingOpenedActivity.MediaBrowserCompat$CustomActionResultReceiver(str.toLowerCase(Locale.ROOT)) : str;
        if (list != null) {
            for (String str3 : list) {
                if (GiftingSelectRecipientActivity.IconCompatParcelizer(str3)) {
                    str3 = GiftingOpenedActivity.MediaBrowserCompat$CustomActionResultReceiver(str3);
                }
                if (write(MediaBrowserCompat$CustomActionResultReceiver2, str3, z)) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate for <");
            sb.append(str);
            sb.append("> doesn't match any ");
            sb.append("of the subject alternative names: ");
            sb.append(list);
            throw new SSLException(sb.toString());
        } else if (str2 != null) {
            if (!write(MediaBrowserCompat$CustomActionResultReceiver2, GiftingSelectRecipientActivity.IconCompatParcelizer(str2) ? GiftingOpenedActivity.MediaBrowserCompat$CustomActionResultReceiver(str2) : str2, z)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Certificate for <");
                sb2.append(str);
                sb2.append("> doesn't match ");
                sb2.append("common name of the certificate subject: ");
                sb2.append(str2);
                throw new SSLException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Certificate subject for <");
            sb3.append(str);
            sb3.append("> doesn't contain ");
            sb3.append("a common name and does not have alternative names");
            throw new SSLException(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (((r1.length == 3 && r1[2].length() == 2 && java.util.Arrays.binarySearch(read, r1[1]) >= 0) ? false : true) != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean write(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r1)
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r7.split(r1)
            int r2 = r1.length
            r3 = 3
            r4 = 1
            if (r2 < r3) goto L_0x0046
            r2 = r1[r0]
            java.lang.String r5 = "*"
            boolean r2 = r2.endsWith(r5)
            if (r2 == 0) goto L_0x0046
            if (r8 == 0) goto L_0x0044
            int r2 = r1.length
            if (r2 != r3) goto L_0x0041
            r2 = 2
            r3 = r1[r2]
            int r3 = r3.length()
            if (r3 == r2) goto L_0x0034
            goto L_0x0041
        L_0x0034:
            java.lang.String[] r2 = read
            r3 = r1[r4]
            int r2 = java.util.Arrays.binarySearch(r2, r3)
            if (r2 >= 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            if (r2 == 0) goto L_0x0046
        L_0x0044:
            r2 = r4
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x0092
            r1 = r1[r0]
            int r2 = r1.length()
            if (r2 <= r4) goto L_0x007a
            int r2 = r1.length()
            int r2 = r2 - r4
            java.lang.String r2 = r1.substring(r0, r2)
            int r1 = r1.length()
            java.lang.String r1 = r7.substring(r1)
            int r3 = r2.length()
            java.lang.String r3 = r6.substring(r3)
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x0078
            boolean r1 = r3.endsWith(r1)
            if (r1 == 0) goto L_0x0078
            r1 = r4
            goto L_0x0082
        L_0x0078:
            r1 = r0
            goto L_0x0082
        L_0x007a:
            java.lang.String r1 = r7.substring(r4)
            boolean r1 = r6.endsWith(r1)
        L_0x0082:
            if (r1 == 0) goto L_0x0091
            if (r8 == 0) goto L_0x0090
            int r6 = MediaBrowserCompat$CustomActionResultReceiver(r6)
            int r7 = MediaBrowserCompat$CustomActionResultReceiver(r7)
            if (r6 != r7) goto L_0x0091
        L_0x0090:
            r0 = r4
        L_0x0091:
            return r0
        L_0x0092:
            boolean r6 = r6.equals(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.GiftSelectionActivity_ViewBinding.write(java.lang.String, java.lang.String, boolean):boolean");
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }
}
