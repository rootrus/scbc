package p040o;

/* renamed from: o.FundSearchListAdapter$FundHolder */
public final class FundSearchListAdapter$FundHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder IconCompatParcelizer;
    public FundSearchListAdapter$FundHolder_ViewBinding MediaBrowserCompat$ItemReceiver;
    private int read = 1;
    public AccountDetailsAdapter$ItemViewHolder write;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: o.FundSearchListAdapter$FundHolder_ViewBinding} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: o.AccountDetailsAdapter$ItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FundSearchListAdapter$FundHolder(p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 1
            r7.read = r0
            int r1 = r8.MediaBrowserCompat$ItemReceiver()
            r2 = 3
            if (r1 > r2) goto L_0x006a
            r1 = 0
            r2 = r1
        L_0x000f:
            int r3 = r8.MediaBrowserCompat$ItemReceiver()
            if (r2 == r3) goto L_0x0067
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r3 = r8.read(r2)
            o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding r3 = p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((java.lang.Object) r3)
            int r4 = r3.IconCompatParcelizer
            r5 = 0
            if (r4 == 0) goto L_0x0053
            if (r4 == r0) goto L_0x0041
            r6 = 2
            if (r4 != r6) goto L_0x0039
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(r3, r1)
            if (r3 == 0) goto L_0x0036
            o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder r5 = new o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r3)
            r5.<init>(r3)
        L_0x0036:
            r7.IconCompatParcelizer = r5
            goto L_0x0064
        L_0x0039:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag in Holder"
            r8.<init>(r0)
            throw r8
        L_0x0041:
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(r3, r1)
            if (r3 == 0) goto L_0x0050
            o.AccountDetailsAdapter$ItemViewHolder r5 = new o.AccountDetailsAdapter$ItemViewHolder
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r3)
            r5.<init>((p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r3)
        L_0x0050:
            r7.write = r5
            goto L_0x0064
        L_0x0053:
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(r3, r1)
            if (r3 == 0) goto L_0x0062
            o.FundSearchListAdapter$FundHolder_ViewBinding r5 = new o.FundSearchListAdapter$FundHolder_ViewBinding
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r3)
            r5.<init>(r3)
        L_0x0062:
            r7.MediaBrowserCompat$ItemReceiver = r5
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0067:
            r7.read = r0
            return
        L_0x006a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bad sequence size: "
            r0.append(r1)
            int r8 = r8.MediaBrowserCompat$ItemReceiver()
            r0.append(r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FundSearchListAdapter$FundHolder.<init>(o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder):void");
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        if (this.read == 1) {
            CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
            FundSearchListAdapter$FundHolder_ViewBinding fundSearchListAdapter$FundHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            if (fundSearchListAdapter$FundHolder_ViewBinding != null) {
                companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, fundSearchListAdapter$FundHolder_ViewBinding));
            }
            AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = this.write;
            if (accountDetailsAdapter$ItemViewHolder != null) {
                companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, accountDetailsAdapter$ItemViewHolder));
            }
            SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder suitabilityAssessmentAdapter$SuitabilityFooterViewHolder = this.IconCompatParcelizer;
            if (suitabilityAssessmentAdapter$SuitabilityFooterViewHolder != null) {
                companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 2, suitabilityAssessmentAdapter$SuitabilityFooterViewHolder));
            }
            return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
        }
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder2 = this.write;
        if (accountDetailsAdapter$ItemViewHolder2 != null) {
            return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 1, accountDetailsAdapter$ItemViewHolder2);
        }
        return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 0, this.MediaBrowserCompat$ItemReceiver);
    }
}
