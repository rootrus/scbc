package com.scb.phone.view.adapter.findus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.BulkTransferService;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.onStart;

public final class SelectProvinceOrDistrictAdapter extends RecyclerView.IconCompatParcelizer<ViewHolder> {
    private Context MediaBrowserCompat$ItemReceiver;
    private List<String> read;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment write;

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder MediaBrowserCompat$ItemReceiver;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = viewHolder;
            viewHolder.relativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.relative_layout, "field 'relativeLayout'", RelativeLayout.class);
            viewHolder.textView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_text_view, "field 'textView'", TextView.class);
            viewHolder.footerDivider = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDivider'");
            viewHolder.footer = onStart.IconCompatParcelizer(view, R.id.footer_view, "field 'footer'");
        }

        public final void read() {
            ViewHolder viewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (viewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                viewHolder.relativeLayout = null;
                viewHolder.textView = null;
                viewHolder.footerDivider = null;
                viewHolder.footer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ViewHolder viewHolder = (ViewHolder) setcontentview;
        viewHolder.textView.setText(this.read.get(i));
        if (i < this.read.size() - 1) {
            viewHolder.footerDivider.setVisibility(8);
            viewHolder.footer.setVisibility(8);
        } else {
            viewHolder.footerDivider.setVisibility(0);
            viewHolder.footer.setVisibility(0);
        }
        viewHolder.relativeLayout.setOnClickListener(new BulkTransferService(this, i));
    }

    public SelectProvinceOrDistrictAdapter(Context context, List<String> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = list;
        this.write = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class ViewHolder extends RecyclerView.setContentView {
        @BindView
        View footer;
        @BindView
        View footerDivider;
        @BindView
        RelativeLayout relativeLayout;
        @BindView
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.MediaBrowserCompat$ItemReceiver).inflate(R.layout.f83612131493587, viewGroup, false));
    }
}
