package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.TypeCastException;
import okhttp3.CertificatePinner;
import okhttp3.internal.Util;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.onGetStartedClick;

public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        onGetStartedClick.write((Object) str, "host");
        onGetStartedClick.write((Object) sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        onGetStartedClick.write((Object) str, "host");
        onGetStartedClick.write((Object) x509Certificate, "certificate");
        if (Util.canParseAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostname(str, x509Certificate);
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        Iterable<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (!(subjectAltNames instanceof Collection) || !((Collection) subjectAltNames).isEmpty()) {
            for (String MediaBrowserCompat$CustomActionResultReceiver : subjectAltNames) {
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, MediaBrowserCompat$CustomActionResultReceiver, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Iterable<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
            if ((subjectAltNames instanceof Collection) && ((Collection) subjectAltNames).isEmpty()) {
                return false;
            }
            for (String verifyHostname : subjectAltNames) {
                if (INSTANCE.verifyHostname(lowerCase, verifyHostname)) {
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean verifyHostname(String str, String str2) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) && !GoodToKnowActivity.read(str, ".", false)) {
            onGetStartedClick.write((Object) str, "$this$endsWith");
            onGetStartedClick.write((Object) "..", "suffix");
            if (!str.endsWith("..")) {
                CharSequence charSequence2 = str2;
                if (!(charSequence2 == null || charSequence2.length() == 0) && !GoodToKnowActivity.read(str2, ".", false)) {
                    onGetStartedClick.write((Object) str2, "$this$endsWith");
                    onGetStartedClick.write((Object) "..", "suffix");
                    if (!str2.endsWith("..")) {
                        onGetStartedClick.write((Object) str, "$this$endsWith");
                        onGetStartedClick.write((Object) ".", "suffix");
                        if (!str.endsWith(".")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(".");
                            str = sb.toString();
                        }
                        onGetStartedClick.write((Object) str2, "$this$endsWith");
                        onGetStartedClick.write((Object) ".", "suffix");
                        if (!str2.endsWith(".")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(".");
                            str2 = sb2.toString();
                        }
                        Locale locale = Locale.US;
                        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            CharSequence charSequence3 = lowerCase;
                            if (!GoodToKnowActivity.read(charSequence3, "*", false)) {
                                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) lowerCase);
                            }
                            if (!GoodToKnowActivity.read(lowerCase, CertificatePinner.WILDCARD, false) || GoodToKnowActivity.read(charSequence3, '*', 1, false, 4) != -1 || str.length() < lowerCase.length() || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) CertificatePinner.WILDCARD, (Object) lowerCase)) {
                                return false;
                            }
                            if (lowerCase != null) {
                                String substring = lowerCase.substring(1);
                                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                                onGetStartedClick.write((Object) str, "$this$endsWith");
                                onGetStartedClick.write((Object) substring, "suffix");
                                if (!str.endsWith(substring)) {
                                    return false;
                                }
                                int length = str.length() - substring.length();
                                return length <= 0 || GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str, '.', length - 1, 4) == -1;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        onGetStartedClick.write((Object) x509Certificate, "certificate");
        return HmlNTBBusinessURLInformationActivity.write(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            List<String> arrayList = new ArrayList<>();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver(next.get(0), (Object) Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj == null) {
                                continue;
                            } else if (obj != null) {
                                arrayList.add((String) obj);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
    }
}
