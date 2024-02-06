package com.scb.phone.view.adapter.bankingagent;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.sameThreadExecutor;
import p040o.setLastBaselineToBottomHeight;

public final class BankingAgentAdapter extends RecyclerView.IconCompatParcelizer<ItemViewHolder> {
    private final Drawable MediaBrowserCompat$ItemReceiver;
    private boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindCcSofBillPaymentOnlyFragment RatingCompat;
    private final Context read;
    public List<sameThreadExecutor> write;

    public final class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.gridLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_grid_layout, "field 'gridLayout'", RelativeLayout.class);
            itemViewHolder.listLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_list_layout, "field 'listLayout'", RelativeLayout.class);
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.avatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_avatar_image_view, "field 'avatar'", ImageView.class);
            itemViewHolder.nameList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_name_text_view_list, "field 'nameList'", TextView.class);
            itemViewHolder.codeList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_code_text_view_list, "field 'codeList'", TextView.class);
            itemViewHolder.avatarList = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agent_avatar_image_view_list, "field 'avatarList'", ImageView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.gridLayout = null;
                itemViewHolder.listLayout = null;
                itemViewHolder.name = null;
                itemViewHolder.avatar = null;
                itemViewHolder.nameList = null;
                itemViewHolder.codeList = null;
                itemViewHolder.avatarList = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82212131493447, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "v");
        return new ItemViewHolder(this, inflate, this.MediaMetadataCompat);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) setcontentview;
        onGetStartedClick.write((Object) itemViewHolder, "holder");
        sameThreadExecutor samethreadexecutor = this.write.get(i);
        onGetStartedClick.write((Object) samethreadexecutor, "agentDisplay");
        Context context = itemViewHolder.AlertController$RecycleListView.read;
        Drawable drawable = itemViewHolder.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver;
        ImageView imageView = itemViewHolder.avatar;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("avatar");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, drawable, imageView, samethreadexecutor.read, itemViewHolder.AlertController$RecycleListView.read.getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(itemViewHolder.AlertController$RecycleListView.read, R.color.f66402131099796));
        TextView textView = itemViewHolder.name;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("name");
        }
        textView.setText(samethreadexecutor.MediaDescriptionCompat);
        itemViewHolder.write.setOnClickListener(new C5728x4c7c9dd4(itemViewHolder));
        Context context2 = itemViewHolder.AlertController$RecycleListView.read;
        Drawable drawable2 = itemViewHolder.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver;
        ImageView imageView2 = itemViewHolder.avatarList;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("avatarList");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context2, drawable2, imageView2, samethreadexecutor.read, itemViewHolder.AlertController$RecycleListView.read.getResources().getDimensionPixelOffset(R.dimen.f72072131165284), setLastBaselineToBottomHeight.read(itemViewHolder.AlertController$RecycleListView.read, R.color.f66402131099796));
        TextView textView2 = itemViewHolder.nameList;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nameList");
        }
        textView2.setText(samethreadexecutor.MediaDescriptionCompat);
        if (itemViewHolder.Keep) {
            RelativeLayout relativeLayout = itemViewHolder.gridLayout;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("gridLayout");
            }
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = itemViewHolder.listLayout;
            if (relativeLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("listLayout");
            }
            relativeLayout2.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout3 = itemViewHolder.gridLayout;
        if (relativeLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("gridLayout");
        }
        relativeLayout3.setVisibility(8);
        RelativeLayout relativeLayout4 = itemViewHolder.listLayout;
        if (relativeLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("listLayout");
        }
        relativeLayout4.setVisibility(0);
    }

    public BankingAgentAdapter(Context context, List<sameThreadExecutor> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) list, "displayList");
        this.read = context;
        this.write = list;
        this.RatingCompat = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
        this.MediaBrowserCompat$ItemReceiver = setLastBaselineToBottomHeight.write(context, R.drawable.banking_agent_placeholder);
        this.MediaMetadataCompat = false;
        this.MediaMetadataCompat = true;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final class ItemViewHolder extends RecyclerView.setContentView {
        final /* synthetic */ BankingAgentAdapter AlertController$RecycleListView;
        boolean Keep;
        @BindView
        public ImageView avatar;
        @BindView
        public ImageView avatarList;
        @BindView
        public TextView codeList;
        @BindView
        public RelativeLayout gridLayout;
        @BindView
        public RelativeLayout listLayout;
        @BindView
        public TextView name;
        @BindView
        public TextView nameList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(BankingAgentAdapter bankingAgentAdapter, View view, boolean z) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.AlertController$RecycleListView = bankingAgentAdapter;
            this.Keep = z;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
