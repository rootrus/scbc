package com.scb.phone.view.adapter.easycash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.getBillPaymentEDonationReview;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public class AccountSelectorAdapter extends onActivityCreated {
    public int IconCompatParcelizer = 0;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    public List<CrashlyticsReport.FilesPayload.File.Builder> read;
    private Context write;

    /* access modifiers changed from: protected */
    public int IconCompatParcelizer() {
        return R.layout.f82182131493444;
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* access modifiers changed from: protected */
    public void read(int i) {
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_linear_layout, "field 'background'", LinearLayout.class);
            itemViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_name_text_view, "field 'title'", TextView.class);
            itemViewHolder.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_funds_text_view, "field 'subtitle'", TextView.class);
        }

        public void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.background = null;
                itemViewHolder.title = null;
                itemViewHolder.subtitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AccountSelectorAdapter(Context context, List<CrashlyticsReport.FilesPayload.File.Builder> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.write = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = list == null ? new ArrayList<>() : list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver.inflate(IconCompatParcelizer(), viewGroup, false);
        CrashlyticsReport.FilesPayload.File.Builder builder = this.read.get(i);
        ItemViewHolder read2 = read();
        if (builder != null) {
            if (builder.AlertController$RecycleListView) {
                read2.title.setVisibility(8);
            }
            read2.title.setText(builder.Keep);
            TextView textView = read2.title;
            StringBuilder sb = new StringBuilder();
            sb.append("TAG_ACCOUNT_SELECTOR_ADAPTER_TEXT");
            sb.append(i);
            textView.setTag(sb.toString());
            read2.subtitle.setText(builder.MediaSessionCompat$Token);
            LinearLayout linearLayout = read2.background;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TAG_ACCOUNT_SELECTOR_ADAPTER_BACKGROUND");
            sb2.append(i);
            linearLayout.setTag(sb2.toString());
            if (this.IconCompatParcelizer == i) {
                read2.background.setBackground(setLastBaselineToBottomHeight.write(this.write, R.drawable.rounded_purple_view_pager));
                read2.title.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66092131099764));
            } else {
                read2.background.setBackground(setLastBaselineToBottomHeight.write(this.write, R.drawable.bg_white_rounded));
                read2.title.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66182131099773));
            }
        }
        viewGroup.addView(this.MediaBrowserCompat$MediaItem, 0);
        read2.background.setOnClickListener(new getBillPaymentEDonationReview(this, i));
        read(i);
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public final View MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public ItemViewHolder read() {
        return new ItemViewHolder(this.MediaBrowserCompat$MediaItem);
    }

    public int getCount() {
        List<CrashlyticsReport.FilesPayload.File.Builder> list = this.read;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        LinearLayout background;
        @BindView
        TextView subtitle;
        @BindView
        TextView title;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
