package com.scb.phone.view.fragment.investment;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.funddetails.InvestmentFundDetailsActivity;
import com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_BindHowToAddAccountActivity;
import p040o.ActivityBuilder_BindInputDetailsActivity;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindCalendarFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addInput;
import p040o.buildSingleThreadExecutorService;
import p040o.doBackgroundInitializationAsync;
import p040o.getAbortedReason;
import p040o.getMicrAmount$MediaBrowserCompat$ItemReceiver;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.validateGER;

public class MyFundsFragment extends BaseFragment implements getMicrAmount$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindCalendarFragment {
    private InvestmentDetailsClientListAdapter IconCompatParcelizer;
    private validateGER MediaBrowserCompat$CustomActionResultReceiver;
    private RecyclerView.IconCompatParcelizer MediaBrowserCompat$MediaItem;
    private FragmentBuilder_BindCalendarFragment MediaBrowserCompat$SearchResultReceiver;
    @BindView
    TextView errorTextView;
    @HmlPinActivity
    public getAbortedReason myFundsPresenter;
    @BindView
    RecyclerView recyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88192131494046, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$SearchResultReceiver = this;
        this.myFundsPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_INVESTMENT_DETAILS")).subscribe(new ActivityBuilder_BindHowToAddAccountActivity(this), ActivityBuilder_BindInputDetailsActivity.MediaBrowserCompat$CustomActionResultReceiver);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("RecyclerViewExpandableItemManager") : null;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = new validateGER(parcelable);
        InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter = new InvestmentDetailsClientListAdapter(getContext());
        this.IconCompatParcelizer = investmentDetailsClientListAdapter;
        investmentDetailsClientListAdapter.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) this.IconCompatParcelizer);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.setAdapter(this.MediaBrowserCompat$MediaItem);
        this.recyclerView.setItemAnimator(addinput);
        this.recyclerView.setHasFixedSize(false);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.recyclerView);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        validateGER validateger = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (validateger != null) {
            bundle.putParcelable("RecyclerViewExpandableItemManager", validateger.read());
        }
    }

    public void onDestroyView() {
        validateGER validateger = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (validateger != null) {
            validateger.write();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
            this.recyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
            this.recyclerView = null;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
        if (iconCompatParcelizer != null) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer);
            this.MediaBrowserCompat$MediaItem = null;
        }
        super.onDestroyView();
    }

    public void onDestroy() {
        this.myFundsPresenter.onDestroy();
        super.onDestroy();
    }

    public final void read(int i, String str) {
        Intent intent = new Intent(getContext(), InvestmentFundDetailsActivity.class);
        intent.putParcelableArrayListExtra("INVESTMENT_DETAILS_CLIENT_LIST", new ArrayList(this.myFundsPresenter.read.IconCompatParcelizer));
        intent.putExtra("INVESTMENT_DETAILS_CLIENT", this.myFundsPresenter.read(str));
        intent.putExtra("SELECTED_FUND_LIST_POSITION", i);
        intent.putExtra("SELECTED_CLIENT_LIST_POSITION", this.myFundsPresenter.MediaBrowserCompat$ItemReceiver(str));
        intent.putExtra("PROFILE_CUSTOMER_NAME", this.myFundsPresenter.read.MediaMetadataCompat.IconCompatParcelizer);
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

    public final void MediaBrowserCompat$ItemReceiver(List<doBackgroundInitializationAsync> list) {
        this.myFundsPresenter.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<buildSingleThreadExecutorService> list) {
        this.recyclerView.setVisibility(0);
        InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter = this.IconCompatParcelizer;
        investmentDetailsClientListAdapter.read.clear();
        investmentDetailsClientListAdapter.read.addAll(list);
        investmentDetailsClientListAdapter.IconCompatParcelizer.write();
    }

    public final void write() {
        StringBuilder sb = new StringBuilder();
        sb.append("Show error ");
        sb.append(true);
        Log.i("MUTUAL", sb.toString());
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(MyFundsFragment myFundsFragment) {
        getAbortedReason getabortedreason = myFundsFragment.myFundsPresenter;
        if (getabortedreason.RatingCompat != null) {
            getabortedreason.RatingCompat.Keep();
        }
        getabortedreason.write.MediaBrowserCompat$ItemReceiver();
        getabortedreason.write.IconCompatParcelizer(new getAbortedReason.read(getabortedreason, (byte) 0));
    }
}
