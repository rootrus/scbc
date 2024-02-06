package com.scb.phone.view.adapter.moreoptions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.FragmentBuilder_BindBaseReviewFragment;
import p040o.getLinkRtp;
import p040o.getPaymentBillPartner;
import p040o.onStart;

public final class MoreOptionsAdapter extends RecyclerView.IconCompatParcelizer<MoreOptionsHolder> {
    private String MediaBrowserCompat$ItemReceiver;
    private final boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaMetadataCompat;
    public ArrayList<getPaymentBillPartner> read;
    public FragmentBuilder_BindBaseReviewFragment write;

    public class MoreOptionsHolder_ViewBinding implements Unbinder {
        private MoreOptionsHolder MediaBrowserCompat$ItemReceiver;

        public MoreOptionsHolder_ViewBinding(MoreOptionsHolder moreOptionsHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = moreOptionsHolder;
            moreOptionsHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_container_relative_layout, "field 'container'", RelativeLayout.class);
            moreOptionsHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_title_text_view, "field 'title'", TextView.class);
            moreOptionsHolder.appVersion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.app_version, "field 'appVersion'", TextView.class);
            moreOptionsHolder.divider = onStart.IconCompatParcelizer(view, R.id.more_option_divider_view, "field 'divider'");
            moreOptionsHolder.full_divider = onStart.IconCompatParcelizer(view, R.id.more_option_full_divider_view, "field 'full_divider'");
            moreOptionsHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_image_view, "field 'icon'", ImageView.class);
        }

        public final void read() {
            MoreOptionsHolder moreOptionsHolder = this.MediaBrowserCompat$ItemReceiver;
            if (moreOptionsHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                moreOptionsHolder.container = null;
                moreOptionsHolder.title = null;
                moreOptionsHolder.appVersion = null;
                moreOptionsHolder.divider = null;
                moreOptionsHolder.full_divider = null;
                moreOptionsHolder.icon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MoreOptionsHolder moreOptionsHolder = (MoreOptionsHolder) setcontentview;
        moreOptionsHolder.title.setText(this.read.get(i).title);
        moreOptionsHolder.icon.setImageResource(this.read.get(i).icon);
        if (i == this.read.size() - 1) {
            moreOptionsHolder.full_divider.setVisibility(0);
            moreOptionsHolder.divider.setVisibility(8);
            moreOptionsHolder.appVersion.setVisibility(0);
        } else {
            moreOptionsHolder.full_divider.setVisibility(8);
            moreOptionsHolder.divider.setVisibility(0);
            moreOptionsHolder.appVersion.setVisibility(8);
        }
        moreOptionsHolder.container.setOnClickListener(new getLinkRtp(this, i));
        moreOptionsHolder.appVersion.setText(this.MediaBrowserCompat$ItemReceiver);
    }

    public MoreOptionsAdapter(Context context, FragmentBuilder_BindBaseReviewFragment fragmentBuilder_BindBaseReviewFragment, boolean z, boolean z2) {
        this.MediaMetadataCompat = z;
        this.write = fragmentBuilder_BindBaseReviewFragment;
        this.MediaBrowserCompat$SearchResultReceiver = z2;
        ArrayList<getPaymentBillPartner> arrayList = new ArrayList<>();
        this.read = arrayList;
        arrayList.addAll(getPaymentBillPartner.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver));
        if (!this.MediaMetadataCompat && !this.MediaBrowserCompat$SearchResultReceiver) {
            this.read.remove(getPaymentBillPartner.GIFTING);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.app_version, new Object[]{"3.40.1"}));
        sb.append(" (");
        sb.append(4331);
        sb.append(")");
        this.MediaBrowserCompat$ItemReceiver = sb.toString();
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class MoreOptionsHolder extends RecyclerView.setContentView {
        @BindView
        TextView appVersion;
        @BindView
        RelativeLayout container;
        @BindView
        View divider;
        @BindView
        View full_divider;
        @BindView
        ImageView icon;
        @BindView
        TextView title;

        public MoreOptionsHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new MoreOptionsHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83372131493563, viewGroup, false));
    }
}
