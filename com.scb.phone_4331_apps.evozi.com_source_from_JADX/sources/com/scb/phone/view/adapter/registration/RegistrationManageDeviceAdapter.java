package com.scb.phone.view.adapter.registration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.C10872writeSessionOs;
import p040o.C6485x62801acb;
import p040o.eligibilityOpenAccountValidation;
import p040o.onStart;

public final class RegistrationManageDeviceAdapter extends RecyclerView.IconCompatParcelizer<DeviceItemViewHolder> {
    /* access modifiers changed from: private */
    public final C6485x62801acb read;
    public final List<C10872writeSessionOs> write;

    public class DeviceItemViewHolder_ViewBinding implements Unbinder {
        private DeviceItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public DeviceItemViewHolder_ViewBinding(DeviceItemViewHolder deviceItemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = deviceItemViewHolder;
            deviceItemViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_title, "field 'title'", TextView.class);
            deviceItemViewHolder.date = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_date, "field 'date'", TextView.class);
            deviceItemViewHolder.delete = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_relative_layout, "field 'delete'", RelativeLayout.class);
        }

        public final void read() {
            DeviceItemViewHolder deviceItemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (deviceItemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                deviceItemViewHolder.title = null;
                deviceItemViewHolder.date = null;
                deviceItemViewHolder.delete = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DeviceItemViewHolder deviceItemViewHolder = (DeviceItemViewHolder) setcontentview;
        C10872writeSessionOs writesessionos = this.write.get(i);
        StringBuilder sb = new StringBuilder();
        sb.append(writesessionos.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" ");
        sb.append(writesessionos.MediaBrowserCompat$SearchResultReceiver);
        String obj = sb.toString();
        deviceItemViewHolder.title.setText(obj);
        deviceItemViewHolder.date.setText(writesessionos.RatingCompat);
        deviceItemViewHolder.delete.setOnClickListener(new eligibilityOpenAccountValidation(deviceItemViewHolder, writesessionos, obj));
    }

    public RegistrationManageDeviceAdapter(List<C10872writeSessionOs> list, C6485x62801acb fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = list;
        this.read = fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public class DeviceItemViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView date;
        @BindView
        RelativeLayout delete;
        @BindView
        TextView title;

        DeviceItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DeviceItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82642131493490, viewGroup, false));
    }
}
