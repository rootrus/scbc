package p040o;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ScriptGroup;

/* renamed from: o.getReturn */
public abstract class getReturn extends ScriptGroup.Closure<retrieveValueAndDependenceInfo> {
    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(retrieveValueAndDependenceInfo retrievevalueanddependenceinfo);

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
    }

    /* access modifiers changed from: protected */
    public abstract void write(retrieveValueAndDependenceInfo retrievevalueanddependenceinfo);

    public abstract boolean write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine) {
        retrieveValueAndDependenceInfo retrievevalueanddependenceinfo = (retrieveValueAndDependenceInfo) connectLine;
        if (retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver != null) {
            IconCompatParcelizer(retrievevalueanddependenceinfo);
        }
        if (retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver != null) {
            write(retrievevalueanddependenceinfo);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        retrieveValueAndDependenceInfo retrievevalueanddependenceinfo = (retrieveValueAndDependenceInfo) connectLine;
        if (retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver != null && (setcontentview == null || retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver == setcontentview)) {
            MediaBrowserCompat$ItemReceiver(retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver);
            read(retrievevalueanddependenceinfo, retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver);
            retrievevalueanddependenceinfo.read(retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver != null && (setcontentview == null || retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver == setcontentview)) {
            MediaBrowserCompat$ItemReceiver(retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver);
            read(retrievevalueanddependenceinfo, retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver);
            retrievevalueanddependenceinfo.read(retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver);
        }
        return retrievevalueanddependenceinfo.MediaBrowserCompat$CustomActionResultReceiver == null && retrievevalueanddependenceinfo.MediaBrowserCompat$ItemReceiver == null;
    }

    public getReturn(seperateArgsAndBindings seperateargsandbindings) {
        super(seperateargsandbindings);
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public void read(retrieveValueAndDependenceInfo retrievevalueanddependenceinfo, RecyclerView.setContentView setcontentview) {
        RecyclerView.MediaMetadataCompat.read read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (read != null) {
            read.write(setcontentview);
        }
    }

    public final long MediaMetadataCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
    }
}
