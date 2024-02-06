package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.jce.provider.AnnotatedException;
import p040o.TileAdapter;

/* renamed from: o.SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder */
public class SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder extends CertPathValidatorSpi {
    private final TileAdapter.NtbScbCustomerHolder write = new TileAdapter.PredictiveHolder_ViewBinding();

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        TileAdapter.BaseHolder baseHolder;
        PublicKey publicKey;
        DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding;
        HashSet hashSet;
        int i;
        List<PKIXCertPathChecker> list;
        ArrayList[] arrayListArr;
        int i2;
        HashSet hashSet2;
        int i3;
        SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder smeLoanDetailCommercialItemAdapter$GroupItemViewHolder = this;
        CertPath certPath2 = certPath;
        CertPathParameters certPathParameters2 = certPathParameters;
        boolean z = false;
        if (certPathParameters2 instanceof PKIXParameters) {
            TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver = new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver((PKIXParameters) certPathParameters2);
            if (certPathParameters2 instanceof MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) {
                MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding = (MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) certPathParameters2;
                tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.RatingCompat;
                tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = mwShopTypeAdapter$ShopTypeViewHolder_ViewBinding.MediaMetadataCompat;
            }
            baseHolder = new TileAdapter.BaseHolder(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver, (byte) 0);
        } else if (certPathParameters2 instanceof TileAdapter.BaseHolder_ViewBinding) {
            baseHolder = ((TileAdapter.BaseHolder_ViewBinding) certPathParameters2).write;
        } else if (certPathParameters2 instanceof TileAdapter.BaseHolder) {
            baseHolder = (TileAdapter.BaseHolder) certPathParameters2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Parameters must be a ");
            sb.append(PKIXParameters.class.getName());
            sb.append(" instance.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        if (baseHolder.MediaBrowserCompat$SearchResultReceiver != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Set<String> initialPolicies = baseHolder.MediaBrowserCompat$ItemReceiver.getInitialPolicies();
                try {
                    TrustAnchor IconCompatParcelizer = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certificates.get(certificates.size() - 1), baseHolder.MediaBrowserCompat$SearchResultReceiver, baseHolder.MediaBrowserCompat$ItemReceiver.getSigProvider());
                    if (IconCompatParcelizer != null) {
                        TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver2 = new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver(baseHolder);
                        tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat = Collections.singleton(IconCompatParcelizer);
                        TileAdapter.BaseHolder baseHolder2 = new TileAdapter.BaseHolder(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver2, (byte) 0);
                        int i4 = size + 1;
                        ArrayList[] arrayListArr2 = new ArrayList[i4];
                        for (int i5 = 0; i5 < i4; i5++) {
                            arrayListArr2[i5] = new ArrayList();
                        }
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), 0, hashSet3, (PolicyNode) null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
                        arrayListArr2[0].add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding);
                        SmeLoanDetailLgItemAdapter$ChildViewHolder smeLoanDetailLgItemAdapter$ChildViewHolder = new SmeLoanDetailLgItemAdapter$ChildViewHolder();
                        HashSet hashSet4 = new HashSet();
                        int i6 = baseHolder2.MediaBrowserCompat$ItemReceiver.isExplicitPolicyRequired() ? 0 : i4;
                        int i7 = baseHolder2.MediaBrowserCompat$ItemReceiver.isAnyPolicyInhibited() ? 0 : i4;
                        if (baseHolder2.MediaBrowserCompat$ItemReceiver.isPolicyMappingInhibited()) {
                            i4 = 0;
                        }
                        X509Certificate trustedCert = IconCompatParcelizer.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                dividendSummaryAdapter$ParentViewHolder_ViewBinding = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(trustedCert.getSubjectX500Principal().getEncoded());
                                publicKey = trustedCert.getPublicKey();
                            } catch (IllegalArgumentException e) {
                                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            dividendSummaryAdapter$ParentViewHolder_ViewBinding = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.getCA().getEncoded());
                            publicKey = IconCompatParcelizer.getCAPublicKey();
                        }
                        try {
                            DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(publicKey);
                            if (baseHolder2.MediaDescriptionCompat != null) {
                                if (baseHolder2.MediaDescriptionCompat.IconCompatParcelizer.match((X509Certificate) certificates.get(0))) {
                                    z = false;
                                } else {
                                    throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                                }
                            }
                            List<PKIXCertPathChecker> certPathCheckers = baseHolder2.MediaBrowserCompat$ItemReceiver.getCertPathCheckers();
                            for (PKIXCertPathChecker init : certPathCheckers) {
                                init.init(z);
                                i4 = i4;
                            }
                            int i8 = i4;
                            X509Certificate x509Certificate = trustedCert;
                            int i9 = i7;
                            int i10 = size;
                            PublicKey publicKey2 = publicKey;
                            int size2 = certificates.size() - 1;
                            DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding2 = dividendSummaryAdapter$ParentViewHolder_ViewBinding;
                            X509Certificate x509Certificate2 = null;
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
                            int i11 = i8;
                            while (size2 >= 0) {
                                X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                                boolean z2 = size2 == certificates.size() + -1;
                                TileAdapter.NtbScbCustomerHolder ntbScbCustomerHolder = smeLoanDetailCommercialItemAdapter$GroupItemViewHolder.write;
                                CertPath certPath3 = certPath;
                                int i12 = i9;
                                List<? extends Certificate> list2 = certificates;
                                int i13 = i6;
                                Set<String> set = initialPolicies;
                                int i14 = i11;
                                TileAdapter.BaseHolder baseHolder3 = baseHolder2;
                                SmeLoanDetailLgItemAdapter$ChildViewHolder smeLoanDetailLgItemAdapter$ChildViewHolder2 = smeLoanDetailLgItemAdapter$ChildViewHolder;
                                boolean z3 = z2;
                                ArrayList[] arrayListArr3 = arrayListArr2;
                                TrustAnchor trustAnchor = IconCompatParcelizer;
                                int i15 = size2;
                                List<PKIXCertPathChecker> list3 = certPathCheckers;
                                C10423xa3461306.IconCompatParcelizer(certPath3, baseHolder2, size2, publicKey2, z3, dividendSummaryAdapter$ParentViewHolder_ViewBinding2, x509Certificate, ntbScbCustomerHolder);
                                C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver(certPath2, i15, smeLoanDetailLgItemAdapter$ChildViewHolder2);
                                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding write2 = C10423xa3461306.write(certPath2, i15, C10423xa3461306.IconCompatParcelizer(certPath3, i15, (Set) hashSet4, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2, (List[]) arrayListArr3, i12));
                                C10423xa3461306.write(certPath2, i15, write2, i13);
                                if (size - i15 == size) {
                                    i = i15;
                                    list = list3;
                                    arrayListArr = arrayListArr3;
                                    smeLoanDetailCommercialItemAdapter$GroupItemViewHolder = this;
                                    smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = write2;
                                    i9 = i12;
                                    i2 = i13;
                                    i11 = i14;
                                } else if (x509Certificate3 == null || x509Certificate3.getVersion() != 1) {
                                    C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver(certPath2, i15);
                                    arrayListArr = arrayListArr3;
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding IconCompatParcelizer2 = C10423xa3461306.IconCompatParcelizer(certPath2, i15, arrayListArr, write2, i14);
                                    C10423xa3461306.read(certPath2, i15, smeLoanDetailLgItemAdapter$ChildViewHolder2);
                                    int write3 = C10423xa3461306.write(certPath2, i15, i13);
                                    int MediaBrowserCompat$ItemReceiver = C10423xa3461306.MediaBrowserCompat$ItemReceiver(certPath2, i15, i14);
                                    int MediaBrowserCompat$CustomActionResultReceiver = C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver(certPath2, i15, i12);
                                    int IconCompatParcelizer3 = C10423xa3461306.IconCompatParcelizer(certPath2, i15, write3);
                                    int read = C10423xa3461306.read(certPath2, i15, MediaBrowserCompat$ItemReceiver);
                                    int MediaBrowserCompat$MediaItem = C10423xa3461306.MediaBrowserCompat$MediaItem(certPath2, i15, MediaBrowserCompat$CustomActionResultReceiver);
                                    C10423xa3461306.MediaBrowserCompat$ItemReceiver(certPath2, i15);
                                    i10 = C10423xa3461306.RatingCompat(certPath2, i15, C10423xa3461306.MediaMetadataCompat(certPath2, i15, i10));
                                    C10423xa3461306.read(certPath2, i15);
                                    Set criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(C10423xa3461306.MediaDescriptionCompat);
                                        hashSet2.remove(C10423xa3461306.read);
                                        hashSet2.remove(C10423xa3461306.MediaMetadataCompat);
                                        hashSet2.remove(C10423xa3461306.IconCompatParcelizer);
                                        hashSet2.remove(C10423xa3461306.RatingCompat);
                                        hashSet2.remove(C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver);
                                        hashSet2.remove(C10423xa3461306.MediaBrowserCompat$SearchResultReceiver);
                                        hashSet2.remove(C10423xa3461306.MediaBrowserCompat$ItemReceiver);
                                        hashSet2.remove(C10423xa3461306.f5821x50fd9e4a);
                                        hashSet2.remove(C10423xa3461306.MediaBrowserCompat$MediaItem);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    list = list3;
                                    C10423xa3461306.IconCompatParcelizer(certPath2, i15, hashSet2, list);
                                    DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate3.getSubjectX500Principal().getEncoded());
                                    try {
                                        i3 = i15;
                                        smeLoanDetailCommercialItemAdapter$GroupItemViewHolder = this;
                                        try {
                                            PublicKey write4 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write((List) certPath.getCertificates(), i3, smeLoanDetailCommercialItemAdapter$GroupItemViewHolder.write);
                                            DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(write4);
                                            smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = IconCompatParcelizer2;
                                            dividendSummaryAdapter$ParentViewHolder_ViewBinding2 = MediaBrowserCompat$CustomActionResultReceiver2;
                                            publicKey2 = write4;
                                            i = i3;
                                            x509Certificate = x509Certificate3;
                                            int i16 = read;
                                            i2 = IconCompatParcelizer3;
                                            i9 = MediaBrowserCompat$MediaItem;
                                            i11 = i16;
                                        } catch (CertPathValidatorException e2) {
                                            e = e2;
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath2, i3);
                                        }
                                    } catch (CertPathValidatorException e3) {
                                        e = e3;
                                        i3 = i15;
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath2, i3);
                                    }
                                } else {
                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, i15);
                                }
                                size2 = i - 1;
                                certPathCheckers = list;
                                x509Certificate2 = x509Certificate3;
                                certificates = list2;
                                initialPolicies = set;
                                IconCompatParcelizer = trustAnchor;
                                arrayListArr2 = arrayListArr;
                                smeLoanDetailLgItemAdapter$ChildViewHolder = smeLoanDetailLgItemAdapter$ChildViewHolder2;
                                baseHolder2 = baseHolder3;
                            }
                            TileAdapter.BaseHolder baseHolder4 = baseHolder2;
                            ArrayList[] arrayListArr4 = arrayListArr2;
                            TrustAnchor trustAnchor2 = IconCompatParcelizer;
                            int i17 = size2;
                            List<PKIXCertPathChecker> list4 = certPathCheckers;
                            Set<String> set2 = initialPolicies;
                            int i18 = i17 + 1;
                            int MediaDescriptionCompat = C10423xa3461306.MediaDescriptionCompat(certPath2, i18, C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver(i6, x509Certificate2));
                            Set criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                hashSet = new HashSet(criticalExtensionOIDs2);
                                hashSet.remove(C10423xa3461306.MediaDescriptionCompat);
                                hashSet.remove(C10423xa3461306.read);
                                hashSet.remove(C10423xa3461306.MediaMetadataCompat);
                                hashSet.remove(C10423xa3461306.IconCompatParcelizer);
                                hashSet.remove(C10423xa3461306.RatingCompat);
                                hashSet.remove(C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver);
                                hashSet.remove(C10423xa3461306.MediaBrowserCompat$SearchResultReceiver);
                                hashSet.remove(C10423xa3461306.MediaBrowserCompat$ItemReceiver);
                                hashSet.remove(C10423xa3461306.f5821x50fd9e4a);
                                hashSet.remove(C10423xa3461306.MediaBrowserCompat$MediaItem);
                                hashSet.remove(C10423xa3461306.write);
                                hashSet.remove(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaMetadataCompat.write);
                            } else {
                                hashSet = new HashSet();
                            }
                            C10423xa3461306.read(certPath2, i18, list4, hashSet);
                            X509Certificate x509Certificate4 = x509Certificate2;
                            int i19 = i17;
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver3 = C10423xa3461306.MediaBrowserCompat$CustomActionResultReceiver(certPath, baseHolder4, set2, i18, arrayListArr4, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2, hashSet4);
                            if (MediaDescriptionCompat > 0 || MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                                return new PKIXCertPathValidatorResult(trustAnchor2, MediaBrowserCompat$CustomActionResultReceiver3, x509Certificate4.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, i19);
                        } catch (CertPathValidatorException e4) {
                            throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (AnnotatedException e5) {
                    throw new CertPathValidatorException(e5.getMessage(), e5, certPath2, certificates.size() - 1);
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
