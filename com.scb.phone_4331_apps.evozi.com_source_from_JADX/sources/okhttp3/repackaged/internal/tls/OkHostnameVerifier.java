package okhttp3.repackaged.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.CertificatePinner;
import okhttp3.repackaged.internal.Util;

public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();
    private static final int amW = 2;
    private static final int amX = 7;

    private OkHostnameVerifier() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        if (Util.verifyAsIpAddress(str)) {
            return m6176a(str, x509Certificate);
        }
        return m6177b(str, x509Certificate);
    }

    /* renamed from: a */
    private boolean m6176a(String str, X509Certificate x509Certificate) {
        List<String> a = m6175a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m6177b(String str, X509Certificate x509Certificate) {
        String findMostSpecific;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> a = m6175a(x509Certificate, 2);
        int size = a.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (verifyHostname(lowerCase, a.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (findMostSpecific = new C10280a(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn")) == null) {
            return false;
        }
        return verifyHostname(lowerCase, findMostSpecific);
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> a = m6175a(x509Certificate, 7);
        List<String> a2 = m6175a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m6175a(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (!(num == null || num.intValue() != i || (str = (String) next.get(1)) == null)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith(CertificatePinner.WILDCARD) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || CertificatePinner.WILDCARD.equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
