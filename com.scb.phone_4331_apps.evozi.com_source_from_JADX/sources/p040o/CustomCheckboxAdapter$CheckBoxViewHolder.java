package p040o;

import java.math.BigInteger;

/* renamed from: o.CustomCheckboxAdapter$CheckBoxViewHolder */
public final class CustomCheckboxAdapter$CheckBoxViewHolder extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    public byte[] MediaBrowserCompat$ItemReceiver;

    public CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, byte[] bArr) {
        this(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, bArr, false);
    }

    CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, byte[] bArr, boolean z) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.MediaBrowserCompat$ItemReceiver = bArr;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer() {
        String str;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            int i = 0;
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                i = new BigInteger(1, this.MediaBrowserCompat$ItemReceiver).bitLength();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(i);
            sb.append("]  ");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(EasycashProductAdapter$LoanProductViewHolder.write(this.MediaBrowserCompat$ItemReceiver));
        return sb2.toString();
    }
}
