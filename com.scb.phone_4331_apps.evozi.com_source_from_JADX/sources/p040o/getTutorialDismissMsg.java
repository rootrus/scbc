package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTutorialDismissMsg */
public final /* synthetic */ class getTutorialDismissMsg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTutorialDismissMsg(List list, String str) {
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector$MediaSessionCompat$Token) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
