package p040o;

import java.util.List;

/* renamed from: o.isClickable */
public final class isClickable {
    public final getZIndex IconCompatParcelizer;
    public final List<setMockMode> MediaBrowserCompat$ItemReceiver;
    public final List<getJointType> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isClickable)) {
            return false;
        }
        isClickable isclickable = (isClickable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isclickable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isclickable.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isclickable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isclickable.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        getZIndex getzindex = this.IconCompatParcelizer;
        int hashCode2 = getzindex != null ? getzindex.hashCode() : 0;
        List<getJointType> list = this.read;
        int hashCode3 = list != null ? list.hashCode() : 0;
        List<setMockMode> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartySlip(themeFlag=");
        sb.append(this.write);
        sb.append(", header=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", body=");
        sb.append(this.read);
        sb.append(", footer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public isClickable(String str, getZIndex getzindex, List<getJointType> list, List<setMockMode> list2) {
        onGetStartedClick.write((Object) str, "themeFlag");
        this.write = str;
        this.IconCompatParcelizer = getzindex;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
    }
}
