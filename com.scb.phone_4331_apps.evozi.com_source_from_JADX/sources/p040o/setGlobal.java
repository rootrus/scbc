package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.setGlobal */
public abstract class setGlobal extends ScriptGroup.Closure<ScriptGroup.Closure.ValueAndSize> {
    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
    }

    public abstract boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        ScriptGroup.Closure.ValueAndSize valueAndSize = (ScriptGroup.Closure.ValueAndSize) connectLine;
        if (valueAndSize.read == null) {
            return false;
        }
        if (setcontentview != null && valueAndSize.read != setcontentview) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver(valueAndSize.read);
        MediaBrowserCompat$CustomActionResultReceiver(valueAndSize.read);
        if (valueAndSize.read != valueAndSize.read) {
            return true;
        }
        valueAndSize.read = null;
        return true;
    }

    public final /* synthetic */ void read(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
    }

    public setGlobal(seperateArgsAndBindings seperateargsandbindings) {
        super(seperateargsandbindings);
    }

    public final long RatingCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.f25x50fd9e4a;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        RecyclerView.MediaMetadataCompat.read read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (read != null) {
            read.write(setcontentview);
        }
    }
}
