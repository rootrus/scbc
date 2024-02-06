package p040o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import p040o.TileAdapter;

/* renamed from: o.TileAdapter$AddShortcutHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public class C10434xcc04803e extends X509CertSelector {
    private final TileAdapter.AddShortcutHolder_ViewBinding write;

    public C10434xcc04803e(TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding) {
        this.write = addShortcutHolder_ViewBinding;
        if (addShortcutHolder_ViewBinding.IconCompatParcelizer instanceof X509CertSelector) {
            X509CertSelector x509CertSelector = (X509CertSelector) addShortcutHolder_ViewBinding.IconCompatParcelizer;
            setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            setBasicConstraints(x509CertSelector.getBasicConstraints());
            setCertificate(x509CertSelector.getCertificate());
            setCertificateValid(x509CertSelector.getCertificateValid());
            setKeyUsage(x509CertSelector.getKeyUsage());
            setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
            setSerialNumber(x509CertSelector.getSerialNumber());
            setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
            setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
            try {
                setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                setIssuer(x509CertSelector.getIssuerAsBytes());
                setNameConstraints(x509CertSelector.getNameConstraints());
                setPathToNames(x509CertSelector.getPathToNames());
                setPolicy(x509CertSelector.getPolicy());
                setSubject(x509CertSelector.getSubjectAsBytes());
                setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("base selector invalid: ");
                sb.append(e.getMessage());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    public final boolean match(Certificate certificate) {
        TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding = this.write;
        if (addShortcutHolder_ViewBinding == null) {
            return certificate != null;
        }
        return addShortcutHolder_ViewBinding.IconCompatParcelizer.match(certificate);
    }
}
