package com.scb.phone.view.fragment.merchant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityBuilder_ContributeEasycashBaseIntroductionActivity;
import p040o.ActivityBuilder_ContributeEasycashCreditCardIntroductionActivity;
import p040o.ActivityBuilder_ContributeEasycashInputIncomeActivity;
import p040o.ActivityBuilder_ContributeEasycashIssuerSearchActivity;
import p040o.ActivityBuilder_ContributeEasycashLandingActivity;
import p040o.AppStatsSqLiteDs;
import p040o.C6900x198d4346;
import p040o.C9846aU;
import p040o.HmlPinActivity;
import p040o.ICheckExtractorListener;
import p040o.MenuItemImpl;
import p040o.doWriteToLog;
import p040o.getExitTransitionCallback;
import p040o.getIdpRequestInfo;
import p040o.getSharedElementEnterTransition;
import p040o.setOverflowReserved;
import p040o.show;
import p040o.showNow;

public class MerchantWalletTransactionFragment extends BaseFragment implements ICheckExtractorListener.read {
    private C6900x198d4346 IconCompatParcelizer;
    private MerchantWalletIncomingTransactionFragment MediaBrowserCompat$CustomActionResultReceiver;
    private MerchantWalletOutgoingTransactionFragment MediaDescriptionCompat;
    private C6900x198d4346 MediaMetadataCompat;
    private getIdpRequestInfo RatingCompat;
    @HmlPinActivity
    public AppStatsSqLiteDs.C3043b mPresenter;
    @BindView
    protected TabLayout mTabLayoutTransaction;
    @BindView
    protected TextView mTextTxn;
    @BindView
    protected TextView mTextTxnMonth;
    @BindView
    protected Toolbar mToolbarTxn;
    @BindView
    protected ViewPager mViewPager;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88352131494062, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mToolbarTxn.IconCompatParcelizer(R.menu.f93072131558412);
        this.mToolbarTxn.setOnMenuItemClickListener(new ActivityBuilder_ContributeEasycashCreditCardIntroductionActivity(this));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        OffsetDateTime now = OffsetDateTime.now();
        setOverflowReserved setoverflowreserved = new setOverflowReserved(getContext(), this.mToolbarTxn.findViewById(R.id.menu_filter));
        MenuItemImpl menuItemImpl = setoverflowreserved.MediaBrowserCompat$CustomActionResultReceiver;
        showNow MediaBrowserCompat$ItemReceiver = showNow.MediaBrowserCompat$ItemReceiver(0, 6);
        show show = new show(MediaBrowserCompat$ItemReceiver.read, new getExitTransitionCallback(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, new ActivityBuilder_ContributeEasycashBaseIntroductionActivity(now)));
        show show2 = new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new ActivityBuilder_ContributeEasycashInputIncomeActivity(this, now)));
        ActivityBuilder_ContributeEasycashIssuerSearchActivity activityBuilder_ContributeEasycashIssuerSearchActivity = new ActivityBuilder_ContributeEasycashIssuerSearchActivity(menuItemImpl);
        while (show2.IconCompatParcelizer.hasNext()) {
            activityBuilder_ContributeEasycashIssuerSearchActivity.MediaBrowserCompat$ItemReceiver(show2.IconCompatParcelizer.next());
        }
        setoverflowreserved.write = new ActivityBuilder_ContributeEasycashLandingActivity(this);
        setoverflowreserved.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(MenuItem menuItem) {
        AppStatsSqLiteDs.C3043b bVar = this.mPresenter;
        OffsetDateTime minusMonths = OffsetDateTime.now().minusMonths((long) menuItem.getOrder());
        bVar.MediaBrowserCompat$ItemReceiver = minusMonths.withDayOfMonth(1).format(bVar.IconCompatParcelizer);
        bVar.read = minusMonths.plusMonths(1).withDayOfMonth(1).minusDays(1).format(bVar.IconCompatParcelizer);
        C9846aU aUVar = new C9846aU(bVar);
        if (bVar.RatingCompat != null) {
            aUVar.IconCompatParcelizer(bVar.RatingCompat);
        }
        this.mTextTxnMonth.setText(menuItem.getTitle());
        this.mTextTxnMonth.setVisibility(0);
        return true;
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof MerchantWalletIncomingTransactionFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (MerchantWalletIncomingTransactionFragment) fragment;
        } else if (fragment instanceof MerchantWalletOutgoingTransactionFragment) {
            this.MediaDescriptionCompat = (MerchantWalletOutgoingTransactionFragment) fragment;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(doWriteToLog dowritetolog, String str, String str2, boolean z) {
        getIdpRequestInfo getidprequestinfo = this.RatingCompat;
        if (getidprequestinfo == null) {
            getIdpRequestInfo getidprequestinfo2 = new getIdpRequestInfo(getChildFragmentManager(), getContext(), dowritetolog, str, str2, z);
            this.RatingCompat = getidprequestinfo2;
            this.mViewPager.setAdapter(getidprequestinfo2);
            this.mTabLayoutTransaction.setupWithViewPager(this.mViewPager);
            return;
        }
        getidprequestinfo.MediaBrowserCompat$CustomActionResultReceiver = dowritetolog;
        getidprequestinfo.write = str;
        getidprequestinfo.read = str2;
        getidprequestinfo.MediaBrowserCompat$ItemReceiver = z;
        MerchantWalletIncomingTransactionFragment merchantWalletIncomingTransactionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (merchantWalletIncomingTransactionFragment != null) {
            merchantWalletIncomingTransactionFragment.write(dowritetolog.MediaBrowserCompat$SearchResultReceiver, str, str2);
        }
        MerchantWalletOutgoingTransactionFragment merchantWalletOutgoingTransactionFragment = this.MediaDescriptionCompat;
        if (merchantWalletOutgoingTransactionFragment != null) {
            merchantWalletOutgoingTransactionFragment.write(dowritetolog.MediaBrowserCompat$SearchResultReceiver, str, str2);
        }
    }

    public final void IconCompatParcelizer(C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        this.IconCompatParcelizer = iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void write(C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaMetadataCompat = iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void aw_() {
        C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
        C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver2;
        if (this.RatingCompat == null) {
            return;
        }
        if (this.mViewPager.getCurrentItem() == 0 && (iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer) != null) {
            iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver2.aw_();
        } else if (this.mViewPager.getCurrentItem() == 1 && (iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat) != null) {
            iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver.aw_();
        }
    }
}
