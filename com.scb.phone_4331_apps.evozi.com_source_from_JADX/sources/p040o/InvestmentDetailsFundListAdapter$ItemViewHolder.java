package p040o;

/* renamed from: o.InvestmentDetailsFundListAdapter$ItemViewHolder */
public final class InvestmentDetailsFundListAdapter$ItemViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public HmlBusinessInfoAdapter$BankAccountViewHolder IconCompatParcelizer;
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding write;

    private InvestmentDetailsFundListAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.IconCompatParcelizer = (HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0);
        this.write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1);
    }

    public static InvestmentDetailsFundListAdapter$ItemViewHolder IconCompatParcelizer(Object obj) {
        if (obj instanceof InvestmentDetailsFundListAdapter$ItemViewHolder) {
            return (InvestmentDetailsFundListAdapter$ItemViewHolder) obj;
        }
        if (obj != null) {
            return new InvestmentDetailsFundListAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.IconCompatParcelizer);
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
