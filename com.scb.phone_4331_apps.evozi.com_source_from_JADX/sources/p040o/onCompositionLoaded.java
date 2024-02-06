package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onCompositionLoaded */
public class onCompositionLoaded extends LottieOnCompositionLoadedListener {
    @SerializedName("maximumDuration")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productProgram")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("uploadImageDisclaimer")
    public String read;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onCompositionLoaded oncompositionloaded = (onCompositionLoaded) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? oncompositionloaded.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(oncompositionloaded.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? oncompositionloaded.MediaBrowserCompat$ItemReceiver != null : !str2.equals(oncompositionloaded.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.read;
        String str4 = oncompositionloaded.read;
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
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
