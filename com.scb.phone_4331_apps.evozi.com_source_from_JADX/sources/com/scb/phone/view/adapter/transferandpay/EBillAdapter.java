package com.scb.phone.view.adapter.transferandpay;

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
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getEasycashInstitutionsList;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class EBillAdapter extends RecyclerView.IconCompatParcelizer<EBillHolder> {
    public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder> MediaBrowserCompat$ItemReceiver;
    private Context read;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment write;

    public class EBillHolder_ViewBinding implements Unbinder {
        private EBillHolder write;

        public EBillHolder_ViewBinding(EBillHolder eBillHolder, View view) {
            this.write = eBillHolder;
            eBillHolder.mIconBiller = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_icon_image_view, "field 'mIconBiller'", ImageView.class);
            eBillHolder.mIconCheck = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_check_icon_image_view, "field 'mIconCheck'", ImageView.class);
            eBillHolder.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_title_text_view, "field 'mTitle'", TextView.class);
            eBillHolder.mCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_code_text_view, "field 'mCode'", TextView.class);
            eBillHolder.mValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_value_text_view, "field 'mValue'", TextView.class);
            eBillHolder.mDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_date_text_view, "field 'mDate'", TextView.class);
            eBillHolder.mPayNowText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_pay_now_text_view, "field 'mPayNowText'", TextView.class);
            eBillHolder.mRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_remark_text_view, "field 'mRemark'", TextView.class);
            eBillHolder.mDivider = onStart.IconCompatParcelizer(view, R.id.ebill_divider, "field 'mDivider'");
            eBillHolder.mFullDivider = onStart.IconCompatParcelizer(view, R.id.ebill_full_divider, "field 'mFullDivider'");
        }

        public final void read() {
            EBillHolder eBillHolder = this.write;
            if (eBillHolder != null) {
                this.write = null;
                eBillHolder.mIconBiller = null;
                eBillHolder.mIconCheck = null;
                eBillHolder.mTitle = null;
                eBillHolder.mCode = null;
                eBillHolder.mValue = null;
                eBillHolder.mDate = null;
                eBillHolder.mPayNowText = null;
                eBillHolder.mRemark = null;
                eBillHolder.mDivider = null;
                eBillHolder.mFullDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        EBillHolder eBillHolder = (EBillHolder) setcontentview;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = this.MediaBrowserCompat$ItemReceiver.get(i);
        eBillHolder.mValue.setText(builder.AlertController$RecycleListView);
        eBillHolder.mDate.setText(builder.MediaBrowserCompat$MediaItem);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(setLastBaselineToBottomHeight.write(this.read, R.drawable.biller_place_holder), eBillHolder.mIconBiller, builder.MediaBrowserCompat$SearchResultReceiver, (int) this.read.getResources().getDimension(R.dimen.f71962131165266));
        eBillHolder.mTitle.setText(builder.MediaDescriptionCompat);
        eBillHolder.mRemark.setText(this.read.getString(R.string.bill_total_amount_as_of_closing_date));
        if (builder.MediaMetadataCompat) {
            eBillHolder.mCode.setText(builder.MediaSessionCompat$Token);
        } else {
            eBillHolder.mCode.setText(builder.setHasDecor);
        }
        if (builder.MediaBrowserCompat$ItemReceiver) {
            eBillHolder.mIconCheck.setVisibility(8);
        } else {
            eBillHolder.mIconCheck.setVisibility(0);
        }
        if (builder.MediaBrowserCompat$CustomActionResultReceiver) {
            eBillHolder.mPayNowText.setVisibility(0);
            eBillHolder.write.setOnClickListener(new getEasycashInstitutionsList(this, i));
        } else {
            eBillHolder.mPayNowText.setVisibility(8);
        }
        if (i == this.MediaBrowserCompat$ItemReceiver.size() - 1) {
            eBillHolder.mDivider.setVisibility(8);
            eBillHolder.mFullDivider.setVisibility(0);
        } else {
            eBillHolder.mFullDivider.setVisibility(8);
            eBillHolder.mDivider.setVisibility(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BILLPAY: ");
        sb.append(i);
        sb.append(builder.MediaBrowserCompat$MediaItem);
        onCheckBoxClick.read(sb.toString(), new Object[0]);
    }

    public EBillAdapter(Context context, List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.read = context;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public class EBillHolder extends RecyclerView.setContentView {
        @BindView
        TextView mCode;
        @BindView
        TextView mDate;
        @BindView
        View mDivider;
        @BindView
        View mFullDivider;
        @BindView
        ImageView mIconBiller;
        @BindView
        ImageView mIconCheck;
        @BindView
        TextView mPayNowText;
        @BindView
        TextView mRemark;
        @BindView
        TextView mTitle;
        @BindView
        TextView mValue;

        public EBillHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new EBillHolder(LayoutInflater.from(this.read).inflate(R.layout.f81772131493403, viewGroup, false));
    }
}
