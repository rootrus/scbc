package p040o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* renamed from: o.SelectAccountAdapter$SelectAccountHolder_ViewBinding */
public final class SelectAccountAdapter$SelectAccountHolder_ViewBinding extends X509CertSelector implements BankAccountAdapter$BankAccountViewHolder {
    public final Object clone() {
        return (SelectAccountAdapter$SelectAccountHolder_ViewBinding) super.clone();
    }

    public static SelectAccountAdapter$SelectAccountHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(X509CertSelector x509CertSelector) {
        if (x509CertSelector != null) {
            SelectAccountAdapter$SelectAccountHolder_ViewBinding selectAccountAdapter$SelectAccountHolder_ViewBinding = new SelectAccountAdapter$SelectAccountHolder_ViewBinding();
            selectAccountAdapter$SelectAccountHolder_ViewBinding.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            selectAccountAdapter$SelectAccountHolder_ViewBinding.setBasicConstraints(x509CertSelector.getBasicConstraints());
            selectAccountAdapter$SelectAccountHolder_ViewBinding.setCertificate(x509CertSelector.getCertificate());
            selectAccountAdapter$SelectAccountHolder_ViewBinding.setCertificateValid(x509CertSelector.getCertificateValid());
            selectAccountAdapter$SelectAccountHolder_ViewBinding.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            try {
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setPathToNames(x509CertSelector.getPathToNames());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setNameConstraints(x509CertSelector.getNameConstraints());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setPolicy(x509CertSelector.getPolicy());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setIssuer(x509CertSelector.getIssuer());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setKeyUsage(x509CertSelector.getKeyUsage());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSerialNumber(x509CertSelector.getSerialNumber());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSubject(x509CertSelector.getSubject());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                selectAccountAdapter$SelectAccountHolder_ViewBinding.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                return selectAccountAdapter$SelectAccountHolder_ViewBinding;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error in passed in selector: ");
                sb.append(e);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("cannot create from null selector");
        }
    }

    public final boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        return super.match((X509Certificate) certificate);
    }
}
