package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding */
public class MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding extends PKIXParameters {
    private BankAccountAdapter$BankAccountViewHolder IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    public Set MediaBrowserCompat$ItemReceiver = new HashSet();
    public Set MediaBrowserCompat$MediaItem = new HashSet();
    public List MediaBrowserCompat$SearchResultReceiver = new ArrayList();
    private Set MediaDescriptionCompat = new HashSet();
    public int MediaMetadataCompat = 0;
    public boolean RatingCompat = false;
    public Set read = new HashSet();
    public List write = new ArrayList();

    public MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding(Set set) throws InvalidAlgorithmParameterException {
        super(set);
    }

    /* access modifiers changed from: protected */
    public void write(PKIXParameters pKIXParameters) {
        BankAccountAdapter$BankAccountViewHolder bankAccountAdapter$BankAccountViewHolder;
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) {
                MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding = (MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) pKIXParameters;
                this.MediaMetadataCompat = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaMetadataCompat;
                this.RatingCompat = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.RatingCompat;
                this.MediaBrowserCompat$CustomActionResultReceiver = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                BankAccountAdapter$BankAccountViewHolder bankAccountAdapter$BankAccountViewHolder2 = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.IconCompatParcelizer;
                if (bankAccountAdapter$BankAccountViewHolder2 == null) {
                    bankAccountAdapter$BankAccountViewHolder = null;
                } else {
                    bankAccountAdapter$BankAccountViewHolder = (BankAccountAdapter$BankAccountViewHolder) bankAccountAdapter$BankAccountViewHolder2.clone();
                }
                this.IconCompatParcelizer = bankAccountAdapter$BankAccountViewHolder;
                this.MediaBrowserCompat$SearchResultReceiver = new ArrayList(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver);
                this.write = new ArrayList(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.write);
                this.MediaDescriptionCompat = new HashSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaDescriptionCompat);
                this.MediaBrowserCompat$MediaItem = new HashSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$MediaItem);
                this.MediaBrowserCompat$ItemReceiver = new HashSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
                this.read = new HashSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.read);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public Object clone() {
        try {
            MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding = new MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding(getTrustAnchors());
            mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.write(this);
            return mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public final BankAccountAdapter$BankAccountViewHolder write() {
        BankAccountAdapter$BankAccountViewHolder bankAccountAdapter$BankAccountViewHolder = this.IconCompatParcelizer;
        if (bankAccountAdapter$BankAccountViewHolder != null) {
            return (BankAccountAdapter$BankAccountViewHolder) bankAccountAdapter$BankAccountViewHolder.clone();
        }
        return null;
    }

    public final void MediaBrowserCompat$ItemReceiver(BankAccountAdapter$BankAccountViewHolder bankAccountAdapter$BankAccountViewHolder) {
        if (bankAccountAdapter$BankAccountViewHolder != null) {
            this.IconCompatParcelizer = (BankAccountAdapter$BankAccountViewHolder) bankAccountAdapter$BankAccountViewHolder.clone();
        } else {
            this.IconCompatParcelizer = null;
        }
    }

    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            this.IconCompatParcelizer = SelectAccountAdapter$SelectAccountHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((X509CertSelector) certSelector);
        } else {
            this.IconCompatParcelizer = null;
        }
    }
}
