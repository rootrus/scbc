package com.scb.phone.view.adapter.investment.discover;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$QueueItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.FundFactSheetActivity;
import p040o.GoogleSigninService;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.isAutomaticDataCollectionEnabled;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setCrashlyticsDataCollectionEnabled;

public final class DiscoverTopListRecyclerAdapter extends RecyclerView.IconCompatParcelizer<GroupItemViewHolder> {
    /* access modifiers changed from: private */
    public final FundFactSheetActivity<setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;
    private final List<isAutomaticDataCollectionEnabled> read;
    public RecyclerView$MediaSessionCompat$QueueItem write;

    public enum write {
        Header,
        Item,
        ItemRemark
    }

    public final class GroupItemViewHolder_ViewBinding implements Unbinder {
        private GroupItemViewHolder IconCompatParcelizer;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            this.IconCompatParcelizer = groupItemViewHolder;
            groupItemViewHolder.textDiscoverFundTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textDiscoverFundTitle, "field 'textDiscoverFundTitle'", TextView.class);
            groupItemViewHolder.ivExpandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivExpandIcon, "field 'ivExpandIcon'", ImageView.class);
            groupItemViewHolder.recyclerViewFunds = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recyclerViewFunds, "field 'recyclerViewFunds'", RecyclerView.class);
            groupItemViewHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
            groupItemViewHolder.layoutFunds = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutFunds, "field 'layoutFunds'", ViewGroup.class);
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.IconCompatParcelizer;
            if (groupItemViewHolder != null) {
                this.IconCompatParcelizer = null;
                groupItemViewHolder.textDiscoverFundTitle = null;
                groupItemViewHolder.ivExpandIcon = null;
                groupItemViewHolder.recyclerViewFunds = null;
                groupItemViewHolder.divider = null;
                groupItemViewHolder.layoutFunds = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82912131493517, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new GroupItemViewHolder(this, inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        GroupItemViewHolder groupItemViewHolder = (GroupItemViewHolder) setcontentview;
        onGetStartedClick.write((Object) groupItemViewHolder, "holder");
        isAutomaticDataCollectionEnabled isautomaticdatacollectionenabled = this.read.get(i);
        onGetStartedClick.write((Object) isautomaticdatacollectionenabled, "display");
        ButterKnife.IconCompatParcelizer(groupItemViewHolder, groupItemViewHolder.write);
        TextView textView = groupItemViewHolder.textDiscoverFundTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textDiscoverFundTitle");
        }
        textView.setText(isautomaticdatacollectionenabled.read);
        View view = groupItemViewHolder.write;
        onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
        view.setClickable(true);
        ImageView imageView = groupItemViewHolder.ivExpandIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivExpandIcon");
        }
        imageView.setVisibility(0);
        RecyclerView$MediaSessionCompat$QueueItem recyclerView$MediaSessionCompat$QueueItem = groupItemViewHolder.setHasDecor.write;
        if (recyclerView$MediaSessionCompat$QueueItem != null) {
            RecyclerView recyclerView = groupItemViewHolder.recyclerViewFunds;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerViewFunds");
            }
            recyclerView.setRecycledViewPool(recyclerView$MediaSessionCompat$QueueItem);
        }
        RecyclerView recyclerView2 = groupItemViewHolder.recyclerViewFunds;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerViewFunds");
        }
        recyclerView2.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        RecyclerView recyclerView3 = groupItemViewHolder.recyclerViewFunds;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerViewFunds");
        }
        recyclerView3.setAdapter(new DiscoverTopListItemRecyclerAdapter(isautomaticdatacollectionenabled.MediaBrowserCompat$ItemReceiver, isautomaticdatacollectionenabled.write, new C5762x6efe7a41(groupItemViewHolder)));
        boolean z = isautomaticdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver;
        View view2 = groupItemViewHolder.divider;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
        }
        view2.setVisibility(z ? 0 : 4);
        if (isautomaticdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver) {
            ViewGroup viewGroup = groupItemViewHolder.layoutFunds;
            if (viewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
            }
            viewGroup.setVisibility(0);
            ImageView imageView2 = groupItemViewHolder.ivExpandIcon;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivExpandIcon");
            }
            FragmentBuilder_BindDeejungPlansFragment.read(imageView2);
        }
        groupItemViewHolder.write.setOnClickListener(new GroupItemViewHolder.read(groupItemViewHolder, isautomaticdatacollectionenabled));
    }

    public DiscoverTopListRecyclerAdapter(List<isAutomaticDataCollectionEnabled> list, FundFactSheetActivity<? super setCrashlyticsDataCollectionEnabled, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) list, "list");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onItemClick");
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final class GroupItemViewHolder extends RecyclerView.setContentView {
        @BindView
        public View divider;
        @BindView
        public ImageView ivExpandIcon;
        @BindView
        public ViewGroup layoutFunds;
        @BindView
        public RecyclerView recyclerViewFunds;
        final /* synthetic */ DiscoverTopListRecyclerAdapter setHasDecor;
        @BindView
        public TextView textDiscoverFundTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupItemViewHolder(DiscoverTopListRecyclerAdapter discoverTopListRecyclerAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = discoverTopListRecyclerAdapter;
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ isAutomaticDataCollectionEnabled MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ GroupItemViewHolder write;

            read(GroupItemViewHolder groupItemViewHolder, isAutomaticDataCollectionEnabled isautomaticdatacollectionenabled) {
                this.write = groupItemViewHolder;
                this.MediaBrowserCompat$CustomActionResultReceiver = isautomaticdatacollectionenabled;
            }

            public final void onClick(View view) {
                ImageView imageView = this.write.ivExpandIcon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivExpandIcon");
                }
                FragmentBuilder_BindDeejungPlansFragment.read(imageView);
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                    ViewGroup viewGroup = this.write.layoutFunds;
                    if (viewGroup == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
                    }
                    FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(viewGroup);
                } else {
                    ViewGroup viewGroup2 = this.write.layoutFunds;
                    if (viewGroup2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
                    }
                    FragmentBuilder_BindDeejungPlansFragment.write(viewGroup2);
                }
                isAutomaticDataCollectionEnabled isautomaticdatacollectionenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
                isautomaticdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver = !isautomaticdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver;
                GroupItemViewHolder.read(this.write, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        public static final /* synthetic */ void read(GroupItemViewHolder groupItemViewHolder, boolean z) {
            View view = groupItemViewHolder.divider;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            view.setVisibility(z ? 0 : 4);
        }
    }
}
