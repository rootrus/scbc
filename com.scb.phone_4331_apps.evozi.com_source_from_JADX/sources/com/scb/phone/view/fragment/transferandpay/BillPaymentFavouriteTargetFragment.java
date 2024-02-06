package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.EditFavouriteActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeScbPrivacyPolicyActivity;
import p040o.ActivityBuilder_ContributeStopChequeLandingActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity;
import p040o.C5170qP;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class BillPaymentFavouriteTargetFragment extends FavouriteTargetFragment implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment, View.OnClickListener {
    @HmlPinActivity
    public C5170qP billPaymentFavouriteTargetPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87432131493970, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.billPaymentFavouriteTargetPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new ActivityBuilder_ContributeScbPrivacyPolicyActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_EDIT_FAVORITE_REFRESH")).subscribe(new ActivityBuilder_ContributeStopChequeLandingActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        this.MediaBrowserCompat$CustomActionResultReceiver = this;
        this.IconCompatParcelizer = this;
        this.billPaymentFavouriteTargetPresenter.read();
        read(getString(R.string.favorite_empty));
        MediaBrowserCompat$CustomActionResultReceiver(C5170qP.MediaBrowserCompat$ItemReceiver("BILLPAYMENT"));
        return inflate;
    }

    public void onDestroy() {
        this.billPaymentFavouriteTargetPresenter.onDestroy();
        super.onDestroy();
    }

    public final void read(int i) {
        this.billPaymentFavouriteTargetPresenter.IconCompatParcelizer("BILLPAYMENT", i);
        write();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends CrashlyticsReport.Session.Builder> list) {
        super.MediaBrowserCompat$ItemReceiver(list);
        ParcelableVolumeInfo(String.format(getString(R.string.favorite), new Object[]{Integer.valueOf(list.size())}));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        read(getString(R.string.favorite_empty));
    }

    public void onClick(View view) {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_bill_payment_empty));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "BILLPAYMENT");
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

    public void onErrorViewClicked() {
        super.onErrorViewClicked();
        this.billPaymentFavouriteTargetPresenter.read();
    }

    public static /* synthetic */ void IconCompatParcelizer(BillPaymentFavouriteTargetFragment billPaymentFavouriteTargetFragment, Intent intent) {
        if ("BILLPAYMENT".equals(intent.getStringExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE"))) {
            billPaymentFavouriteTargetFragment.billPaymentFavouriteTargetPresenter.read();
        }
    }
}
