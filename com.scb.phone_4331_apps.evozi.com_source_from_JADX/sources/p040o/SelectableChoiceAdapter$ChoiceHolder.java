package p040o;

/* renamed from: o.SelectableChoiceAdapter$ChoiceHolder */
public final class SelectableChoiceAdapter$ChoiceHolder extends HmlBanksGridAdapter$HmlBankViewHolder implements FixedTransferSubDepositAdapter$SubDepositViewHolder {
    public int read;
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding write;

    public static SelectableChoiceAdapter$ChoiceHolder MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj == null) {
            return (SelectableChoiceAdapter$ChoiceHolder) obj;
        }
        if (obj instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
            return new SelectableChoiceAdapter$ChoiceHolder((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public SelectableChoiceAdapter$ChoiceHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        this.read = 0;
        this.write = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
    }

    private SelectableChoiceAdapter$ChoiceHolder(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        int i = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer;
        this.read = i;
        if (i == 0) {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, false);
            this.write = write2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null;
            return;
        }
        this.write = C10403xf0c8ae24.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding);
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, this.read, this.write);
    }

    public final String toString() {
        String read2 = MoneyActionAdapter$CustomViewHolder.read();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(read2);
        if (this.read == 0) {
            read(stringBuffer, read2, "fullName", this.write.toString());
        } else {
            read(stringBuffer, read2, "nameRelativeToCRLIssuer", this.write.toString());
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
