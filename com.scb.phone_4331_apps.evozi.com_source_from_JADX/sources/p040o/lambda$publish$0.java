package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.lambda$publish$0 */
public final class lambda$publish$0 {
    public final List<EventBus$$Lambda$1> IconCompatParcelizer;
    public final EventBus$$Lambda$1 MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambda$publish$0)) {
            return false;
        }
        lambda$publish$0 lambda_publish_0 = (lambda$publish$0) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lambda_publish_0.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lambda_publish_0.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lambda_publish_0.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        EventBus$$Lambda$1 eventBus$$Lambda$1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = eventBus$$Lambda$1 != null ? eventBus$$Lambda$1.hashCode() : 0;
        List<EventBus$$Lambda$1> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomCheckboxGroupDisplay(title=");
        sb.append(this.read);
        sb.append(", mainCheckbox=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", children=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public lambda$publish$0(String str, EventBus$$Lambda$1 eventBus$$Lambda$1, List<EventBus$$Lambda$1> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) eventBus$$Lambda$1, "mainCheckbox");
        onGetStartedClick.write((Object) list, "children");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = eventBus$$Lambda$1;
        this.IconCompatParcelizer = list;
    }
}
