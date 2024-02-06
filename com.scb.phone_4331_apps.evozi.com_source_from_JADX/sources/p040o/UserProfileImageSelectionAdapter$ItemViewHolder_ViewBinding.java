package p040o;

import java.io.IOException;
import java.security.cert.CertSelector;
import p040o.TileAdapter;

/* renamed from: o.UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding */
public final class UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding implements CertSelector, BankAccountAdapter$BankAccountViewHolder {
    private FundSearchListAdapter$FundHolder MediaBrowserCompat$ItemReceiver;

    private UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder != null ? new FundSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) : null;
    }

    public final Object clone() {
        return new UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean match(java.security.cert.Certificate r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.security.cert.X509Certificate
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = r6
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            o.FundSearchListAdapter$FundHolder r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.FundSearchListAdapter$FundHolder_ViewBinding r2 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            r3 = 1
            if (r2 == 0) goto L_0x0039
            o.FundSearchListAdapter$FundHolder r6 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.FundSearchListAdapter$FundHolder_ViewBinding r6 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding r6 = r6.write     // Catch:{  }
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{  }
            byte[] r6 = r6.read     // Catch:{  }
            r2.<init>(r6)     // Catch:{  }
            java.math.BigInteger r6 = r0.getSerialNumber()     // Catch:{  }
            boolean r6 = r2.equals(r6)     // Catch:{  }
            if (r6 == 0) goto L_0x0038
            o.TileAdapter$ShortcutHolder_ViewBinding r6 = p040o.UnselectedTileAdapter$Holder.IconCompatParcelizer(r0)     // Catch:{  }
            o.FundSearchListAdapter$FundHolder r0 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.FundSearchListAdapter$FundHolder_ViewBinding r0 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.AccountDetailsAdapter$ItemViewHolder r0 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            boolean r6 = read(r6, r0)     // Catch:{  }
            if (r6 == 0) goto L_0x0038
            r1 = r3
        L_0x0038:
            return r1
        L_0x0039:
            o.FundSearchListAdapter$FundHolder r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.AccountDetailsAdapter$ItemViewHolder r2 = r2.write     // Catch:{  }
            if (r2 == 0) goto L_0x004e
            o.TileAdapter$ShortcutHolder_ViewBinding r0 = p040o.UnselectedTileAdapter$Holder.write(r0)     // Catch:{  }
            o.FundSearchListAdapter$FundHolder r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.AccountDetailsAdapter$ItemViewHolder r2 = r2.write     // Catch:{  }
            boolean r0 = read(r0, r2)     // Catch:{  }
            if (r0 == 0) goto L_0x004e
            return r3
        L_0x004e:
            o.FundSearchListAdapter$FundHolder r0 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r0 = r0.IconCompatParcelizer     // Catch:{  }
            if (r0 == 0) goto L_0x00ae
            o.FundSearchListAdapter$FundHolder r0 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ CertificateEncodingException -> 0x00ae }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r0 = r0.IconCompatParcelizer     // Catch:{ CertificateEncodingException -> 0x00ae }
            if (r0 == 0) goto L_0x0065
            o.FundSearchListAdapter$FundHolder r0 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ CertificateEncodingException -> 0x00ae }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r0 = r0.IconCompatParcelizer     // Catch:{ CertificateEncodingException -> 0x00ae }
            o.LtfSummaryAdapter$SsfChildViewHolder r0 = r0.write     // Catch:{ CertificateEncodingException -> 0x00ae }
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r0 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ CertificateEncodingException -> 0x00ae }
            java.lang.String r0 = r0.write     // Catch:{ CertificateEncodingException -> 0x00ae }
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            java.lang.String r2 = "SC"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r2)     // Catch:{ CertificateEncodingException -> 0x00ae }
            o.FundSearchListAdapter$FundHolder r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r2 = r2.IconCompatParcelizer     // Catch:{  }
            if (r2 == 0) goto L_0x0084
            o.FundSearchListAdapter$FundHolder r2 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r2 = r2.IconCompatParcelizer     // Catch:{  }
            o.HmlAboutAdapter$HmlAboutViewHolder r2 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{  }
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch:{  }
            byte[] r2 = r2.read     // Catch:{  }
            r4.<init>(r2)     // Catch:{  }
            int r2 = r4.intValue()     // Catch:{  }
            goto L_0x0085
        L_0x0084:
            r2 = -1
        L_0x0085:
            if (r2 == 0) goto L_0x0091
            if (r2 != r3) goto L_0x009c
            byte[] r6 = r6.getEncoded()     // Catch:{  }
            r0.update(r6)     // Catch:{  }
            goto L_0x009c
        L_0x0091:
            java.security.PublicKey r6 = r6.getPublicKey()     // Catch:{  }
            byte[] r6 = r6.getEncoded()     // Catch:{  }
            r0.update(r6)     // Catch:{  }
        L_0x009c:
            r0.digest()     // Catch:{  }
            o.FundSearchListAdapter$FundHolder r6 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r6 = r6.IconCompatParcelizer     // Catch:{  }
            if (r6 == 0) goto L_0x00ae
            o.FundSearchListAdapter$FundHolder r6 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{  }
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r6 = r6.IconCompatParcelizer     // Catch:{  }
            o.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder r6 = r6.IconCompatParcelizer     // Catch:{  }
            r6.read()     // Catch:{  }
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding.match(java.security.cert.Certificate):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding)) {
            return false;
        }
        return this.MediaBrowserCompat$ItemReceiver.equals(((UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding) obj).MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    private static boolean read(TileAdapter.ShortcutHolder_ViewBinding shortcutHolder_ViewBinding, AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder) {
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
        for (int i = 0; i != length; i++) {
            CreditCardDetailsAdapter$ItemViewHolder creditCardDetailsAdapter$ItemViewHolder = creditCardDetailsAdapter$ItemViewHolderArr2[i];
            if (creditCardDetailsAdapter$ItemViewHolder.IconCompatParcelizer == 4) {
                try {
                    if (new TileAdapter.ShortcutHolder_ViewBinding(creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem().ParcelableVolumeInfo()).equals(shortcutHolder_ViewBinding)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
