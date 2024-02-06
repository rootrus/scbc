package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.addInvoke */
public final class addInvoke extends ScriptGroup.ConnectLine {
    public RecyclerView.setContentView MediaBrowserCompat$ItemReceiver;

    public addInvoke(RecyclerView.setContentView setcontentview) {
        this.MediaBrowserCompat$ItemReceiver = setcontentview;
    }

    public final RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        if (this.MediaBrowserCompat$ItemReceiver == setcontentview) {
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddAnimationInfo{holder=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('}');
        return sb.toString();
    }
}
