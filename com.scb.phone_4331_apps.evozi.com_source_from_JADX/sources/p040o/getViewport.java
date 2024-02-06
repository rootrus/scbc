package p040o;

import java.util.List;

/* renamed from: o.getViewport */
public final class getViewport {
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final List<getAttributions> MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getViewport)) {
            return false;
        }
        getViewport getviewport = (getViewport) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getviewport.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getviewport.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getviewport.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getviewport.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<getAttributions> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question(questionNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", questionTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", questionSummaryTitle=");
        sb.append(this.read);
        sb.append(", answers=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getViewport(int i, String str, String str2, List<getAttributions> list) {
        onGetStartedClick.write((Object) str, "questionTitle");
        onGetStartedClick.write((Object) str2, "questionSummaryTitle");
        onGetStartedClick.write((Object) list, "answers");
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
