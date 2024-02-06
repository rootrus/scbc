package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.notifyListener */
public class notifyListener {
    @SerializedName("scheduleFlag")
    public String IconCompatParcelizer;
    @SerializedName("cardId")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("eligibilityFlag")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        notifyListener notifylistener = (notifyListener) obj;
        String str = this.write;
        if (str == null ? notifylistener.write != null : !str.equals(notifylistener.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? notifylistener.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(notifylistener.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = notifylistener.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
