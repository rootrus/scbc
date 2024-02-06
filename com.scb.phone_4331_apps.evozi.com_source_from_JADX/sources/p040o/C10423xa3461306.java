package p040o;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.jce.provider.PKIXNameConstraintValidatorException;
import p040o.TileAdapter;

/* renamed from: o.SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder_ViewBinding */
final class C10423xa3461306 {
    public static final String IconCompatParcelizer = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.RatingCompat.write;
    public static final String MediaBrowserCompat$CustomActionResultReceiver = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem.write;
    public static final String MediaBrowserCompat$ItemReceiver = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.write;
    public static final String MediaBrowserCompat$MediaItem = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$QueueItem.write;
    public static final String MediaBrowserCompat$SearchResultReceiver = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper.write;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static final String f5821x50fd9e4a = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.setHasDecor.write;
    public static final String MediaDescriptionCompat = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$Token.write;
    public static final String MediaMetadataCompat = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.PlaybackStateCompat$CustomAction.write;
    private static String MediaSessionCompat$QueueItem = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.read.write;
    private static String[] MediaSessionCompat$ResultReceiverWrapper = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final String RatingCompat = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write;
    public static final String read = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver.write;
    public static final String write = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer.write;

    C10423xa3461306() {
    }

    private static void IconCompatParcelizer(FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding, Object obj, X509CRL x509crl) throws AnnotatedException {
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr;
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2;
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder;
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder2;
        try {
            C10402xc503e64f IconCompatParcelizer2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509crl, RatingCompat);
            CurrencyAdapter$CurrencyHolder_ViewBinding currencyAdapter$CurrencyHolder_ViewBinding = null;
            LandingAccountsAdapter$AccountViewHolder landingAccountsAdapter$AccountViewHolder = IconCompatParcelizer2 != null ? new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null;
            if (landingAccountsAdapter$AccountViewHolder != null) {
                if (landingAccountsAdapter$AccountViewHolder.write != null) {
                    SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder = landingAccountsAdapter$AccountViewHolder.write;
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    if (selectableChoiceAdapter$ChoiceHolder.read == 0) {
                        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = selectableChoiceAdapter$ChoiceHolder.write;
                        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof AccountDetailsAdapter$ItemViewHolder) {
                            accountDetailsAdapter$ItemViewHolder2 = (AccountDetailsAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
                        } else {
                            accountDetailsAdapter$ItemViewHolder2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) : null;
                        }
                        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr3 = accountDetailsAdapter$ItemViewHolder2.MediaBrowserCompat$CustomActionResultReceiver;
                        int length = creditCardDetailsAdapter$ItemViewHolderArr3.length;
                        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr4 = new CreditCardDetailsAdapter$ItemViewHolder[length];
                        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr3, 0, creditCardDetailsAdapter$ItemViewHolderArr4, 0, creditCardDetailsAdapter$ItemViewHolderArr3.length);
                        for (int i = 0; i < length; i++) {
                            arrayList.add(creditCardDetailsAdapter$ItemViewHolderArr4[i]);
                        }
                    }
                    if (selectableChoiceAdapter$ChoiceHolder.read == 1) {
                        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
                        try {
                            Enumeration write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509crl.getIssuerX500Principal().getEncoded())).write();
                            while (write2.hasMoreElements()) {
                                companyItemViewHolder_ViewBinding.write.addElement((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement());
                            }
                            companyItemViewHolder_ViewBinding.write.addElement(selectableChoiceAdapter$ChoiceHolder.write);
                            arrayList.add(new CreditCardDetailsAdapter$ItemViewHolder(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding))));
                        } catch (Exception e) {
                            throw new AnnotatedException("Could not read CRL issuer.", e);
                        }
                    }
                    if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.write != null) {
                        SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder2 = fundAccountPagerAdapter$ItemViewHolder_ViewBinding.write;
                        if (selectableChoiceAdapter$ChoiceHolder2.read == 0) {
                            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = selectableChoiceAdapter$ChoiceHolder2.write;
                            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 instanceof AccountDetailsAdapter$ItemViewHolder) {
                                accountDetailsAdapter$ItemViewHolder = (AccountDetailsAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2;
                            } else {
                                accountDetailsAdapter$ItemViewHolder = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2)) : null;
                            }
                            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr5 = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                            creditCardDetailsAdapter$ItemViewHolderArr = new CreditCardDetailsAdapter$ItemViewHolder[creditCardDetailsAdapter$ItemViewHolderArr5.length];
                            System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr5, 0, creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr5.length);
                        } else {
                            creditCardDetailsAdapter$ItemViewHolderArr = null;
                        }
                        if (selectableChoiceAdapter$ChoiceHolder2.read == 1) {
                            if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null) {
                                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr6 = fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr7 = new CreditCardDetailsAdapter$ItemViewHolder[creditCardDetailsAdapter$ItemViewHolderArr6.length];
                                System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr6, 0, creditCardDetailsAdapter$ItemViewHolderArr7, 0, creditCardDetailsAdapter$ItemViewHolderArr6.length);
                                creditCardDetailsAdapter$ItemViewHolderArr2 = creditCardDetailsAdapter$ItemViewHolderArr7;
                            } else {
                                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr8 = new CreditCardDetailsAdapter$ItemViewHolder[1];
                                try {
                                    creditCardDetailsAdapter$ItemViewHolderArr8[0] = new CreditCardDetailsAdapter$ItemViewHolder(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(obj).ParcelableVolumeInfo()));
                                    creditCardDetailsAdapter$ItemViewHolderArr2 = creditCardDetailsAdapter$ItemViewHolderArr8;
                                } catch (Exception e2) {
                                    throw new AnnotatedException("Could not read certificate issuer.", e2);
                                }
                            }
                            for (int i2 = 0; i2 < creditCardDetailsAdapter$ItemViewHolderArr.length; i2++) {
                                Enumeration write3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr[i2].MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem()).write();
                                CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding2 = new CompanyItemViewHolder_ViewBinding();
                                while (write3.hasMoreElements()) {
                                    companyItemViewHolder_ViewBinding2.write.addElement((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write3.nextElement());
                                }
                                companyItemViewHolder_ViewBinding2.write.addElement(selectableChoiceAdapter$ChoiceHolder2.write);
                                creditCardDetailsAdapter$ItemViewHolderArr[i2] = new CreditCardDetailsAdapter$ItemViewHolder(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding2)));
                            }
                        }
                        if (creditCardDetailsAdapter$ItemViewHolderArr != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= creditCardDetailsAdapter$ItemViewHolderArr.length) {
                                    break;
                                } else if (arrayList.contains(creditCardDetailsAdapter$ItemViewHolderArr[i3])) {
                                    z = true;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        if (!z) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null) {
                        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr9 = fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                        int length2 = creditCardDetailsAdapter$ItemViewHolderArr9.length;
                        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr10 = new CreditCardDetailsAdapter$ItemViewHolder[length2];
                        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr9, 0, creditCardDetailsAdapter$ItemViewHolderArr10, 0, creditCardDetailsAdapter$ItemViewHolderArr9.length);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                break;
                            } else if (arrayList.contains(creditCardDetailsAdapter$ItemViewHolderArr10[i4])) {
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else {
                        throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                    }
                }
                try {
                    C10402xc503e64f IconCompatParcelizer3 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Extension) obj, MediaBrowserCompat$ItemReceiver);
                    if (IconCompatParcelizer3 != null) {
                        currencyAdapter$CurrencyHolder_ViewBinding = new CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3));
                    }
                    if (obj instanceof X509Certificate) {
                        if (landingAccountsAdapter$AccountViewHolder.read && currencyAdapter$CurrencyHolder_ViewBinding != null && currencyAdapter$CurrencyHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        } else if (landingAccountsAdapter$AccountViewHolder.MediaBrowserCompat$CustomActionResultReceiver && (currencyAdapter$CurrencyHolder_ViewBinding == null || !currencyAdapter$CurrencyHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (landingAccountsAdapter$AccountViewHolder.IconCompatParcelizer) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void MediaBrowserCompat$ItemReceiver(p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding r6, java.lang.Object r7, java.security.cert.X509CRL r8) throws org.spongycastle.jce.provider.AnnotatedException {
        /*
            java.lang.String r0 = RatingCompat
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r0 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r8, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            if (r0 == 0) goto L_0x0016
            o.LandingAccountsAdapter$AccountViewHolder r3 = new o.LandingAccountsAdapter$AccountViewHolder
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r0 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r0)
            r3.<init>(r0)
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            boolean r0 = r3.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x001d
            r0 = r1
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            javax.security.auth.x500.X500Principal r3 = r8.getIssuerX500Principal()     // Catch:{ IOException -> 0x00a3 }
            byte[] r3 = r3.getEncoded()     // Catch:{ IOException -> 0x00a3 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r3 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ IOException -> 0x00a3 }
            byte[] r3 = r3.ParcelableVolumeInfo()     // Catch:{ IOException -> 0x00a3 }
            o.AccountDetailsAdapter$ItemViewHolder r4 = r6.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x0080
            o.AccountDetailsAdapter$ItemViewHolder r6 = r6.MediaBrowserCompat$ItemReceiver
            o.CreditCardDetailsAdapter$ItemViewHolder[] r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r6.length
            o.CreditCardDetailsAdapter$ItemViewHolder[] r8 = new p040o.CreditCardDetailsAdapter$ItemViewHolder[r7]
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r2, r8, r2, r4)
            r6 = r2
        L_0x003e:
            if (r2 >= r7) goto L_0x0067
            r4 = r8[r2]
            int r4 = r4.IconCompatParcelizer
            r5 = 4
            if (r4 != r5) goto L_0x0064
            r4 = r8[r2]     // Catch:{ IOException -> 0x005b }
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x005b }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$MediaItem()     // Catch:{ IOException -> 0x005b }
            byte[] r4 = r4.ParcelableVolumeInfo()     // Catch:{ IOException -> 0x005b }
            boolean r4 = p040o.C6958xd50139e8.write(r4, r3)     // Catch:{ IOException -> 0x005b }
            if (r4 == 0) goto L_0x0064
            r6 = r1
            goto L_0x0064
        L_0x005b:
            r6 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r7 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r8 = "CRL issuer information from distribution point cannot be decoded."
            r7.<init>(r8, r6)
            throw r7
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0067:
            if (r6 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            org.spongycastle.jce.provider.AnnotatedException r6 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r7 = "Distribution point contains cRLIssuer field but CRL is not indirect."
            r6.<init>(r7)
            throw r6
        L_0x0074:
            if (r6 == 0) goto L_0x0078
            r1 = r6
            goto L_0x0098
        L_0x0078:
            org.spongycastle.jce.provider.AnnotatedException r6 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r7 = "CRL issuer of CRL does not match CRL issuer of distribution point."
            r6.<init>(r7)
            throw r6
        L_0x0080:
            javax.security.auth.x500.X500Principal r6 = r8.getIssuerX500Principal()
            byte[] r6 = r6.getEncoded()
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r6 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r7 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = r2
        L_0x0098:
            if (r1 == 0) goto L_0x009b
            return
        L_0x009b:
            org.spongycastle.jce.provider.AnnotatedException r6 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r7 = "Cannot find matching CRL issuer for certificate."
            r6.<init>(r7)
            throw r6
        L_0x00a3:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Exception encoding CRL issuer: "
            r7.append(r8)
            java.lang.String r8 = r6.getMessage()
            r7.append(r8)
            org.spongycastle.jce.provider.AnnotatedException r8 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10423xa3461306.MediaBrowserCompat$ItemReceiver(o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding, java.lang.Object, java.security.cert.X509CRL):void");
    }

    private static SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder MediaBrowserCompat$CustomActionResultReceiver(X509CRL x509crl, FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding) throws AnnotatedException {
        SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder;
        SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder2;
        try {
            C10402xc503e64f IconCompatParcelizer2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509crl, RatingCompat);
            LandingAccountsAdapter$AccountViewHolder landingAccountsAdapter$AccountViewHolder = IconCompatParcelizer2 != null ? new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null;
            if (landingAccountsAdapter$AccountViewHolder != null && landingAccountsAdapter$AccountViewHolder.MediaMetadataCompat != null && fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver != null) {
                SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder3 = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
                SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder4 = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(landingAccountsAdapter$AccountViewHolder.MediaMetadataCompat);
                SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder5 = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder();
                smeLoanDetailLgItemAdapter$ClaimedItemViewHolder5.IconCompatParcelizer |= new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(smeLoanDetailLgItemAdapter$ClaimedItemViewHolder3.IconCompatParcelizer & smeLoanDetailLgItemAdapter$ClaimedItemViewHolder4.IconCompatParcelizer).IconCompatParcelizer;
                return smeLoanDetailLgItemAdapter$ClaimedItemViewHolder5;
            } else if ((landingAccountsAdapter$AccountViewHolder == null || landingAccountsAdapter$AccountViewHolder.MediaMetadataCompat == null) && fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == null) {
                return SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                if (fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    smeLoanDetailLgItemAdapter$ClaimedItemViewHolder = SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    smeLoanDetailLgItemAdapter$ClaimedItemViewHolder = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(fundAccountPagerAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (landingAccountsAdapter$AccountViewHolder == null) {
                    smeLoanDetailLgItemAdapter$ClaimedItemViewHolder2 = SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    smeLoanDetailLgItemAdapter$ClaimedItemViewHolder2 = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(landingAccountsAdapter$AccountViewHolder.MediaMetadataCompat);
                }
                SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder smeLoanDetailLgItemAdapter$ClaimedItemViewHolder6 = new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder();
                smeLoanDetailLgItemAdapter$ClaimedItemViewHolder6.IconCompatParcelizer |= new SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder(smeLoanDetailLgItemAdapter$ClaimedItemViewHolder.IconCompatParcelizer & smeLoanDetailLgItemAdapter$ClaimedItemViewHolder2.IconCompatParcelizer).IconCompatParcelizer;
                return smeLoanDetailLgItemAdapter$ClaimedItemViewHolder6;
            }
        } catch (Exception e) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    static {
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaDescriptionCompat;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
    }

    private static Set IconCompatParcelizer(X509CRL x509crl, X509Certificate x509Certificate, PublicKey publicKey, TileAdapter.BaseHolder baseHolder, List list, TileAdapter.NtbScbCustomerHolder ntbScbCustomerHolder) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509crl.getIssuerX500Principal().getEncoded()).ParcelableVolumeInfo());
            TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding = new TileAdapter.AddShortcutHolder_ViewBinding(new TileAdapter.AddShortcutHolder_ViewBinding.read(x509CertSelector).IconCompatParcelizer, (byte) 0);
            try {
                Collection<X509Certificate> MediaBrowserCompat$CustomActionResultReceiver2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) baseHolder.MediaBrowserCompat$CustomActionResultReceiver);
                MediaBrowserCompat$CustomActionResultReceiver2.addAll(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) baseHolder.MediaBrowserCompat$ItemReceiver.getCertStores()));
                MediaBrowserCompat$CustomActionResultReceiver2.add(x509Certificate);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (X509Certificate x509Certificate2 : MediaBrowserCompat$CustomActionResultReceiver2) {
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding smeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding = new SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver = new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver(baseHolder);
                            tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = new TileAdapter.AddShortcutHolder_ViewBinding(new TileAdapter.AddShortcutHolder_ViewBinding.read(x509CertSelector2).IconCompatParcelizer, (byte) 0);
                            if (list.contains(x509Certificate2)) {
                                tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.RatingCompat = false;
                            } else {
                                tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.RatingCompat = true;
                            }
                            List<? extends Certificate> certificates = smeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding.engineBuild(new TileAdapter.BaseHolder_ViewBinding(new TileAdapter.BaseHolder_ViewBinding.read(new TileAdapter.BaseHolder(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver, (byte) 0)), (byte) 0)).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write((List) certificates, 0, ntbScbCustomerHolder));
                        } catch (CertPathBuilderException e) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length >= 7 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                } else if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                } else {
                    throw annotatedException;
                }
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    private static PublicKey MediaBrowserCompat$ItemReceiver(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e);
    }

    private static X509CRL write(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e);
    }

    protected static SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding IconCompatParcelizer(CertPath certPath, int i, List[] listArr, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, int i2) throws CertPathValidatorException {
        boolean z;
        Set set;
        PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding;
        CertPath certPath2 = certPath;
        int i3 = i;
        List[] listArr2 = listArr;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size() - i3;
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509Certificate, MediaMetadataCompat));
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
            }
            HashMap hashMap = new HashMap();
            HashSet<String> hashSet = new HashSet<>();
            boolean z2 = false;
            for (int i4 = 0; i4 < MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(); i4++) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) MediaBrowserCompat$CustomActionResultReceiver2.read(i4);
                String str = ((HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0)).write;
                String str2 = ((HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1)).write;
                if (!hashMap.containsKey(str)) {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(str2);
                    hashMap.put(str, hashSet2);
                    hashSet.add(str);
                } else {
                    ((Set) hashMap.get(str)).add(str2);
                }
            }
            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
            for (String str3 : hashSet) {
                if (i2 > 0) {
                    Iterator it = listArr2[size].iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = z2;
                            break;
                        }
                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) it.next();
                        if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3.getValidPolicy().equals(str3)) {
                            smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3.read = (Set) hashMap.get(str3);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        Iterator it2 = listArr2[size].iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) it2.next();
                            if (RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4.getValidPolicy())) {
                                try {
                                    Enumeration write2 = ((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509Certificate, read)).write();
                                    while (true) {
                                        if (!write2.hasMoreElements()) {
                                            set = null;
                                            break;
                                        }
                                        try {
                                            Object nextElement = write2.nextElement();
                                            if (nextElement == null || (nextElement instanceof PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding)) {
                                                pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding = (PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding) nextElement;
                                            } else {
                                                pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding = new PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement));
                                            }
                                            if (RFC3280CertPathUtilities.ANY_POLICY.equals(pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.write)) {
                                                try {
                                                    set = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding.write);
                                                    break;
                                                } catch (CertPathValidatorException e) {
                                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", e, certPath2, i3);
                                                }
                                            }
                                        } catch (Exception e2) {
                                            throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath2, i3);
                                        }
                                    }
                                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(read) : z2;
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4.getParent();
                                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5.getValidPolicy())) {
                                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6 = r5;
                                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7 = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), size, (Set) hashMap.get(str3), smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5, set, str3, contains);
                                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding8 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5;
                                        smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding8.write.add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6);
                                        smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding8;
                                        listArr2[size].add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6);
                                    }
                                } catch (AnnotatedException e3) {
                                    throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", e3, certPath2, i3);
                                }
                            }
                        }
                    }
                } else if (i2 <= 0) {
                    Iterator it3 = listArr2[size].iterator();
                    while (it3.hasNext()) {
                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding9 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) it3.next();
                        if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding9.getValidPolicy().equals(str3)) {
                            ((SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding9.getParent()).write.remove(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding9);
                            it3.remove();
                            for (int i5 = size - 1; i5 >= 0; i5--) {
                                List list = listArr2[i5];
                                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding10 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2;
                                for (int i6 = 0; i6 < list.size(); i6++) {
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding11 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list.get(i6);
                                    if (!(!smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding11.write.isEmpty()) && (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding10 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding10, listArr2, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding11)) == null) {
                                        break;
                                    }
                                }
                                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding10;
                            }
                        }
                    }
                }
                z2 = false;
            }
            return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2;
        } catch (AnnotatedException e4) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e4, certPath2, i3);
        }
    }

    protected static void MediaBrowserCompat$CustomActionResultReceiver(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaMetadataCompat));
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                int i2 = 0;
                while (i2 < MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver()) {
                    try {
                        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver3 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2.read(i2));
                        HmlBusinessInfoAdapter$BankAccountViewHolder write2 = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) MediaBrowserCompat$CustomActionResultReceiver3.read(0));
                        HmlBusinessInfoAdapter$BankAccountViewHolder write3 = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) MediaBrowserCompat$CustomActionResultReceiver3.read(1));
                        if (RFC3280CertPathUtilities.ANY_POLICY.equals(write2.write)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        } else if (!RFC3280CertPathUtilities.ANY_POLICY.equals(write3.write)) {
                            i2++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", (Throwable) null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    protected static void write(CertPath certPath, int i, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, int i2) throws CertPathValidatorException {
        if (i2 <= 0 && smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", (Throwable) null, certPath, i);
        }
    }

    protected static SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding write(CertPath certPath, int i, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) throws CertPathValidatorException {
        try {
            if (InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), read)) == null) {
                return null;
            }
            return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
        } catch (AnnotatedException e) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    protected static void MediaBrowserCompat$CustomActionResultReceiver(CertPath certPath, int i, SmeLoanDetailLgItemAdapter$ChildViewHolder smeLoanDetailLgItemAdapter$ChildViewHolder) throws CertPathValidatorException {
        int i2;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        if (!DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate) || size - i >= size) {
            try {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate.getSubjectX500Principal().getEncoded()).ParcelableVolumeInfo());
                try {
                    SmeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver(smeLoanDetailLgItemAdapter$ChildViewHolder.read, MediaBrowserCompat$CustomActionResultReceiver2);
                    SmeLoanDetailLgItemAdapter$ChildViewHolder.read(smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver2);
                    try {
                        C10402xc503e64f IconCompatParcelizer2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509Certificate, f5821x50fd9e4a);
                        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null;
                        DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver3 = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
                        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = LtfSummaryAdapter$LtfChildViewHolder.IconCompatParcelizer;
                        DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr = new DividendSummaryAdapter$ChildViewHolder_ViewBinding[MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver.length];
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver;
                            if (i4 == dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2.length) {
                                break;
                            }
                            DividendSummaryAdapter$ChildViewHolder_ViewBinding dividendSummaryAdapter$ChildViewHolder_ViewBinding = dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2[i4];
                            boolean z = true;
                            if (dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer.IconCompatParcelizer.size() <= 1) {
                                z = false;
                            }
                            if (z) {
                                InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer3 = dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer();
                                int i6 = 0;
                                while (true) {
                                    if (i6 == IconCompatParcelizer3.length) {
                                        break;
                                    } else if (IconCompatParcelizer3[i6].IconCompatParcelizer.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                                        i2 = i5 + 1;
                                        dividendSummaryAdapter$ChildViewHolder_ViewBindingArr[i5] = dividendSummaryAdapter$ChildViewHolder_ViewBinding;
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else if (dividendSummaryAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                                i2 = i5 + 1;
                                dividendSummaryAdapter$ChildViewHolder_ViewBindingArr[i5] = dividendSummaryAdapter$ChildViewHolder_ViewBinding;
                            } else {
                                i4++;
                            }
                            i5 = i2;
                            i4++;
                        }
                        DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr3 = new DividendSummaryAdapter$ChildViewHolder_ViewBinding[i5];
                        System.arraycopy(dividendSummaryAdapter$ChildViewHolder_ViewBindingArr, 0, dividendSummaryAdapter$ChildViewHolder_ViewBindingArr3, 0, i5);
                        int i7 = 0;
                        while (i7 != i5) {
                            CreditCardDetailsAdapter$ItemViewHolder creditCardDetailsAdapter$ItemViewHolder = new CreditCardDetailsAdapter$ItemViewHolder(((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) dividendSummaryAdapter$ChildViewHolder_ViewBindingArr3[i7].MediaBrowserCompat$ItemReceiver().write).MediaMetadataCompat());
                            try {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer(creditCardDetailsAdapter$ItemViewHolder);
                                smeLoanDetailLgItemAdapter$ChildViewHolder.write(creditCardDetailsAdapter$ItemViewHolder);
                                i7++;
                            } catch (PKIXNameConstraintValidatorException e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (accountDetailsAdapter$ItemViewHolder != null) {
                            try {
                                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                                int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
                                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
                                System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                                while (i3 < length) {
                                    try {
                                        smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer(creditCardDetailsAdapter$ItemViewHolderArr2[i3]);
                                        smeLoanDetailLgItemAdapter$ChildViewHolder.write(creditCardDetailsAdapter$ItemViewHolderArr2[i3]);
                                        i3++;
                                    } catch (PKIXNameConstraintValidatorException e2) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (Exception e3) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (PKIXNameConstraintValidatorException e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    protected static SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding IconCompatParcelizer(CertPath certPath, int i, Set set, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, List[] listArr, int i2) throws CertPathValidatorException {
        PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding;
        String str;
        PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding2;
        CertPath certPath2 = certPath;
        int i3 = i;
        Set set2 = set;
        List[] listArr2 = listArr;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i4 = size - i3;
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509Certificate, read));
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null || smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding == null) {
                return null;
            }
            Enumeration write2 = MediaBrowserCompat$CustomActionResultReceiver2.write();
            HashSet hashSet = new HashSet();
            while (write2.hasMoreElements()) {
                Object nextElement = write2.nextElement();
                if (nextElement == null || (nextElement instanceof PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding)) {
                    pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding2 = (PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding) nextElement;
                } else {
                    pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding2 = new PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement));
                }
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver;
                hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                if (!RFC3280CertPathUtilities.ANY_POLICY.equals(hmlBusinessInfoAdapter$BankAccountViewHolder.write)) {
                    try {
                        Set write3 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding2.write);
                        if (!DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(i4, listArr2, hmlBusinessInfoAdapter$BankAccountViewHolder, write3)) {
                            DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(i4, listArr2, hmlBusinessInfoAdapter$BankAccountViewHolder, write3);
                        }
                    } catch (CertPathValidatorException e) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e, certPath2, i3);
                    }
                }
            }
            if (set.isEmpty() || set2.contains(RFC3280CertPathUtilities.ANY_POLICY)) {
                set.clear();
                set2.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object next : set) {
                    if (hashSet.contains(next)) {
                        hashSet2.add(next);
                    }
                }
                set.clear();
                set2.addAll(hashSet2);
            }
            if (i2 > 0 || (i4 < size && DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate))) {
                Enumeration write4 = MediaBrowserCompat$CustomActionResultReceiver2.write();
                while (true) {
                    if (!write4.hasMoreElements()) {
                        break;
                    }
                    Object nextElement2 = write4.nextElement();
                    if (nextElement2 == null || (nextElement2 instanceof PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding)) {
                        pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding = (PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding) nextElement2;
                    } else {
                        pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding = new PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement2));
                    }
                    if (RFC3280CertPathUtilities.ANY_POLICY.equals(pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.write)) {
                        Set write5 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(pieChartLegendAdapter$ChartEntryViewHolder_ViewBinding.write);
                        List list = listArr2[i4 - 1];
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list.get(i5);
                            for (Object next2 : smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.getExpectedPolicies()) {
                                if (next2 instanceof String) {
                                    str = (String) next2;
                                } else if (next2 instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) {
                                    str = ((HmlBusinessInfoAdapter$BankAccountViewHolder) next2).write;
                                }
                                String str2 = str;
                                Iterator children = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.getChildren();
                                boolean z = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) children.next()).getValidPolicy())) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3 = r6;
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2;
                                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5 = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), i4, hashSet3, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2, write5, str2, false);
                                    smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4.write.add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3);
                                    smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4;
                                    listArr2[i4].add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3);
                                    smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4;
                                }
                            }
                        }
                    }
                }
            }
            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                List list2 = listArr2[i6];
                int i7 = 0;
                while (true) {
                    if (i7 >= list2.size()) {
                        break;
                    }
                    SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list2.get(i7);
                    if (!(!smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7.write.isEmpty()) && (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6, listArr2, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7)) == null) {
                        break;
                    }
                    i7++;
                }
            }
            Set criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(read);
                List list3 = listArr2[i4];
                for (int i8 = 0; i8 < list3.size(); i8++) {
                    ((SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list3.get(i8)).MediaBrowserCompat$ItemReceiver = contains;
                }
            }
            return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath2, i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.TileAdapter$BaseHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: o.TileAdapter$BaseHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: o.TileAdapter$BaseHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: o.PersonalLimitAdapter$LimitCustomViewHolder} */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void IconCompatParcelizer(java.security.cert.CertPath r27, p040o.TileAdapter.BaseHolder r28, int r29, java.security.PublicKey r30, boolean r31, p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r32, java.security.cert.X509Certificate r33, p040o.TileAdapter.NtbScbCustomerHolder r34) throws org.spongycastle.jce.exception.ExtCertPathValidatorException {
        /*
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r32
            java.lang.String r5 = "Could not validate certificate: "
            java.util.List r15 = r27.getCertificates()
            java.lang.Object r0 = r15.get(r3)
            r14 = r0
            java.security.cert.X509Certificate r14 = (java.security.cert.X509Certificate) r14
            if (r31 != 0) goto L_0x002c
            java.security.cert.PKIXParameters r0 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ GeneralSecurityException -> 0x0023 }
            java.lang.String r0 = r0.getSigProvider()     // Catch:{ GeneralSecurityException -> 0x0023 }
            r13 = r30
            p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read(r14, r13, r0)     // Catch:{ GeneralSecurityException -> 0x0023 }
            goto L_0x002e
        L_0x0023:
            r0 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r2 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r4 = "Could not validate certificate signature."
            r2.<init>(r4, r0, r1, r3)
            throw r2
        L_0x002c:
            r13 = r30
        L_0x002e:
            java.util.Date r0 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write((p040o.TileAdapter.BaseHolder) r2, (java.security.cert.CertPath) r1, (int) r3)     // Catch:{ CertificateExpiredException -> 0x0299, CertificateNotYetValidException -> 0x027f, AnnotatedException -> 0x0276 }
            r14.checkValidity(r0)     // Catch:{ CertificateExpiredException -> 0x0299, CertificateNotYetValidException -> 0x027f, AnnotatedException -> 0x0276 }
            boolean r0 = r2.MediaMetadataCompat
            if (r0 == 0) goto L_0x0240
            java.util.Date r16 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write((p040o.TileAdapter.BaseHolder) r2, (java.security.cert.CertPath) r1, (int) r3)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r0 = write     // Catch:{ Exception -> 0x0220 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r0 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r14, r0)     // Catch:{ Exception -> 0x0220 }
            if (r0 == 0) goto L_0x004f
            o.FundSwitchSearchListAdapter$FundHolder r6 = new o.FundSwitchSearchListAdapter$FundHolder     // Catch:{ Exception -> 0x0220 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r0 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r0)     // Catch:{ Exception -> 0x0220 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0220 }
            goto L_0x0050
        L_0x004f:
            r6 = 0
        L_0x0050:
            o.TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver r0 = new o.TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver     // Catch:{ AnnotatedException -> 0x0229 }
            r0.<init>((p040o.TileAdapter.BaseHolder) r2)     // Catch:{ AnnotatedException -> 0x0229 }
            java.util.Map<o.CreditCardDetailsAdapter$ItemViewHolder, o.ShortcutAdapter$MyViewHolder> r7 = r2.write     // Catch:{ AnnotatedException -> 0x0217 }
            java.util.List r7 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read(r6, r7)     // Catch:{ AnnotatedException -> 0x0217 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ AnnotatedException -> 0x0217 }
        L_0x005f:
            boolean r8 = r7.hasNext()     // Catch:{ AnnotatedException -> 0x0217 }
            if (r8 == 0) goto L_0x0071
            java.lang.Object r8 = r7.next()     // Catch:{ AnnotatedException -> 0x0217 }
            o.ShortcutAdapter$MyViewHolder r8 = (p040o.ShortcutAdapter$MyViewHolder) r8     // Catch:{ AnnotatedException -> 0x0217 }
            java.util.List<o.ShortcutAdapter$MyViewHolder> r9 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ AnnotatedException -> 0x0217 }
            r9.add(r8)     // Catch:{ AnnotatedException -> 0x0217 }
            goto L_0x005f
        L_0x0071:
            o.PersonalLimitAdapter$LimitCustomViewHolder r12 = new o.PersonalLimitAdapter$LimitCustomViewHolder     // Catch:{ AnnotatedException -> 0x0229 }
            r12.<init>()     // Catch:{ AnnotatedException -> 0x0229 }
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r11 = new o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder     // Catch:{ AnnotatedException -> 0x0229 }
            r11.<init>()     // Catch:{ AnnotatedException -> 0x0229 }
            o.TileAdapter$BaseHolder r10 = new o.TileAdapter$BaseHolder     // Catch:{ AnnotatedException -> 0x0229 }
            r9 = 0
            r10.<init>(r0, r9)     // Catch:{ AnnotatedException -> 0x0229 }
            r8 = 11
            r17 = 1
            if (r6 == 0) goto L_0x0117
            o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding[] r7 = r6.IconCompatParcelizer()     // Catch:{ Exception -> 0x010d }
            r6 = r9
            r18 = r6
            r0 = 0
        L_0x008f:
            int r9 = r7.length     // Catch:{ AnnotatedException -> 0x0229 }
            if (r6 >= r9) goto L_0x00ff
            int r9 = r12.write     // Catch:{ AnnotatedException -> 0x0229 }
            if (r9 != r8) goto L_0x00ff
            int r9 = r11.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r8 = p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ AnnotatedException -> 0x0229 }
            int r8 = r8.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            if (r9 != r8) goto L_0x00a1
            r8 = r17
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            if (r8 != 0) goto L_0x00f4
            r8 = r7[r6]     // Catch:{ AnnotatedException -> 0x00cf }
            r20 = r6
            r6 = r8
            r21 = r7
            r7 = r10
            r9 = 11
            r8 = r14
            r5 = r9
            r19 = 0
            r9 = r16
            r22 = r10
            r10 = r33
            r23 = r11
            r11 = r30
            r24 = r12
            r13 = r23
            r25 = r14
            r14 = r15
            r26 = r15
            r15 = r34
            read(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ AnnotatedException -> 0x00cd }
            r18 = r17
            goto L_0x00e2
        L_0x00cd:
            r0 = move-exception
            goto L_0x00e2
        L_0x00cf:
            r0 = move-exception
            r20 = r6
            r21 = r7
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r14
            r26 = r15
            r5 = 11
            r19 = 0
        L_0x00e2:
            int r6 = r20 + 1
            r13 = r30
            r8 = r5
            r7 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r14 = r25
            r15 = r26
            goto L_0x008f
        L_0x00f4:
            r23 = r11
            r24 = r12
            r25 = r14
            r26 = r15
            r5 = 11
            goto L_0x0108
        L_0x00ff:
            r5 = r8
            r23 = r11
            r24 = r12
            r25 = r14
            r26 = r15
        L_0x0108:
            r19 = 0
            r15 = r24
            goto L_0x0127
        L_0x010d:
            r0 = move-exception
            r2 = r0
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r4 = "Distribution points could not be read."
            r0.<init>(r4, r2)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r0     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x0117:
            r5 = r8
            r19 = r9
            r23 = r11
            r24 = r12
            r25 = r14
            r26 = r15
            r18 = r19
            r15 = r24
            r0 = 0
        L_0x0127:
            int r6 = r15.write     // Catch:{ AnnotatedException -> 0x0229 }
            if (r6 != r5) goto L_0x0191
            r14 = r23
            int r6 = r14.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r7 = p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ AnnotatedException -> 0x0229 }
            int r7 = r7.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            if (r6 != r7) goto L_0x0138
            r9 = r17
            goto L_0x013a
        L_0x0138:
            r9 = r19
        L_0x013a:
            if (r9 != 0) goto L_0x0181
            o.CompanyItemViewHolder r6 = new o.CompanyItemViewHolder     // Catch:{ Exception -> 0x0184 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r7 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r25)     // Catch:{ Exception -> 0x0184 }
            byte[] r7 = r7.ParcelableVolumeInfo()     // Catch:{ Exception -> 0x0184 }
            r6.<init>((byte[]) r7)     // Catch:{ Exception -> 0x0184 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r6 = r6.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0184 }
            o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding r7 = new o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding     // Catch:{ AnnotatedException -> 0x0180 }
            o.SelectableChoiceAdapter$ChoiceHolder r8 = new o.SelectableChoiceAdapter$ChoiceHolder     // Catch:{ AnnotatedException -> 0x0180 }
            o.AccountDetailsAdapter$ItemViewHolder r9 = new o.AccountDetailsAdapter$ItemViewHolder     // Catch:{ AnnotatedException -> 0x0180 }
            o.CreditCardDetailsAdapter$ItemViewHolder r10 = new o.CreditCardDetailsAdapter$ItemViewHolder     // Catch:{ AnnotatedException -> 0x0180 }
            r11 = 4
            r10.<init>(r11, r6)     // Catch:{ AnnotatedException -> 0x0180 }
            r9.<init>((p040o.CreditCardDetailsAdapter$ItemViewHolder) r10)     // Catch:{ AnnotatedException -> 0x0180 }
            r8.<init>((p040o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) r9)     // Catch:{ AnnotatedException -> 0x0180 }
            r7.<init>((p040o.SelectableChoiceAdapter$ChoiceHolder) r8)     // Catch:{ AnnotatedException -> 0x0180 }
            java.lang.Object r2 = r28.clone()     // Catch:{ AnnotatedException -> 0x0180 }
            o.TileAdapter$BaseHolder r2 = (p040o.TileAdapter.BaseHolder) r2     // Catch:{ AnnotatedException -> 0x0180 }
            r6 = r7
            r7 = r2
            r8 = r25
            r9 = r16
            r10 = r33
            r11 = r30
            r12 = r15
            r13 = r14
            r2 = r14
            r14 = r26
            r5 = r15
            r15 = r34
            read(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ AnnotatedException -> 0x018f }
            r18 = r17
            goto L_0x0194
        L_0x0180:
            r0 = move-exception
        L_0x0181:
            r2 = r14
            r5 = r15
            goto L_0x0194
        L_0x0184:
            r0 = move-exception
            r2 = r14
            r5 = r15
            org.spongycastle.jce.provider.AnnotatedException r6 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x018f }
            java.lang.String r7 = "Issuer from certificate for CRL could not be reencoded."
            r6.<init>(r7, r0)     // Catch:{ AnnotatedException -> 0x018f }
            throw r6     // Catch:{ AnnotatedException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            goto L_0x0194
        L_0x0191:
            r5 = r15
            r2 = r23
        L_0x0194:
            if (r18 != 0) goto L_0x01a3
            boolean r2 = r0 instanceof org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            if (r2 == 0) goto L_0x019b
            throw r0     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x019b:
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r4 = "No valid CRL found."
            r2.<init>(r4, r0)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r2     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x01a3:
            int r0 = r5.write     // Catch:{ AnnotatedException -> 0x0229 }
            r6 = 11
            if (r0 != r6) goto L_0x01d0
            int r0 = r2.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r2 = p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ AnnotatedException -> 0x0229 }
            int r2 = r2.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            if (r0 != r2) goto L_0x01b4
            r9 = r17
            goto L_0x01b6
        L_0x01b4:
            r9 = r19
        L_0x01b6:
            r0 = 12
            if (r9 != 0) goto L_0x01c2
            int r2 = r5.write     // Catch:{ AnnotatedException -> 0x0229 }
            r6 = 11
            if (r2 != r6) goto L_0x01c2
            r5.write = r0     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x01c2:
            int r2 = r5.write     // Catch:{ AnnotatedException -> 0x0229 }
            if (r2 == r0) goto L_0x01c8
            goto L_0x0242
        L_0x01c8:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r2 = "Certificate status could not be determined."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r0     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x01d0:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss Z"
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)     // Catch:{ AnnotatedException -> 0x0229 }
            r0.setTimeZone(r2)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AnnotatedException -> 0x0229 }
            r2.<init>()     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r4 = "Certificate revocation after "
            r2.append(r4)     // Catch:{ AnnotatedException -> 0x0229 }
            java.util.Date r4 = r5.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r0 = r0.format(r4)     // Catch:{ AnnotatedException -> 0x0229 }
            r2.append(r0)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r0 = r2.toString()     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AnnotatedException -> 0x0229 }
            r2.<init>()     // Catch:{ AnnotatedException -> 0x0229 }
            r2.append(r0)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r0 = ", reason: "
            r2.append(r0)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String[] r0 = MediaSessionCompat$ResultReceiverWrapper     // Catch:{ AnnotatedException -> 0x0229 }
            int r4 = r5.write     // Catch:{ AnnotatedException -> 0x0229 }
            r0 = r0[r4]     // Catch:{ AnnotatedException -> 0x0229 }
            r2.append(r0)     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r0 = r2.toString()     // Catch:{ AnnotatedException -> 0x0229 }
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            r2.<init>(r0)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r2     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x0217:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r4 = "No additional CRL locations could be decoded from CRL distribution point extension."
            r2.<init>(r4, r0)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r2     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x0220:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0229 }
            java.lang.String r4 = "CRL distribution point extension could not be read."
            r2.<init>(r4, r0)     // Catch:{ AnnotatedException -> 0x0229 }
            throw r2     // Catch:{ AnnotatedException -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L_0x0235
            java.lang.Throwable r2 = r0.getCause()
            goto L_0x0236
        L_0x0235:
            r2 = r0
        L_0x0236:
            org.spongycastle.jce.exception.ExtCertPathValidatorException r4 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = r0.getMessage()
            r4.<init>(r0, r2, r1, r3)
            throw r4
        L_0x0240:
            r25 = r14
        L_0x0242:
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r0 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r25)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x024d
            return
        L_0x024d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "IssuerName("
            r0.append(r2)
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r2 = p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding.read(r25)
            r0.append(r2)
            java.lang.String r2 = ") does not match SubjectName("
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ") of signing certificate."
            r0.append(r2)
            org.spongycastle.jce.exception.ExtCertPathValidatorException r2 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r0 = r0.toString()
            r4 = 0
            r2.<init>(r0, r4, r1, r3)
            throw r2
        L_0x0276:
            r0 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r2 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r4 = "Could not validate time of certificate."
            r2.<init>(r4, r0, r1, r3)
            throw r2
        L_0x027f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            org.spongycastle.jce.exception.ExtCertPathValidatorException r4 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r2 = r2.toString()
            r4.<init>(r2, r0, r1, r3)
            throw r4
        L_0x0299:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            org.spongycastle.jce.exception.ExtCertPathValidatorException r4 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r2 = r2.toString()
            r4.<init>(r2, r0, r1, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10423xa3461306.IconCompatParcelizer(java.security.cert.CertPath, o.TileAdapter$BaseHolder, int, java.security.PublicKey, boolean, o.DividendSummaryAdapter$ParentViewHolder_ViewBinding, java.security.cert.X509Certificate, o.TileAdapter$NtbScbCustomerHolder):void");
    }

    protected static int IconCompatParcelizer(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$SearchResultReceiver));
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                Enumeration write2 = MediaBrowserCompat$CustomActionResultReceiver2.write();
                while (true) {
                    if (!write2.hasMoreElements()) {
                        break;
                    }
                    try {
                        HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write3 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write(write2.nextElement());
                        if (write3.IconCompatParcelizer == 0) {
                            int intValue = new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write3, false).read).intValue();
                            if (intValue < i2) {
                                return intValue;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    protected static int read(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$SearchResultReceiver));
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                Enumeration write2 = MediaBrowserCompat$CustomActionResultReceiver2.write();
                while (true) {
                    if (!write2.hasMoreElements()) {
                        break;
                    }
                    try {
                        HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write3 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write(write2.nextElement());
                        if (write3.IconCompatParcelizer == 1) {
                            int intValue = new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write3, false).read).intValue();
                            if (intValue < i2) {
                                return intValue;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    protected static void read(CertPath certPath, int i, SmeLoanDetailLgItemAdapter$ChildViewHolder smeLoanDetailLgItemAdapter$ChildViewHolder) throws CertPathValidatorException {
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$MediaItem));
            FundRedeemSearchListAdapter$FundHolder_ViewBinding fundRedeemSearchListAdapter$FundHolder_ViewBinding = null;
            if (!(MediaBrowserCompat$CustomActionResultReceiver2 == null || MediaBrowserCompat$CustomActionResultReceiver2 == null)) {
                fundRedeemSearchListAdapter$FundHolder_ViewBinding = new FundRedeemSearchListAdapter$FundHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
            }
            if (fundRedeemSearchListAdapter$FundHolder_ViewBinding != null) {
                AccountDetailsAdapter$ItemViewHolder_ViewBinding[] accountDetailsAdapter$ItemViewHolder_ViewBindingArr = fundRedeemSearchListAdapter$FundHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = 0;
                if (accountDetailsAdapter$ItemViewHolder_ViewBindingArr != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        for (int i3 = 0; i3 != accountDetailsAdapter$ItemViewHolder_ViewBindingArr.length; i3++) {
                            AccountDetailsAdapter$ItemViewHolder_ViewBinding accountDetailsAdapter$ItemViewHolder_ViewBinding = accountDetailsAdapter$ItemViewHolder_ViewBindingArr[i3];
                            Integer valueOf = Integer.valueOf(accountDetailsAdapter$ItemViewHolder_ViewBinding.write.IconCompatParcelizer);
                            if (hashMap.get(valueOf) == null) {
                                hashMap.put(valueOf, new HashSet());
                            }
                            ((Set) hashMap.get(valueOf)).add(accountDetailsAdapter$ItemViewHolder_ViewBinding);
                        }
                        for (Map.Entry entry : hashMap.entrySet()) {
                            int intValue = ((Integer) entry.getKey()).intValue();
                            if (intValue == 1) {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.write = smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer(smeLoanDetailLgItemAdapter$ChildViewHolder.write, (Set) entry.getValue());
                            } else if (intValue == 2) {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver = SmeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver(smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver, (Set) entry.getValue());
                            } else if (intValue == 4) {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.read = SmeLoanDetailLgItemAdapter$ChildViewHolder.write(smeLoanDetailLgItemAdapter$ChildViewHolder.read, (Set) entry.getValue());
                            } else if (intValue == 6) {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.MediaDescriptionCompat = smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver(smeLoanDetailLgItemAdapter$ChildViewHolder.MediaDescriptionCompat, (Set) entry.getValue());
                            } else if (intValue == 7) {
                                smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer = smeLoanDetailLgItemAdapter$ChildViewHolder.read(smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer, (Set) entry.getValue());
                            }
                        }
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                    }
                }
                AccountDetailsAdapter$ItemViewHolder_ViewBinding[] accountDetailsAdapter$ItemViewHolder_ViewBindingArr2 = fundRedeemSearchListAdapter$FundHolder_ViewBinding.IconCompatParcelizer;
                if (accountDetailsAdapter$ItemViewHolder_ViewBindingArr2 != null) {
                    while (i2 != accountDetailsAdapter$ItemViewHolder_ViewBindingArr2.length) {
                        try {
                            smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer(accountDetailsAdapter$ItemViewHolder_ViewBindingArr2[i2]);
                            i2++;
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011a, code lost:
        if (r5 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0121, code lost:
        if (r4.equals(r5) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void read(p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding r18, p040o.TileAdapter.BaseHolder r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.security.cert.X509Certificate r22, java.security.PublicKey r23, p040o.PersonalLimitAdapter$LimitCustomViewHolder r24, p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r25, java.util.List r26, p040o.TileAdapter.NtbScbCustomerHolder r27) throws org.spongycastle.jce.provider.AnnotatedException {
        /*
            r1 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r24
            r12 = r25
            java.util.Date r0 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r0.<init>(r2)
            long r2 = r21.getTime()
            long r4 = r0.getTime()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0211
            java.util.Set r0 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write((p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding) r1, (java.lang.Object) r9, (p040o.TileAdapter.BaseHolder) r8)
            java.util.Iterator r13 = r0.iterator()
            r2 = r12
            r0 = 0
            r16 = 0
        L_0x002d:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x020d
            int r3 = r11.write
            r6 = 11
            if (r3 != r6) goto L_0x020d
            int r3 = r12.IconCompatParcelizer
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r4 = p040o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4.IconCompatParcelizer
            if (r3 != r4) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 != 0) goto L_0x020d
            java.lang.Object r3 = r13.next()     // Catch:{ AnnotatedException -> 0x0209 }
            r5 = r3
            java.security.cert.X509CRL r5 = (java.security.cert.X509CRL) r5     // Catch:{ AnnotatedException -> 0x0209 }
            o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder r4 = MediaBrowserCompat$CustomActionResultReceiver((java.security.cert.X509CRL) r5, (p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding) r1)     // Catch:{ AnnotatedException -> 0x0209 }
            int r3 = r4.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0209 }
            int r6 = r2.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0209 }
            int r7 = r4.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0209 }
            r6 = r6 ^ r7
            r3 = r3 | r6
            if (r3 == 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x002d
            r2 = r5
            r3 = r22
            r7 = r4
            r4 = r23
            r6 = r5
            r5 = r19
            r14 = r6
            r15 = 11
            r6 = r26
            r17 = r7
            r15 = 1
            r7 = r27
            java.util.Set r2 = IconCompatParcelizer((java.security.cert.X509CRL) r2, (java.security.cert.X509Certificate) r3, (java.security.PublicKey) r4, (p040o.TileAdapter.BaseHolder) r5, (java.util.List) r6, (p040o.TileAdapter.NtbScbCustomerHolder) r7)     // Catch:{ AnnotatedException -> 0x0205 }
            java.security.PublicKey r2 = MediaBrowserCompat$ItemReceiver((java.security.cert.X509CRL) r14, (java.util.Set) r2)     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Date r3 = new java.util.Date     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Date r4 = r8.read     // Catch:{ AnnotatedException -> 0x0205 }
            long r4 = r4.getTime()     // Catch:{ AnnotatedException -> 0x0205 }
            r3.<init>(r4)     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Date r3 = new java.util.Date     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Date r4 = r8.read     // Catch:{ AnnotatedException -> 0x0205 }
            long r4 = r4.getTime()     // Catch:{ AnnotatedException -> 0x0205 }
            r3.<init>(r4)     // Catch:{ AnnotatedException -> 0x0205 }
            boolean r4 = r8.RatingCompat     // Catch:{ AnnotatedException -> 0x0205 }
            if (r4 == 0) goto L_0x00a6
            java.security.cert.PKIXParameters r4 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.List r4 = r4.getCertStores()     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.List<o.ShortcutAdapter$MyViewHolder> r5 = r8.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Set r3 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read((java.util.Date) r3, (java.security.cert.X509CRL) r14, (java.util.List<java.security.cert.CertStore>) r4, (java.util.List<p040o.ShortcutAdapter$MyViewHolder>) r5)     // Catch:{ AnnotatedException -> 0x0205 }
            java.security.cert.X509CRL r2 = write(r3, r2)     // Catch:{ AnnotatedException -> 0x0205 }
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            int r3 = r8.f5824x50fd9e4a     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == r15) goto L_0x00c8
            java.util.Date r3 = r20.getNotAfter()     // Catch:{ AnnotatedException -> 0x0205 }
            long r3 = r3.getTime()     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Date r5 = r14.getThisUpdate()     // Catch:{ AnnotatedException -> 0x0205 }
            long r5 = r5.getTime()     // Catch:{ AnnotatedException -> 0x0205 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "No valid CRL for current time found."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x00c8:
            MediaBrowserCompat$ItemReceiver((p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding) r1, (java.lang.Object) r9, (java.security.cert.X509CRL) r14)     // Catch:{ AnnotatedException -> 0x0205 }
            IconCompatParcelizer((p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding) r1, (java.lang.Object) r9, (java.security.cert.X509CRL) r14)     // Catch:{ AnnotatedException -> 0x0205 }
            if (r2 == 0) goto L_0x018b
            java.lang.String r3 = RatingCompat     // Catch:{ Exception -> 0x0182 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r3 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r14, r3)     // Catch:{ Exception -> 0x0182 }
            if (r3 == 0) goto L_0x00e2
            o.LandingAccountsAdapter$AccountViewHolder r4 = new o.LandingAccountsAdapter$AccountViewHolder     // Catch:{ Exception -> 0x0182 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ Exception -> 0x0182 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0182 }
            goto L_0x00e3
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            boolean r3 = r8.RatingCompat     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x018b
            javax.security.auth.x500.X500Principal r3 = r2.getIssuerX500Principal()     // Catch:{ AnnotatedException -> 0x0205 }
            byte[] r3 = r3.getEncoded()     // Catch:{ AnnotatedException -> 0x0205 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r3 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ AnnotatedException -> 0x0205 }
            javax.security.auth.x500.X500Principal r5 = r14.getIssuerX500Principal()     // Catch:{ AnnotatedException -> 0x0205 }
            byte[] r5 = r5.getEncoded()     // Catch:{ AnnotatedException -> 0x0205 }
            o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r5 = p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)     // Catch:{ AnnotatedException -> 0x0205 }
            boolean r3 = r3.equals(r5)     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x017a
            java.lang.String r3 = RatingCompat     // Catch:{ Exception -> 0x0171 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r3 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r2, r3)     // Catch:{ Exception -> 0x0171 }
            if (r3 == 0) goto L_0x0117
            o.LandingAccountsAdapter$AccountViewHolder r5 = new o.LandingAccountsAdapter$AccountViewHolder     // Catch:{ Exception -> 0x0171 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ Exception -> 0x0171 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0171 }
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            if (r4 != 0) goto L_0x011d
            if (r5 != 0) goto L_0x0125
            goto L_0x0123
        L_0x011d:
            boolean r3 = r4.equals(r5)     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x0125
        L_0x0123:
            r7 = r15
            goto L_0x0126
        L_0x0125:
            r7 = 0
        L_0x0126:
            if (r7 == 0) goto L_0x0169
            java.lang.String r3 = MediaSessionCompat$QueueItem     // Catch:{ AnnotatedException -> 0x0160 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r3 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r14, r3)     // Catch:{ AnnotatedException -> 0x0160 }
            java.lang.String r4 = MediaSessionCompat$QueueItem     // Catch:{ AnnotatedException -> 0x0157 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r4 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r2, r4)     // Catch:{ AnnotatedException -> 0x0157 }
            if (r3 == 0) goto L_0x014f
            if (r4 == 0) goto L_0x0147
            boolean r3 = r3.equals(r4)     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x013f
            goto L_0x018b
        L_0x013f:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0147:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "Delta CRL authority key identifier is null."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x014f:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "CRL authority key identifier is null."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0157:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = "Authority key identifier extension could not be extracted from delta CRL."
            r2.<init>(r3, r0)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r2     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0160:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = "Authority key identifier extension could not be extracted from complete CRL."
            r2.<init>(r3, r0)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r2     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0169:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0171:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = "Issuing distribution point extension from delta CRL could not be decoded."
            r2.<init>(r3, r0)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r2     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x017a:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "Complete CRL issuer does not match delta CRL issuer."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0182:
            r0 = move-exception
            org.spongycastle.jce.provider.AnnotatedException r2 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = "Issuing distribution point extension could not be decoded."
            r2.<init>(r3, r0)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r2     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x018b:
            boolean r3 = r8.RatingCompat     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x0194
            if (r2 == 0) goto L_0x0194
            p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read((java.util.Date) r10, (java.security.cert.X509CRL) r2, (java.lang.Object) r9, (p040o.PersonalLimitAdapter$LimitCustomViewHolder) r11)     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0194:
            int r3 = r11.write     // Catch:{ AnnotatedException -> 0x0205 }
            r4 = 11
            if (r3 != r4) goto L_0x019d
            p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.read((java.util.Date) r10, (java.security.cert.X509CRL) r14, (java.lang.Object) r9, (p040o.PersonalLimitAdapter$LimitCustomViewHolder) r11)     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x019d:
            int r3 = r11.write     // Catch:{ AnnotatedException -> 0x0205 }
            r5 = 8
            if (r3 != r5) goto L_0x01a5
            r11.write = r4     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x01a5:
            int r3 = r12.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0205 }
            r4 = r17
            int r4 = r4.IconCompatParcelizer     // Catch:{ AnnotatedException -> 0x0205 }
            r3 = r3 | r4
            r12.IconCompatParcelizer = r3     // Catch:{ AnnotatedException -> 0x0205 }
            java.util.Set r3 = r14.getCriticalExtensionOIDs()     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x01d6
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ AnnotatedException -> 0x0205 }
            r4.<init>(r3)     // Catch:{ AnnotatedException -> 0x0205 }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r3 = p040o.SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = r3.write     // Catch:{ AnnotatedException -> 0x0205 }
            r4.remove(r3)     // Catch:{ AnnotatedException -> 0x0205 }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r3 = p040o.SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r3 = r3.write     // Catch:{ AnnotatedException -> 0x0205 }
            r4.remove(r3)     // Catch:{ AnnotatedException -> 0x0205 }
            boolean r3 = r4.isEmpty()     // Catch:{ AnnotatedException -> 0x0205 }
            if (r3 == 0) goto L_0x01ce
            goto L_0x01d6
        L_0x01ce:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "CRL contains unsupported critical extensions."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x01d6:
            if (r2 == 0) goto L_0x0200
            java.util.Set r2 = r2.getCriticalExtensionOIDs()     // Catch:{ AnnotatedException -> 0x0205 }
            if (r2 == 0) goto L_0x0200
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ AnnotatedException -> 0x0205 }
            r3.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r2 = p040o.SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = r2.write     // Catch:{ AnnotatedException -> 0x0205 }
            r3.remove(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r2 = p040o.SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = r2.write     // Catch:{ AnnotatedException -> 0x0205 }
            r3.remove(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            boolean r2 = r3.isEmpty()     // Catch:{ AnnotatedException -> 0x0205 }
            if (r2 == 0) goto L_0x01f8
            goto L_0x0200
        L_0x01f8:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException     // Catch:{ AnnotatedException -> 0x0205 }
            java.lang.String r2 = "Delta CRL contains unsupported critical extension."
            r0.<init>(r2)     // Catch:{ AnnotatedException -> 0x0205 }
            throw r0     // Catch:{ AnnotatedException -> 0x0205 }
        L_0x0200:
            r2 = r12
            r16 = r15
            goto L_0x002d
        L_0x0205:
            r0 = move-exception
            r2 = r12
            goto L_0x002d
        L_0x0209:
            r0 = move-exception
            r15 = 1
            goto L_0x002d
        L_0x020d:
            if (r16 == 0) goto L_0x0210
            return
        L_0x0210:
            throw r0
        L_0x0211:
            org.spongycastle.jce.provider.AnnotatedException r0 = new org.spongycastle.jce.provider.AnnotatedException
            java.lang.String r1 = "Validation time is in future."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10423xa3461306.read(o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding, o.TileAdapter$BaseHolder, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, o.PersonalLimitAdapter$LimitCustomViewHolder, o.SmeLoanDetailLgItemAdapter$ClaimedItemViewHolder, java.util.List, o.TileAdapter$NtbScbCustomerHolder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r2 = new java.math.BigInteger(r2.read).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int MediaBrowserCompat$MediaItem(java.security.cert.CertPath r2, int r3, int r4) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r2.getCertificates()
            java.lang.Object r0 = r0.get(r3)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = IconCompatParcelizer     // Catch:{ Exception -> 0x0025 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r0 = p040o.DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(r0, r1)     // Catch:{ Exception -> 0x0025 }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding r2 = p040o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((java.lang.Object) r0)     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x0024
            java.math.BigInteger r3 = new java.math.BigInteger
            byte[] r2 = r2.read
            r3.<init>(r2)
            int r2 = r3.intValue()
            if (r2 >= r4) goto L_0x0024
            return r2
        L_0x0024:
            return r4
        L_0x0025:
            r4 = move-exception
            org.spongycastle.jce.exception.ExtCertPathValidatorException r0 = new org.spongycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r1 = "Inhibit any-policy extension cannot be decoded."
            r0.<init>(r1, r4, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10423xa3461306.MediaBrowserCompat$MediaItem(java.security.cert.CertPath, int, int):int");
    }

    protected static void MediaBrowserCompat$ItemReceiver(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            C10402xc503e64f IconCompatParcelizer2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$ItemReceiver);
            CurrencyAdapter$CurrencyHolder_ViewBinding currencyAdapter$CurrencyHolder_ViewBinding = IconCompatParcelizer2 != null ? new CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null;
            if (currencyAdapter$CurrencyHolder_ViewBinding == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
            } else if (!currencyAdapter$CurrencyHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver()) {
                throw new CertPathValidatorException("Not a CA certificate");
            }
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    protected static int MediaMetadataCompat(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        if (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", (Throwable) null, certPath, i);
    }

    protected static int RatingCompat(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        int intValue;
        try {
            C10402xc503e64f IconCompatParcelizer2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$ItemReceiver);
            BigInteger bigInteger = null;
            CurrencyAdapter$CurrencyHolder_ViewBinding currencyAdapter$CurrencyHolder_ViewBinding = IconCompatParcelizer2 != null ? new CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null;
            if (currencyAdapter$CurrencyHolder_ViewBinding != null) {
                HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = currencyAdapter$CurrencyHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
                    bigInteger = new BigInteger(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read);
                }
                return (bigInteger == null || (intValue = bigInteger.intValue()) >= i2) ? i2 : intValue;
            }
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    protected static void read(CertPath certPath, int i) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null && !keyUsage[5]) {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i);
        }
    }

    protected static void IconCompatParcelizer(CertPath certPath, int i, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate has unsupported critical extension: ");
            sb.append(set);
            throw new ExtCertPathValidatorException(sb.toString(), (Throwable) null, certPath, i);
        }
    }

    protected static int write(CertPath certPath, int i, int i2) {
        return (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int MediaBrowserCompat$ItemReceiver(CertPath certPath, int i, int i2) {
        return (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int MediaBrowserCompat$CustomActionResultReceiver(CertPath certPath, int i, int i2) {
        return (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    protected static int MediaBrowserCompat$CustomActionResultReceiver(int i, X509Certificate x509Certificate) {
        return (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate) || i == 0) ? i : i - 1;
    }

    protected static int MediaDescriptionCompat(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = InvestmentDetailsTransactionAdapter$TransactionHolder.MediaBrowserCompat$CustomActionResultReceiver(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer((X509Certificate) certPath.getCertificates().get(i), MediaBrowserCompat$SearchResultReceiver));
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                Enumeration write2 = MediaBrowserCompat$CustomActionResultReceiver2.write();
                while (write2.hasMoreElements()) {
                    HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) write2.nextElement();
                    if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer == 0) {
                        try {
                            if (new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, false).read).intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    protected static void read(CertPath certPath, int i, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException("Additional certificate path checker failed.", e, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate has unsupported critical extension: ");
            sb.append(set);
            throw new ExtCertPathValidatorException(sb.toString(), (Throwable) null, certPath, i);
        }
    }

    protected static SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(CertPath certPath, TileAdapter.BaseHolder baseHolder, Set set, int i, List[] listArr, SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding != null) {
            if (!DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(set)) {
                HashSet<SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding> hashSet = new HashSet<>();
                for (List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list.get(i2);
                        if (RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.getValidPolicy())) {
                            Iterator children = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding2.getChildren();
                            while (children.hasNext()) {
                                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) children.next();
                                if (!RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3.getValidPolicy())) {
                                    hashSet.add(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding3);
                                }
                            }
                        }
                    }
                }
                for (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4 : hashSet) {
                    if (!set.contains(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4.getValidPolicy())) {
                        smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, listArr, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding4);
                    }
                }
                if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding != null) {
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        List list2 = listArr[i3];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list2.get(i4);
                            if (!(!smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5.write.isEmpty())) {
                                smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, listArr, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding5);
                            }
                        }
                    }
                }
            } else if (baseHolder.MediaBrowserCompat$ItemReceiver.isExplicitPolicyRequired()) {
                if (!set2.isEmpty()) {
                    HashSet<SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding> hashSet2 = new HashSet<>();
                    for (List list3 : listArr) {
                        for (int i5 = 0; i5 < list3.size(); i5++) {
                            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list3.get(i5);
                            if (RFC3280CertPathUtilities.ANY_POLICY.equals(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6.getValidPolicy())) {
                                Iterator children2 = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding6.getChildren();
                                while (children2.hasNext()) {
                                    hashSet2.add(children2.next());
                                }
                            }
                        }
                    }
                    for (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding validPolicy : hashSet2) {
                        set2.contains(validPolicy.getValidPolicy());
                    }
                    if (smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding != null) {
                        for (int i6 = size - 1; i6 >= 0; i6--) {
                            List list4 = listArr[i6];
                            for (int i7 = 0; i7 < list4.size(); i7++) {
                                SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7 = (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) list4.get(i7);
                                if (!(!smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7.write.isEmpty())) {
                                    smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.write(smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding, listArr, smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding7);
                                }
                            }
                        }
                    }
                } else {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", (Throwable) null, certPath, i);
                }
            }
            return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
        } else if (!baseHolder.MediaBrowserCompat$ItemReceiver.isExplicitPolicyRequired()) {
            return null;
        } else {
            throw new ExtCertPathValidatorException("Explicit policy requested but none available.", (Throwable) null, certPath, i);
        }
    }
}
