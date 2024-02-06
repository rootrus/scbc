package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isLooping */
public final class isLooping {
    @SerializedName(alternate = {"repaymentAccount"}, value = "receivingAccount")
    public final isRunning IconCompatParcelizer;
    @SerializedName("header")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("remarks")
    public final List<String> read;
    @SerializedName("componentType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isLooping)) {
            return false;
        }
        isLooping islooping = (isLooping) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) islooping.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) islooping.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) islooping.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) islooping.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        isRunning isrunning = this.IconCompatParcelizer;
        int hashCode3 = isrunning != null ? isrunning.hashCode() : 0;
        List<String> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashDisplayFeatureAccountEntity(header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", componentType=");
        sb.append(this.write);
        sb.append(", receivingAccount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remarks=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
