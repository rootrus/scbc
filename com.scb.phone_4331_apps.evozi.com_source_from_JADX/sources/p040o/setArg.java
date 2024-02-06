package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.setArg */
public abstract class setArg extends ScriptGroup.Closure<getClosure> {
    public abstract boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview);

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        getClosure getclosure = (getClosure) connectLine;
        if (getclosure.IconCompatParcelizer == null) {
            return false;
        }
        if (setcontentview != null && getclosure.IconCompatParcelizer != setcontentview) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver(getclosure.IconCompatParcelizer);
        MediaBrowserCompat$CustomActionResultReceiver(getclosure.IconCompatParcelizer);
        if (getclosure.IconCompatParcelizer != getclosure.IconCompatParcelizer) {
            return true;
        }
        getclosure.IconCompatParcelizer = null;
        return true;
    }

    public final /* synthetic */ void read(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
    }

    public setArg(seperateArgsAndBindings seperateargsandbindings) {
        super(seperateargsandbindings);
    }

    public final long RatingCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        RecyclerView.MediaMetadataCompat.read read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (read != null) {
            read.write(setcontentview);
        }
    }
}
