package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isIndoorLevelPickerEnabled */
public final class isIndoorLevelPickerEnabled {
    @SerializedName("name")
    public String IconCompatParcelizer;
    @SerializedName("accountType")
    public UiSettings MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("bankLogo")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNumber")
    public String read;

    public isIndoorLevelPickerEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isIndoorLevelPickerEnabled)) {
            return false;
        }
        isIndoorLevelPickerEnabled isindoorlevelpickerenabled = (isIndoorLevelPickerEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isindoorlevelpickerenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isindoorlevelpickerenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isindoorlevelpickerenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isindoorlevelpickerenabled.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        UiSettings uiSettings = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = uiSettings != null ? uiSettings.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PullSlipSender(bankLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public isIndoorLevelPickerEnabled(String str, String str2, UiSettings uiSettings, String str3) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = uiSettings;
        this.read = str3;
    }

    private /* synthetic */ isIndoorLevelPickerEnabled(byte b) {
        this((String) null, (String) null, (UiSettings) null, (String) null);
    }
}
