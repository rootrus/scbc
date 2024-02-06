package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.ActivityTypeItem;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindPartnerWebViewFragment */
public final class FragmentBuilder_BindPartnerWebViewFragment extends RecyclerView.IconCompatParcelizer<onRetakeClicked> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    public List<ActivityTypeItem> read;
    private final View.OnClickListener write;

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onRetakeClicked onretakeclicked = (onRetakeClicked) setcontentview;
        onretakeclicked.AlertController$RecycleListView.setText(this.read.get(i).getName());
        onretakeclicked.AlertController$RecycleListView.setChecked(this.MediaBrowserCompat$ItemReceiver == i);
        onretakeclicked.AlertController$RecycleListView.setOnClickListener(new C6633x7c71d71f(this, i, this.write));
    }

    public FragmentBuilder_BindPartnerWebViewFragment(List<ActivityTypeItem> list, View.OnClickListener onClickListener) {
        this.read = list;
        this.write = onClickListener;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return C6554xc460715d.th_view_list_item_checkable;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null && str.length() != 0) {
            int i = 0;
            while (true) {
                if (i >= this.read.size()) {
                    i = -1;
                    break;
                } else if (this.read.get(i).getId().equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, 1);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new onRetakeClicked(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
