package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.billpayment.RtpEBillPaymentReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C7434sI;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.getTopLeftCornerWidth;
import p040o.sI$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class RtpEBillPaymentDetailFragment extends BaseFragment implements getTopLeftCornerWidth.setExpandedFormat {
    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder IconCompatParcelizer;
    private double MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    DefaultButton buttonReview;
    @BindView
    ImageView destinationImageIcon;
    @BindView
    TextView destinationProxyNumber;
    @BindView
    TextView destinationTextTitle;
    @BindView
    AmountEditText editAmount;
    @BindView
    TextView invalidAmountTextView;
    @BindView
    NoteEditText noteEditText;
    @BindView
    TextView refNo1;
    @BindView
    TextView refNo2;
    @BindView
    TextView refNo3;
    @BindView
    TextView remainingLimitError;
    @BindView
    LinearLayout remainingLimitLinearLayout;
    @HmlPinActivity
    public C7434sI rtpEBillPaymentDetailPresenter;
    @BindView
    ImageView sourceImageIcon;
    @BindView
    TextView sourceTextProxyNumber;
    @BindView
    TextView sourceTextTitle;
    @BindView
    TextView textRemainingLimit;
    @BindView
    TextView tvDueDate;

    public static RtpEBillPaymentDetailFragment IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        RtpEBillPaymentDetailFragment rtpEBillPaymentDetailFragment = new RtpEBillPaymentDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY", builder);
        rtpEBillPaymentDetailFragment.setArguments(bundle);
        return rtpEBillPaymentDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89592131494186, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.rtpEBillPaymentDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder) getArguments().getParcelable("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY");
        this.IconCompatParcelizer = builder;
        C7434sI sIVar = this.rtpEBillPaymentDetailPresenter;
        if (sIVar.RatingCompat != null) {
            sIVar.RatingCompat.AlertController$RecycleListView();
        }
        sIVar.read = builder;
        C7434sI sIVar2 = this.rtpEBillPaymentDetailPresenter;
        sIVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer);
        sIVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C7434sI.write(sIVar2, (byte) 0));
        C7434sI sIVar3 = this.rtpEBillPaymentDetailPresenter;
        if (sIVar3.RatingCompat != null) {
            sIVar3.RatingCompat.Keep();
        }
        sIVar3.MediaBrowserCompat$ItemReceiver.write("BILLPAYMENT", "ALL");
        sIVar3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new sI$MediaBrowserCompat$CustomActionResultReceiver(sIVar3, (byte) 0));
        this.buttonReview.setButtonEnabled(false);
        this.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.AlertController$RecycleListView).doubleValue();
        this.buttonReview.setButtonEnabled(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.AlertController$RecycleListView).doubleValue() > 0.0d);
        if (this.IconCompatParcelizer.read.equals("04") || this.IconCompatParcelizer.read.equals("05")) {
            this.editAmount.setEnabled(false);
            this.editAmount.setFormattedAmount(this.IconCompatParcelizer.AlertController$RecycleListView);
            this.editAmount.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
        } else if (this.IconCompatParcelizer.read.equals("01") || this.IconCompatParcelizer.read.equals("02") || this.IconCompatParcelizer.read.equals("03")) {
            this.editAmount.setEnabled(true);
            this.editAmount.setFormattedAmount(this.IconCompatParcelizer.AlertController$RecycleListView);
            this.editAmount.setMaximumDecimalDigit(17);
        }
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                RtpEBillPaymentDetailFragment.MediaBrowserCompat$ItemReceiver(RtpEBillPaymentDetailFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                RtpEBillPaymentDetailFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.tvDueDate.setText(this.IconCompatParcelizer.RatingCompat);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public final void ay_() {
        this.remainingLimitLinearLayout.setVisibility(0);
        super.ay_();
    }

    public final void read() {
        this.noteEditText.write();
    }

    public final void write() {
        this.textRemainingLimit.setVisibility(8);
        this.remainingLimitError.setVisibility(0);
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        PlaybackStateCompat$CustomAction();
        aj_();
        Intent intent = new Intent(getContext(), RtpEBillPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReviewButtonClick() {
        /*
            r7 = this;
            o.sI r0 = r7.rtpEBillPaymentDetailPresenter
            com.scb.phone.view.custom.common.NoteEditText r1 = r7.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            T r2 = r0.RatingCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            if (r2 == 0) goto L_0x0042
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0040
            o.tq r1 = p040o.C10163tq.IconCompatParcelizer
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0037
            r2 = r3
            goto L_0x0038
        L_0x0037:
            r2 = r4
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x0042
        L_0x0040:
            r0 = r3
            goto L_0x0043
        L_0x0042:
            r0 = r4
        L_0x0043:
            if (r0 == 0) goto L_0x00a7
            r7.PlaybackStateCompat$CustomAction()
            r7.AlertController$RecycleListView()
            o.sI r0 = r7.rtpEBillPaymentDetailPresenter
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r1 = r7.IconCompatParcelizer
            java.lang.String r1 = r1.setIcon
            double r5 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            com.scb.phone.view.custom.common.NoteEditText r5 = r7.noteEditText
            android.widget.EditText r5 = r5.mNoteEditText
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            o.Interners r6 = new o.Interners
            r6.<init>()
            r6.RatingCompat = r1
            double r1 = r2.doubleValue()
            java.lang.String r1 = p040o.removeIfFromRandomAccessList.read((double) r1)
            r6.write = r1
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r1 = r0.read
            java.lang.String r1 = r1.setItemInvoker
            r6.read = r1
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r1 = r0.read
            java.lang.String r1 = r1.setContentView
            r6.IconCompatParcelizer = r1
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r1 = r0.read
            java.lang.String r1 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r6.MediaBrowserCompat$CustomActionResultReceiver = r1
            if (r5 == 0) goto L_0x008f
            int r1 = r5.length()
            if (r1 == 0) goto L_0x008f
            r3 = r4
        L_0x008f:
            if (r3 == 0) goto L_0x0093
            r1 = 0
            goto L_0x0094
        L_0x0093:
            r1 = r5
        L_0x0094:
            o.paddedPartition<java.lang.String> r2 = r6.MediaBrowserCompat$ItemReceiver
            r2.MediaBrowserCompat$ItemReceiver = r1
            o.AppMeasurementInstallReferrerReceiver r1 = r0.MediaBrowserCompat$ItemReceiver
            r1.IconCompatParcelizer((p040o.Interners) r6)
            o.AppMeasurementInstallReferrerReceiver r1 = r0.MediaBrowserCompat$ItemReceiver
            o.sI$MediaBrowserCompat$ItemReceiver r2 = new o.sI$MediaBrowserCompat$ItemReceiver
            r2.<init>(r0, r5)
            r1.IconCompatParcelizer(r2)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.billpaymenttab.RtpEBillPaymentDetailFragment.onReviewButtonClick():void");
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(RtpEBillPaymentDetailFragment rtpEBillPaymentDetailFragment, double d) {
        rtpEBillPaymentDetailFragment.MediaBrowserCompat$CustomActionResultReceiver = d;
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        rtpEBillPaymentDetailFragment.buttonReview.setButtonEnabled(i > 0);
        if (i == 0) {
            rtpEBillPaymentDetailFragment.editAmount.setInvalidAmount(true);
            rtpEBillPaymentDetailFragment.invalidAmountTextView.setVisibility(0);
            return;
        }
        rtpEBillPaymentDetailFragment.editAmount.setInvalidAmount(false);
        rtpEBillPaymentDetailFragment.invalidAmountTextView.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        this.sourceTextTitle.setText(builder.Keep);
        this.sourceTextProxyNumber.setText(builder.setContentView);
        if (builder.AppCompatDelegateImpl$ListMenuDecorView.equals("MOB")) {
            this.sourceImageIcon.setImageResource(R.drawable.icon_prompt_pay_mobile);
        } else if (builder.AppCompatDelegateImpl$ListMenuDecorView.equals("CID")) {
            this.sourceImageIcon.setImageResource(R.drawable.icon_prompt_pay_cid);
        }
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.donations_place_holder_logo, this.destinationImageIcon, builder.MediaBrowserCompat$SearchResultReceiver);
        this.destinationTextTitle.setText(builder.MediaDescriptionCompat);
        this.destinationProxyNumber.setText(getString(R.string.biller_id, builder.IconCompatParcelizer));
        this.refNo1.setText(builder.setExpandedFormat);
        if (builder.setChecked != null && !builder.setChecked.isEmpty()) {
            this.refNo2.setVisibility(0);
            this.refNo2.setText(builder.ActionMenuItemView);
        }
        if (builder.setPadding != null && !builder.setPadding.isEmpty()) {
            this.refNo3.setVisibility(0);
            this.refNo3.setText(builder.setPopupCallback);
        }
    }

    public final void read(String str) {
        this.remainingLimitLinearLayout.setVisibility(0);
        super.ay_();
        this.textRemainingLimit.setVisibility(0);
        this.textRemainingLimit.setText(str);
    }
}
