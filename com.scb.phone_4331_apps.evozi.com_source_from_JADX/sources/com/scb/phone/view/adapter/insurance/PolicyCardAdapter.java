package com.scb.phone.view.adapter.insurance;

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
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsController;
import p040o.isReset;
import p040o.onCreatePanelMenu;
import p040o.onGetStartedClick;
import p040o.onPostResume;
import p040o.onStart;

public final class PolicyCardAdapter extends RecyclerView.IconCompatParcelizer<PolicyCardViewHolder> {
    public ArrayList<CrashlyticsController.SessionPartFileFilter> read;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90692131494296, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…licy_card, parent, false)");
        return new PolicyCardViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        PolicyCardViewHolder policyCardViewHolder = (PolicyCardViewHolder) setcontentview;
        onGetStartedClick.write((Object) policyCardViewHolder, "holder");
        CrashlyticsController.SessionPartFileFilter sessionPartFileFilter = this.read.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) sessionPartFileFilter, "policyInfoList[position]");
        CrashlyticsController.SessionPartFileFilter sessionPartFileFilter2 = sessionPartFileFilter;
        onGetStartedClick.write((Object) sessionPartFileFilter2, "item");
        ImageView imageView = policyCardViewHolder.ivProductTypeIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivProductTypeIcon");
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView, sessionPartFileFilter2.MediaBrowserCompat$SearchResultReceiver, (isReset) ((isReset) ((isReset) new isReset().IconCompatParcelizer((int) R.drawable.biller_place_holder)).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.biller_place_holder)).MediaBrowserCompat$ItemReceiver(onCreatePanelMenu.IconCompatParcelizer, new onPostResume(), true));
        ImageView imageView2 = policyCardViewHolder.ivPartnerIcon;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivPartnerIcon");
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView2, sessionPartFileFilter2.MediaDescriptionCompat, (isReset) ((isReset) ((isReset) new isReset().IconCompatParcelizer((int) R.drawable.biller_place_holder)).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.biller_place_holder)).MediaBrowserCompat$ItemReceiver(onCreatePanelMenu.IconCompatParcelizer, new onPostResume(), true));
        TextView textView = policyCardViewHolder.tvProductTypeName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProductTypeName");
        }
        textView.setText(sessionPartFileFilter2.MediaMetadataCompat);
        TextView textView2 = policyCardViewHolder.tvProductName;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProductName");
        }
        textView2.setText(sessionPartFileFilter2.RatingCompat);
        TextView textView3 = policyCardViewHolder.tvPolicyNo;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPolicyNo");
        }
        textView3.setText(sessionPartFileFilter2.MediaBrowserCompat$MediaItem);
        TextView textView4 = policyCardViewHolder.tvEffectiveDate;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEffectiveDate");
        }
        textView4.setText(sessionPartFileFilter2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public PolicyCardAdapter(ArrayList<CrashlyticsController.SessionPartFileFilter> arrayList) {
        onGetStartedClick.write((Object) arrayList, "policyInfoList");
        this.read = arrayList;
    }

    public final class PolicyCardViewHolder_ViewBinding implements Unbinder {
        private PolicyCardViewHolder write;

        public PolicyCardViewHolder_ViewBinding(PolicyCardViewHolder policyCardViewHolder, View view) {
            this.write = policyCardViewHolder;
            policyCardViewHolder.ivProductTypeIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_product_type_icon, "field 'ivProductTypeIcon'", ImageView.class);
            policyCardViewHolder.ivPartnerIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_partner_icon, "field 'ivPartnerIcon'", ImageView.class);
            policyCardViewHolder.tvProductTypeName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_type_name, "field 'tvProductTypeName'", TextView.class);
            policyCardViewHolder.tvProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_name, "field 'tvProductName'", TextView.class);
            policyCardViewHolder.tvPolicyNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_policy_no, "field 'tvPolicyNo'", TextView.class);
            policyCardViewHolder.tvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_effective_date, "field 'tvEffectiveDate'", TextView.class);
        }

        public final void read() {
            PolicyCardViewHolder policyCardViewHolder = this.write;
            if (policyCardViewHolder != null) {
                this.write = null;
                policyCardViewHolder.ivProductTypeIcon = null;
                policyCardViewHolder.ivPartnerIcon = null;
                policyCardViewHolder.tvProductTypeName = null;
                policyCardViewHolder.tvProductName = null;
                policyCardViewHolder.tvPolicyNo = null;
                policyCardViewHolder.tvEffectiveDate = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class PolicyCardViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivPartnerIcon;
        @BindView
        public ImageView ivProductTypeIcon;
        @BindView
        public TextView tvEffectiveDate;
        @BindView
        public TextView tvPolicyNo;
        @BindView
        public TextView tvProductName;
        @BindView
        public TextView tvProductTypeName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PolicyCardViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "inflate");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }
}
