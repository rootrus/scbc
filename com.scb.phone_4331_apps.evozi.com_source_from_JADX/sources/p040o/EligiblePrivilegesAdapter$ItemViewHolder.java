package p040o;

import java.io.IOException;
import java.io.InputStream;
import p040o.OPRRewardAdapter;

/* renamed from: o.EligiblePrivilegesAdapter$ItemViewHolder */
public final class EligiblePrivilegesAdapter$ItemViewHolder extends InputStream {
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private final OPRRewardTiersAdapter$TierViewHolder_ViewBinding write;

    public EligiblePrivilegesAdapter$ItemViewHolder(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding) {
        this.write = (OPRRewardTiersAdapter$TierViewHolder_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
    }

    public final int available() throws IOException {
        OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding = this.write;
        if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding instanceof OPRRewardAdapter.RewardViewHolder) {
            return ((OPRRewardAdapter.RewardViewHolder) oPRRewardTiersAdapter$TierViewHolder_ViewBinding).MediaDescriptionCompat();
        }
        return 0;
    }

    public final void close() throws IOException {
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public final int read() throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return -1;
        }
        return this.write.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return -1;
        }
        return this.write.read(bArr, i, i2);
    }
}
