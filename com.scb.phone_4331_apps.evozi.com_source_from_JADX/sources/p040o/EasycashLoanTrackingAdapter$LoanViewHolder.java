package p040o;

import java.math.BigInteger;

/* renamed from: o.EasycashLoanTrackingAdapter$LoanViewHolder */
public final class EasycashLoanTrackingAdapter$LoanViewHolder extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    int write;

    EasycashLoanTrackingAdapter$LoanViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, int i) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        this.write = i;
    }

    public EasycashLoanTrackingAdapter$LoanViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, byte[] bArr) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        if (bArr.length <= 4) {
            this.write = new BigInteger(1, bArr).intValue();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Byte array too long, max is 4, was ");
        sb.append(bArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        return read(Integer.valueOf(this.write));
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        return sb.toString();
    }
}
