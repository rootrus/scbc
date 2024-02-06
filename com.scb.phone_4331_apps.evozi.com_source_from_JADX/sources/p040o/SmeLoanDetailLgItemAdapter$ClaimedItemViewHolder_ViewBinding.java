package p040o;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;
import p040o.TileAdapter;

/* renamed from: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding */
public final class SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding extends X509CRL {
    private int IconCompatParcelizer;
    private boolean write;

    public final String getSigAlgName() {
        return null;
    }

    public final byte[] getSigAlgParams() {
        return null;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write);
            if (extensionValue != null) {
                byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(extensionValue).write();
                if ((write2 != null ? new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null).MediaBrowserCompat$ItemReceiver) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new DebitsLimitAdapter$LimitCustomViewHolder("Exception reading IssuingDistributionPoint", e);
        }
    }

    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C10423xa3461306.RatingCompat);
        criticalExtensionOIDs.remove(C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver);
        return !criticalExtensionOIDs.isEmpty();
    }

    private Set MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
        HashSet hashSet = null;
        if (getVersion() == 2 && (creditCardDetailsAdapter$ItemViewHolder_ViewBinding = null.read.IconCompatParcelizer) != null) {
            hashSet = new HashSet();
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (z == ((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                }
            }
        }
        return hashSet;
    }

    public final Set getCriticalExtensionOIDs() {
        return MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final Set getNonCriticalExtensionOIDs() {
        return MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    public final byte[] getEncoded() throws CRLException {
        HmlBanksGridAdapter$HmlBankViewHolder hmlBanksGridAdapter$HmlBankViewHolder = null;
        try {
            return hmlBanksGridAdapter$HmlBankViewHolder.write(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public final void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), "SC");
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        MediaBrowserCompat$CustomActionResultReceiver(publicKey, signature);
    }

    public final void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        if (str != null) {
            signature = Signature.getInstance(getSigAlgName(), str);
        } else {
            signature = Signature.getInstance(getSigAlgName());
        }
        MediaBrowserCompat$CustomActionResultReceiver(publicKey, signature);
    }

    public final void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        if (provider != null) {
            signature = Signature.getInstance(getSigAlgName(), provider);
        } else {
            signature = Signature.getInstance(getSigAlgName());
        }
        MediaBrowserCompat$CustomActionResultReceiver(publicKey, signature);
    }

    public final int getVersion() {
        FundSourceListAdapter$FundSourceHolder fundSourceListAdapter$FundSourceHolder = null;
        return fundSourceListAdapter$FundSourceHolder.write();
    }

    public final Principal getIssuerDN() {
        return new TileAdapter.ShortcutHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(null.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem()));
    }

    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(null.read.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.FundSourceListAdapter$FundSourceHolder, java.security.cert.X509CRLEntry, o.DividendSummaryAdapter$ParentViewHolder_ViewBinding] */
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        ? r0 = 0;
        Enumeration MediaBrowserCompat$ItemReceiver = r0.MediaBrowserCompat$ItemReceiver();
        while (MediaBrowserCompat$ItemReceiver.hasMoreElements()) {
            SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer = (SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) MediaBrowserCompat$ItemReceiver.nextElement();
            if (bigInteger.equals(new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) iconCompatParcelizer.read.read(0)).read))) {
                return new SmeLoanDetailLgItemAdapter$GroupItemViewHolder(iconCompatParcelizer, false, r0);
            }
        }
        return r0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String read = MoneyActionAdapter$CustomViewHolder.read();
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(read);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(read);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(read);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(read);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(read);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, 0, 20)));
        stringBuffer.append(read);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, 20)));
                stringBuffer.append(read);
            } else {
                stringBuffer.append("                       ");
                stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, signature.length - i)));
                stringBuffer.append(read);
            }
        }
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = null.read.IconCompatParcelizer;
        if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding != null) {
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            if (elements.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(read);
            }
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
                if (selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView != null) {
                    CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(selectableChoiceAdapter$ChoiceHolder_ViewBinding.Keep);
                    stringBuffer.append(") ");
                    try {
                        if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver)) {
                            stringBuffer.append(new LtfSummaryAdapter$SsfChildViewHolder_ViewBinding(new BigInteger(1, HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()).read)));
                            stringBuffer.append(read);
                        } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Base CRL: ");
                            sb.append(new LtfSummaryAdapter$SsfChildViewHolder_ViewBinding(new BigInteger(1, HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()).read)));
                            stringBuffer.append(sb.toString());
                            stringBuffer.append(read);
                        } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo)) {
                            C10402xc503e64f MediaBrowserCompat$ItemReceiver = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                            stringBuffer.append(MediaBrowserCompat$ItemReceiver != null ? new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver)) : null);
                            stringBuffer.append(read);
                        } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer)) {
                            C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                            stringBuffer.append(MediaBrowserCompat$ItemReceiver2 != null ? new FundSwitchSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2)) : null);
                            stringBuffer.append(read);
                        } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaDescriptionCompat)) {
                            C10402xc503e64f MediaBrowserCompat$ItemReceiver3 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                            stringBuffer.append(MediaBrowserCompat$ItemReceiver3 != null ? new FundSwitchSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3)) : null);
                            stringBuffer.append(read);
                        } else {
                            stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                            stringBuffer.append(" value = ");
                            stringBuffer.append(DividendSummaryAdapter$ChildViewHolder.read(companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                            stringBuffer.append(read);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(read);
                    }
                } else {
                    stringBuffer.append(read);
                }
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                stringBuffer.append(append);
                stringBuffer.append(read);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: o.FundAccountPagerAdapter$ItemViewHolder} */
    /* JADX WARNING: type inference failed for: r0v3, types: [o.FundSourceListAdapter$FundSourceHolder] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRevoked(java.security.cert.Certificate r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getType()
            java.lang.String r1 = "X.509"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = 0
            java.util.Enumeration r1 = r0.MediaBrowserCompat$ItemReceiver()
            o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder r2 = r0.read
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r2 = r2.MediaBrowserCompat$ItemReceiver
            r3 = r9
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.math.BigInteger r4 = r3.getSerialNumber()
        L_0x001c:
            boolean r5 = r1.hasMoreElements()
            r6 = 0
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r1.nextElement()
            boolean r7 = r5 instanceof p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer
            if (r7 == 0) goto L_0x002e
            o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder$IconCompatParcelizer r5 = (p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) r5
            goto L_0x003c
        L_0x002e:
            if (r5 == 0) goto L_0x003b
            o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder$IconCompatParcelizer r7 = new o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder$IconCompatParcelizer
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r5 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r5)
            r7.<init>(r5)
            r5 = r7
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r5 = r5.read
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.read(r6)
            o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding r5 = p040o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((java.lang.Object) r5)
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r5 = r5.read
            r7.<init>(r5)
            boolean r5 = r7.equals(r4)
            if (r5 == 0) goto L_0x001c
            boolean r1 = r9 instanceof java.security.cert.X509Certificate
            if (r1 == 0) goto L_0x0064
            javax.security.auth.x500.X500Principal r9 = r3.getIssuerX500Principal()
            byte[] r9 = r9.getEncoded()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r9 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r9)
            goto L_0x0077
        L_0x0064:
            byte[] r9 = r9.getEncoded()     // Catch:{ CertificateEncodingException -> 0x0080 }
            if (r9 == 0) goto L_0x0073
            o.FundAccountPagerAdapter$ItemViewHolder r0 = new o.FundAccountPagerAdapter$ItemViewHolder     // Catch:{ CertificateEncodingException -> 0x0080 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r9 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r9)     // Catch:{ CertificateEncodingException -> 0x0080 }
            r0.<init>(r9)     // Catch:{ CertificateEncodingException -> 0x0080 }
        L_0x0073:
            o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding r9 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ CertificateEncodingException -> 0x0080 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r9 = r9.IconCompatParcelizer     // Catch:{ CertificateEncodingException -> 0x0080 }
        L_0x0077:
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto L_0x007e
            return r6
        L_0x007e:
            r9 = 1
            return r9
        L_0x0080:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot process certificate"
            r9.<init>(r0)
            throw r9
        L_0x0088:
            return r6
        L_0x0089:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "X.509 CRL used with non X.509 Cert"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding.isRevoked(java.security.cert.Certificate):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding)) {
            return super.equals(obj);
        }
        SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding smeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding = (SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding) obj;
        if (this.write && smeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding.write && smeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding.IconCompatParcelizer != this.IconCompatParcelizer) {
            return false;
        }
        Object obj2 = null;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        if (!this.write) {
            this.write = true;
            this.IconCompatParcelizer = super.hashCode();
        }
        return this.IconCompatParcelizer;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (null.write.equals(null.read.write)) {
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    public final byte[] getExtensionValue(String str) {
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = null.read.IconCompatParcelizer;
        if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding != null) {
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(new HmlBusinessInfoAdapter$BankAccountViewHolder(str));
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding != null) {
                try {
                    return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.ParcelableVolumeInfo();
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("error parsing ");
                    sb.append(e.toString());
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return null;
    }

    public final Date getNextUpdate() {
        if (null.read.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return null.read.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [o.FundSourceListAdapter$FundSourceHolder, o.DividendSummaryAdapter$ParentViewHolder_ViewBinding, java.util.Set] */
    public final Set getRevokedCertificates() {
        HashSet hashSet = new HashSet();
        ? r1 = 0;
        Enumeration MediaBrowserCompat$ItemReceiver = r1.MediaBrowserCompat$ItemReceiver();
        while (MediaBrowserCompat$ItemReceiver.hasMoreElements()) {
            hashSet.add(new SmeLoanDetailLgItemAdapter$GroupItemViewHolder((SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) MediaBrowserCompat$ItemReceiver.nextElement(), false, r1));
        }
        return !hashSet.isEmpty() ? Collections.unmodifiableSet(hashSet) : r1;
    }

    public final String getSigAlgOID() {
        return null.write.MediaBrowserCompat$CustomActionResultReceiver.write;
    }

    public final byte[] getSignature() {
        return null.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final byte[] getTBSCertList() throws CRLException {
        try {
            return null.read.write(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public final Date getThisUpdate() {
        return null.read.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
    }
}
