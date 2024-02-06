package org.ejbca.cvc;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import org.ejbca.cvc.exception.ConstructionException;
import p040o.AlertController$RecycleListView;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
import p040o.CustomCheckboxAdapter$CheckBoxViewHolder;
import p040o.DeviceSettingsAdapter$ParentViewHolder;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder;
import p040o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder;

public class CVCertificate extends DeviceSettingsAdapter$ParentViewHolder {
    private static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write = {EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.SIGNATURE};

    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write() {
        return write;
    }

    public CVCertificate() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CV_CERTIFICATE);
    }

    public CVCertificate(EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding easycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) throws ConstructionException {
        this();
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding);
    }

    public String toString() {
        return MediaBrowserCompat$ItemReceiver("");
    }

    public final byte[] MediaBrowserCompat$MediaItem() throws ConstructionException {
        try {
            return ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).MediaBrowserCompat$ItemReceiver();
        } catch (IOException e) {
            throw new ConstructionException((Throwable) e);
        } catch (NoSuchFieldException e2) {
            throw new ConstructionException((Throwable) e2);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        try {
            String MediaBrowserCompat$CustomActionResultReceiver = DonationsItemListAdapter$DonationsCardViewHolder.MediaBrowserCompat$CustomActionResultReceiver((EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) ((EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID));
            Signature instance = Signature.getInstance(MediaBrowserCompat$CustomActionResultReceiver, str);
            instance.initVerify(publicKey);
            instance.update(MediaBrowserCompat$MediaItem());
            if (!instance.verify(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, ((CustomCheckboxAdapter$CheckBoxViewHolder) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.SIGNATURE)).MediaBrowserCompat$ItemReceiver))) {
                throw new SignatureException("Signature verification failed!");
            }
        } catch (NoSuchFieldException e) {
            throw new CertificateException("CV-Certificate is corrupt", e);
        } catch (ConstructionException e2) {
            throw new CertificateException("CV-Certificate is corrupt", e2);
        }
    }
}
