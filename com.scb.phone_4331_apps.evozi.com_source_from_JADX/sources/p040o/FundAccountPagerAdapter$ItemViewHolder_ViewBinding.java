package p040o;

/* renamed from: o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding */
public final class FundAccountPagerAdapter$ItemViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public PieChartLegendAdapter$ChartEntryViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public AccountDetailsAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver;
    public SelectableChoiceAdapter$ChoiceHolder write;

    /* JADX WARNING: type inference failed for: r4v3, types: [o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FundAccountPagerAdapter$ItemViewHolder_ViewBinding(p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r1 = r0
        L_0x0005:
            int r2 = r7.MediaBrowserCompat$ItemReceiver()
            if (r1 == r2) goto L_0x004f
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r2 = r7.read(r1)
            o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding r2 = p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((java.lang.Object) r2)
            int r3 = r2.IconCompatParcelizer
            r4 = 0
            if (r3 == 0) goto L_0x003c
            r5 = 1
            if (r3 == r5) goto L_0x0030
            r5 = 2
            if (r3 != r5) goto L_0x004c
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r2 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(r2, r0)
            if (r2 == 0) goto L_0x002d
            o.AccountDetailsAdapter$ItemViewHolder r4 = new o.AccountDetailsAdapter$ItemViewHolder
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r2 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r2)
            r4.<init>((p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r2)
        L_0x002d:
            r6.MediaBrowserCompat$ItemReceiver = r4
            goto L_0x004c
        L_0x0030:
            o.PieChartLegendAdapter$ChartEntryViewHolder r3 = new o.PieChartLegendAdapter$ChartEntryViewHolder
            o.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder r2 = p040o.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) r2)
            r3.<init>(r2)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r3
            goto L_0x004c
        L_0x003c:
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r2 = r2.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x0044
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r4 = r2.MediaBrowserCompat$MediaItem()
        L_0x0044:
            o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding r4 = (p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) r4
            o.SelectableChoiceAdapter$ChoiceHolder r2 = p040o.SelectableChoiceAdapter$ChoiceHolder.MediaBrowserCompat$CustomActionResultReceiver(r4)
            r6.write = r2
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FundAccountPagerAdapter$ItemViewHolder_ViewBinding.<init>(o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder):void");
    }

    public FundAccountPagerAdapter$ItemViewHolder_ViewBinding(SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder) {
        this.write = selectableChoiceAdapter$ChoiceHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder = this.write;
        if (selectableChoiceAdapter$ChoiceHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(0, selectableChoiceAdapter$ChoiceHolder));
        }
        PieChartLegendAdapter$ChartEntryViewHolder pieChartLegendAdapter$ChartEntryViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pieChartLegendAdapter$ChartEntryViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, pieChartLegendAdapter$ChartEntryViewHolder));
        }
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (accountDetailsAdapter$ItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 2, accountDetailsAdapter$ItemViewHolder));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }

    public final String toString() {
        String read = MoneyActionAdapter$CustomViewHolder.read();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(read);
        SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder = this.write;
        if (selectableChoiceAdapter$ChoiceHolder != null) {
            read(stringBuffer, read, "distributionPoint", selectableChoiceAdapter$ChoiceHolder.toString());
        }
        PieChartLegendAdapter$ChartEntryViewHolder pieChartLegendAdapter$ChartEntryViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pieChartLegendAdapter$ChartEntryViewHolder != null) {
            read(stringBuffer, read, "reasons", pieChartLegendAdapter$ChartEntryViewHolder.toString());
        }
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (accountDetailsAdapter$ItemViewHolder != null) {
            read(stringBuffer, read, "cRLIssuer", accountDetailsAdapter$ItemViewHolder.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(read);
        return stringBuffer.toString();
    }

    private static void read(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }
}
