package com.scb.phone.view.adapter.scheduledtransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.C6381x4d1a9e14;
import p040o.EDonationService;
import p040o.eligibilityValidation;
import p040o.onStart;

public final class ScheduleListAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public List<AutoValue_CrashlyticsReport_Session_Event_Device.Builder> MediaBrowserCompat$ItemReceiver = new ArrayList();
    public C6381x4d1a9e14 write;

    public class ScheduleListNoHeaderViewHolder_ViewBinding implements Unbinder {
        private ScheduleListNoHeaderViewHolder MediaBrowserCompat$ItemReceiver;

        public ScheduleListNoHeaderViewHolder_ViewBinding(ScheduleListNoHeaderViewHolder scheduleListNoHeaderViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = scheduleListNoHeaderViewHolder;
            scheduleListNoHeaderViewHolder.textViewScheduleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_name, "field 'textViewScheduleName'", TextView.class);
            scheduleListNoHeaderViewHolder.textViewScheduleAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_amount, "field 'textViewScheduleAmount'", TextView.class);
        }

        public final void read() {
            ScheduleListNoHeaderViewHolder scheduleListNoHeaderViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (scheduleListNoHeaderViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                scheduleListNoHeaderViewHolder.textViewScheduleName = null;
                scheduleListNoHeaderViewHolder.textViewScheduleAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ScheduleListWithHeaderViewHolder_ViewBinding implements Unbinder {
        private ScheduleListWithHeaderViewHolder MediaBrowserCompat$ItemReceiver;

        public ScheduleListWithHeaderViewHolder_ViewBinding(ScheduleListWithHeaderViewHolder scheduleListWithHeaderViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = scheduleListWithHeaderViewHolder;
            scheduleListWithHeaderViewHolder.textViewTransactionType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_type, "field 'textViewTransactionType'", TextView.class);
            scheduleListWithHeaderViewHolder.textViewScheduleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_name, "field 'textViewScheduleName'", TextView.class);
            scheduleListWithHeaderViewHolder.textViewScheduleAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_amount, "field 'textViewScheduleAmount'", TextView.class);
        }

        public final void read() {
            ScheduleListWithHeaderViewHolder scheduleListWithHeaderViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (scheduleListWithHeaderViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                scheduleListWithHeaderViewHolder.textViewTransactionType = null;
                scheduleListWithHeaderViewHolder.textViewScheduleName = null;
                scheduleListWithHeaderViewHolder.textViewScheduleAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ScheduleListWithHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83722131493598, viewGroup, false));
        }
        if (i == 2) {
            return new ScheduleListNoHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83712131493597, viewGroup, false));
        }
        throw new IllegalStateException("Wrong type");
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (!builder.IconCompatParcelizer) {
            return 2;
        }
        return builder.IconCompatParcelizer ? 1 : -1;
    }

    public class ScheduleListNoHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView textViewScheduleAmount;
        @BindView
        TextView textViewScheduleName;

        public ScheduleListNoHeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            view.setOnClickListener(new EDonationService(this));
        }
    }

    public class ScheduleListWithHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView textViewScheduleAmount;
        @BindView
        TextView textViewScheduleName;
        @BindView
        TextView textViewTransactionType;

        public ScheduleListWithHeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            view.setOnClickListener(new eligibilityValidation(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0.equals("TOPUP") != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r0.equals("TOPUP") != false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView.setContentView r11, int r12) {
        /*
            r10 = this;
            int r0 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r1 = 0
            java.lang.String r2 = "TOPUP"
            java.lang.String r3 = ""
            r4 = 80008848(0x4c4d690, float:4.6276423E-36)
            java.lang.String r5 = "BULKXFER"
            r6 = -562462675(0xffffffffde79802d, float:-4.4946048E18)
            r7 = -1
            r8 = 1
            if (r0 == r8) goto L_0x009d
            r9 = 2
            if (r0 != r9) goto L_0x012c
            com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter$ScheduleListNoHeaderViewHolder r11 = (com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter.ScheduleListNoHeaderViewHolder) r11
            java.util.List<o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder> r0 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.Object r12 = r0.get(r12)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder r12 = (p040o.AutoValue_CrashlyticsReport_Session_Event_Device.Builder) r12
            o.ForwardingFuture$SimpleForwardingFuture r0 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0095
            o.ForwardingFuture$SimpleForwardingFuture r0 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            int r9 = r0.hashCode()
            if (r9 == r6) goto L_0x0037
            if (r9 != r4) goto L_0x003f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003f
            goto L_0x0040
        L_0x0037:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x003f
            r1 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r7
        L_0x0040:
            if (r1 == 0) goto L_0x007a
            if (r1 == r8) goto L_0x0060
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            if (r1 == 0) goto L_0x005c
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x005c
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x005c:
            r0.setText(r3)
            goto L_0x0095
        L_0x0060:
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.setBatteryVelocity r1 = r12.f2681x50fd9e4a
            if (r1 == 0) goto L_0x0076
            o.setBatteryVelocity r1 = r12.f2681x50fd9e4a
            java.lang.String r1 = r1.write
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x0076:
            r0.setText(r3)
            goto L_0x0095
        L_0x007a:
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            if (r1 == 0) goto L_0x0092
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.RatingCompat
            if (r1 == 0) goto L_0x0092
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.RatingCompat
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x0092:
            r0.setText(r3)
        L_0x0095:
            android.widget.TextView r11 = r11.textViewScheduleName
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver
            r11.setText(r12)
            return
        L_0x009d:
            com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter$ScheduleListWithHeaderViewHolder r11 = (com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter.ScheduleListWithHeaderViewHolder) r11
            java.util.List<o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder> r0 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.Object r12 = r0.get(r12)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder r12 = (p040o.AutoValue_CrashlyticsReport_Session_Event_Device.Builder) r12
            o.ForwardingFuture$SimpleForwardingFuture r0 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0125
            android.widget.TextView r0 = r11.textViewTransactionType
            o.ForwardingFuture$SimpleForwardingFuture r9 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = r9.IconCompatParcelizer
            r0.setText(r9)
            o.ForwardingFuture$SimpleForwardingFuture r0 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            int r9 = r0.hashCode()
            if (r9 == r6) goto L_0x00c7
            if (r9 != r4) goto L_0x00cf
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00c7:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00cf
            r1 = r8
            goto L_0x00d0
        L_0x00cf:
            r1 = r7
        L_0x00d0:
            if (r1 == 0) goto L_0x010a
            if (r1 == r8) goto L_0x00f0
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            if (r1 == 0) goto L_0x00ec
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x00ec
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x00ec:
            r0.setText(r3)
            goto L_0x0125
        L_0x00f0:
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.setBatteryVelocity r1 = r12.f2681x50fd9e4a
            if (r1 == 0) goto L_0x0106
            o.setBatteryVelocity r1 = r12.f2681x50fd9e4a
            java.lang.String r1 = r1.write
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x0106:
            r0.setText(r3)
            goto L_0x0125
        L_0x010a:
            android.widget.TextView r0 = r11.textViewScheduleAmount
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            if (r1 == 0) goto L_0x0122
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.RatingCompat
            if (r1 == 0) goto L_0x0122
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r12.ParcelableVolumeInfo
            java.math.BigDecimal r1 = r1.RatingCompat
            double r1 = r1.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r1)
        L_0x0122:
            r0.setText(r3)
        L_0x0125:
            android.widget.TextView r11 = r11.textViewScheduleName
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver
            r11.setText(r12)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$setContentView, int):void");
    }
}
