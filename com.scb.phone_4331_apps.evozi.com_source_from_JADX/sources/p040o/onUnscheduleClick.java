package p040o;

import java.net.InetAddress;
import java.net.InetSocketAddress;

@Deprecated
/* renamed from: o.onUnscheduleClick */
public final class onUnscheduleClick extends InetSocketAddress {
    public final PrivacyManagementLandingViewHolder read;

    public onUnscheduleClick(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        this.read = privacyManagementLandingViewHolder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.write);
        sb.append(":");
        sb.append(getPort());
        return sb.toString();
    }
}
