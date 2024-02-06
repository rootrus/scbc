package com.scb.phone.view.adapter.sme.gifting;

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
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.verifyIdentity;

public final class MoneyPresentAdapter extends RecyclerView.IconCompatParcelizer<MoneyPresentViewHolder> {
    public write MediaBrowserCompat$ItemReceiver;
    private List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> write;

    public interface write {
        void read(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r1);
    }

    public class MoneyPresentViewHolder_ViewBinding implements Unbinder {
        private MoneyPresentViewHolder MediaBrowserCompat$ItemReceiver;

        public MoneyPresentViewHolder_ViewBinding(MoneyPresentViewHolder moneyPresentViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = moneyPresentViewHolder;
            moneyPresentViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_present_item_name, "field 'name'", TextView.class);
            moneyPresentViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_present_item_description, "field 'description'", TextView.class);
            moneyPresentViewHolder.image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_present_item_image, "field 'image'", ImageView.class);
        }

        public final void read() {
            MoneyPresentViewHolder moneyPresentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (moneyPresentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                moneyPresentViewHolder.name = null;
                moneyPresentViewHolder.description = null;
                moneyPresentViewHolder.image = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MoneyPresentViewHolder moneyPresentViewHolder = (MoneyPresentViewHolder) setcontentview;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r5 = this.write.get(i);
        moneyPresentViewHolder.name.setText(r5.MediaBrowserCompat$SearchResultReceiver);
        moneyPresentViewHolder.description.setText(r5.read);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(moneyPresentViewHolder.setHasDecor, R.color.f66402131099796), moneyPresentViewHolder.image, r5.MediaMetadataCompat);
        moneyPresentViewHolder.write.setOnClickListener(new verifyIdentity(this, r5));
    }

    public MoneyPresentAdapter(List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list, write write2) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public final int IconCompatParcelizer() {
        List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class MoneyPresentViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView description;
        @BindView
        ImageView image;
        @BindView
        TextView name;
        final Context setHasDecor;

        MoneyPresentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.setHasDecor = view.getContext();
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new MoneyPresentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84262131493652, viewGroup, false));
    }
}
