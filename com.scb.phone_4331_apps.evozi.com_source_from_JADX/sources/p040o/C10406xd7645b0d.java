package p040o;

/* renamed from: o.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder_ViewBinding */
final class C10406xd7645b0d {
    private static C10403xf0c8ae24 MediaBrowserCompat$CustomActionResultReceiver = new BasicAssetAllocationAdapter$BaaHolder_ViewBinding();
    private static HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write = new InvestmentDetailsTransactionAdapter$TransactionHolder();

    C10406xd7645b0d() {
    }

    static HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder read(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        return companyItemViewHolder_ViewBinding.write.size() <= 0 ? write : new DiscoverFundFilterAdapter$SelectListHolder(companyItemViewHolder_ViewBinding);
    }

    static C10403xf0c8ae24 write(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        return companyItemViewHolder_ViewBinding.write.size() <= 0 ? MediaBrowserCompat$CustomActionResultReceiver : new DiscoverFundFilterAdapter$SubTitleHolder(companyItemViewHolder_ViewBinding);
    }
}
