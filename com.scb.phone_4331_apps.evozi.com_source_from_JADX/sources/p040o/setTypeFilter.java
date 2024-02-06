package p040o;

/* renamed from: o.setTypeFilter */
public final class setTypeFilter {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTypeFilter)) {
            return false;
        }
        setTypeFilter settypefilter = (setTypeFilter) obj;
        return this.RatingCompat == settypefilter.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) settypefilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) settypefilter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) settypefilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) settypefilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settypefilter.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.RatingCompat;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", accountNickname=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", accountBranch=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", branchCode=");
        sb.append(this.write);
        sb.append(", productTypeCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setTypeFilter(int i, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "accountNickname");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountBranch");
        onGetStartedClick.write((Object) str4, "branchCode");
        onGetStartedClick.write((Object) str5, "productTypeCode");
        this.RatingCompat = i;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }
}
