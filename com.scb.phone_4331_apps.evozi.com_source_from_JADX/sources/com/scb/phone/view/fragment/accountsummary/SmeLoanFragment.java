package com.scb.phone.view.fragment.accountsummary;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.loan.SmeLoanDetailActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule$a$MediaSessionCompat$QueueItem;
import p040o.EasycashMCMCDetailRepositoryModule;
import p040o.FragmentBuilder_BindBaseReplaceableFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCachedSettingsData;
import p040o.getCustomerData;
import p040o.getIdps;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class SmeLoanFragment extends BaseCardFragment implements CheckCaptureModule$a$MediaSessionCompat$QueueItem, FragmentBuilder_BindBaseReplaceableFragment {
    @HmlPinActivity
    public getCachedSettingsData smeLoanPresenter;
    @BindView
    TextView smeLoanTextView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85542131493781, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.smeLoanPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.smeLoanTextView.setText(R.string.account_summary_sme_loan);
        this.smeLoanPresenter.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new getCustomerData(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new getCustomerData(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new getCustomerData(this), getIdps.MediaBrowserCompat$ItemReceiver);
        return inflate;
    }

    public void onDestroy() {
        getCachedSettingsData getcachedsettingsdata = this.smeLoanPresenter;
        if (getcachedsettingsdata != null) {
            getcachedsettingsdata.onDestroy();
        }
        super.onDestroy();
    }

    public final void write(List<Futures.ChainingListenableFuture> list) {
        if (list.isEmpty()) {
            RelativeLayout relativeLayout = this.mParentLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
                return;
            }
            return;
        }
        EasycashMCMCDetailRepositoryModule easycashMCMCDetailRepositoryModule = new EasycashMCMCDetailRepositoryModule(getActivity(), list);
        if (easycashMCMCDetailRepositoryModule.read == null) {
            easycashMCMCDetailRepositoryModule.read = this;
        }
        this.mViewPager.setAdapter(easycashMCMCDetailRepositoryModule);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        read(list);
        RelativeLayout relativeLayout2 = this.mParentLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Intent intent = new Intent(getContext(), SmeLoanDetailActivity.class);
        List<Futures.ChainingListenableFuture> list = this.smeLoanPresenter.MediaBrowserCompat$ItemReceiver;
        Intent putExtra = intent.putParcelableArrayListExtra("com.scb.phone.EXTRA_SME_LOAN_LIST", list != null ? (ArrayList) list : new ArrayList()).putExtra("com.scb.phone.EXTRA_SME_LOAN_SELECTED_POSITION", i);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
