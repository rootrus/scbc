package p040o;

import java.util.List;

/* renamed from: o.getRadius */
public final class getRadius {
    public final String IconCompatParcelizer;
    public final List<getTile> MediaBrowserCompat$ItemReceiver;
    public final List<getFadeIn> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRadius)) {
            return false;
        }
        getRadius getradius = (getRadius) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getradius.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getradius.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getradius.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<getFadeIn> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<getTile> list2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardRequest(debitCardDepositAccountList=");
        sb.append(this.write);
        sb.append(", debitCardTypeList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", basicAccountRemark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getRadius(List<getFadeIn> list, List<getTile> list2, String str) {
        onGetStartedClick.write((Object) list, "debitCardDepositAccountList");
        onGetStartedClick.write((Object) list2, "debitCardTypeList");
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.IconCompatParcelizer = str;
    }
}
