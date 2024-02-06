package p040o;

import android.text.TextUtils;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.co */
public final /* synthetic */ class C9881co implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setContentDescription MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C9881co(setContentDescription setcontentdescription) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setcontentdescription;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.read) obj).write(TextUtils.join("\n", this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer));
    }
}
