package p040o;

import java.math.BigInteger;

/* renamed from: o.LtfSummaryAdapter$SsfChildViewHolder_ViewBinding */
public final class LtfSummaryAdapter$SsfChildViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    private BigInteger IconCompatParcelizer;

    public LtfSummaryAdapter$SsfChildViewHolder_ViewBinding(BigInteger bigInteger) {
        this.IconCompatParcelizer = bigInteger;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CRLNumber: ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(this.IconCompatParcelizer);
    }
}
