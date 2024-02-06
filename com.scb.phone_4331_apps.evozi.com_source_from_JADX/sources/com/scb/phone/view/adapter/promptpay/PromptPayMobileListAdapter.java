package com.scb.phone.view.adapter.promptpay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.animateCameraWithCallback;
import p040o.getDonationList;
import p040o.getOverflowCount;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PromptPayMobileListAdapter extends RecyclerView.IconCompatParcelizer<PromptPayListView> {
    private List<getOverflowCount> MediaBrowserCompat$ItemReceiver;
    private int read = -1;
    public write write;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(getOverflowCount getoverflowcount, boolean z);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        PromptPayListView promptPayListView = (PromptPayListView) setcontentview;
        getOverflowCount getoverflowcount = this.MediaBrowserCompat$ItemReceiver.get(i);
        promptPayListView.mobileCheckbox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        promptPayListView.mobileTextValue.setText(getoverflowcount.RatingCompat);
        promptPayListView.mobileCheckbox.setChecked(getoverflowcount.write);
        if (this.write != null && getoverflowcount.write) {
            this.write.MediaBrowserCompat$ItemReceiver(getoverflowcount, true);
            write(i);
        }
        promptPayListView.linearLayout.setOnClickListener(new getDonationList(this, promptPayListView, getoverflowcount, i));
        if (this.MediaBrowserCompat$ItemReceiver.size() - 1 == i) {
            promptPayListView.dividerView.setVisibility(8);
            promptPayListView.footerDividerView.setVisibility(0);
        } else {
            promptPayListView.dividerView.setVisibility(0);
            promptPayListView.footerDividerView.setVisibility(8);
        }
        String str = getoverflowcount.MediaMetadataCompat;
        if (animateCameraWithCallback.MOB.name().equalsIgnoreCase(str)) {
            promptPayListView.ivProxyType.setImageResource(R.drawable.ic_mobile);
        }
        if (animateCameraWithCallback.CID.name().equalsIgnoreCase(str)) {
            promptPayListView.ivProxyType.setImageResource(R.drawable.ic_cid);
        }
    }

    public class PromptPayListView_ViewBinding implements Unbinder {
        private View IconCompatParcelizer;
        private PromptPayListView MediaBrowserCompat$ItemReceiver;

        public PromptPayListView_ViewBinding(final PromptPayListView promptPayListView, View view) {
            this.MediaBrowserCompat$ItemReceiver = promptPayListView;
            promptPayListView.linearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.holder_linear_layout, "field 'linearLayout'", LinearLayout.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.mobile_checkbox, "field 'mobileCheckbox' and method 'onMobileCheckBoxClick'");
            promptPayListView.mobileCheckbox = (CheckBox) onStart.write(IconCompatParcelizer2, R.id.mobile_checkbox, "field 'mobileCheckbox'", CheckBox.class);
            this.IconCompatParcelizer = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    PromptPayListView.this.onMobileCheckBoxClick();
                }
            });
            promptPayListView.mobileTextValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_number_value, "field 'mobileTextValue'", TextView.class);
            promptPayListView.dividerView = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'dividerView'");
            promptPayListView.footerDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDividerView'");
            promptPayListView.ivProxyType = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_proxy_type, "field 'ivProxyType'", ImageView.class);
        }

        public final void read() {
            PromptPayListView promptPayListView = this.MediaBrowserCompat$ItemReceiver;
            if (promptPayListView != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                promptPayListView.linearLayout = null;
                promptPayListView.mobileCheckbox = null;
                promptPayListView.mobileTextValue = null;
                promptPayListView.dividerView = null;
                promptPayListView.footerDividerView = null;
                promptPayListView.ivProxyType = null;
                this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PromptPayMobileListAdapter(List<getOverflowCount> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void write(int i) {
        int i2 = this.read;
        if (i2 != i) {
            if (i2 != -1) {
                this.MediaBrowserCompat$ItemReceiver.get(i2).write = false;
            }
            this.MediaBrowserCompat$ItemReceiver.get(i).write = true;
            this.read = i;
        }
    }

    public class PromptPayListView extends RecyclerView.setContentView {
        public boolean AlertController$RecycleListView = false;
        public boolean Keep = false;
        @BindView
        View dividerView;
        @BindView
        View footerDividerView;
        @BindView
        ImageView ivProxyType;
        @BindView
        LinearLayout linearLayout;
        @BindView
        public CheckBox mobileCheckbox;
        @BindView
        TextView mobileTextValue;

        PromptPayListView(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        @OnClick
        public void onMobileCheckBoxClick() {
            if (!this.AlertController$RecycleListView) {
                this.Keep = true;
                this.write.callOnClick();
            }
            this.Keep = false;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new PromptPayListView(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84492131493675, (ViewGroup) null));
    }
}
