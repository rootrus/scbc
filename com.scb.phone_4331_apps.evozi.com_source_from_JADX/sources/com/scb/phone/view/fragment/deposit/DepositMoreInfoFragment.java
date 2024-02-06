package com.scb.phone.view.fragment.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.HashMap;
import p040o.C1157x4c69105f;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.HmlPinActivity;
import p040o.getAppFile;
import p040o.getKtdxXML;
import p040o.getSessionFileProvider;
import p040o.hasCrashDataForSession;
import p040o.openSession;
import p040o.setCrashlyticsCollectionEnabled;
import p040o.setLastBaselineToBottomHeight;

public class DepositMoreInfoFragment extends BaseFragment implements C1157x4c69105f {
    public HashMap<String, getSessionFileProvider> IconCompatParcelizer;
    public write MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getKtdxXML depositMoreInfoPresenter;
    @BindView
    CustomHorizontalProgressBar mCustomProgressBarOverdraftStatus;
    @BindView
    ImageView mImageIconExpandMore;
    @BindView
    ViewGroup mLayoutCollapsed;
    @BindView
    public ViewGroup mLayoutExpanded;
    @BindView
    public LinearLayout mLayoutOverdraftStatus;
    @BindView
    public TextView mTenorTitle;
    @BindView
    TextView mTextAccountBalance;
    @BindView
    TextView mTextAccountName;
    @BindView
    TextView mTextAvailableBalance;
    @BindView
    TextView mTextDepositAmount;
    @BindView
    TextView mTextInterestAccrued;
    @BindView
    TextView mTextInterestAccruedTitle;
    @BindView
    TextView mTextOverdraftInterestAccruedTitle;
    @BindView
    TextView mTextOverdraftLimit;
    @BindView
    TextView mTextOverdraftLimitUsed;
    @BindView
    public TextView mTextProductName;
    @BindView
    public TextView mTextProductType;
    @BindView
    public TextView mTextTenor;
    @BindView
    TextView mTextTransferOtherBankAccounts;
    @BindView
    TextView mTextTransferOtherScbAccounts;
    @BindView
    TextView mTextTransferOwnScbAccounts;
    @BindView
    TextView mTextTransferPromptPay;
    @BindView
    View mViewDepositAmountKey;
    @BindView
    ViewGroup mViewGroupBalance;
    @BindView
    ViewGroup mViewGroupInterestAccrued;
    @BindView
    ViewGroup mViewGroupOverdraftLimit;
    @BindView
    ViewGroup mViewGroupTenorAndDepositAmount;
    @BindView
    ViewGroup mViewGroupTransferLimits;
    @BindView
    public Button moreServices;

    public interface write {
        void MediaSessionCompat$QueueItem();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.depositMoreInfoPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86662131493893, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onDestroy() {
        getKtdxXML getktdxxml = this.depositMoreInfoPresenter;
        if (getktdxxml != null) {
            getktdxxml.onDestroy();
        }
        super.onDestroy();
    }

