package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.retrieveValueAndDependenceInfo */
public final class retrieveValueAndDependenceInfo extends ScriptGroup.ConnectLine {
    public int IconCompatParcelizer;
    public RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver;
    public RecyclerView.setContentView MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$SearchResultReceiver;
    public int read;
    public int write;

    public retrieveValueAndDependenceInfo(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setcontentview;
        this.MediaBrowserCompat$ItemReceiver = setcontentview2;
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.write = i3;
        this.MediaBrowserCompat$SearchResultReceiver = i4;
    }

    public final RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver() {
        RecyclerView.setContentView setcontentview = this.MediaBrowserCompat$CustomActionResultReceiver;
        return setcontentview == null ? this.MediaBrowserCompat$ItemReceiver : setcontentview;
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == setcontentview) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        if (this.MediaBrowserCompat$ItemReceiver == setcontentview) {
            this.MediaBrowserCompat$ItemReceiver = null;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null && this.MediaBrowserCompat$ItemReceiver == null) {
            this.read = 0;
            this.IconCompatParcelizer = 0;
            this.write = 0;
            this.MediaBrowserCompat$SearchResultReceiver = 0;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeInfo{, oldHolder=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", newHolder=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fromX=");
        sb.append(this.read);
        sb.append(", fromY=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", toX=");
        sb.append(this.write);
        sb.append(", toY=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
