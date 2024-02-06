package com.scb.phone.view.fragment.chequemanagement.ordercheque;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeReviewActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.ComponentRuntime$$Lambda$5;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.connectEvictables;
import p040o.excludeField;
import p040o.isValidUntil;
import p040o.promptPayVerification;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.toGraph;
import p040o.withModifiers;
import p040o.withModifiers$MediaBrowserCompat$ItemReceiver;

public class OrderChequeInputFragment extends BaseFragment implements CheckCaptureModule_GetIJsonExactionHelperKtaFactory.write, AccountSourceSelectFragment.write {
    private promptPayVerification IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnOrderChequeReview;
    @BindView
    RecyclerView mRecyclerView;
    @BindView
    TextView mRemainingLimit;
    @HmlPinActivity
    public withModifiers presenter;
    @BindView
    LinearLayout rootErrorNoAccount;
    @BindView
    TextView tvErrorNoAccountDetail;
    @BindView
    TextView tvErrorNoAccountTitle;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static OrderChequeInputFragment write(int i) {
        OrderChequeInputFragment orderChequeInputFragment = new OrderChequeInputFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_SOURCE_SIZE", i);
        orderChequeInputFragment.setArguments(bundle);
        return orderChequeInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88802131494107, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        withModifiers withmodifiers = this.presenter;
        withmodifiers.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        withmodifiers.IconCompatParcelizer.IconCompatParcelizer(new withModifiers.read(withmodifiers, (byte) 0));
        this.btnOrderChequeReview.setEnabled(false);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = false;
        int i = getArguments() != null ? getArguments().getInt("EXTRA_SOURCE_SIZE", 0) : 0;
        withModifiers withmodifiers = this.presenter;
        withmodifiers.write = i;
        if (i > 0) {
            excludeField excludefield = excludeField.IconCompatParcelizer;
            if (withmodifiers.RatingCompat != null) {
                z = true;
            }
            if (z) {
                excludefield.IconCompatParcelizer(withmodifiers.RatingCompat);
                return;
            }
            return;
        }
        isValidUntil isvaliduntil = isValidUntil.MediaBrowserCompat$ItemReceiver;
        if (withmodifiers.RatingCompat != null) {
            z = true;
        }
        if (z) {
            isvaliduntil.IconCompatParcelizer(withmodifiers.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getString(R.string.order_cheque);
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.ACTIVATE_ORDER_CHEQUE_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.RatingCompat = false;
        write.IconCompatParcelizer = false;
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
    }

    public final void write() {
        String string = getString(R.string.error_issued_cheque_no_account);
        String string2 = getString(R.string.error_issued_activate_cheque_no_account_detail);
        this.tvErrorNoAccountTitle.setText(string);
        this.tvErrorNoAccountDetail.setText(string2);
        this.rootErrorNoAccount.setVisibility(0);
        this.btnOrderChequeReview.setEnabled(false);
    }

    public final void read(toGraph tograph) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        if (tograph.IconCompatParcelizer != null && !tograph.IconCompatParcelizer.isEmpty()) {
            promptPayVerification promptpayverification = new promptPayVerification(tograph.IconCompatParcelizer);
            this.IconCompatParcelizer = promptpayverification;
            this.mRecyclerView.setAdapter(promptpayverification);
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.mRemainingLimit.setText(String.format(getString(R.string.order_cheque_input_remaining), new Object[]{tograph.MediaBrowserCompat$ItemReceiver, tograph.MediaBrowserCompat$CustomActionResultReceiver}));
    }

    public final void read(boolean z) {
        this.btnOrderChequeReview.setEnabled(z);
    }

    @OnClick
    public void onReviewButtonClick() {
        if (this.IconCompatParcelizer.write() != -1 && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            int intValue = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().intValue();
            withModifiers withmodifiers = this.presenter;
            withmodifiers.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(new connectEvictables(this.MediaBrowserCompat$CustomActionResultReceiver, intValue));
            withmodifiers.IconCompatParcelizer.IconCompatParcelizer(new withModifiers$MediaBrowserCompat$ItemReceiver(withmodifiers, (byte) 0));
        }
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getContext(), OrderChequeReviewActivity.class);
        if (setuuidfromutf8bytes instanceof ComponentRuntime$$Lambda$5) {
            setuuidfromutf8bytes.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            intent.putExtra("com.scb.phone.EXTRA_REVIEW", (ComponentRuntime$$Lambda$5) setuuidfromutf8bytes);
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
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaSessionCompat$Token;
        }
    }
}
