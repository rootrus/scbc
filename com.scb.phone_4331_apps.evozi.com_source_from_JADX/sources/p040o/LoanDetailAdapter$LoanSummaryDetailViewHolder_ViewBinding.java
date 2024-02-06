package p040o;

import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.util.StoreException;
import p040o.LandingPageAdapter$MyViewHolder_ViewBinding;

/* renamed from: o.LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding */
final class LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding {
    LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding() {
    }

    public static Set MediaBrowserCompat$CustomActionResultReceiver(LandingPageAdapter$MyViewHolder_ViewBinding landingPageAdapter$MyViewHolder_ViewBinding, Date date, List list, List list2) throws AnnotatedException {
        HashSet<X509CRL> hashSet = new HashSet<>();
        try {
            hashSet.addAll(MediaBrowserCompat$CustomActionResultReceiver(landingPageAdapter$MyViewHolder_ViewBinding, list2));
            hashSet.addAll(MediaBrowserCompat$CustomActionResultReceiver(landingPageAdapter$MyViewHolder_ViewBinding, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = landingPageAdapter$MyViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                    X509Certificate certificateChecking = cRLSelector instanceof X509CRLSelector ? ((X509CRLSelector) cRLSelector).getCertificateChecking() : null;
                    if (certificateChecking == null) {
                        hashSet2.add(x509crl);
                    } else if (x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }

    private static Collection MediaBrowserCompat$CustomActionResultReceiver(LandingPageAdapter$MyViewHolder_ViewBinding landingPageAdapter$MyViewHolder_ViewBinding, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (Object next : list) {
            if (next instanceof MoreOptionsAdapter$MoreOptionsHolder) {
                try {
                    hashSet.addAll(((MoreOptionsAdapter$MoreOptionsHolder) next).MediaBrowserCompat$ItemReceiver());
                } catch (StoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCRLs(new LandingPageAdapter$MyViewHolder_ViewBinding.IconCompatParcelizer(landingPageAdapter$MyViewHolder_ViewBinding)));
                } catch (CertStoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                    annotatedException2 = annotatedException;
                }
            }
            z = true;
        }
        if (z || annotatedException2 == null) {
            return hashSet;
        }
        throw annotatedException2;
    }
}
