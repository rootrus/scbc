package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.TabParser$TabParserException */
public abstract class TabParser$TabParserException<T> extends RecyclerView.IconCompatParcelizer<TabParser$TabParserException<T>.CustomActionResultReceiver> {
    public Context MediaBrowserCompat$ItemReceiver;
    public read<T> MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    public View read;
    public List<T> write = new ArrayList();

    /* renamed from: o.TabParser$TabParserException$read */
    public interface read<T> {
        void MediaBrowserCompat$ItemReceiver(T t);
    }

    /* access modifiers changed from: protected */
    public abstract TabParser$TabParserException<T>.CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract void write(TabParser$TabParserException<T>.CustomActionResultReceiver customActionResultReceiver, int i);

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        C7086xdf8ebab8 tabParser$TabParserException$MediaBrowserCompat$CustomActionResultReceiver = (C7086xdf8ebab8) setcontentview;
        if (MediaBrowserCompat$CustomActionResultReceiver(i) == 2) {
            write(tabParser$TabParserException$MediaBrowserCompat$CustomActionResultReceiver, i - (this.read == null ? 0 : 1));
        }
    }

    public TabParser$TabParserException(Context context, View view, View view2) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.MediaDescriptionCompat = view;
        this.MediaMetadataCompat = view2;
    }

    public final void IconCompatParcelizer(List<T> list) {
        this.write = list;
        this.IconCompatParcelizer.write();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.read != null && i == 0) {
            return 0;
        }
        if (i == IconCompatParcelizer() - 1) {
            return 1;
        }
        return this.write.isEmpty() ? 3 : 2;
    }

    public final int IconCompatParcelizer() {
        return (this.read == null ? 0 : 1) + (!this.write.isEmpty() ? this.write.size() + 1 : 2);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return MediaBrowserCompat$CustomActionResultReceiver(viewGroup);
        }
        if (i == 0) {
            return new C7086xdf8ebab8(this.read);
        }
        if (i == 1) {
            return new C7086xdf8ebab8(this.MediaDescriptionCompat);
        }
        return new C7086xdf8ebab8(this.MediaMetadataCompat);
    }
}
