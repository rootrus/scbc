package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isRotateGesturesEnabled */
public final class isRotateGesturesEnabled {
    @SerializedName("proxyNumber")
    public String IconCompatParcelizer;
    @SerializedName("bankLogo")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("name")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("proxyType")
    public isMyLocationButtonEnabled MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("accountNumber")
    public String read;
    @SerializedName("accountType")
    public UiSettings write;

    public isRotateGesturesEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isRotateGesturesEnabled)) {
            return false;
        }
        isRotateGesturesEnabled isrotategesturesenabled = (isRotateGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isrotategesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isrotategesturesenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isrotategesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isrotategesturesenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) isrotategesturesenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isrotategesturesenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        UiSettings uiSettings = this.write;
        int hashCode3 = uiSettings != null ? uiSettings.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        isMyLocationButtonEnabled ismylocationbuttonenabled = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = ismylocationbuttonenabled != null ? ismylocationbuttonenabled.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PullSlipReceiver(bankLogo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.write);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(", proxyType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", proxyNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public isRotateGesturesEnabled(String str, String str2, UiSettings uiSettings, String str3, isMyLocationButtonEnabled ismylocationbuttonenabled, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = uiSettings;
        this.read = str3;
        this.MediaBrowserCompat$SearchResultReceiver = ismylocationbuttonenabled;
        this.IconCompatParcelizer = str4;
    }

    private /* synthetic */ isRotateGesturesEnabled(byte b) {
        this((String) null, (String) null, (UiSettings) null, (String) null, (isMyLocationButtonEnabled) null, (String) null);
    }
}
