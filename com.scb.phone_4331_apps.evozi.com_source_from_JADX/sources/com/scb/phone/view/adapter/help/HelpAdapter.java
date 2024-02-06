package com.scb.phone.view.adapter.help;

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
import java.util.List;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.confirmBulkTransfer;
import p040o.onStart;

public final class HelpAdapter extends RecyclerView.IconCompatParcelizer<MoreOptionsHolder> {
    private String MediaBrowserCompat$ItemReceiver;
    private List<String> read;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment write;

    public class MoreOptionsHolder_ViewBinding implements Unbinder {
        private MoreOptionsHolder IconCompatParcelizer;

        public MoreOptionsHolder_ViewBinding(MoreOptionsHolder moreOptionsHolder, View view) {
            this.IconCompatParcelizer = moreOptionsHolder;
            moreOptionsHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_container_relative_layout, "field 'container'", RelativeLayout.class);
            moreOptionsHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_title_text_view, "field 'title'", TextView.class);
            moreOptionsHolder.appVersion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.app_version, "field 'appVersion'", TextView.class);
            moreOptionsHolder.divider = onStart.IconCompatParcelizer(view, R.id.more_option_divider_view, "field 'divider'");
            moreOptionsHolder.fullDivider = onStart.IconCompatParcelizer(view, R.id.more_option_full_divider_view, "field 'fullDivider'");
            moreOptionsHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_option_image_view, "field 'icon'", ImageView.class);
        }

        public final void read() {
            MoreOptionsHolder moreOptionsHolder = this.IconCompatParcelizer;
            if (moreOptionsHolder != null) {
                this.IconCompatParcelizer = null;
                moreOptionsHolder.container = null;
                moreOptionsHolder.title = null;
                moreOptionsHolder.appVersion = null;
                moreOptionsHolder.divider = null;
                moreOptionsHolder.fullDivider = null;
                moreOptionsHolder.icon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MoreOptionsHolder moreOptionsHolder = (MoreOptionsHolder) setcontentview;
        moreOptionsHolder.title.setText(this.read.get(i));
        moreOptionsHolder.icon.setVisibility(8);
        moreOptionsHolder.appVersion.setVisibility(8);
        if (i == this.read.size() - 1) {
            moreOptionsHolder.fullDivider.setVisibility(0);
            moreOptionsHolder.divider.setVisibility(8);
        } else {
            moreOptionsHolder.fullDivider.setVisibility(8);
            moreOptionsHolder.divider.setVisibility(0);
        }
        moreOptionsHolder.container.setOnClickListener(new confirmBulkTransfer(this, i));
        moreOptionsHolder.appVersion.setText(this.MediaBrowserCompat$ItemReceiver);
    }

    public HelpAdapter(Context context, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment, List<String> list) {
        this.write = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
        this.read = list;
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
        View fullDivider;
        @BindView
        ImageView icon;
        @BindView
        TextView title;

        MoreOptionsHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new MoreOptionsHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83372131493563, viewGroup, false));
    }
}
