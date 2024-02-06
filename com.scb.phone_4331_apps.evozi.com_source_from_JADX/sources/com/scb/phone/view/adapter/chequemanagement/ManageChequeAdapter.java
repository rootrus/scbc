package com.scb.phone.view.adapter.chequemanagement;

import android.content.Context;
import android.content.res.TypedArray;
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
import com.scb.phone.R;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.onStart;
import p040o.postMailingAddressGoodToKnow;

public final class ManageChequeAdapter extends RecyclerView.IconCompatParcelizer<ManageChequeHolder> {
    private TypedArray MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment read;
    private TypedArray write;

    public class ManageChequeHolder_ViewBinding implements Unbinder {
        private ManageChequeHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ManageChequeHolder_ViewBinding(ManageChequeHolder manageChequeHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = manageChequeHolder;
            manageChequeHolder.viewContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_container, "field 'viewContainer'", RelativeLayout.class);
            manageChequeHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'title'", TextView.class);
            manageChequeHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon, "field 'icon'", ImageView.class);
            manageChequeHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'divider'");
            manageChequeHolder.fullDivider = onStart.IconCompatParcelizer(view, R.id.full_divider_view, "field 'fullDivider'");
        }

        public final void read() {
            ManageChequeHolder manageChequeHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (manageChequeHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                manageChequeHolder.viewContainer = null;
                manageChequeHolder.title = null;
                manageChequeHolder.icon = null;
                manageChequeHolder.divider = null;
                manageChequeHolder.fullDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ManageChequeHolder manageChequeHolder = (ManageChequeHolder) setcontentview;
        manageChequeHolder.title.setText(this.MediaBrowserCompat$ItemReceiver.getString(i));
        manageChequeHolder.icon.setImageResource(this.write.getResourceId(i, 0));
        if (i == this.MediaBrowserCompat$ItemReceiver.length() - 1) {
            manageChequeHolder.fullDivider.setVisibility(0);
            manageChequeHolder.divider.setVisibility(8);
        } else {
            manageChequeHolder.fullDivider.setVisibility(8);
            manageChequeHolder.divider.setVisibility(0);
        }
        manageChequeHolder.viewContainer.setOnClickListener(new postMailingAddressGoodToKnow(this, i));
    }

    public ManageChequeAdapter(Context context, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.read = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
        this.write = context.getResources().obtainTypedArray(R.array.f64792130903058);
        this.MediaBrowserCompat$ItemReceiver = context.getResources().obtainTypedArray(R.array.f64802130903059);
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.length();
    }

    class ManageChequeHolder extends RecyclerView.setContentView {
        @BindView
        View divider;
        @BindView
        View fullDivider;
        @BindView
        ImageView icon;
        @BindView
        TextView title;
        @BindView
        RelativeLayout viewContainer;

        ManageChequeHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ManageChequeHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84212131493647, viewGroup, false));
    }
}
