package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getBitmap */
public class getBitmap {
    @SerializedName("referenceAccounts")
    public List<LottieListener> IconCompatParcelizer;
    @SerializedName("repaymentAccounts")
    public List<LottieListener> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("disclaimerDescription")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("disclaimerHeader")
    public String read;
    @SerializedName("receivingAccounts")
    public List<LottieListener> write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getBitmap getbitmap = (getBitmap) obj;
        List<LottieListener> list = this.write;
        if (list == null ? getbitmap.write != null : !list.equals(getbitmap.write)) {
            return false;
        }
        List<LottieListener> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 == null ? getbitmap.MediaBrowserCompat$CustomActionResultReceiver != null : !list2.equals(getbitmap.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        List<LottieListener> list3 = this.IconCompatParcelizer;
        if (list3 == null ? getbitmap.IconCompatParcelizer != null : !list3.equals(getbitmap.IconCompatParcelizer)) {
            return false;
        }
        String str = this.read;
        if (str == null ? getbitmap.read != null : !str.equals(getbitmap.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        String str3 = getbitmap.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<LottieListener> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<LottieListener> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<LottieListener> list3 = this.IconCompatParcelizer;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        String str = this.read;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }
}
