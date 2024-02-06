package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.getGlobal */
public abstract class getGlobal extends ScriptGroup.Closure<addInvoke> {
    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
    }

    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview);

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        addInvoke addinvoke = (addInvoke) connectLine;
        if (addinvoke.MediaBrowserCompat$ItemReceiver == null) {
            return false;
        }
        if (setcontentview != null && addinvoke.MediaBrowserCompat$ItemReceiver != setcontentview) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver(addinvoke.MediaBrowserCompat$ItemReceiver);
        IconCompatParcelizer(addinvoke.MediaBrowserCompat$ItemReceiver);
        if (addinvoke.MediaBrowserCompat$ItemReceiver != addinvoke.MediaBrowserCompat$ItemReceiver) {
            return true;
        }
        addinvoke.MediaBrowserCompat$ItemReceiver = null;
        return true;
    }

    public final /* synthetic */ void read(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        IconCompatParcelizer(setcontentview);
    }

    public getGlobal(seperateArgsAndBindings seperateargsandbindings) {
        super(seperateargsandbindings);
    }

    public final long MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
    }

    private void IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
        RecyclerView.MediaMetadataCompat.read read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (read != null) {
            read.write(setcontentview);
        }
    }
}
