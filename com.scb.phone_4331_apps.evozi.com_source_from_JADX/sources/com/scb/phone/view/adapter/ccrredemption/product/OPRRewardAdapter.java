package com.scb.phone.view.adapter.ccrredemption.product;

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
import java.util.ArrayList;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.JustForYouApi;
import p040o.abandon;
import p040o.getNameSuffix;
import p040o.hashCode;
import p040o.hashCode$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.intoSet;
import p040o.isReset;
import p040o.onStart;
import p040o.performCreate;
import p040o.postAddressesValidation;

public class OPRRewardAdapter extends postAddressesValidation {
    public List<intoSet> MediaBrowserCompat$ItemReceiver = new ArrayList();
    @HmlPinActivity
    public hashCode glide;
    public getNameSuffix write;

    public class RewardViewHolder_ViewBinding implements Unbinder {
        private RewardViewHolder write;

        public RewardViewHolder_ViewBinding(RewardViewHolder rewardViewHolder, View view) {
            this.write = rewardViewHolder;
            rewardViewHolder.imvReward = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_reward, "field 'imvReward'", ImageView.class);
            rewardViewHolder.txvRewardName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reward_name, "field 'txvRewardName'", TextView.class);
            rewardViewHolder.txvRewardCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reward_code, "field 'txvRewardCode'", TextView.class);
        }

        public final void read() {
            RewardViewHolder rewardViewHolder = this.write;
            if (rewardViewHolder != null) {
                this.write = null;
                rewardViewHolder.imvReward = null;
                rewardViewHolder.txvRewardName = null;
                rewardViewHolder.txvRewardCode = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup) {
        return new RewardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91992131494426, viewGroup, false));
    }

    public final int write() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof RewardViewHolder) {
            RewardViewHolder rewardViewHolder = (RewardViewHolder) setcontentview;
            intoSet intoset = this.MediaBrowserCompat$ItemReceiver.get(i);
            rewardViewHolder.txvRewardName.setText(intoset.MediaSessionCompat$QueueItem);
            rewardViewHolder.txvRewardCode.setText(rewardViewHolder.txvRewardCode.getContext().getString(R.string.item_code, new Object[]{intoset.MediaSessionCompat$Token}));
            if (intoset.MediaDescriptionCompat != null) {
                hashCode hashcode = this.glide;
                if (hashcode != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
                    sb.append(intoset.MediaDescriptionCompat);
                    hashcode.MediaBrowserCompat$ItemReceiver(sb.toString()).MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) ((isReset) ((isReset) new isReset().read(true)).MediaBrowserCompat$CustomActionResultReceiver(performCreate.read)).IconCompatParcelizer((int) R.drawable.donations_place_holder)).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder)).MediaBrowserCompat$ItemReceiver(rewardViewHolder.imvReward);
                }
            } else {
                rewardViewHolder.imvReward.setImageResource(R.drawable.donations_place_holder);
            }
            rewardViewHolder.write.setOnClickListener(new JustForYouApi(this, intoset));
        }
    }

    public final void write(RecyclerView.setContentView setcontentview) {
        super.write(setcontentview);
        if (setcontentview instanceof RewardViewHolder) {
            RewardViewHolder rewardViewHolder = (RewardViewHolder) setcontentview;
            hashCode hashcode = this.glide;
            if (hashcode != null) {
                hashcode.MediaBrowserCompat$CustomActionResultReceiver(new hashCode$MediaBrowserCompat$CustomActionResultReceiver(rewardViewHolder.imvReward));
            }
            rewardViewHolder.imvReward.setImageDrawable((Drawable) null);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
        if (!(setcontentview instanceof RewardViewHolder)) {
            return false;
        }
        hashCode hashcode = this.glide;
        if (hashcode == null) {
            return true;
        }
        hashcode.MediaBrowserCompat$CustomActionResultReceiver(new hashCode$MediaBrowserCompat$CustomActionResultReceiver(((RewardViewHolder) setcontentview).imvReward));
        return true;
    }

    static class RewardViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imvReward;
        @BindView
        TextView txvRewardCode;
        @BindView
        TextView txvRewardName;

        RewardViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
