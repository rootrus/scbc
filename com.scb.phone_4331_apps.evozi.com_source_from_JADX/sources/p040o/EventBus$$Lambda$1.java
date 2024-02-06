package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.EventBus$$Lambda$1 */
public final class EventBus$$Lambda$1 {
    public boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventBus$$Lambda$1)) {
            return false;
        }
        EventBus$$Lambda$1 eventBus$$Lambda$1 = (EventBus$$Lambda$1) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) eventBus$$Lambda$1.MediaBrowserCompat$ItemReceiver) && this.read == eventBus$$Lambda$1.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) eventBus$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) eventBus$$Lambda$1.write) && this.IconCompatParcelizer == eventBus$$Lambda$1.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.read;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        return (((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomCheckboxDisplay(id=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sortSequence=");
        sb.append(this.read);
        sb.append(", title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", subtitle=");
        sb.append(this.write);
        sb.append(", checked=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public EventBus$$Lambda$1(String str, int i, String str2, String str3, boolean z) {
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) str2, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str3, "subtitle");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = z;
    }
}
