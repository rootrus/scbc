package p040o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindQuickPromptPayFragment */
public final class FragmentBuilder_BindQuickPromptPayFragment implements Serializable {
    @SerializedName("statusCode")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("interactions")
    public final List<String> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindQuickPromptPayFragment)) {
            return false;
        }
        FragmentBuilder_BindQuickPromptPayFragment fragmentBuilder_BindQuickPromptPayFragment = (FragmentBuilder_BindQuickPromptPayFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindQuickPromptPayFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindQuickPromptPayFragment.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllowedInteractionsResponse(interactions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", statusCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindQuickPromptPayFragment(List<String> list, String str) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
