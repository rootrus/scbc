package p040o;

/* renamed from: o.DiscoverSearchResultAdapter$ItemViewHolder_ViewBinding */
public final class DiscoverSearchResultAdapter$ItemViewHolder_ViewBinding extends InvestmentDetailsClientListAdapter$ExpandableChildViewHolder {
    public DiscoverSearchResultAdapter$ItemViewHolder_ViewBinding(InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder) {
        super(investmentDetailsClientListAdapter$ExpandableChildViewHolder.read(), investmentDetailsClientListAdapter$ExpandableChildViewHolder.write());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetscapeCertType: 0x");
        sb.append(Integer.toHexString(this.read[0] & 255));
        return sb.toString();
    }
}