    @OnClick
    public void onLayoutCollapsedClick() {
        getSessionFileProvider getsessionfileprovider;
        getKtdxXML getktdxxml = this.depositMoreInfoPresenter;
        if (getktdxxml != null) {
            getsessionfileprovider = getktdxxml.read;
        } else {
            getsessionfileprovider = null;
        }
        if (getsessionfileprovider != null) {
            getsessionfileprovider.AlertController$RecycleListView = !getsessionfileprovider.AlertController$RecycleListView;
            FragmentBuilder_BindDeejungPlansFragment.read(this.mImageIconExpandMore);
            if (this.mLayoutExpanded.getVisibility() == 8) {
                FragmentBuilder_BindDeejungPlansFragment.write(this.mLayoutExpanded);
            } else {
                FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mLayoutExpanded);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getSessionFileProvider getsessionfileprovider) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new HashMap<>();
        }
        this.IconCompatParcelizer.put(getsessionfileprovider.ParcelableVolumeInfo, getsessionfileprovider);
        int i = 0;
        if (getsessionfileprovider instanceof getAppFile) {
            getAppFile getappfile = (getAppFile) getsessionfileprovider;
            this.mViewGroupTenorAndDepositAmount.setVisibility(8);
            this.mViewGroupBalance.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            MediaBrowserCompat$CustomActionResultReceiver(8);
            write(8);
            this.mViewGroupBalance.setVisibility(0);
            this.mViewGroupTransferLimits.setVisibility(0);
            this.mViewGroupInterestAccrued.setVisibility(0);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            this.mTextAccountName.setText(getappfile.f2852x50fd9e4a);
            this.mTextAccountBalance.setText(getappfile.IconCompatParcelizer);
            this.mTextAvailableBalance.setText(getappfile.MediaBrowserCompat$ItemReceiver);
            this.mTextInterestAccrued.setText(getappfile.MediaBrowserCompat$MediaItem);
            this.mTextTransferOwnScbAccounts.setText(getappfile.MediaMetadataCompat);
            this.mTextTransferOtherScbAccounts.setText(getappfile.MediaDescriptionCompat);
            this.mTextTransferOtherBankAccounts.setText(getappfile.MediaBrowserCompat$CustomActionResultReceiver);
            this.mTextTransferPromptPay.setText(getappfile.read);
        } else if (getsessionfileprovider instanceof setCrashlyticsCollectionEnabled) {
            setCrashlyticsCollectionEnabled setcrashlyticscollectionenabled = (setCrashlyticsCollectionEnabled) getsessionfileprovider;
            this.mViewGroupTenorAndDepositAmount.setVisibility(8);
            this.mViewGroupBalance.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            MediaBrowserCompat$CustomActionResultReceiver(8);
            this.mViewGroupBalance.setVisibility(8);
            this.mViewGroupTransferLimits.setVisibility(8);
            this.mViewGroupInterestAccrued.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            write(0);
            LinearLayout linearLayout = this.mLayoutOverdraftStatus;
            if (!setcrashlyticscollectionenabled.MediaBrowserCompat$MediaItem) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            this.mCustomProgressBarOverdraftStatus.setProgressBar(setcrashlyticscollectionenabled.MediaSessionCompat$QueueItem);
            this.mCustomProgressBarOverdraftStatus.setTotalValue(setcrashlyticscollectionenabled.MediaBrowserCompat$SearchResultReceiver);
            this.mCustomProgressBarOverdraftStatus.setUsedValue(setcrashlyticscollectionenabled.MediaSessionCompat$ResultReceiverWrapper);
            this.mCustomProgressBarOverdraftStatus.setAvailableValue(setcrashlyticscollectionenabled.MediaBrowserCompat$ItemReceiver);
            this.mCustomProgressBarOverdraftStatus.setUsedValueColor(setLastBaselineToBottomHeight.read(getContext(), setcrashlyticscollectionenabled.MediaSessionCompat$Token));
            this.mTextAccountName.setText(setcrashlyticscollectionenabled.f2852x50fd9e4a);
            this.mTextAccountBalance.setText(setcrashlyticscollectionenabled.IconCompatParcelizer);
            this.mTextAvailableBalance.setText(setcrashlyticscollectionenabled.MediaBrowserCompat$ItemReceiver);
            this.mTextOverdraftLimit.setText(setcrashlyticscollectionenabled.MediaBrowserCompat$SearchResultReceiver);
            this.mTextOverdraftLimitUsed.setText(setcrashlyticscollectionenabled.MediaSessionCompat$ResultReceiverWrapper);
            this.mTextInterestAccrued.setText(setcrashlyticscollectionenabled.RatingCompat);
            this.mTextTransferOwnScbAccounts.setText(setcrashlyticscollectionenabled.MediaMetadataCompat);
            this.mTextTransferOtherScbAccounts.setText(setcrashlyticscollectionenabled.MediaDescriptionCompat);
            this.mTextTransferOtherBankAccounts.setText(setcrashlyticscollectionenabled.MediaBrowserCompat$CustomActionResultReceiver);
            this.mTextTransferPromptPay.setText(setcrashlyticscollectionenabled.read);
        } else if (getsessionfileprovider instanceof hasCrashDataForSession) {
            hasCrashDataForSession hascrashdataforsession = (hasCrashDataForSession) getsessionfileprovider;
            MediaBrowserCompat$CustomActionResultReceiver(8);
            this.mViewGroupBalance.setVisibility(8);
            this.mViewGroupTransferLimits.setVisibility(8);
            this.mViewGroupInterestAccrued.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            write(8);
            this.mViewGroupTenorAndDepositAmount.setVisibility(0);
            this.mViewGroupBalance.setVisibility(0);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            this.mTextAccountName.setText(hascrashdataforsession.f2852x50fd9e4a);
            this.mTextAccountBalance.setText(hascrashdataforsession.MediaBrowserCompat$ItemReceiver);
            this.mTextAvailableBalance.setText(hascrashdataforsession.read);
            this.mTextTenor.setText(hascrashdataforsession.IconCompatParcelizer);
        } else if (getsessionfileprovider instanceof openSession) {
            openSession opensession = (openSession) getsessionfileprovider;
            this.mViewGroupBalance.setVisibility(0);
            this.mViewGroupTransferLimits.setVisibility(0);
            this.mViewGroupInterestAccrued.setVisibility(0);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            write(8);
            this.mViewGroupTenorAndDepositAmount.setVisibility(8);
            this.mViewGroupBalance.setVisibility(8);
            MediaBrowserCompat$CustomActionResultReceiver(false);
            MediaBrowserCompat$CustomActionResultReceiver(0);
            this.mTextAccountName.setText(opensession.f2852x50fd9e4a);
            this.mTextAccountBalance.setText(opensession.MediaBrowserCompat$CustomActionResultReceiver);
            this.mTextAvailableBalance.setText(opensession.MediaBrowserCompat$ItemReceiver);
            this.mTextTenor.setText(opensession.MediaMetadataCompat);
            this.mTextDepositAmount.setText(opensession.read);
            this.mTextInterestAccrued.setText(opensession.IconCompatParcelizer);
        }
        this.mImageIconExpandMore.setRotation(BitmapDescriptorFactory.HUE_RED);
    }

