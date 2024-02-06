package p040o;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.CertificatePinner;

/* renamed from: o.GiftingOpenedActivity */
public final class GiftingOpenedActivity implements HostnameVerifier {
    private final C1133x65c1ec57 read;
    private final PrepaidTravelCoachMarkActivity_ViewBinding write;

    /* renamed from: o.GiftingOpenedActivity$write */
    enum write {
        IPv4(7),
        IPv6(7),
        DNS(2);
        
        final int subjectType;

        private write(int i) {
            this.subjectType = i;
        }
    }

    private GiftingOpenedActivity(byte b) {
        this.write = PrepaidOtpActivity.write((Class) getClass());
        this.read = null;
    }

    public GiftingOpenedActivity() {
        this((byte) 0);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        write write2;
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (GiftingSelectRecipientActivity.read(str)) {
                write2 = write.IPv4;
            } else {
                if (GiftingSelectRecipientActivity.IconCompatParcelizer((!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1))) {
                    write2 = write.IPv6;
                } else {
                    write2 = write.DNS;
                }
            }
            List<GiftingOpenedActivity_ViewBinding> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(x509Certificate);
            if (MediaBrowserCompat$ItemReceiver != null) {
                if (!MediaBrowserCompat$ItemReceiver.isEmpty()) {
                    int i = C97512.read[write2.ordinal()];
                    if (i == 1) {
                        MediaBrowserCompat$CustomActionResultReceiver(str, MediaBrowserCompat$ItemReceiver);
                    } else if (i != 2) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        int i2 = 0;
                        while (i2 < MediaBrowserCompat$ItemReceiver.size()) {
                            GiftingOpenedActivity_ViewBinding giftingOpenedActivity_ViewBinding = MediaBrowserCompat$ItemReceiver.get(i2);
                            if (giftingOpenedActivity_ViewBinding.IconCompatParcelizer != 2 || !write(lowerCase, giftingOpenedActivity_ViewBinding.read.toLowerCase(Locale.ROOT), (C1133x65c1ec57) null)) {
                                i2++;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Certificate for <");
                        sb.append(str);
                        sb.append("> doesn't match any ");
                        sb.append("of the subject alternative names: ");
                        sb.append(MediaBrowserCompat$ItemReceiver);
                        throw new SSLPeerUnverifiedException(sb.toString());
                    } else {
                        MediaBrowserCompat$ItemReceiver(str, MediaBrowserCompat$ItemReceiver);
                    }
                    return true;
                }
            }
            String write3 = write(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
            if (write3 != null) {
                if (!write(str.toLowerCase(Locale.ROOT), write3.toLowerCase(Locale.ROOT), (C1133x65c1ec57) null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Certificate for <");
                    sb2.append(str);
                    sb2.append("> doesn't match ");
                    sb2.append("common name of the certificate subject: ");
                    sb2.append(write3);
                    throw new SSLPeerUnverifiedException(sb2.toString());
                }
                return true;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Certificate subject for <");
            sb3.append(str);
            sb3.append("> doesn't contain ");
            sb3.append("a common name and does not have alternative names");
            throw new SSLException(sb3.toString());
        } catch (SSLException e) {
            if (this.write.IconCompatParcelizer()) {
                this.write.IconCompatParcelizer(e.getMessage(), e);
            }
            return false;
        }
    }

    /* renamed from: o.GiftingOpenedActivity$2 */
    static /* synthetic */ class C97512 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.GiftingOpenedActivity$write[] r0 = p040o.GiftingOpenedActivity.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.GiftingOpenedActivity$write r1 = p040o.GiftingOpenedActivity.write.IPv4     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.GiftingOpenedActivity$write r1 = p040o.GiftingOpenedActivity.write.IPv6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.GiftingOpenedActivity.C97512.<clinit>():void");
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(String str, List<GiftingOpenedActivity_ViewBinding> list) throws SSLException {
        int i = 0;
        while (i < list.size()) {
            GiftingOpenedActivity_ViewBinding giftingOpenedActivity_ViewBinding = list.get(i);
            if (giftingOpenedActivity_ViewBinding.IconCompatParcelizer != 7 || !str.equals(giftingOpenedActivity_ViewBinding.read)) {
                i++;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate for <");
        sb.append(str);
        sb.append("> doesn't match any ");
        sb.append("of the subject alternative names: ");
        sb.append(list);
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    private static void MediaBrowserCompat$ItemReceiver(String str, List<GiftingOpenedActivity_ViewBinding> list) throws SSLException {
        String MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(str);
        int i = 0;
        while (i < list.size()) {
            GiftingOpenedActivity_ViewBinding giftingOpenedActivity_ViewBinding = list.get(i);
            if (giftingOpenedActivity_ViewBinding.IconCompatParcelizer != 7 || !MediaBrowserCompat$CustomActionResultReceiver.equals(MediaBrowserCompat$CustomActionResultReceiver(giftingOpenedActivity_ViewBinding.read))) {
                i++;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate for <");
        sb.append(str);
        sb.append("> doesn't match any ");
        sb.append("of the subject alternative names: ");
        sb.append(list);
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    private static boolean write(String str, String str2, C1133x65c1ec57 alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver) {
        boolean z;
        if (alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver != null && str.contains(".")) {
            GiftingSelectRecipientActivity_ViewBinding giftingSelectRecipientActivity_ViewBinding = GiftingSelectRecipientActivity_ViewBinding.ICANN;
            String str3 = null;
            if (str2 != null && !str2.startsWith(".")) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                String str4 = null;
                while (true) {
                    if (lowerCase == null) {
                        break;
                    }
                    String unicode = IDN.toUnicode(lowerCase);
                    if (C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver((Map<String, GiftingSelectRecipientActivity_ViewBinding>) null, unicode, giftingSelectRecipientActivity_ViewBinding)) {
                        str3 = lowerCase;
                        break;
                    } else if (C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver((Map<String, GiftingSelectRecipientActivity_ViewBinding>) null, unicode, giftingSelectRecipientActivity_ViewBinding)) {
                        break;
                    } else {
                        int indexOf = lowerCase.indexOf(46);
                        String substring = indexOf != -1 ? lowerCase.substring(indexOf + 1) : null;
                        if (substring != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(CertificatePinner.WILDCARD);
                            sb.append(IDN.toUnicode(substring));
                            if (C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver((Map<String, GiftingSelectRecipientActivity_ViewBinding>) null, sb.toString(), giftingSelectRecipientActivity_ViewBinding)) {
                                break;
                            }
                        }
                        str4 = lowerCase;
                        lowerCase = substring;
                    }
                }
                str3 = str4;
            }
            if (str3 != null && str.endsWith(str3) && (str.length() == str3.length() || str.charAt((str.length() - str3.length()) - 1) == '.')) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        int indexOf2 = str2.indexOf(42);
        if (indexOf2 == -1) {
            return str.equalsIgnoreCase(str2);
        }
        String substring2 = str2.substring(0, indexOf2);
        String substring3 = str2.substring(indexOf2 + 1);
        if (substring2.isEmpty() || str.startsWith(substring2)) {
            return (substring3.isEmpty() || str.endsWith(substring3)) && !str.substring(substring2.length(), str.length() - substring3.length()).contains(".");
        }
        return false;
    }

    static String write(String str) throws SSLException {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                    } catch (NoSuchElementException | NamingException unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not a valid X500 distinguished name");
            throw new SSLException(sb.toString());
        }
    }

    static List<GiftingOpenedActivity_ViewBinding> MediaBrowserCompat$ItemReceiver(X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                Integer num = next.size() >= 2 ? (Integer) next.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = next.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new GiftingOpenedActivity_ViewBinding((String) obj, num.intValue()));
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }
}
