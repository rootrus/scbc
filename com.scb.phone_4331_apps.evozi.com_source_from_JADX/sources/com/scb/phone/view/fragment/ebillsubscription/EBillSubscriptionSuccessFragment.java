package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsReport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;

public class EBillSubscriptionSuccessFragment extends BaseEBillSubscriptionReviewFragment {
    private getUuidUtf8Bytes IconCompatParcelizer;
    private CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView dateTimeTextView;
    @BindView
    TextView refIdTextView;

    public static EBillSubscriptionSuccessFragment read(CrashlyticsReport.Session.Event.Application.Execution execution, getUuidUtf8Bytes getuuidutf8bytes) {
        EBillSubscriptionSuccessFragment eBillSubscriptionSuccessFragment = new EBillSubscriptionSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        eBillSubscriptionSuccessFragment.setArguments(bundle);
        return eBillSubscriptionSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87222131493949, viewGroup, false);
        Bundle arguments = getArguments();
        this.MediaBrowserCompat$CustomActionResultReceiver = (CrashlyticsReport.Session.Event.Application.Execution) arguments.getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) arguments.getParcelable("com.scb.phone.EXTRA_SUCCESS");
        this.IconCompatParcelizer = getuuidutf8bytes;
        if (getuuidutf8bytes != null) {
            IconCompatParcelizer(getuuidutf8bytes.PlaybackStateCompat, this.MediaBrowserCompat$CustomActionResultReceiver, inflate);
            getUuidUtf8Bytes getuuidutf8bytes2 = this.IconCompatParcelizer;
            this.refIdTextView.setText(getuuidutf8bytes2.MediaSessionCompat$Token);
            this.dateTimeTextView.setText(getuuidutf8bytes2.MediaDescriptionCompat);
        }
        return inflate;
    }

    @OnClick
    public void onReturnToSubscriptionListClick() {
        Intent intent = new Intent(getContext(), EBillSubscriptionActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS_EBILL_SUBSCRIPTION", true);
        intent.addFlags(603979776);
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
