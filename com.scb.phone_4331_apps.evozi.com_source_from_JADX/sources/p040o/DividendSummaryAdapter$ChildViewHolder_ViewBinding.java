package p040o;

/* renamed from: o.DividendSummaryAdapter$ChildViewHolder_ViewBinding */
public final class DividendSummaryAdapter$ChildViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public C10403xf0c8ae24 IconCompatParcelizer;

    DividendSummaryAdapter$ChildViewHolder_ViewBinding(C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding) {
        this.IconCompatParcelizer = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding;
    }

    public final InvestmentDetailsFundListAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver() {
        if (this.IconCompatParcelizer.IconCompatParcelizer.size() == 0) {
            return null;
        }
        return InvestmentDetailsFundListAdapter$ItemViewHolder.IconCompatParcelizer((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) this.IconCompatParcelizer.IconCompatParcelizer.elementAt(0));
    }

    public final InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer() {
        int size = this.IconCompatParcelizer.IconCompatParcelizer.size();
        InvestmentDetailsFundListAdapter$ItemViewHolder[] investmentDetailsFundListAdapter$ItemViewHolderArr = new InvestmentDetailsFundListAdapter$ItemViewHolder[size];
        for (int i = 0; i != size; i++) {
            investmentDetailsFundListAdapter$ItemViewHolderArr[i] = InvestmentDetailsFundListAdapter$ItemViewHolder.IconCompatParcelizer((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) this.IconCompatParcelizer.IconCompatParcelizer.elementAt(i));
        }
        return investmentDetailsFundListAdapter$ItemViewHolderArr;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.IconCompatParcelizer;
    }
}
