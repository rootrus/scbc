package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.FlexboxLayoutManager */
public final class FlexboxLayoutManager {
    @SerializedName("labels")
    public final setShowDividerVertical IconCompatParcelizer;
    @SerializedName("securitiesAccountDetails")
    public final setShowDividerHorizontal MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billerAccountNo")
    public final String read;
    @SerializedName("cardId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexboxLayoutManager)) {
            return false;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) flexboxLayoutManager.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) flexboxLayoutManager.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) flexboxLayoutManager.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) flexboxLayoutManager.read);
    }

    public final int hashCode() {
        setShowDividerVertical setshowdividervertical = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = setshowdividervertical != null ? setshowdividervertical.hashCode() : 0;
        setShowDividerHorizontal setshowdividerhorizontal = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = setshowdividerhorizontal != null ? setshowdividerhorizontal.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PortfolioDetailsEntity(labels=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", securitiesAccountDetails=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardId=");
        sb.append(this.write);
        sb.append(", billerAccountNo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
