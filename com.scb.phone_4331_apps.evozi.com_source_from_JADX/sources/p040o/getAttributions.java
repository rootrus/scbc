package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.getAttributions */
public final class getAttributions {
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAttributions)) {
            return false;
        }
        getAttributions getattributions = (getAttributions) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getattributions.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getattributions.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getattributions.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuestionAnswer(selected=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", title=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", score=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getAttributions(boolean z, String str, String str2) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "score");
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
