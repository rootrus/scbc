package com.scb.phone.view.fragment.purchase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailPurchaseViewPagerAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Arrays;
import java.util.List;
import p040o.C10178z;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getCarbonStrip$MediaBrowserCompat$CustomActionResultReceiver;
import p059me.relex.circleindicator.CircleIndicator;

public class PurchaseCreditCardFragment extends BaseFragment implements getCarbonStrip$MediaBrowserCompat$CustomActionResultReceiver {
    /* access modifiers changed from: private */
    public PurchaseCreditCardInputFragment IconCompatParcelizer;
    private List<String> MediaBrowserCompat$CustomActionResultReceiver;
    private CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaBrowserCompat$MediaItem;
    @BindView
    TextView errorDescription;
    @BindView
    TextView errorTitle;
    @BindView
    LinearLayout layoutCards;
    @BindView
    LinearLayout layoutError;
    @BindView
    LinearLayout layoutNoCard;
    @BindView
    CircleIndicator mIndicator;
    @HmlPinActivity
    public C10178z.C547010 mPresenter;
    @BindView
    ViewPager mViewPager;
    @BindView
    TextView noCardDescriptionTextView;
    @BindView
    TextView noCardTitleTextView;

    public static PurchaseCreditCardFragment IconCompatParcelizer(String[] strArr, CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("com.scb.phone.EXTRA_PURCHASE_CARD_SCHEME_ALLOW", strArr);
        bundle.putParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN", builder);
        PurchaseCreditCardFragment purchaseCreditCardFragment = new PurchaseCreditCardFragment();
        purchaseCreditCardFragment.setArguments(bundle);
        return purchaseCreditCardFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89112131494138, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String[] stringArray = arguments.getStringArray("com.scb.phone.EXTRA_PURCHASE_CARD_SCHEME_ALLOW");
            if (stringArray != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(stringArray);
            }
            if (getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN") != null) {
                this.MediaBrowserCompat$MediaItem = (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN");
            }
        }
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.IconCompatParcelizer = PurchaseCreditCardInputFragment.read(this.MediaBrowserCompat$MediaItem);
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.credit_card_input_container, this.IconCompatParcelizer).write();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mPresenter.onDestroy();
    }

    public final void Keep() {
        super.Keep();
        this.layoutCards.setVisibility(8);
        this.layoutNoCard.setVisibility(8);
        this.layoutError.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(final List<chain> list) {
        this.layoutCards.setVisibility(0);
        this.mViewPager.setAdapter(new CreditCardDetailPurchaseViewPagerAdapter(getContext(), list));
        this.mIndicator.setViewPager(this.mViewPager);
        this.IconCompatParcelizer.IconCompatParcelizer(list.get(0));
        this.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                PurchaseCreditCardFragment.this.IconCompatParcelizer.IconCompatParcelizer((chain) list.get(i));
            }
        });
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder;
        if (isAdded() && (builder = this.MediaBrowserCompat$MediaItem) != null && builder.IconCompatParcelizer != null) {
            this.layoutNoCard.setVisibility(0);
            this.noCardDescriptionTextView.setText(this.MediaBrowserCompat$MediaItem.IconCompatParcelizer.IconCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer() {
        this.mIndicator.setVisibility(0);
    }

    public final void read() {
        this.mIndicator.setVisibility(8);
    }

    public final void write() {
        this.layoutError.setVisibility(0);
    }

    @OnClick
    public void onRefreshErrorCard() {
        this.mPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
