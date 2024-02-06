package p040o;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.UnselectedTileAdapter$Holder_ViewBinding */
public class UnselectedTileAdapter$Holder_ViewBinding extends CertStoreSpi {
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        CollectionCertStoreParameters collectionCertStoreParameters = null;
        Iterator<?> it = collectionCertStoreParameters.getCollection().iterator();
        if (certSelector == null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Certificate) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if ((next2 instanceof Certificate) && certSelector.match((Certificate) next2)) {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }

    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        ArrayList arrayList = new ArrayList();
        CollectionCertStoreParameters collectionCertStoreParameters = null;
        Iterator<?> it = collectionCertStoreParameters.getCollection().iterator();
        if (cRLSelector == null) {
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof CRL) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                Object next2 = it.next();
                if ((next2 instanceof CRL) && cRLSelector.match((CRL) next2)) {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }
}
