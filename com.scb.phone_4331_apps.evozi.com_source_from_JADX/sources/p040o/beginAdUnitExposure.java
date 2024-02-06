package p040o;

/* renamed from: o.beginAdUnitExposure */
public final class beginAdUnitExposure {
    public final Integer IconCompatParcelizer;
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    public final Integer MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beginAdUnitExposure)) {
            return false;
        }
        beginAdUnitExposure beginadunitexposure = (beginAdUnitExposure) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) beginadunitexposure.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) beginadunitexposure.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) beginadunitexposure.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) beginadunitexposure.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) beginadunitexposure.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) beginadunitexposure.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        Integer num2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.MediaBrowserCompat$ItemReceiver;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLoanInfoItemBody(bodySequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", activeFlag=");
        sb.append(this.read);
        sb.append(", indexNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", iconKey=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public beginAdUnitExposure(Integer num, String str, String str2, String str3, Integer num2, Integer num3) {
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = num2;
        this.MediaBrowserCompat$ItemReceiver = num3;
    }
}
