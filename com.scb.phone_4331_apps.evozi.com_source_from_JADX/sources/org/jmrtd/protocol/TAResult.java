package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jmrtd.Util;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;
import p040o.AlertController$RecycleListView;

public class TAResult implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -2926063872890928748L;
    private CVCPrincipal caReference;
    private byte[] cardChallenge;
    private CAResult chipAuthenticationResult;
    private String documentNumber;
    private List<CardVerifiableCertificate> terminalCertificates = new ArrayList();
    private PrivateKey terminalKey;

    public TAResult(CAResult cAResult, CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, byte[] bArr) {
        this.chipAuthenticationResult = cAResult;
        this.caReference = cVCPrincipal;
        for (CardVerifiableCertificate add : list) {
            this.terminalCertificates.add(add);
        }
        this.terminalKey = privateKey;
        this.documentNumber = str;
        this.cardChallenge = bArr;
    }

    public CAResult getChipAuthenticationResult() {
        return this.chipAuthenticationResult;
    }

    public CVCPrincipal getCAReference() {
        return this.caReference;
    }

    public List<CardVerifiableCertificate> getCVCertificates() {
        return this.terminalCertificates;
    }

    public PrivateKey getTerminalKey() {
        return this.terminalKey;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public byte[] getCardChallenge() {
        return this.cardChallenge;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TAResult [chipAuthenticationResult: ");
        sb2.append(this.chipAuthenticationResult);
        sb2.append(", ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("caReference: ");
        sb3.append(this.caReference);
        sb3.append(", ");
        sb.append(sb3.toString());
        sb.append("terminalCertificates: [");
        boolean z = true;
        for (CardVerifiableCertificate next : this.terminalCertificates) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(toString(next));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("terminalKey = ");
        sb4.append(Util.getDetailedPrivateKeyAlgorithm(this.terminalKey));
        sb4.append(", ");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("documentNumber = ");
        sb5.append(this.documentNumber);
        sb5.append(", ");
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("cardChallenge = ");
        sb6.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.cardChallenge));
        sb6.append(", ");
        sb.append(sb6.toString());
        sb.append("]");
        return sb.toString();
    }

    private Object toString(CardVerifiableCertificate cardVerifiableCertificate) {
        StringBuilder sb = new StringBuilder();
        sb.append("CardVerifiableCertificate [");
        try {
            CVCPrincipal holderReference = cardVerifiableCertificate.getHolderReference();
            if (!this.caReference.equals(holderReference)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("holderReference: ");
                sb2.append(holderReference);
                sb.append(sb2.toString());
            }
        } catch (CertificateException e) {
            sb.append("holderReference = ???");
            Logger logger = LOGGER;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e.getMessage());
            logger.severe(sb3.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
