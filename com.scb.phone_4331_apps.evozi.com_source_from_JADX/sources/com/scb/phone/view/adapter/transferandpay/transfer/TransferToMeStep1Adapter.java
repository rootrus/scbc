package com.scb.phone.view.adapter.transferandpay.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.landingNTBReferral;
import p040o.onStart;
import p040o.parseOs;
import p040o.setLastBaselineToBottomHeight;

public final class TransferToMeStep1Adapter extends RecyclerView.IconCompatParcelizer<LocalViewHolder> {
    public write MediaBrowserCompat$ItemReceiver;
    private boolean read = false;
    public List<parseOs> write;

    @FunctionalInterface
    public interface write {
        void IconCompatParcelizer(parseOs parseos);
    }

    public class LocalViewHolder_ViewBinding implements Unbinder {
        private LocalViewHolder IconCompatParcelizer;

        public LocalViewHolder_ViewBinding(LocalViewHolder localViewHolder, View view) {
            this.IconCompatParcelizer = localViewHolder;
            localViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            localViewHolder.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
            localViewHolder.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        }

        public final void read() {
            LocalViewHolder localViewHolder = this.IconCompatParcelizer;
            if (localViewHolder != null) {
                this.IconCompatParcelizer = null;
                localViewHolder.textTitle = null;
                localViewHolder.textSubtitle = null;
                localViewHolder.imageIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LocalViewHolder localViewHolder = (LocalViewHolder) setcontentview;
        parseOs parseos = this.write.get(i);
        localViewHolder.textTitle.setText(parseos.read);
        localViewHolder.textSubtitle.setText(parseos.MediaBrowserCompat$ItemReceiver);
        String str = parseos.MediaBrowserCompat$CustomActionResultReceiver;
        Context context = localViewHolder.PlaybackStateCompat;
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, localViewHolder.AlertController$RecycleListView, localViewHolder.imageIcon, str, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(localViewHolder.PlaybackStateCompat, R.color.f66402131099796));
        localViewHolder.write.setOnClickListener(new landingNTBReferral(this, parseos));
    }

    public TransferToMeStep1Adapter(List<parseOs> list) {
        this.write = list;
    }

    public TransferToMeStep1Adapter(List<parseOs> list, byte b) {
        this.write = list;
        this.read = true;
    }

    public final int IconCompatParcelizer() {
        List<parseOs> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class LocalViewHolder extends RecyclerView.setContentView {
        Drawable AlertController$RecycleListView;
        final Context PlaybackStateCompat;
        @BindView
        ImageView imageIcon;
        @BindView
        TextView textSubtitle;
        @BindView
        TextView textTitle;

        LocalViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            Context context = view.getContext();
            this.PlaybackStateCompat = context;
            this.AlertController$RecycleListView = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_place_holder);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LocalViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.read ? R.layout.f85102131493737 : R.layout.f85112131493738, viewGroup, false));
    }
}
