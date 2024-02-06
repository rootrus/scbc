package com.scb.phone.view.adapter.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class SequentialSearchAdapter extends RecyclerView.IconCompatParcelizer<ItemViewHolder> {
    public List<String> read = HmlNationalIdActivity.IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final write write;

    public interface write {
        void write(String str);
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ SequentialSearchAdapter write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(SequentialSearchAdapter sequentialSearchAdapter) {
            super(1);
            this.write = sequentialSearchAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "it");
            this.write.write.write(str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83782131493604, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…al_search, parent, false)");
        return new ItemViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) setcontentview;
        onGetStartedClick.write((Object) itemViewHolder, "viewHolder");
        String str = this.read.get(i);
        FundFactSheetActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) str, "text");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSelectedItem");
        TextView textView = itemViewHolder.textItem;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textItem");
        }
        textView.setText(str);
        itemViewHolder.write.setOnClickListener(new C5783x5cd5ccdc(iconCompatParcelizer, str));
    }

    public SequentialSearchAdapter(write write2) {
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.write = write2;
    }

    public final class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.textItem = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_item, "field 'textItem'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.textItem = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView textItem;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
