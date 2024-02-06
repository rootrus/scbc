package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionSuccessActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportDetectionSettings;
import p040o.getUuidUtf8Bytes;
import p040o.processPendingCleanup;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class EbillSubscriptionReviewFragment extends BaseEBillSubscriptionReviewFragment implements CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.write {
    private CrashlyticsReport.Session.Event.Application.Execution IconCompatParcelizer;
    private setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public PassportDetectionSettings eBillSubscriptionReviewPresenter;

    public static EbillSubscriptionReviewFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        EbillSubscriptionReviewFragment ebillSubscriptionReviewFragment = new EbillSubscriptionReviewFragment();
        ebillSubscriptionReviewFragment.setArguments(bundle);
        return ebillSubscriptionReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87202131493947, viewGroup, false);
        Bundle arguments = getArguments();
        this.IconCompatParcelizer = (CrashlyticsReport.Session.Event.Application.Execution) arguments.getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) arguments.getParcelable("com.scb.phone.EXTRA_REVIEW");
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes;
        IconCompatParcelizer(setuuidfromutf8bytes, this.IconCompatParcelizer, inflate);
        this.eBillSubscriptionReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        setTransitioning();
        return inflate;
    }

    @OnClick
    public void onConfirmButtonClick() {
        PassportDetectionSettings passportDetectionSettings = this.eBillSubscriptionReviewPresenter;
        CrashlyticsReport.Session.Event.Application.Execution execution = this.IconCompatParcelizer;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!passportDetectionSettings.IconCompatParcelizer) {
            passportDetectionSettings.MediaBrowserCompat$ItemReceiver = execution;
            boolean z = true;
            passportDetectionSettings.IconCompatParcelizer = true;
            if (passportDetectionSettings.RatingCompat == null) {
                z = false;
            }
            if (z) {
                passportDetectionSettings.RatingCompat.AlertController$RecycleListView();
            }
            processPendingCleanup write = processPendingCleanup.write();
            write.write = execution.MediaBrowserCompat$SearchResultReceiver;
            write.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.setVisibility;
            write.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes.MenuItemImpl;
            write.read = setuuidfromutf8bytes.setStackedBackground;
            write.MediaBrowserCompat$SearchResultReceiver = execution.setPopupCallback;
            write.MediaDescriptionCompat = execution.setGroupDividerEnabled;
            write.MediaBrowserCompat$MediaItem = execution.ExpandedMenuView;
            passportDetectionSettings.read.write(write);
            passportDetectionSettings.read.IconCompatParcelizer(new PassportDetectionSettings.IconCompatParcelizer(write));
        }
    }

    public final void write(getUuidUtf8Bytes getuuidutf8bytes, CrashlyticsReport.Session.Event.Application.Execution execution) {
        Intent intent = new Intent(getContext(), EBillSubscriptionSuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
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
