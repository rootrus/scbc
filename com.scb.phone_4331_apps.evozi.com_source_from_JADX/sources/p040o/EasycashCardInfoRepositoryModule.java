package p040o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.CustomCheckboxView;
import java.util.List;

/* renamed from: o.EasycashCardInfoRepositoryModule */
public final class EasycashCardInfoRepositoryModule extends RecyclerView.IconCompatParcelizer<read> {
    public List<EventBus$$Lambda$1> MediaBrowserCompat$ItemReceiver;
    public C6446xa4368296 read;

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        read read2 = (read) setcontentview;
        EventBus$$Lambda$1 eventBus$$Lambda$1 = this.MediaBrowserCompat$ItemReceiver.get(i);
        C6446xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        read2.PlaybackStateCompat.setData(eventBus$$Lambda$1);
        read2.PlaybackStateCompat.setListener(new setTitleTypeface(easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, eventBus$$Lambda$1));
    }

    public EasycashCardInfoRepositoryModule(List<EventBus$$Lambda$1> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    /* renamed from: o.EasycashCardInfoRepositoryModule$read */
    static class read extends RecyclerView.setContentView {
        CustomCheckboxView PlaybackStateCompat;

        read(View view) {
            super(view);
            this.PlaybackStateCompat = (CustomCheckboxView) view;
        }

        static /* synthetic */ void IconCompatParcelizer(C6446xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver, EventBus$$Lambda$1 eventBus$$Lambda$1, boolean z) {
            if (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver != null) {
                easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(eventBus$$Lambda$1.MediaBrowserCompat$ItemReceiver, z);
            }
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        CustomCheckboxView customCheckboxView = new CustomCheckboxView(viewGroup.getContext());
        customCheckboxView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new read(customCheckboxView);
    }
}
