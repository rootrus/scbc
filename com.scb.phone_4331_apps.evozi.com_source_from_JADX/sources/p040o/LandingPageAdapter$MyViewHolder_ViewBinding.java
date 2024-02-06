package p040o;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

/* renamed from: o.LandingPageAdapter$MyViewHolder_ViewBinding */
public final class LandingPageAdapter$MyViewHolder_ViewBinding<T extends CRL> implements BankAccountAdapter$BankAccountViewHolder<T> {
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final CRLSelector MediaBrowserCompat$ItemReceiver;
    private final BigInteger RatingCompat;
    private final boolean read;
    private final byte[] write;

    public final Object clone() {
        return this;
    }

    public /* synthetic */ LandingPageAdapter$MyViewHolder_ViewBinding(C10409x2819ac26 landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
        this(landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private LandingPageAdapter$MyViewHolder_ViewBinding(C10409x2819ac26 landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.IconCompatParcelizer = landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read;
        this.RatingCompat = landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        this.write = landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.read = landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.write;
    }

    public final boolean write(CRL crl) {
        if (!(crl instanceof X509CRL)) {
            return this.MediaBrowserCompat$ItemReceiver.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = null;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem.write);
            if (extensionValue != null) {
                hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) C10905onItemClick.MediaBrowserCompat$ItemReceiver(extensionValue).write());
            }
            if (this.IconCompatParcelizer && hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
                return false;
            }
            if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null && this.RatingCompat != null && new BigInteger(1, hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read).compareTo(this.RatingCompat) == 1) {
                return false;
            }
            if (this.read) {
                byte[] extensionValue2 = x509crl.getExtensionValue(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write);
                byte[] bArr = this.write;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!C6958xd50139e8.write(extensionValue2, bArr)) {
                    return false;
                }
            }
            return this.MediaBrowserCompat$ItemReceiver.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o.LandingPageAdapter$MyViewHolder_ViewBinding$IconCompatParcelizer */
    public static class IconCompatParcelizer extends X509CRLSelector {
        private final LandingPageAdapter$MyViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(LandingPageAdapter$MyViewHolder_ViewBinding landingPageAdapter$MyViewHolder_ViewBinding) {
            this.MediaBrowserCompat$ItemReceiver = landingPageAdapter$MyViewHolder_ViewBinding;
            if (landingPageAdapter$MyViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) landingPageAdapter$MyViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        public final boolean match(CRL crl) {
            LandingPageAdapter$MyViewHolder_ViewBinding landingPageAdapter$MyViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            if (landingPageAdapter$MyViewHolder_ViewBinding == null) {
                return crl != null;
            }
            return landingPageAdapter$MyViewHolder_ViewBinding.write(crl);
        }
    }
}