    public final void write(getSessionFileProvider getsessionfileprovider) {
        Context context = getContext();
        if (context != null) {
            context.sendBroadcast(new Intent("com.scb.phone.ACTION_MORE_INFO_UPDATE").putExtra("com.scb.phone.EXTRA_MORE_INFO", getsessionfileprovider));
        }
    }

    @OnClick
    public void onExportStatementButtonClick() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaSessionCompat$QueueItem();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.mViewGroupTenorAndDepositAmount.setVisibility(i);
        this.mTextDepositAmount.setVisibility(i);
        this.mViewDepositAmountKey.setVisibility(i);
        this.mViewGroupBalance.setVisibility(i);
        this.mViewGroupInterestAccrued.setVisibility(i);
        MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.mTextOverdraftInterestAccruedTitle.setVisibility(0);
            this.mTextInterestAccruedTitle.setVisibility(8);
            return;
        }
        this.mTextOverdraftInterestAccruedTitle.setVisibility(8);
        this.mTextInterestAccruedTitle.setVisibility(0);
    }

    private void write(int i) {
        this.mLayoutOverdraftStatus.setVisibility(i);
        this.mViewGroupBalance.setVisibility(i);
        this.mViewGroupTransferLimits.setVisibility(i);
        this.mViewGroupOverdraftLimit.setVisibility(i);
        this.mViewGroupInterestAccrued.setVisibility(i);
        MediaBrowserCompat$CustomActionResultReceiver(true);
    }
}
