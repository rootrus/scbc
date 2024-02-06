package p040o;

import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: o.MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding */
public abstract class MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding extends CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding {
    /* access modifiers changed from: protected */
    public abstract String IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract byte[] MediaBrowserCompat$ItemReceiver();

    public MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
    }

    /* access modifiers changed from: protected */
    public final int read(DataOutputStream dataOutputStream) throws IOException {
        int size = dataOutputStream.size();
        dataOutputStream.write(read(Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver().value)));
        byte[] MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        dataOutputStream.write(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.length));
        dataOutputStream.write(MediaBrowserCompat$ItemReceiver);
        return dataOutputStream.size() - size;
    }

    public final String write(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.write(str, z));
        stringBuffer.append(IconCompatParcelizer());
        return stringBuffer.toString();
    }
}
