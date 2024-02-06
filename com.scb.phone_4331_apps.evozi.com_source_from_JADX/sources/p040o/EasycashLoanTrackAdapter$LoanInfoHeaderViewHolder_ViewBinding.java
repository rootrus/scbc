package p040o;

import java.io.IOException;
import java.security.PublicKey;

/* renamed from: o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding */
public abstract class EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding extends DeviceSettingsAdapter$ParentViewHolder implements PublicKey {
    EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY);
    }

    public byte[] getEncoded() {
        try {
            return MediaBrowserCompat$ItemReceiver();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
