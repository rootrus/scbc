package com.scb.phone.view.fragment.creditcard;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.creditcard.CreditCardBilledDetailActivity;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailBilledAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.C6385xbe9d6559;
import p040o.EasycashCardService;
import p040o.FragmentBuilder_BindBillPaymentBillerListFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TouchPointService;
import p040o.TypeAdapters;
import p040o.cardInfoInit;
import p040o.getInterface;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class BilledTabFragment extends BaseFragment implements FragmentBuilder_BindBillPaymentBillerListFragment, C6385xbe9d6559 {
    public CreditCardDetailBilledAdapter IconCompatParcelizer;
    public Handler MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public TypeAdapters.C39139 billedTabPresenter;
    @BindView
    public RelativeLayout mContainerRelativeLayout;
    @BindView
    TextView mEmptyCenterTitle;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    public RecyclerView mRecyclerView;
    @BindView
    public TextView mShowMessages;

    public static BilledTabFragment read(String str) {
        BilledTabFragment billedTabFragment = new BilledTabFragment();
        Bundle bundle = new Bundle();
        bundle.putString("CREDIT_CARD_NUMBER", str);
        billedTabFragment.setArguments(bundle);
        return billedTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86322131493859, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.billedTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            this.billedTabPresenter.read = getArguments().getString("CREDIT_CARD_NUMBER");
        }
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.billedTabPresenter.write();
        this.MediaBrowserCompat$CustomActionResultReceiver = new Handler(Looper.getMainLooper());
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_UPDATE_LIST")).subscribe(new cardInfoInit(this), EasycashCardService.IconCompatParcelizer);
        return inflate;
    }

    public final void write(int i) {
        Intent intent = new Intent(getContext(), CreditCardBilledDetailActivity.class);
        intent.putExtra("BILLED_DETAIL", this.billedTabPresenter.write.get(i));
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

    public final void write(List<getInterface> list) {
        this.mRecyclerView.setVisibility(0);
        if (this.IconCompatParcelizer == null) {
            CreditCardDetailBilledAdapter creditCardDetailBilledAdapter = new CreditCardDetailBilledAdapter(list, this);
            this.IconCompatParcelizer = creditCardDetailBilledAdapter;
            this.mRecyclerView.setAdapter(creditCardDetailBilledAdapter);
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.post(new TouchPointService(this, list));
    }

    public void onDestroy() {
        this.billedTabPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyCenterTitle.setText(getResources().getString(R.string.custom_empty_no_transactions));
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    @OnClick
    public void onClick() {
        this.billedTabPresenter.write();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacksAndMessages((Object) null);
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }
}
