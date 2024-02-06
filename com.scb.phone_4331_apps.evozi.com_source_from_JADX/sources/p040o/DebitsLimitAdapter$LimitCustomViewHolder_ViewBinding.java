package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.util.StoreException;
import p040o.TileAdapter;

/* renamed from: o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding */
final class DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding {
    private static String IconCompatParcelizer = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write;
    private static LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding();
    private static String MediaBrowserCompat$ItemReceiver = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.read.write;
    private static String write = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.write;

    DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding() {
    }

    static {
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder3 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.PlaybackStateCompat$CustomAction;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder4 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.setHasDecor;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder5 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$QueueItem;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder6 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$Token;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder7 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.RatingCompat;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder8 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder9 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder10 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaDescriptionCompat;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder11 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer;
        new String[]{"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.security.cert.TrustAnchor IconCompatParcelizer(java.security.cert.X509Certificate r7, java.util.Set r8, java.lang.String r9) throws org.spongycastle.jce.provider.AnnotatedException {
        /*
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector
            r0.<init>()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r1 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r7)
            byte[] r2 = r1.ParcelableVolumeInfo()     // Catch:{ IOException -> 0x0082 }
            r0.setSubject(r2)     // Catch:{ IOException -> 0x0082 }
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x0018:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x0074
            if (r3 != 0) goto L_0x0074
            java.lang.Object r3 = r8.next()
            java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3
            java.security.cert.X509Certificate r6 = r3.getTrustedCert()
            if (r6 == 0) goto L_0x003f
            java.security.cert.X509Certificate r6 = r3.getTrustedCert()
            boolean r6 = r0.match(r6)
            if (r6 == 0) goto L_0x0062
            java.security.cert.X509Certificate r5 = r3.getTrustedCert()
            java.security.PublicKey r5 = r5.getPublicKey()
            goto L_0x0063
        L_0x003f:
            java.lang.String r6 = r3.getCAName()
            if (r6 == 0) goto L_0x0062
            java.security.PublicKey r6 = r3.getCAPublicKey()
            if (r6 == 0) goto L_0x0062
            javax.security.auth.x500.X500Principal r6 = r3.getCA()     // Catch:{ IllegalArgumentException -> 0x0062 }
            byte[] r6 = r6.getEncoded()     // Catch:{ IllegalArgumentException -> 0x0062 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r6 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ IllegalArgumentException -> 0x0062 }
            boolean r6 = r1.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0062 }
            if (r6 == 0) goto L_0x0062
            java.security.PublicKey r5 = r3.getCAPublicKey()     // Catch:{ IllegalArgumentException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r5 == 0) goto L_0x0018
            if (r9 != 0) goto L_0x006b
            r7.verify(r5)     // Catch:{ Exception -> 0x006f }
            goto L_0x0018
        L_0x006b:
            r7.verify(r5, r9)     // Catch:{ Exception -> 0x006f }
            goto L_0x0018
        L_0x006f:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r5 = r3
            goto L_0x0018
        L_0x0074:
            if (r3 != 0) goto L_0x0081
            if (r4 != 0) goto L_0x0079
            goto L_0x0081
        L_0x0079:
            org.spongycastle.jce.provider.AnnotatedException r7 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r8 = "TrustAnchor found but certificate validation failed."
            r7.<init>(r8, r4)
            throw r7
        L_0x0081:
            return r3
        L_0x0082:
            r7 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r8 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r9 = "Cannot set subject search criteria for trust anchor."
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    static List<ShortcutAdapter$MyViewHolder_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder_ViewBinding> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(bArr).write();
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (write2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
        int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != length; i++) {
            ShortcutAdapter$MyViewHolder_ViewBinding shortcutAdapter$MyViewHolder_ViewBinding = map.get(creditCardDetailsAdapter$ItemViewHolderArr2[i]);
            if (shortcutAdapter$MyViewHolder_ViewBinding != null) {
                arrayList.add(shortcutAdapter$MyViewHolder_ViewBinding);
            }
        }
        return arrayList;
    }

    protected static boolean MediaBrowserCompat$CustomActionResultReceiver(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    protected static C10402xc503e64f IconCompatParcelizer(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return MediaBrowserCompat$CustomActionResultReceiver(str, extensionValue);
    }

    private static C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver(String str, byte[] bArr) throws AnnotatedException {
        try {
            return new CompanyItemViewHolder(((C10905onItemClick) new CompanyItemViewHolder(bArr).MediaBrowserCompat$ItemReceiver()).write()).MediaBrowserCompat$ItemReceiver();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception processing extension ");
            sb.append(str);
            throw new AnnotatedException(sb.toString(), e);
        }
    }

    protected static LtfSummaryAdapter$SsfChildViewHolder MediaBrowserCompat$ItemReceiver(PublicKey publicKey) throws CertPathValidatorException {
        try {
            C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = new CompanyItemViewHolder(publicKey.getEncoded()).MediaBrowserCompat$ItemReceiver();
            return (MediaBrowserCompat$ItemReceiver2 != null ? new LandingAccountsAdapter$AccountViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    protected static final Set write(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding = new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream);
        Enumeration write2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write2.hasMoreElements()) {
            try {
                hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
            }
        }
        return hashSet;
    }

    protected static SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding write(SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, List[] listArr, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2) {
        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.getParent();
        if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding == null) {
            return null;
        }
        if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3 == null) {
            for (int i = 0; i < listArr.length; i++) {
                listArr[i] = new ArrayList();
            }
            return null;
        }
        smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3.write.remove(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
        MediaBrowserCompat$ItemReceiver(listArr, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
        return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
    }

    private static void MediaBrowserCompat$ItemReceiver(List[] listArr, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) {
        listArr[smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.getDepth()].remove(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding);
        if (!smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.write.isEmpty()) {
            Iterator children = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.getChildren();
            while (children.hasNext()) {
                MediaBrowserCompat$ItemReceiver(listArr, (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) children.next());
            }
        }
    }

    protected static boolean MediaBrowserCompat$ItemReceiver(int i, List[] listArr, HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list.get(i2);
            if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.getExpectedPolicies().contains(hmlBusinessInfoAdapter$BankAccountViewHolder.write)) {
                HashSet hashSet = new HashSet();
                hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), i, hashSet, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, set, hmlBusinessInfoAdapter$BankAccountViewHolder.write, false);
                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.write.add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
                listArr[i].add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
                return true;
            }
        }
        return false;
    }

    protected static void IconCompatParcelizer(int i, List[] listArr, HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list.get(i2);
            if (RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), i, hashSet, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, set, hmlBusinessInfoAdapter$BankAccountViewHolder.write, false);
                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.write.add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
                listArr[i].add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2);
                return;
            }
        }
    }

    protected static boolean IconCompatParcelizer(Set set) {
        return set == null || set.contains(RFC3280CertPathUtilities.ANY_POLICY) || set.isEmpty();
    }

    protected static Collection MediaBrowserCompat$CustomActionResultReceiver(TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding, List list) throws AnnotatedException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : list) {
            if (next instanceof MoreOptionsAdapter$MoreOptionsHolder) {
                try {
                    linkedHashSet.addAll(((MoreOptionsAdapter$MoreOptionsHolder) next).MediaBrowserCompat$ItemReceiver());
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new C10434xcc04803e(addShortcutHolder_ViewBinding)));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return linkedHashSet;
    }

    static List<ShortcutAdapter$MyViewHolder> read(FundSwitchSearchListAdapter$FundHolder fundSwitchSearchListAdapter$FundHolder, Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder> map) throws AnnotatedException {
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder;
        if (fundSwitchSearchListAdapter$FundHolder == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            FundAccountPagerAdapter$ItemViewHolder_ViewBinding[] IconCompatParcelizer2 = fundSwitchSearchListAdapter$FundHolder.IconCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            for (FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding : IconCompatParcelizer2) {
                SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder = fundAccountPagerAdapter$ItemViewHolder_ViewBinding.write;
                if (selectableChoiceAdapter$ChoiceHolder != null && selectableChoiceAdapter$ChoiceHolder.read == 0) {
                    HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = selectableChoiceAdapter$ChoiceHolder.write;
                    if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof AccountDetailsAdapter$ItemViewHolder) {
                        accountDetailsAdapter$ItemViewHolder = (AccountDetailsAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
                    } else {
                        accountDetailsAdapter$ItemViewHolder = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) : null;
                    }
                    CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                    int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
                    CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
                    System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                    for (int i = 0; i < length; i++) {
                        ShortcutAdapter$MyViewHolder shortcutAdapter$MyViewHolder = map.get(creditCardDetailsAdapter$ItemViewHolderArr2[i]);
                        if (shortcutAdapter$MyViewHolder != null) {
                            arrayList.add(shortcutAdapter$MyViewHolder);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new AnnotatedException("Distribution points could not be read.", e);
        }
    }

    private static void write(FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList<DividendSummaryAdapter$ParentViewHolder_ViewBinding> arrayList = new ArrayList<>();
        if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null) {
            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
            System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
            for (int i = 0; i < length; i++) {
                if (creditCardDetailsAdapter$ItemViewHolderArr2[i].IconCompatParcelizer == 4) {
                    try {
                        arrayList.add(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[i].MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem().ParcelableVolumeInfo()));
                    } catch (IOException e) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
        } else if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.write != null) {
            for (Object add : collection) {
                arrayList.add(add);
            }
        } else {
            throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        }
        for (DividendSummaryAdapter$ParentViewHolder_ViewBinding ParcelableVolumeInfo : arrayList) {
            try {
                x509CRLSelector.addIssuerName(ParcelableVolumeInfo.ParcelableVolumeInfo());
            } catch (IOException e2) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void read(java.util.Date r3, java.security.cert.X509CRL r4, java.lang.Object r5, p040o.PersonalLimitAdapter$LimitCustomViewHolder r6) throws org.spongycastle.jce.provider.AnnotatedException {
        /*
            boolean r0 = p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ CRLException -> 0x00e6 }
            if (r0 == 0) goto L_0x003a
            r0 = r5
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.math.BigInteger r0 = r0.getSerialNumber()
            java.security.cert.X509CRLEntry r0 = r4.getRevokedCertificate(r0)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            javax.security.auth.x500.X500Principal r1 = r0.getCertificateIssuer()
            if (r1 != 0) goto L_0x0027
            javax.security.auth.x500.X500Principal r4 = r4.getIssuerX500Principal()
            byte[] r4 = r4.getEncoded()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r4 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r4)
            goto L_0x002f
        L_0x0027:
            byte[] r4 = r1.getEncoded()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r4 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r4)
        L_0x002f:
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r5 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r5)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x005e
            return
        L_0x003a:
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r0 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r5)
            javax.security.auth.x500.X500Principal r1 = r4.getIssuerX500Principal()
            byte[] r1 = r1.getEncoded()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r1 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
            return
        L_0x0051:
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            java.math.BigInteger r5 = r5.getSerialNumber()
            java.security.cert.X509CRLEntry r0 = r4.getRevokedCertificate(r5)
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            boolean r4 = r0.hasExtensions()
            r5 = 0
            if (r4 == 0) goto L_0x0082
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r4 = p040o.SelectableChoiceAdapter$ChoiceHolder_ViewBinding.PlaybackStateCompat     // Catch:{ Exception -> 0x0079 }
            java.lang.String r4 = r4.write     // Catch:{ Exception -> 0x0079 }
            byte[] r1 = r0.getExtensionValue(r4)     // Catch:{ Exception -> 0x0079 }
            if (r1 != 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r5 = MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r4, (byte[]) r1)     // Catch:{ Exception -> 0x0079 }
        L_0x0074:
            o.HmlAboutAdapter$HmlAboutViewHolder r5 = p040o.HmlAboutAdapter$HmlAboutViewHolder.IconCompatParcelizer((java.lang.Object) r5)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0082
        L_0x0079:
            r3 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r4 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r5 = "Reason code CRL entry extension could not be decoded."
            r4.<init>(r5, r3)
            throw r4
        L_0x0082:
            long r3 = r3.getTime()
            java.util.Date r1 = r0.getRevocationDate()
            long r1 = r1.getTime()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x00cc
            if (r5 == 0) goto L_0x00cc
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r5.read
            r3.<init>(r4)
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x00cc
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r5.read
            r3.<init>(r4)
            int r3 = r3.intValue()
            r4 = 1
            if (r3 == r4) goto L_0x00cc
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r5.read
            r3.<init>(r4)
            int r3 = r3.intValue()
            r4 = 2
            if (r3 == r4) goto L_0x00cc
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r5.read
            r3.<init>(r4)
            int r3 = r3.intValue()
            r4 = 8
            if (r3 != r4) goto L_0x00e5
        L_0x00cc:
            if (r5 == 0) goto L_0x00dc
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r4 = r5.read
            r3.<init>(r4)
            int r3 = r3.intValue()
            r6.write = r3
            goto L_0x00df
        L_0x00dc:
            r3 = 0
            r6.write = r3
        L_0x00df:
            java.util.Date r3 = r0.getRevocationDate()
            r6.IconCompatParcelizer = r3
        L_0x00e5:
            return
        L_0x00e6:
            r3 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r4 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r5 = "Failed check for indirect CRL."
            r4.<init>(r5, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read(java.util.Date, java.security.cert.X509CRL, java.lang.Object, o.PersonalLimitAdapter$LimitCustomViewHolder):void");
    }

    protected static Set read(Date date, X509CRL x509crl, List<CertStore> list, List<ShortcutAdapter$MyViewHolder> list2) throws AnnotatedException {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        boolean z;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509crl.getIssuerX500Principal().getEncoded()).ParcelableVolumeInfo());
            try {
                String str = write;
                byte[] extensionValue = x509crl.getExtensionValue(str);
                byte[] bArr = null;
                if (extensionValue == null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
                } else {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver(str, extensionValue);
                }
                BigInteger bigInteger = hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding != null ? new BigInteger(1, HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read) : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(IconCompatParcelizer);
                    x509CRLSelector.setMinCRLNumber(bigInteger == null ? null : bigInteger.add(BigInteger.valueOf(1)));
                    C10409x2819ac26 landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C10409x2819ac26(x509CRLSelector);
                    if (extensionValue2 != null) {
                        bArr = new byte[extensionValue2.length];
                        System.arraycopy(extensionValue2, 0, bArr, 0, extensionValue2.length);
                    }
                    landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = bArr;
                    landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.write = true;
                    landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = bigInteger;
                    Set<X509CRL> MediaBrowserCompat$CustomActionResultReceiver2 = LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new LandingPageAdapter$MyViewHolder_ViewBinding(landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, (byte) 0), date, list, list2);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : MediaBrowserCompat$CustomActionResultReceiver2) {
                        Set criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs == null) {
                            z = false;
                        } else {
                            z = criticalExtensionOIDs.contains(C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                        if (z) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e);
                }
            } catch (Exception e2) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e2);
            }
        } catch (IOException e3) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e3);
        }
    }

    protected static Set write(FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding, Object obj, TileAdapter.BaseHolder baseHolder) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(obj));
            write(fundAccountPagerAdapter$ItemViewHolder_ViewBinding, (Collection) hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            C10409x2819ac26 landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C10409x2819ac26(x509CRLSelector);
            landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read = true;
            LandingPageAdapter$MyViewHolder_ViewBinding landingPageAdapter$MyViewHolder_ViewBinding = new LandingPageAdapter$MyViewHolder_ViewBinding(landingPageAdapter$MyViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            new Date(baseHolder.read.getTime());
            Set MediaBrowserCompat$CustomActionResultReceiver2 = LoanDetailAdapter$LoanSummaryDetailViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(landingPageAdapter$MyViewHolder_ViewBinding, new Date(baseHolder.read.getTime()), baseHolder.MediaBrowserCompat$ItemReceiver.getCertStores(), baseHolder.IconCompatParcelizer);
            if (!MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
                return MediaBrowserCompat$CustomActionResultReceiver2;
            }
            if (obj instanceof MobileListAdapter$MobileListCustomView) {
                StringBuilder sb = new StringBuilder();
                sb.append("No CRLs found for issuer \"");
                sb.append(((MobileListAdapter$MobileListCustomView) obj).read().read()[0]);
                sb.append("\"");
                throw new AnnotatedException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No CRLs found for issuer \"");
            sb2.append(LtfSummaryAdapter$ParentViewHolder_ViewBinding.write.MediaBrowserCompat$CustomActionResultReceiver(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(((X509Certificate) obj).getIssuerX500Principal().getEncoded())));
            sb2.append("\"");
            throw new AnnotatedException(sb2.toString());
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e);
        }
    }

    protected static PublicKey write(List list, int i, TileAdapter.NtbScbCustomerHolder ntbScbCustomerHolder) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i < list.size()) {
                PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
                if (publicKey2 instanceof DSAPublicKey) {
                    dSAPublicKey = (DSAPublicKey) publicKey2;
                } else {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
            } else {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return ntbScbCustomerHolder.MediaBrowserCompat$CustomActionResultReceiver("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static Collection MediaBrowserCompat$CustomActionResultReceiver(X509Certificate x509Certificate, List<CertStore> list, List<ShortcutAdapter$MyViewHolder_ViewBinding> list2) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate.getIssuerX500Principal().getEncoded()).ParcelableVolumeInfo());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(MediaBrowserCompat$ItemReceiver);
                if (extensionValue != null) {
                    byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(extensionValue).write();
                    byte[] bArr = null;
                    C10905onItemClick onitemclick = (write2 != null ? new CurrencyAdapter$CurrencyHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null).read;
                    if (onitemclick != null) {
                        bArr = onitemclick.write();
                    }
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new C10407x3ea8e030(bArr).ParcelableVolumeInfo());
                    }
                }
            } catch (Exception unused) {
            }
            TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding = new TileAdapter.AddShortcutHolder_ViewBinding(new TileAdapter.AddShortcutHolder_ViewBinding.read(x509CertSelector).IconCompatParcelizer, (byte) 0);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                ArrayList<X509Certificate> arrayList = new ArrayList<>();
                arrayList.addAll(MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) list));
                arrayList.addAll(MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) list2));
                for (X509Certificate add : arrayList) {
                    linkedHashSet.add(add);
                }
                return linkedHashSet;
            } catch (AnnotatedException e) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e);
            }
        } catch (IOException e2) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    protected static void read(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    protected static Date write(TileAdapter.BaseHolder baseHolder, CertPath certPath, int i) throws AnnotatedException {
        if (baseHolder.f5824x50fd9e4a != 1) {
            return new Date(baseHolder.read.getTime());
        }
        if (i <= 0) {
            return new Date(baseHolder.read.getTime());
        }
        int i2 = i - 1;
        if (i2 != 0) {
            return ((X509Certificate) certPath.getCertificates().get(i2)).getNotBefore();
        }
        HelpAdapter$MoreOptionsHolder_ViewBinding helpAdapter$MoreOptionsHolder_ViewBinding = null;
        try {
            byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i2)).getExtensionValue(DiscoverSearchResultAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver.write);
            if (extensionValue != null) {
                C10402xc503e64f read = C10402xc503e64f.read(extensionValue);
                if (read != null) {
                    if (!(read instanceof HelpAdapter$MoreOptionsHolder_ViewBinding)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("illegal object in getInstance: ");
                        sb.append(read.getClass().getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                helpAdapter$MoreOptionsHolder_ViewBinding = (HelpAdapter$MoreOptionsHolder_ViewBinding) read;
            }
            if (helpAdapter$MoreOptionsHolder_ViewBinding == null) {
                return ((X509Certificate) certPath.getCertificates().get(i2)).getNotBefore();
            }
            try {
                return helpAdapter$MoreOptionsHolder_ViewBinding.MediaBrowserCompat$ItemReceiver();
            } catch (ParseException e) {
                throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e);
            }
        } catch (IOException unused) {
            throw new AnnotatedException("Date of cert gen extension could not be read.");
        } catch (IllegalArgumentException unused2) {
            throw new AnnotatedException("Date of cert gen extension could not be read.");
        }
    }
}
