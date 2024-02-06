package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.constrainedList */
public class constrainedList {
    @SerializedName("duplicateAcceptable")
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRef")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("verificationData")
    private constrainedTypePreservingCollection read;

    public constrainedList(constrainedTypePreservingCollection constrainedtypepreservingcollection, boolean z, String str) {
        this.read = constrainedtypepreservingcollection;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
