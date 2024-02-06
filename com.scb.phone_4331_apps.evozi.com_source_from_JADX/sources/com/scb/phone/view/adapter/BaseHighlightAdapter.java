package com.scb.phone.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.ForwardingListenableFuture;
import p040o.ItemCustom;
import p040o.isReset;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class BaseHighlightAdapter<DISPLAY extends ForwardingListenableFuture, ITEMS extends ArrayList<DISPLAY>> extends ItemCustom<DISPLAY, BannerViewHolder> {
    private write<DISPLAY> MediaBrowserCompat$ItemReceiver;
    private ITEMS write;

    public interface write<DISPLAY extends ForwardingListenableFuture> {
        void IconCompatParcelizer(DISPLAY display);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90642131494291, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new BannerViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        BannerViewHolder bannerViewHolder = (BannerViewHolder) setcontentview;
        onGetStartedClick.write((Object) bannerViewHolder, Promotion.ACTION_VIEW);
        Object obj = this.write.get(read(i));
        onGetStartedClick.IconCompatParcelizer(obj, "items[realPosition]");
        ForwardingListenableFuture forwardingListenableFuture = (ForwardingListenableFuture) obj;
        write<DISPLAY> write2 = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) forwardingListenableFuture, "display");
        onGetStartedClick.write((Object) write2, "onHolderClickListener");
        bannerViewHolder.write.setOnClickListener(new BannerViewHolder.IconCompatParcelizer(write2, forwardingListenableFuture));
        TextView textView = bannerViewHolder.tvHighlightTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHighlightTitle");
        }
        textView.setText(forwardingListenableFuture.IconCompatParcelizer());
        ImageView imageView = bannerViewHolder.ivHighlight;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivHighlight");
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView, forwardingListenableFuture.MediaBrowserCompat$CustomActionResultReceiver(), (isReset) ((isReset) ((isReset) new isReset().IconCompatParcelizer(forwardingListenableFuture.read())).MediaBrowserCompat$CustomActionResultReceiver(forwardingListenableFuture.read())).MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final class BannerViewHolder_ViewBinding implements Unbinder {
        private BannerViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public BannerViewHolder_ViewBinding(BannerViewHolder bannerViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bannerViewHolder;
            bannerViewHolder.tvHighlightTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_highlight_title, "field 'tvHighlightTitle'", TextView.class);
            bannerViewHolder.ivHighlight = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_highlight, "field 'ivHighlight'", ImageView.class);
        }

        public final void read() {
            BannerViewHolder bannerViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bannerViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                bannerViewHolder.tvHighlightTitle = null;
                bannerViewHolder.ivHighlight = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseHighlightAdapter(ITEMS items, write<DISPLAY> write2) {
        super(items);
        onGetStartedClick.write((Object) items, "items");
        onGetStartedClick.write((Object) write2, "onClick");
        this.write = items;
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public static final class BannerViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivHighlight;
        @BindView
        public TextView tvHighlightTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BannerViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ write read;
            private /* synthetic */ ForwardingListenableFuture write;

            IconCompatParcelizer(write write2, ForwardingListenableFuture forwardingListenableFuture) {
                this.read = write2;
                this.write = forwardingListenableFuture;
            }

            public final void onClick(View view) {
                this.read.IconCompatParcelizer(this.write);
            }
        }
    }
}
