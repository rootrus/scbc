package com.scb.phone.view.adapter.ccrredemption.product;

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
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.getFatca;
import p040o.insightsHeader;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.validateInterface;
import p040o.zaz;

public final class EligiblePrivilegesAdapter extends onActivityCreated {
    public List<validateInterface> MediaBrowserCompat$CustomActionResultReceiver;
    public getFatca read;
    private zaz write;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder write;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.write = itemViewHolder;
            itemViewHolder.tierImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tier_image, "field 'tierImage'", ImageView.class);
            itemViewHolder.tierRewardLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tier_reward_label, "field 'tierRewardLabel'", TextView.class);
            itemViewHolder.tierRange = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tier_range, "field 'tierRange'", TextView.class);
            itemViewHolder.expiryDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expiry_date, "field 'expiryDate'", TextView.class);
            itemViewHolder.redeemLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.redeem_layout, "field 'redeemLayout'", ViewGroup.class);
            itemViewHolder.redeemEarlierPrivilege = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.redeem_earlier_privilege, "field 'redeemEarlierPrivilege'", TextView.class);
            itemViewHolder.privilegeItemView = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.privilege_item_view, "field 'privilegeItemView'", ViewGroup.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.write;
            if (itemViewHolder != null) {
                this.write = null;
                itemViewHolder.tierImage = null;
                itemViewHolder.tierRewardLabel = null;
                itemViewHolder.tierRange = null;
                itemViewHolder.expiryDate = null;
                itemViewHolder.redeemLayout = null;
                itemViewHolder.redeemEarlierPrivilege = null;
                itemViewHolder.privilegeItemView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public EligiblePrivilegesAdapter(List<validateInterface> list, getFatca getfatca, zaz zaz) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list == null ? new ArrayList<>() : list;
        this.read = getfatca;
        this.write = zaz;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView expiryDate;
        @BindView
        ViewGroup privilegeItemView;
        @BindView
        TextView redeemEarlierPrivilege;
        @BindView
        ViewGroup redeemLayout;
        @BindView
        ImageView tierImage;
        @BindView
        TextView tierRange;
        @BindView
        TextView tierRewardLabel;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f85422131493769, viewGroup, false);
        validateInterface validateinterface = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        if (validateinterface != null) {
            String str = validateinterface.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                Picasso picasso = this.write.read;
                StringBuilder sb = new StringBuilder();
                sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
                sb.append(str);
                picasso.write(sb.toString()).IconCompatParcelizer((int) R.drawable.placeholder_tier_primary).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(itemViewHolder.tierImage, (FragmentBuilder_BindEkycFragment) null);
            } else {
                itemViewHolder.tierImage.setImageResource(R.drawable.placeholder_tier_primary);
            }
            itemViewHolder.tierRewardLabel.setText(validateinterface.MediaBrowserCompat$CustomActionResultReceiver);
            itemViewHolder.tierRange.setText(String.format(validateinterface.read, new Object[0]));
            if (i > 0) {
                if ((i > 0 || i <= this.MediaBrowserCompat$CustomActionResultReceiver.size()) && this.MediaBrowserCompat$CustomActionResultReceiver.get(i).IconCompatParcelizer.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver.get(i + -1).IconCompatParcelizer)) {
                    itemViewHolder.redeemEarlierPrivilege.setVisibility(0);
                    itemViewHolder.redeemLayout.setVisibility(8);
                }
            }
            itemViewHolder.redeemLayout.setVisibility(0);
            itemViewHolder.expiryDate.setText(validateinterface.write);
            itemViewHolder.redeemEarlierPrivilege.setVisibility(8);
            itemViewHolder.privilegeItemView.setOnClickListener(new insightsHeader(this, i));
        }
        viewGroup.addView(inflate, 0);
        return inflate;
    }
}
