package com.scb.phone.view.adapter.sme.gifting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.getProductTermAndCondition;
import p040o.onStart;
import p040o.withEvents;

public final class GifShareMomentBackgroundAdapter extends RecyclerView.IconCompatParcelizer<GifShareMomentBackgroundHolder> {
    public List<withEvents> MediaBrowserCompat$ItemReceiver;
    public read read;

    public interface read {
        void MediaBrowserCompat$ItemReceiver(withEvents withevents);
    }

    public class GifShareMomentBackgroundHolder_ViewBinding implements Unbinder {
        private GifShareMomentBackgroundHolder write;

        public GifShareMomentBackgroundHolder_ViewBinding(GifShareMomentBackgroundHolder gifShareMomentBackgroundHolder, View view) {
            this.write = gifShareMomentBackgroundHolder;
            gifShareMomentBackgroundHolder.backgroundTile = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.background_image, "field 'backgroundTile'", ImageView.class);
            gifShareMomentBackgroundHolder.backgroundCheck = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.background_check, "field 'backgroundCheck'", ImageView.class);
        }

        public final void read() {
            GifShareMomentBackgroundHolder gifShareMomentBackgroundHolder = this.write;
            if (gifShareMomentBackgroundHolder != null) {
                this.write = null;
                gifShareMomentBackgroundHolder.backgroundTile = null;
                gifShareMomentBackgroundHolder.backgroundCheck = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        GifShareMomentBackgroundHolder gifShareMomentBackgroundHolder = (GifShareMomentBackgroundHolder) setcontentview;
        withEvents withevents = this.MediaBrowserCompat$ItemReceiver.get(i);
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(withevents.IconCompatParcelizer);
        write.write = true;
        write.read(gifShareMomentBackgroundHolder.backgroundTile, (FragmentBuilder_BindEkycFragment) null);
        if (withevents.MediaBrowserCompat$ItemReceiver) {
            gifShareMomentBackgroundHolder.backgroundCheck.setVisibility(0);
            withevents.MediaBrowserCompat$MediaItem = true;
            withevents.MediaBrowserCompat$ItemReceiver = false;
            this.read.MediaBrowserCompat$ItemReceiver(withevents);
        }
        if (withevents.MediaBrowserCompat$MediaItem) {
            gifShareMomentBackgroundHolder.backgroundCheck.setVisibility(0);
        } else {
            gifShareMomentBackgroundHolder.backgroundCheck.setVisibility(8);
        }
        gifShareMomentBackgroundHolder.backgroundTile.setOnClickListener(new getProductTermAndCondition(this, withevents));
    }

    public GifShareMomentBackgroundAdapter(List<withEvents> list, read read2) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = read2;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    protected class GifShareMomentBackgroundHolder extends RecyclerView.setContentView {
        @BindView
        ImageView backgroundCheck;
        @BindView
        ImageView backgroundTile;

        public GifShareMomentBackgroundHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new GifShareMomentBackgroundHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90382131494265, viewGroup, false));
    }
}
