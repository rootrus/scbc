package p040o;

/* renamed from: o.FundRedeemSearchListAdapter$FundHolder */
public final class FundRedeemSearchListAdapter$FundHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public FundRedeemSearchListAdapter$FundHolder(InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = investmentDetailsClientListAdapter$ExpandableChildViewHolder;
    }

    public final String toString() {
        byte[] read = this.MediaBrowserCompat$CustomActionResultReceiver.read();
        if (read.length == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            sb.append(Integer.toHexString(read[0] & 255));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyUsage: 0x");
        sb2.append(Integer.toHexString((read[0] & 255) | ((read[1] & 255) << 8)));
        return sb2.toString();
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
