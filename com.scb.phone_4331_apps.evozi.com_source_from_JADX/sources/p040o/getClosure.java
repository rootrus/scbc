package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.getClosure */
public final class getClosure extends ScriptGroup.ConnectLine {
    public RecyclerView.setContentView IconCompatParcelizer;

    public getClosure(RecyclerView.setContentView setcontentview) {
        this.IconCompatParcelizer = setcontentview;
    }

    public final RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        if (this.IconCompatParcelizer == setcontentview) {
            this.IconCompatParcelizer = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveAnimationInfo{holder=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
