package p040o;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.SmeLoanDetailCommercialItemAdapter$ChildViewHolder */
public class SmeLoanDetailCommercialItemAdapter$ChildViewHolder extends CertStoreSpi {
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        Collection<CertStore> collection = null;
        List list = Collections.EMPTY_LIST;
        for (CertStore certificates : collection) {
            Collection<? extends Certificate> certificates2 = certificates.getCertificates(certSelector);
            if (!certificates2.isEmpty()) {
                return certificates2;
            }
        }
        return list;
    }

    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        Collection<CertStore> collection = null;
        List list = Collections.EMPTY_LIST;
        for (CertStore cRLs : collection) {
            Collection<? extends CRL> cRLs2 = cRLs.getCRLs(cRLSelector);
            if (!cRLs2.isEmpty()) {
                return cRLs2;
            }
        }
        return list;
    }
}
