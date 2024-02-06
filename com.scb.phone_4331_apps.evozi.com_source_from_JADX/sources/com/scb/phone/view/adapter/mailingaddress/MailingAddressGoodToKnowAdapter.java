package com.scb.phone.view.adapter.mailingaddress;

import android.content.Context;
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
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.usedBytes;

public final class MailingAddressGoodToKnowAdapter extends RecyclerView.IconCompatParcelizer<GoodToKnowViewHolder> {
    public final ArrayList<usedBytes> write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83302131493556, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…d_to_know, parent, false)");
        return new GoodToKnowViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        GoodToKnowViewHolder goodToKnowViewHolder = (GoodToKnowViewHolder) setcontentview;
        onGetStartedClick.write((Object) goodToKnowViewHolder, "viewHolder");
        usedBytes usedbytes = this.write.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) usedbytes, "items[position]");
        usedBytes usedbytes2 = usedbytes;
        onGetStartedClick.write((Object) usedbytes2, "item");
        ImageView imageView = goodToKnowViewHolder.ivCategoryIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivCategoryIcon");
        }
        GoodToKnowViewHolder.IconCompatParcelizer(imageView, usedbytes2.write);
        TextView textView = goodToKnowViewHolder.tvName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
        }
        textView.setText(usedbytes2.read);
    }

    public MailingAddressGoodToKnowAdapter(ArrayList<usedBytes> arrayList) {
        onGetStartedClick.write((Object) arrayList, "items");
        this.write = arrayList;
    }

    public final class GoodToKnowViewHolder_ViewBinding implements Unbinder {
        private GoodToKnowViewHolder IconCompatParcelizer;

        public GoodToKnowViewHolder_ViewBinding(GoodToKnowViewHolder goodToKnowViewHolder, View view) {
            this.IconCompatParcelizer = goodToKnowViewHolder;
            goodToKnowViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_item_name, "field 'tvName'", TextView.class);
            goodToKnowViewHolder.ivCategoryIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_item_icon, "field 'ivCategoryIcon'", ImageView.class);
        }

        public final void read() {
            GoodToKnowViewHolder goodToKnowViewHolder = this.IconCompatParcelizer;
            if (goodToKnowViewHolder != null) {
                this.IconCompatParcelizer = null;
                goodToKnowViewHolder.tvName = null;
                goodToKnowViewHolder.ivCategoryIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static final class GoodToKnowViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivCategoryIcon;
        @BindView
        public TextView tvName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GoodToKnowViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "inflate");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }

        static void IconCompatParcelizer(ImageView imageView, String str) {
            imageView.getContext();
            Context context = imageView.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(imageView, str, context.getResources().getDimensionPixelOffset(R.dimen.f73152131165563));
        }
    }
}
