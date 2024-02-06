package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isClosed */
public final class isClosed {
    @SerializedName("id")
    private final String IconCompatParcelizer;
    @SerializedName("description")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public isClosed() {
        this((byte) 0);
    }

    private isClosed(String str, String str2) {
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    private /* synthetic */ isClosed(byte b) {
        this((String) null, (String) null);
    }

    public final DenominatorAmountAdapter$BubbleViewHolder_ViewBinding IconCompatParcelizer() {
        String str = this.IconCompatParcelizer;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            str2 = str3;
        }
        return new DenominatorAmountAdapter$BubbleViewHolder_ViewBinding(str, str2);
    }
}
