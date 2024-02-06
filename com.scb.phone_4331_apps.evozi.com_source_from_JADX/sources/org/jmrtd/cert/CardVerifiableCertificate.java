package org.jmrtd.cert;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import java.util.logging.Logger;
import net.p088sf.scuba.data.Country;
import org.ejbca.cvc.AuthorizationRoleEnum;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.exception.ConstructionException;
import org.jmrtd.cert.CVCAuthorizationTemplate;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
import p040o.CustomCheckboxAdapter$CheckBoxViewHolder;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder;
import p040o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder;
import p040o.EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding;

public class CardVerifiableCertificate extends Certificate {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3585440601605666288L;
    private CVCertificate cvCertificate;
    private transient KeyFactory rsaKeyFactory;

    protected CardVerifiableCertificate(CVCertificate cVCertificate) {
        super("CVC");
        try {
            this.rsaKeyFactory = KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.cvCertificate = cVCertificate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardVerifiableCertificate(CVCPrincipal cVCPrincipal, CVCPrincipal cVCPrincipal2, PublicKey publicKey, String str, Date date, Date date2, CVCAuthorizationTemplate.Role role, CVCAuthorizationTemplate.Permission permission, byte[] bArr) {
        super("CVC");
        try {
            CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder = new CardLoanOfferViewPagerAdapter$ItemViewHolder(cVCPrincipal.getCountry().toAlpha2Code(), cVCPrincipal.getMnemonic(), cVCPrincipal.getSeqNumber());
            EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding = new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding(cVCPrincipal2.getCountry().toAlpha2Code(), cVCPrincipal2.getMnemonic(), cVCPrincipal2.getSeqNumber());
            AuthorizationRoleEnum fromRole = CVCAuthorizationTemplate.fromRole(role);
            PublicKey publicKey2 = publicKey;
            String str2 = str;
            CVCertificate cVCertificate = new CVCertificate(new EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding(cardLoanOfferViewPagerAdapter$ItemViewHolder, EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(publicKey, str, fromRole), easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding, fromRole, CVCAuthorizationTemplate.fromPermission(permission), date, date2));
            this.cvCertificate = cVCertificate;
            cVCertificate.MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.SIGNATURE, bArr));
            this.cvCertificate.MediaBrowserCompat$MediaItem();
        } catch (ConstructionException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getSigAlgName() {
        try {
            return DonationsItemListAdapter$DonationsCardViewHolder.MediaBrowserCompat$CustomActionResultReceiver((EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) ((EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID));
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public String getSigAlgOID() {
        try {
            return ((EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) ((EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID)).write("", true);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.cvCertificate.MediaBrowserCompat$ItemReceiver();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.getMessage());
        }
    }

    public PublicKey getPublicKey() {
        try {
            EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding = (EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY);
            if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding.getAlgorithm().equals("RSA")) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding;
                try {
                    return this.rsaKeyFactory.generatePublic(new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent()));
                } catch (GeneralSecurityException e) {
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception: ");
                    sb.append(e.getMessage());
                    logger.severe(sb.toString());
                }
            }
            return easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding;
        } catch (NoSuchFieldException e2) {
            Logger logger2 = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e2.getMessage());
            logger2.severe(sb2.toString());
            return null;
        }
    }

    public String toString() {
        return this.cvCertificate.toString();
    }

    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            try {
                this.cvCertificate.MediaBrowserCompat$ItemReceiver(publicKey, providers[i].getName());
                z = true;
                break;
            } catch (NoSuchAlgorithmException unused) {
                i++;
            }
        }
        if (!z) {
            throw new NoSuchAlgorithmException("Tried all security providers: None was able to provide this signature algorithm.");
        }
    }

    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.cvCertificate.MediaBrowserCompat$ItemReceiver(publicKey, str);
    }

    public byte[] getCertBodyData() throws CertificateException, IOException {
        try {
            return ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).MediaBrowserCompat$ItemReceiver();
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public Date getNotBefore() throws CertificateException {
        try {
            return ((EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EFFECTIVE_DATE)).write;
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public Date getNotAfter() throws CertificateException {
        try {
            return ((EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPIRATION_DATE)).write;
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public CVCPrincipal getAuthorityReference() throws CertificateException {
        try {
            CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder = (CardLoanOfferViewPagerAdapter$ItemViewHolder) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CA_REFERENCE);
            return new CVCPrincipal(Country.getInstance(cardLoanOfferViewPagerAdapter$ItemViewHolder.write.toUpperCase()), cardLoanOfferViewPagerAdapter$ItemViewHolder.IconCompatParcelizer, cardLoanOfferViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver);
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public CVCPrincipal getHolderReference() throws CertificateException {
        try {
            EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding = (EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_REFERENCE);
            return new CVCPrincipal(Country.getInstance(easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding.write.toUpperCase()), easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding.IconCompatParcelizer, easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public CVCAuthorizationTemplate getAuthorizationTemplate() throws CertificateException {
        try {
            return new CVCAuthorizationTemplate((org.ejbca.cvc.CVCAuthorizationTemplate) ((EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY)).read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_AUTH_TEMPLATE));
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public byte[] getSignature() throws CertificateException {
        try {
            return ((CustomCheckboxAdapter$CheckBoxViewHolder) this.cvCertificate.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.SIGNATURE)).MediaBrowserCompat$ItemReceiver;
        } catch (NoSuchFieldException e) {
            throw new CertificateException(e.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        return this.cvCertificate.equals(((CardVerifiableCertificate) obj).cvCertificate);
    }

    public int hashCode() {
        return (this.cvCertificate.hashCode() << 1) - 1030507011;
    }
}
