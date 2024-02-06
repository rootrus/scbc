package p040o;

import java.io.IOException;

/* renamed from: o.OPRRewardTiersAdapter$TierViewHolder_ViewBinding */
public interface OPRRewardTiersAdapter$TierViewHolder_ViewBinding {
    loadInBackground MediaBrowserCompat$CustomActionResultReceiver();

    int read() throws IOException;

    int read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    @Deprecated
    boolean write(int i) throws IOException;
}
