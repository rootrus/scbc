package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.HashSet;
import p040o.TileAdapter;

/* renamed from: o.LoanDetailAdapter$LoanSummaryDetailViewHolder */
public class LoanDetailAdapter$LoanSummaryDetailViewHolder extends CertPathValidatorSpi {
    public LoanDetailAdapter$LoanSummaryDetailViewHolder() {
        new TileAdapter.PredictiveHolder_ViewBinding();
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        boolean z = certPathParameters instanceof MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding;
        if (z || (certPathParameters instanceof TileAdapter.BaseHolder)) {
            new HashSet();
            new HashSet();
            new HashSet();
            new HashSet();
            if (certPathParameters instanceof PKIXParameters) {
                TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver = new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver((PKIXParameters) certPathParameters);
                if (z) {
                    MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding = (MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) certPathParameters;
                    tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.RatingCompat;
                    tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaMetadataCompat;
                    Collections.unmodifiableSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.read);
                    Collections.unmodifiableSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$MediaItem);
                    Collections.unmodifiableSet(mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
                }
                new TileAdapter.BaseHolder(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver, (byte) 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("TargetConstraints must be an instance of ");
            sb.append(onMobileCheckBoxClick.class.getName());
            sb.append(" for ");
            sb.append(getClass().getName());
            sb.append(" class.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parameters must be a ");
        sb2.append(MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.class.getName());
        sb2.append(" instance.");
        throw new InvalidAlgorithmParameterException(sb2.toString());
    }
}
