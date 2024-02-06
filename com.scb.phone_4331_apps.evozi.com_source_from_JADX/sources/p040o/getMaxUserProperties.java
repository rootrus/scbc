package p040o;

import java.util.List;

/* renamed from: o.getMaxUserProperties */
public final class getMaxUserProperties {
    public final String IconCompatParcelizer;
    public final setInstanceIdProvider MediaBrowserCompat$ItemReceiver;
    public final List<getTestFlag> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaxUserProperties)) {
            return false;
        }
        getMaxUserProperties getmaxuserproperties = (getMaxUserProperties) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmaxuserproperties.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmaxuserproperties.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmaxuserproperties.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<getTestFlag> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode2 = str != null ? str.hashCode() : 0;
        setInstanceIdProvider setinstanceidprovider = this.MediaBrowserCompat$ItemReceiver;
        if (setinstanceidprovider != null) {
            i = setinstanceidprovider.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCommercialLoan(offers=");
        sb.append(this.read);
        sb.append(", applicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getMaxUserProperties(List<? extends getTestFlag> list, String str, setInstanceIdProvider setinstanceidprovider) {
        onGetStartedClick.write((Object) list, "offers");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) setinstanceidprovider, "remark");
        this.read = list;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = setinstanceidprovider;
    }
}
