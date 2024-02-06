package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setAlignContent */
public class setAlignContent extends setCurrentItemInternal {
    @SerializedName("endDate")
    public String IconCompatParcelizer;
    @SerializedName("scheduleType")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("startDate")
    public String read;
    @SerializedName("dayOfMonth")
    public int write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setAlignContent setaligncontent = (setAlignContent) obj;
        if (this.write != setaligncontent.write) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? setaligncontent.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(setaligncontent.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? setaligncontent.read != null : !str2.equals(setaligncontent.read)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = setaligncontent.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.write;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + i;
    }
}
