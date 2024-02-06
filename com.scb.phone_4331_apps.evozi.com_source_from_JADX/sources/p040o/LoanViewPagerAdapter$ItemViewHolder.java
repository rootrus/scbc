package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Deprecated
/* renamed from: o.LoanViewPagerAdapter$ItemViewHolder */
public final class LoanViewPagerAdapter$ItemViewHolder implements OPRRewardTiersAdapter$TierViewHolder {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$ItemReceiver;
    private final ErrorPagerAdapter_ViewBinding write;

    public LoanViewPagerAdapter$ItemViewHolder(OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder, ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding, String str) {
        this.MediaBrowserCompat$ItemReceiver = oPRRewardTiersAdapter$TierViewHolder;
        this.write = errorPagerAdapter_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = str == null ? PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver.name() : str;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.write(bArr, i, i2);
        if (this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.write;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bArr, "Output");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver(">> ", new ByteArrayInputStream(bArr, i, i2));
        }
    }

    public final void write(int i) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.write(i);
        if (this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.write;
            byte[] bArr = {(byte) i};
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bArr, "Output");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver(">> ", new ByteArrayInputStream(bArr));
        }
    }

    public final void write() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding);
        if (this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            String str = new String(depositTransactionAdapter$ChildViewHolder_ViewBinding.write, 0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            String obj = sb.toString();
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.write;
            byte[] bytes = obj.getBytes(this.MediaBrowserCompat$CustomActionResultReceiver);
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bytes, "Output");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver(">> ", new ByteArrayInputStream(bytes));
        }
    }

    public final void write(String str) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.write(str);
        if (this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            String obj = sb.toString();
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.write;
            byte[] bytes = obj.getBytes(this.MediaBrowserCompat$CustomActionResultReceiver);
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bytes, "Output");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver(">> ", new ByteArrayInputStream(bytes));
        }
    }

    public final loadInBackground MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
