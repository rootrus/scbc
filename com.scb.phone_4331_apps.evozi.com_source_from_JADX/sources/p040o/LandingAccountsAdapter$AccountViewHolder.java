package p040o;

/* renamed from: o.LandingAccountsAdapter$AccountViewHolder */
public final class LandingAccountsAdapter$AccountViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaDescriptionCompat;
    public PieChartLegendAdapter$ChartEntryViewHolder MediaMetadataCompat;
    public boolean read;
    public SelectableChoiceAdapter$ChoiceHolder write;

    public LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        this.MediaDescriptionCompat = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        for (int i = 0; i != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver(); i++) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i));
            int i2 = write2.IconCompatParcelizer;
            if (i2 != 0) {
                boolean z = true;
                if (i2 == 1) {
                    this.read = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer(write2).read[0] == 0 ? false : z;
                } else if (i2 == 2) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer(write2).read[0] == 0 ? false : z;
                } else if (i2 == 3) {
                    this.MediaMetadataCompat = new PieChartLegendAdapter$ChartEntryViewHolder(PieChartLegendAdapter$ChartEntryViewHolder.MediaBrowserCompat$ItemReceiver(write2));
                } else if (i2 == 4) {
                    this.MediaBrowserCompat$ItemReceiver = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer(write2).read[0] == 0 ? false : z;
                } else if (i2 == 5) {
                    this.IconCompatParcelizer = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer(write2).read[0] == 0 ? false : z;
                } else {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
            } else {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = write2.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
                } else {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
                }
                this.write = SelectableChoiceAdapter$ChoiceHolder.MediaBrowserCompat$CustomActionResultReceiver((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.MediaDescriptionCompat;
    }

    public final String toString() {
        String str;
        String str2;
        String read2 = MoneyActionAdapter$CustomViewHolder.read();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(read2);
        SelectableChoiceAdapter$ChoiceHolder selectableChoiceAdapter$ChoiceHolder = this.write;
        if (selectableChoiceAdapter$ChoiceHolder != null) {
            read(stringBuffer, read2, "distributionPoint", selectableChoiceAdapter$ChoiceHolder.toString());
        }
        boolean z = this.read;
        String str3 = "true";
        if (z) {
            read(stringBuffer, read2, "onlyContainsUserCerts", z ? str3 : "false");
        }
        boolean z2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z2) {
            if (z2) {
                str2 = str3;
            } else {
                str2 = "false";
            }
            read(stringBuffer, read2, "onlyContainsCACerts", str2);
        }
        PieChartLegendAdapter$ChartEntryViewHolder pieChartLegendAdapter$ChartEntryViewHolder = this.MediaMetadataCompat;
        if (pieChartLegendAdapter$ChartEntryViewHolder != null) {
            read(stringBuffer, read2, "onlySomeReasons", pieChartLegendAdapter$ChartEntryViewHolder.toString());
        }
        boolean z3 = this.IconCompatParcelizer;
        if (z3) {
            if (z3) {
                str = str3;
            } else {
                str = "false";
            }
            read(stringBuffer, read2, "onlyContainsAttributeCerts", str);
        }
        boolean z4 = this.MediaBrowserCompat$ItemReceiver;
        if (z4) {
            if (!z4) {
                str3 = "false";
            }
            read(stringBuffer, read2, "indirectCRL", str3);
        }
        stringBuffer.append("]");
        stringBuffer.append(read2);
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
