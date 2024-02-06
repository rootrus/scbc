package p040o;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: o.FundSwitchSearchListAdapter$FundHolder_ViewBinding */
public final class FundSwitchSearchListAdapter$FundHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    private static final Hashtable read = new Hashtable();
    private static final String[] write = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private HmlAboutAdapter$HmlAboutViewHolder IconCompatParcelizer;

    public static FundSwitchSearchListAdapter$FundHolder_ViewBinding MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = new BigInteger(HmlAboutAdapter$HmlAboutViewHolder.IconCompatParcelizer(obj).read).intValue();
        Integer valueOf = Integer.valueOf(intValue);
        if (!read.containsKey(valueOf)) {
            read.put(valueOf, new FundSwitchSearchListAdapter$FundHolder_ViewBinding(intValue));
        }
        return (FundSwitchSearchListAdapter$FundHolder_ViewBinding) read.get(valueOf);
    }

    private FundSwitchSearchListAdapter$FundHolder_ViewBinding(int i) {
        this.IconCompatParcelizer = new HmlAboutAdapter$HmlAboutViewHolder(i);
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        int intValue = new BigInteger(this.IconCompatParcelizer.read).intValue();
        String str = (intValue < 0 || intValue > 10) ? "invalid" : write[intValue];
        StringBuilder sb = new StringBuilder();
        sb.append("CRLReason: ");
        sb.append(str);
        return sb.toString();
    }
}
