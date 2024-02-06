package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionInputActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.BasePaymentFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.ActivityBuilder_ContributesStatementChannelCommonActivity;
import p040o.ActivityBuilder_ContributesStatementChannelLandingActivity;
import p040o.ActivityBuilder_ContributesStatementChannelSuccessfulActivity;
import p040o.ActivityBuilder_ContributesThirdPartySlipDeepLinkActivity;
import p040o.C7085x54efaba5;
import p040o.CrashlyticsReport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.getStreetViewPanoramaCamera;
import p040o.setTapText;

public class BillPaymentBillerListFragment extends BasePaymentFragment implements View.OnFocusChangeListener {
    public C7085x54efaba5 MediaBrowserCompat$CustomActionResultReceiver;
    private ServerProjectProvider.C70695.IconCompatParcelizer MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean RatingCompat;

    public static BillPaymentBillerListFragment MediaMetadataCompat() {
        BillPaymentBillerListFragment billPaymentBillerListFragment = new BillPaymentBillerListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_FROM_BILLPAYMENT", true);
        billPaymentBillerListFragment.setArguments(bundle);
        return billPaymentBillerListFragment;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider.C70695.IconCompatParcelizer)) {
            this.MediaMetadataCompat = (ServerProjectProvider.C70695.IconCompatParcelizer) parentFragment;
        }
        if (parentFragment != null && (parentFragment instanceof C7085x54efaba5)) {
            C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = (C7085x54efaba5) parentFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver;
            if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.write() != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write().read(new ActivityBuilder_ContributesStatementChannelSuccessfulActivity(this));
            }
        }
    }

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((BillPaymentBillerListFragment) fragment).startActivityForResult(intent, 1899);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.RatingCompat) {
            this.billPaymentPresenter.MediaBrowserCompat$ItemReceiver();
        } else {
            this.billPaymentPresenter.MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.mRecommendedBillersTextView.setText(R.string.recommended_billers);
    }

    public final void MediaBrowserCompat$MediaItem() {
        super.MediaBrowserCompat$MediaItem();
        this.mSearchEditText.setHint(R.string.auto_biller_search_input_placeholder);
        this.mSearchEditText.setInputType(0);
    }

    public final void RatingCompat() {
        this.mSearchEditText.setOnTouchListener(new ActivityBuilder_ContributesStatementChannelLandingActivity(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1899 && i2 == -1 && this.RatingCompat && this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((CrashlyticsReport.Session.Event.Application.Execution) BillPaymentSearchActivity.read(intent));
        }
    }

    public final void read(int i) {
        super.read(i);
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) this.IconCompatParcelizer.IconCompatParcelizer(i);
        if (this.RatingCompat) {
            ServerProjectProvider.C70695.IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(execution);
            }
            if (this.mRecyclerView.AppCompatActivity instanceof LinearLayoutManager) {
                new Handler().postDelayed(new ActivityBuilder_ContributesThirdPartySlipDeepLinkActivity(this), 100);
                this.mSearchEditText.setText("");
                return;
            }
            return;
        }
        Intent intent = new Intent(getContext(), EBillSubscriptionInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
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

    public void onEmptyLayoutClick() {
        super.onEmptyLayoutClick();
        if (this.RatingCompat) {
            this.billPaymentPresenter.MediaBrowserCompat$ItemReceiver();
        } else {
            this.billPaymentPresenter.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaDescriptionCompat() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.RatingCompat = arguments.getBoolean("BUNDLE_FROM_BILLPAYMENT", false);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mRecyclerView.setVisibility(8);
        this.mViewBillerNotFound.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        if (!this.RatingCompat) {
            read read2 = new read(linearLayoutManager);
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView.setGroupDividerEnabled == null) {
                recyclerView.setGroupDividerEnabled = new ArrayList();
            }
            recyclerView.setGroupDividerEnabled.add(read2);
        }
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        BillerAdapter billerAdapter = this.IconCompatParcelizer;
        billerAdapter.MediaBrowserCompat$ItemReceiver = linearLayoutManager;
        billerAdapter.write = false;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = billerAdapter.MediaBrowserCompat$ItemReceiver;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null || (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof GridLayoutManager)) {
            billerAdapter.write = true;
        }
        billerAdapter.IconCompatParcelizer.write();
        this.mRecommendedBillersTextView.setText(R.string.search_biller);
        this.mRecyclerView.setVisibility(0);
    }

    public void onFocusChange(View view, boolean z) {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat && z && view.getId() == this.mSearchEditText.getId() && this.RatingCompat && getActivity() != null && (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.read(write(getView()));
        }
    }

    private int write(View view) {
        if (view.getId() == R.id.bill_payment_tab_nested_scrollview) {
            return (int) view.getY();
        }
        return ((int) view.getY()) + write((View) view.getParent());
    }

    public class read extends RecyclerView.ParcelableVolumeInfo {
        private LinearLayoutManager IconCompatParcelizer;

        public read(LinearLayoutManager linearLayoutManager) {
            this.IconCompatParcelizer = linearLayoutManager;
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            super.IconCompatParcelizer(recyclerView, i, i2);
            if (i2 > 0) {
                int MediaSessionCompat$ResultReceiverWrapper = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
                int MediaSessionCompat$QueueItem = this.IconCompatParcelizer.MediaSessionCompat$QueueItem();
                int MediaMetadataCompat = this.IconCompatParcelizer.MediaMetadataCompat();
                getStreetViewPanoramaCamera getstreetviewpanoramacamera = BillPaymentBillerListFragment.this.billPaymentPresenter.IconCompatParcelizer;
                if (getstreetviewpanoramacamera != null && !BillPaymentBillerListFragment.this.billPaymentPresenter.MediaMetadataCompat && MediaMetadataCompat + MediaSessionCompat$ResultReceiverWrapper == MediaSessionCompat$QueueItem && MediaSessionCompat$QueueItem != 0) {
                    BillerAdapter unused = BillPaymentBillerListFragment.this.IconCompatParcelizer;
                    BillerAdapter.IconCompatParcelizer((BillerAdapter.IconCompatParcelizer) new ActivityBuilder_ContributesStatementChannelCommonActivity(this, getstreetviewpanoramacamera));
                }
            }
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$MediaItem(BillPaymentBillerListFragment billPaymentBillerListFragment) {
        getStreetViewPanoramaCamera getstreetviewpanoramacamera = billPaymentBillerListFragment.billPaymentPresenter.IconCompatParcelizer;
        if (getstreetviewpanoramacamera != null && !billPaymentBillerListFragment.billPaymentPresenter.MediaMetadataCompat) {
            billPaymentBillerListFragment.billPaymentPresenter.MediaBrowserCompat$ItemReceiver(billPaymentBillerListFragment.MediaBrowserCompat$SearchResultReceiver(), getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver, billPaymentBillerListFragment.RatingCompat);
        }
    }
}
