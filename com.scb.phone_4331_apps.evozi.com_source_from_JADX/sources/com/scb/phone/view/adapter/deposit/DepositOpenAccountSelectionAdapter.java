package com.scb.phone.view.adapter.deposit;

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
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.GoodToKnowActivity;
import p040o.access$1900;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class DepositOpenAccountSelectionAdapter extends RecyclerView.IconCompatParcelizer<ListViewHolder> {
    public List<access$1900> MediaBrowserCompat$ItemReceiver;
    private final int read;
    private C5742x6445dbf5 write;

    public final class ListViewHolderWithAccountType_ViewBinding extends ListViewHolder_ViewBinding {
        private ListViewHolderWithAccountType MediaBrowserCompat$ItemReceiver;

        public ListViewHolderWithAccountType_ViewBinding(ListViewHolderWithAccountType listViewHolderWithAccountType, View view) {
            super(listViewHolderWithAccountType, view);
            this.MediaBrowserCompat$ItemReceiver = listViewHolderWithAccountType;
            listViewHolderWithAccountType.accountTypeTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type, "field 'accountTypeTitle'", TextView.class);
        }

        public final void read() {
            ListViewHolderWithAccountType listViewHolderWithAccountType = this.MediaBrowserCompat$ItemReceiver;
            if (listViewHolderWithAccountType != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                listViewHolderWithAccountType.accountTypeTitle = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        ListViewHolder listViewHolder;
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == this.read) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82592131493485, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "v");
            listViewHolder = new ListViewHolderWithAccountType(inflate);
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82602131493486, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "v");
            listViewHolder = new ListViewHolder(inflate2);
        }
        return listViewHolder;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ListViewHolder listViewHolder = (ListViewHolder) setcontentview;
        onGetStartedClick.write((Object) listViewHolder, "holder");
        access$1900 access_1900 = this.MediaBrowserCompat$ItemReceiver.get(i);
        C5742x6445dbf5 depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        onGetStartedClick.write((Object) access_1900, "accountDisplay");
        onGetStartedClick.write((Object) depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver, "clickListener");
        ImageView imageView = listViewHolder.imageAccountType;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageAccountType");
        }
        String str = access_1900.IconCompatParcelizer;
        onGetStartedClick.write((Object) imageView, "$this$loadUrl");
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        imageView.getContext();
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(imageView, str);
        TextView textView = listViewHolder.textAccountType;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textAccountType");
        }
        textView.setText(access_1900.read);
        TextView textView2 = listViewHolder.textAccountDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textAccountDescription");
        }
        textView2.setText(access_1900.MediaBrowserCompat$ItemReceiver);
        listViewHolder.write.setOnClickListener(new ListViewHolder.read(depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver, access_1900));
        if (listViewHolder instanceof ListViewHolderWithAccountType) {
            ListViewHolderWithAccountType listViewHolderWithAccountType = (ListViewHolderWithAccountType) listViewHolder;
            access$1900 access_19002 = this.MediaBrowserCompat$ItemReceiver.get(i);
            C5742x6445dbf5 depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver2 = this.write;
            onGetStartedClick.write((Object) access_19002, "accountDisplay");
            onGetStartedClick.write((Object) depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver2, "clickListener");
            TextView textView3 = listViewHolderWithAccountType.accountTypeTitle;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountTypeTitle");
            }
            textView3.setText(access_19002.write);
            listViewHolderWithAccountType.write.setOnClickListener(new C5741x78bef632(depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver2, access_19002));
        }
    }

    public class ListViewHolder_ViewBinding implements Unbinder {
        private ListViewHolder MediaBrowserCompat$ItemReceiver;

        public ListViewHolder_ViewBinding(ListViewHolder listViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = listViewHolder;
            listViewHolder.imageAccountType = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_account_type, "field 'imageAccountType'", ImageView.class);
            listViewHolder.textAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_type, "field 'textAccountType'", TextView.class);
            listViewHolder.textAccountDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_description, "field 'textAccountDescription'", TextView.class);
        }

        public void read() {
            ListViewHolder listViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (listViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                listViewHolder.imageAccountType = null;
                listViewHolder.textAccountType = null;
                listViewHolder.textAccountDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DepositOpenAccountSelectionAdapter(Context context, List<access$1900> list, C5742x6445dbf5 depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) list, "items");
        onGetStartedClick.write((Object) depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver, "clickListener");
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        CharSequence charSequence = this.MediaBrowserCompat$ItemReceiver.get(i).write;
        if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
            return this.read;
        }
        return 1;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public static class ListViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView imageAccountType;
        @BindView
        public TextView textAccountDescription;
        @BindView
        public TextView textAccountType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class read implements View.OnClickListener {
            private /* synthetic */ C5742x6445dbf5 MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ access$1900 write;

            read(C5742x6445dbf5 depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver, access$1900 access_1900) {
                this.MediaBrowserCompat$CustomActionResultReceiver = depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver;
                this.write = access_1900;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write);
            }
        }
    }

    public static final class ListViewHolderWithAccountType extends ListViewHolder {
        @BindView
        public TextView accountTypeTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListViewHolderWithAccountType(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
