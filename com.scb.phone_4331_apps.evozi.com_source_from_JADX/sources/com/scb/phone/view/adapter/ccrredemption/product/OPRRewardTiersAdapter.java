package com.scb.phone.view.adapter.ccrredemption.product;

import android.graphics.PorterDuff;
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
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import p040o.C4283discover;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.HmlPinActivity;
import p040o.deviceState;
import p040o.getAddressDetails;
import p040o.getNationality;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.zaz;

public class OPRRewardTiersAdapter extends RecyclerView.IconCompatParcelizer<TierViewHolder> {
    public List<C4283discover> MediaBrowserCompat$ItemReceiver = new ArrayList();
    private zaz MediaBrowserCompat$MediaItem;
    public getNationality read;
    public int write;

    public class TierViewHolder_ViewBinding implements Unbinder {
        private TierViewHolder IconCompatParcelizer;

        public TierViewHolder_ViewBinding(TierViewHolder tierViewHolder, View view) {
            this.IconCompatParcelizer = tierViewHolder;
            tierViewHolder.imvTier = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_tier, "field 'imvTier'", ImageView.class);
            tierViewHolder.txvTierName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_tier_name, "field 'txvTierName'", TextView.class);
            tierViewHolder.txvTierRange = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_tier_range, "field 'txvTierRange'", TextView.class);
            tierViewHolder.txvRewardCount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reward_count, "field 'txvRewardCount'", TextView.class);
        }

        public final void read() {
            TierViewHolder tierViewHolder = this.IconCompatParcelizer;
            if (tierViewHolder != null) {
                this.IconCompatParcelizer = null;
                tierViewHolder.imvTier = null;
                tierViewHolder.txvTierName = null;
                tierViewHolder.txvTierRange = null;
                tierViewHolder.txvRewardCount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        TierViewHolder tierViewHolder = (TierViewHolder) setcontentview;
        C4283discover discover = this.MediaBrowserCompat$ItemReceiver.get(i);
        tierViewHolder.txvTierName.setText(discover.IconCompatParcelizer);
        tierViewHolder.txvTierRange.setText(discover.MediaBrowserCompat$MediaItem);
        if (discover.read > 0) {
            tierViewHolder.txvRewardCount.setVisibility(0);
            tierViewHolder.txvRewardCount.setText(String.valueOf(discover.read));
        } else {
            tierViewHolder.txvRewardCount.setVisibility(8);
        }
        if (discover.MediaBrowserCompat$CustomActionResultReceiver != null) {
            Picasso picasso = this.MediaBrowserCompat$MediaItem.read;
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(discover.MediaBrowserCompat$CustomActionResultReceiver);
            picasso.write(sb.toString()).IconCompatParcelizer((int) R.drawable.placeholder_tier_grey).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(tierViewHolder.imvTier, new deviceState(this.MediaBrowserCompat$MediaItem, discover.MediaBrowserCompat$CustomActionResultReceiver));
        } else {
            tierViewHolder.imvTier.setImageResource(R.drawable.placeholder_tier_grey);
        }
        if (i == this.write) {
            tierViewHolder.imvTier.setColorFilter(setLastBaselineToBottomHeight.read(tierViewHolder.imvTier.getContext(), R.color.f65622131099715), PorterDuff.Mode.SRC_IN);
        } else {
            tierViewHolder.imvTier.clearColorFilter();
        }
        tierViewHolder.write.setOnClickListener(new getAddressDetails(this, i));
    }

    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
        Picasso picasso = this.MediaBrowserCompat$MediaItem.read;
        ImageView imageView = ((TierViewHolder) setcontentview).imvTier;
        if (imageView != null) {
            picasso.write((Object) imageView);
            return true;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public final /* synthetic */ void write(RecyclerView.setContentView setcontentview) {
        TierViewHolder tierViewHolder = (TierViewHolder) setcontentview;
        super.write(tierViewHolder);
        tierViewHolder.imvTier.setImageDrawable((Drawable) null);
        Picasso picasso = this.MediaBrowserCompat$MediaItem.read;
        ImageView imageView = tierViewHolder.imvTier;
        if (imageView != null) {
            picasso.write((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    @HmlPinActivity
    public OPRRewardTiersAdapter(zaz zaz) {
        this.MediaBrowserCompat$MediaItem = zaz;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    static class TierViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imvTier;
        @BindView
        TextView txvRewardCount;
        @BindView
        TextView txvTierName;
        @BindView
        TextView txvTierRange;

        TierViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new TierViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91582131494385, viewGroup, false));
    }
}
