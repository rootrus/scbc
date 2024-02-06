package com.scb.phone.view.adapter.demontb;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getAppConfig;
import p040o.onStart;

public final class BankingServiceAdapter extends RecyclerView.IconCompatParcelizer<CustomViewHolder> {
    private final Context MediaBrowserCompat$ItemReceiver;
    private final List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> read;
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindBaseRequestToPayFragment write;

    public class CustomViewHolder_ViewBinding implements Unbinder {
        private CustomViewHolder IconCompatParcelizer;

        public CustomViewHolder_ViewBinding(CustomViewHolder customViewHolder, View view) {
            this.IconCompatParcelizer = customViewHolder;
            customViewHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banking_action_icon, "field 'icon'", ImageView.class);
            customViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banking_action_description, "field 'description'", TextView.class);
        }

        public final void read() {
            CustomViewHolder customViewHolder = this.IconCompatParcelizer;
            if (customViewHolder != null) {
                this.IconCompatParcelizer = null;
                customViewHolder.icon = null;
                customViewHolder.description = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CustomViewHolder customViewHolder = (CustomViewHolder) setcontentview;
        customViewHolder.setHasDecor = i;
        customViewHolder.description.setText(this.read.get(i).ListMenuItemView);
        customViewHolder.icon.setPadding((int) TypedValue.applyDimension(1, 20.0f, this.MediaBrowserCompat$ItemReceiver.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, this.MediaBrowserCompat$ItemReceiver.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, this.MediaBrowserCompat$ItemReceiver.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, this.MediaBrowserCompat$ItemReceiver.getResources().getDisplayMetrics()));
        FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(this.read.get(i).RatingCompat);
        write2.write = true;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = write2.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read2.IconCompatParcelizer) {
            read2.MediaBrowserCompat$ItemReceiver = true;
            write2.read(customViewHolder.icon, (FragmentBuilder_BindEkycFragment) null);
            if (i / 3 == this.read.size() / 3) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 0, 0, (int) TypedValue.applyDimension(1, 70.0f, this.MediaBrowserCompat$ItemReceiver.getResources().getDisplayMetrics()));
                customViewHolder.write.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public BankingServiceAdapter(Context context, FragmentBuilder_BindBaseRequestToPayFragment fragmentBuilder_BindBaseRequestToPayFragment, List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        this.write = fragmentBuilder_BindBaseRequestToPayFragment;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class CustomViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView description;
        @BindView
        ImageView icon;
        public int setHasDecor;

        CustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            view.setOnClickListener(new getAppConfig(this));
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82262131493452, (ViewGroup) null));
    }
}
