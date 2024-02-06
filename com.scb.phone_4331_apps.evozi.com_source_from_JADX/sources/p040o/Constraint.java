package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.Constraints;

/* renamed from: o.Constraint */
public final class Constraint {
    @SerializedName("rate")
    private final String IconCompatParcelizer;
    @SerializedName("loanId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRef")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("term")
    private final String read;
    @SerializedName("transactions")
    private final List<Constraints.ConstrainedListIterator> write;

    public Constraint(String str, String str2, String str3, String str4, List<? extends Constraints.ConstrainedListIterator> list) {
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) str2, "loanId");
        onGetStartedClick.write((Object) str3, "rate");
        onGetStartedClick.write((Object) str4, "term");
        onGetStartedClick.write((Object) list, "transactions");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.write = list;
    }
}
