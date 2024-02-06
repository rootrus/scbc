package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Deprecated
/* renamed from: o.DepositViewPagerAdapter$ItemViewHolder_ViewBinding */
public final class DepositViewPagerAdapter$ItemViewHolder_ViewBinding implements OPRRewardTiersAdapter$TierViewHolder_ViewBinding, PaginationViewFooterHolder {
    private final ErrorPagerAdapter_ViewBinding IconCompatParcelizer;
    private final OPRRewardTiersAdapter$TierViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private final PaginationViewFooterHolder MediaBrowserCompat$ItemReceiver;
    private final String read;

    public DepositViewPagerAdapter$ItemViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = oPRRewardTiersAdapter$TierViewHolder_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = oPRRewardTiersAdapter$TierViewHolder_ViewBinding instanceof PaginationViewFooterHolder ? (PaginationViewFooterHolder) oPRRewardTiersAdapter$TierViewHolder_ViewBinding : null;
        this.IconCompatParcelizer = errorPagerAdapter_ViewBinding;
        this.read = str == null ? PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver.name() : str;
    }

    public final boolean write(int i) throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(bArr, i, i2);
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer() && read2 > 0) {
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.IconCompatParcelizer;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bArr, "Input");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver("<< ", new ByteArrayInputStream(bArr, i, read2));
        }
        return read2;
    }

    public final int read() throws IOException {
        int read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read();
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer() && read2 != -1) {
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.IconCompatParcelizer;
            byte[] bArr = {(byte) read2};
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bArr, "Input");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver("<< ", new ByteArrayInputStream(bArr));
        }
        return read2;
    }

    public final int read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException {
        int read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(depositTransactionAdapter$ChildViewHolder_ViewBinding);
        if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer() && read2 >= 0) {
            String str = new String(depositTransactionAdapter$ChildViewHolder_ViewBinding.write, depositTransactionAdapter$ChildViewHolder_ViewBinding.length() - read2, read2);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\r\n");
            String obj = sb.toString();
            ErrorPagerAdapter_ViewBinding errorPagerAdapter_ViewBinding = this.IconCompatParcelizer;
            byte[] bytes = obj.getBytes(this.read);
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(bytes, "Input");
            errorPagerAdapter_ViewBinding.MediaBrowserCompat$ItemReceiver("<< ", new ByteArrayInputStream(bytes));
        }
        return read2;
    }

    public final loadInBackground MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final boolean IconCompatParcelizer() {
        PaginationViewFooterHolder paginationViewFooterHolder = this.MediaBrowserCompat$ItemReceiver;
        if (paginationViewFooterHolder != null) {
            return paginationViewFooterHolder.IconCompatParcelizer();
        }
        return false;
    }
}
