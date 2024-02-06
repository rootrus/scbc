package com.scb.phone.view.adapter.tierpricing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.getIdentifierUtf8Bytes;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class TierPricingInstallmentAdapter extends RecyclerView.IconCompatParcelizer<InstallmentViewHolder> {
    private final Integer read;
    private final List<getIdentifierUtf8Bytes> write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90442131494271, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "this");
        return new InstallmentViewHolder(inflate, this.read);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        InstallmentViewHolder installmentViewHolder = (InstallmentViewHolder) setcontentview;
        onGetStartedClick.write((Object) installmentViewHolder, "holder");
        getIdentifierUtf8Bytes getidentifierutf8bytes = this.write.get(i);
        onGetStartedClick.write((Object) getidentifierutf8bytes, "display");
        TextView textView = installmentViewHolder.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = installmentViewHolder.value;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        textView2.setText(getidentifierutf8bytes.read);
        Integer num = installmentViewHolder.AlertController$RecycleListView;
        if (num == null) {
            return;
        }
        if (num == null || num.intValue() != 0) {
            TextView textView3 = installmentViewHolder.value;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            TextView textView4 = installmentViewHolder.title;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
            }
            textView3.setTextColor(setLastBaselineToBottomHeight.read(textView4.getContext(), installmentViewHolder.AlertController$RecycleListView.intValue()));
        }
    }

    public final class InstallmentViewHolder_ViewBinding implements Unbinder {
        private InstallmentViewHolder IconCompatParcelizer;

        public InstallmentViewHolder_ViewBinding(InstallmentViewHolder installmentViewHolder, View view) {
            this.IconCompatParcelizer = installmentViewHolder;
            installmentViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_interestrate_title, "field 'title'", TextView.class);
            installmentViewHolder.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_interestrate_value, "field 'value'", TextView.class);
        }

        public final void read() {
            InstallmentViewHolder installmentViewHolder = this.IconCompatParcelizer;
            if (installmentViewHolder != null) {
                this.IconCompatParcelizer = null;
                installmentViewHolder.title = null;
                installmentViewHolder.value = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TierPricingInstallmentAdapter(List<getIdentifierUtf8Bytes> list, Integer num) {
        onGetStartedClick.write((Object) list, "installments");
        this.write = list;
        this.read = num;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static final class InstallmentViewHolder extends RecyclerView.setContentView {
        final Integer AlertController$RecycleListView;
        @BindView
        public TextView title;
        @BindView
        public TextView value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InstallmentViewHolder(View view, Integer num) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.AlertController$RecycleListView = num;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
