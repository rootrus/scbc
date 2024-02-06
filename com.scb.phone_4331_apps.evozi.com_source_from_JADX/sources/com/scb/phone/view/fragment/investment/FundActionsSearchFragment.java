package com.scb.phone.view.fragment.investment;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement;
import com.scb.phone.view.fragment.investment.purchase.IpoTabFragment;
import com.scb.phone.view.fragment.investment.purchase.OthersTabFragment;
import com.scb.phone.view.fragment.investment.purchase.PurchasedTabFragment;
import com.scb.phone.view.fragment.investment.purchase.SSFTabFragment;
import com.scb.phone.view.fragment.investment.redeem.FundRedeemSearchListFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.DeliveryMechanism;
import p040o.HmlPinActivity;
import p040o.InstallerPackageNameProvider;
import p040o.determineFrom;
import p040o.getAdditionalMetadata;
import p040o.getCancelWithdraw;
import p040o.loadInstallerPackageName;
import p040o.onGetStartedClick;
import p040o.remainingCapacity;

public class FundActionsSearchFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    boolean IconCompatParcelizer = false;
    getCancelWithdraw MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver = false;
    boolean MediaDescriptionCompat = false;
    boolean MediaMetadataCompat = false;
    /* access modifiers changed from: private */
    public AsyncTask<String, Void, remainingCapacity> MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: package-private */
    public String RatingCompat;
    @HmlPinActivity
    public getAdditionalMetadata fundActionsSearchPresenter;
    @BindView
    LinearLayout fundRedeemSearchContainer;
    @BindView
    EditText mSearchEdit;
    @BindView
    NestedScrollView nestedScrollView;
    @BindView
    TabLayout tabLayout;
    @BindView
    FragmentWrapContentViewPager tabPager;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r10 = 0
            r0 = 2131493980(0x7f0c045c, float:1.8611455E38)
            android.view.View r8 = r8.inflate(r0, r9, r10)
            butterknife.ButterKnife.IconCompatParcelizer(r7, r8)
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            r9.MediaBrowserCompat$ItemReceiver(r7)
            androidx.fragment.app.FragmentActivity r9 = r7.getActivity()
            android.content.Intent r9 = r9.getIntent()
            java.lang.String r0 = "com.scb.phone.FUND_ACTION_INDICATOR"
            java.lang.String r9 = r9.getStringExtra(r0)
            r7.MediaBrowserCompat$MediaItem = r9
            int r0 = r9.hashCode()
            r1 = 2
            r2 = 3
            r3 = 1
            switch(r0) {
                case -2111590015: goto L_0x0049;
                case -1575706677: goto L_0x003f;
                case -1034774958: goto L_0x0035;
                case 97916784: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0053
        L_0x002b:
            java.lang.String r0 = "FUND_ACTION_PURCHASE"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0053
            r9 = r10
            goto L_0x0054
        L_0x0035:
            java.lang.String r0 = "FUND_ACTION_SWITCH_OUT"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0053
            r9 = r1
            goto L_0x0054
        L_0x003f:
            java.lang.String r0 = "FUND_ACTION_REDEEM"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0053
            r9 = r3
            goto L_0x0054
        L_0x0049:
            java.lang.String r0 = "FUND_ACTION_SWITCH_IN"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0053
            r9 = r2
            goto L_0x0054
        L_0x0053:
            r9 = -1
        L_0x0054:
            java.lang.String r0 = "com.scb.phone.ARGS_FUND_SEARCH_DATA"
            r4 = 8
            if (r9 == 0) goto L_0x0126
            r5 = 2131297955(0x7f0906a3, float:1.821387E38)
            java.lang.String r6 = ""
            if (r9 == r3) goto L_0x00e6
            r3 = 0
            if (r9 == r1) goto L_0x00a6
            if (r9 != r2) goto L_0x01b7
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            o.determineFrom r0 = (p040o.determineFrom) r0
            r9.IconCompatParcelizer = r0
            android.widget.LinearLayout r9 = r7.fundRedeemSearchContainer
            r9.setVisibility(r10)
            com.google.android.material.tabs.TabLayout r9 = r7.tabLayout
            r9.setVisibility(r4)
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r9.setVisibility(r4)
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            o.determineFrom r9 = r9.MediaBrowserCompat$ItemReceiver(r6)
            java.util.List<o.waitForAutomaticDataCollectionEnabled> r9 = r9.MediaBrowserCompat$ItemReceiver
            o.setTitleMarginStart r0 = r7.getChildFragmentManager()
            o.CardView r0 = r0.read()
            com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement r9 = com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement.MediaBrowserCompat$ItemReceiver(r3, r9)
            java.lang.String r1 = "LIST_SWITCH_IN_SEARCH"
            o.CardView r9 = r0.IconCompatParcelizer(r5, r9, r1)
            r9.write()
            goto L_0x01b7
        L_0x00a6:
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            o.DeliveryMechanism r0 = (p040o.DeliveryMechanism) r0
            r9.write = r0
            android.widget.LinearLayout r9 = r7.fundRedeemSearchContainer
            r9.setVisibility(r10)
            com.google.android.material.tabs.TabLayout r9 = r7.tabLayout
            r9.setVisibility(r4)
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r9.setVisibility(r4)
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            o.DeliveryMechanism r9 = r9.IconCompatParcelizer(r6)
            java.util.List<o.DataTransportState> r9 = r9.IconCompatParcelizer
            o.setTitleMarginStart r0 = r7.getChildFragmentManager()
            o.CardView r0 = r0.read()
            com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement r9 = com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement.MediaBrowserCompat$ItemReceiver(r9, r3)
            java.lang.String r1 = "LIST_SWITCH_OUT_SEARCH"
            o.CardView r9 = r0.IconCompatParcelizer(r5, r9, r1)
            r9.write()
            goto L_0x01b7
        L_0x00e6:
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            o.loadInstallerPackageName r0 = (p040o.loadInstallerPackageName) r0
            r9.read = r0
            android.widget.LinearLayout r9 = r7.fundRedeemSearchContainer
            r9.setVisibility(r10)
            com.google.android.material.tabs.TabLayout r9 = r7.tabLayout
            r9.setVisibility(r4)
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r9.setVisibility(r4)
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            o.loadInstallerPackageName r9 = r9.MediaBrowserCompat$CustomActionResultReceiver(r6)
            java.util.List<o.getOsDisplayVersionString> r9 = r9.MediaBrowserCompat$ItemReceiver
            o.setTitleMarginStart r0 = r7.getChildFragmentManager()
            o.CardView r0 = r0.read()
            com.scb.phone.view.fragment.investment.redeem.FundRedeemSearchListFragment r9 = com.scb.phone.view.fragment.investment.redeem.FundRedeemSearchListFragment.IconCompatParcelizer(r9)
            java.lang.String r1 = "REDEEM_SEARCH_LIST_FRAGMENT"
            o.CardView r9 = r0.IconCompatParcelizer(r5, r9, r1)
            r9.write()
            goto L_0x01b7
        L_0x0126:
            o.getAdditionalMetadata r9 = r7.fundActionsSearchPresenter
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            o.InstallerPackageNameProvider r1 = (p040o.InstallerPackageNameProvider) r1
            r9.MediaBrowserCompat$ItemReceiver = r1
            android.widget.LinearLayout r9 = r7.fundRedeemSearchContainer
            r9.setVisibility(r4)
            com.google.android.material.tabs.TabLayout r9 = r7.tabLayout
            r9.setVisibility(r10)
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r9.setVisibility(r10)
            androidx.fragment.app.FragmentActivity r9 = r7.getActivity()
            android.content.Intent r9 = r9.getIntent()
            android.os.Parcelable r9 = r9.getParcelableExtra(r0)
            o.InstallerPackageNameProvider r9 = (p040o.InstallerPackageNameProvider) r9
            java.util.List<o.InstallIdProvider> r1 = r9.read
            int r1 = r1.size()
            if (r1 != 0) goto L_0x015f
            r1 = r3
            goto L_0x0160
        L_0x015f:
            r1 = r10
        L_0x0160:
            r7.MediaMetadataCompat = r1
            java.util.List<o.InstallIdProvider> r1 = r9.IconCompatParcelizer
            int r1 = r1.size()
            if (r1 != 0) goto L_0x016c
            r1 = r3
            goto L_0x016d
        L_0x016c:
            r1 = r10
        L_0x016d:
            r7.MediaDescriptionCompat = r1
            java.util.List<o.InstallIdProvider> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0179
            r1 = r3
            goto L_0x017a
        L_0x0179:
            r1 = r10
        L_0x017a:
            r7.IconCompatParcelizer = r1
            java.util.List<o.InstallIdProvider> r9 = r9.MediaBrowserCompat$ItemReceiver
            int r9 = r9.size()
            if (r9 != 0) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r3 = r10
        L_0x0186:
            r7.MediaBrowserCompat$SearchResultReceiver = r3
            androidx.fragment.app.FragmentActivity r9 = r7.getActivity()
            android.content.Intent r9 = r9.getIntent()
            android.os.Parcelable r9 = r9.getParcelableExtra(r0)
            o.InstallerPackageNameProvider r9 = (p040o.InstallerPackageNameProvider) r9
            o.getCancelWithdraw r0 = new o.getCancelWithdraw
            o.setTitleMarginStart r1 = r7.getFragmentManager()
            android.content.Context r2 = r7.getContext()
            r0.<init>(r1, r2, r9)
            r7.MediaBrowserCompat$CustomActionResultReceiver = r0
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r9.setAdapter(r0)
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r9 = r7.tabPager
            r0 = 4
            r9.setOffscreenPageLimit(r0)
            com.google.android.material.tabs.TabLayout r9 = r7.tabLayout
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r0 = r7.tabPager
            r9.setupWithViewPager(r0)
        L_0x01b7:
            android.widget.EditText r9 = r7.mSearchEdit
            com.scb.phone.view.fragment.investment.FundActionsSearchFragment$write r0 = new com.scb.phone.view.fragment.investment.FundActionsSearchFragment$write
            r0.<init>(r7, r10)
            r9.addTextChangedListener(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.FundActionsSearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @OnClick
    public void onClickCancel() {
        getActivity().setResult(0);
        getActivity().finish();
    }

    @OnClick
    public void onClickClear() {
        this.mSearchEdit.setText("");
    }

    class write implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private write() {
        }

        /* synthetic */ write(FundActionsSearchFragment fundActionsSearchFragment, byte b) {
            this();
        }

        public final void afterTextChanged(Editable editable) {
            if (FundActionsSearchFragment.this.MediaSessionCompat$ResultReceiverWrapper != null) {
                FundActionsSearchFragment.this.MediaSessionCompat$ResultReceiverWrapper.cancel(true);
            }
            AsyncTask unused = FundActionsSearchFragment.this.MediaSessionCompat$ResultReceiverWrapper = new IconCompatParcelizer(FundActionsSearchFragment.this, (byte) 0);
            FundActionsSearchFragment.this.MediaSessionCompat$ResultReceiverWrapper.execute(new String[]{editable.toString()});
        }
    }

    class IconCompatParcelizer extends AsyncTask<String, Void, remainingCapacity> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(FundActionsSearchFragment fundActionsSearchFragment, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            if (r8.equals("FUND_ACTION_PURCHASE") != false) goto L_0x0055;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
            /*
                r7 = this;
                java.lang.String[] r8 = (java.lang.String[]) r8
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r0 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                int r1 = r8.length
                r2 = 0
                if (r1 <= 0) goto L_0x000b
                r8 = r8[r2]
                goto L_0x000d
            L_0x000b:
                java.lang.String r8 = ""
            L_0x000d:
                java.lang.String unused = r0.RatingCompat = r8
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r8 = r8.RatingCompat
                int r8 = r8.length()
                r0 = 1
                if (r8 == r0) goto L_0x01b6
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r8 = r8.MediaBrowserCompat$MediaItem
                int r1 = r8.hashCode()
                r3 = 2
                r4 = 3
                switch(r1) {
                    case -2111590015: goto L_0x004a;
                    case -1575706677: goto L_0x0040;
                    case -1034774958: goto L_0x0036;
                    case 97916784: goto L_0x002d;
                    default: goto L_0x002c;
                }
            L_0x002c:
                goto L_0x0054
            L_0x002d:
                java.lang.String r1 = "FUND_ACTION_PURCHASE"
                boolean r8 = r8.equals(r1)
                if (r8 == 0) goto L_0x0054
                goto L_0x0055
            L_0x0036:
                java.lang.String r1 = "FUND_ACTION_SWITCH_OUT"
                boolean r8 = r8.equals(r1)
                if (r8 == 0) goto L_0x0054
                r2 = r3
                goto L_0x0055
            L_0x0040:
                java.lang.String r1 = "FUND_ACTION_REDEEM"
                boolean r8 = r8.equals(r1)
                if (r8 == 0) goto L_0x0054
                r2 = r0
                goto L_0x0055
            L_0x004a:
                java.lang.String r1 = "FUND_ACTION_SWITCH_IN"
                boolean r8 = r8.equals(r1)
                if (r8 == 0) goto L_0x0054
                r2 = r4
                goto L_0x0055
            L_0x0054:
                r2 = -1
            L_0x0055:
                if (r2 == 0) goto L_0x008a
                if (r2 == r0) goto L_0x007b
                if (r2 == r3) goto L_0x006c
                if (r2 != r4) goto L_0x01b6
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                o.getAdditionalMetadata r8 = r8.fundActionsSearchPresenter
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r0 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r0 = r0.RatingCompat
                o.determineFrom r8 = r8.MediaBrowserCompat$ItemReceiver(r0)
                return r8
            L_0x006c:
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                o.getAdditionalMetadata r8 = r8.fundActionsSearchPresenter
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r0 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r0 = r0.RatingCompat
                o.DeliveryMechanism r8 = r8.IconCompatParcelizer(r0)
                return r8
            L_0x007b:
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                o.getAdditionalMetadata r8 = r8.fundActionsSearchPresenter
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r0 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r0 = r0.RatingCompat
                o.loadInstallerPackageName r8 = r8.MediaBrowserCompat$CustomActionResultReceiver(r0)
                return r8
            L_0x008a:
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r8 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                o.getAdditionalMetadata r8 = r8.fundActionsSearchPresenter
                com.scb.phone.view.fragment.investment.FundActionsSearchFragment r0 = com.scb.phone.view.fragment.investment.FundActionsSearchFragment.this
                java.lang.String r0 = r0.RatingCompat
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x009d
                o.InstallerPackageNameProvider r8 = r8.MediaBrowserCompat$ItemReceiver
                return r8
            L_0x009d:
                o.InstallerPackageNameProvider r1 = p040o.InstallerPackageNameProvider.MediaBrowserCompat$ItemReceiver()
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.read
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x00df
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.read
                o.show r3 = new o.show
                r3.<init>(r2)
                o.initializeRequest r2 = new o.initializeRequest
                r2.<init>(r0)
                o.show r4 = new o.show
                o.AppCompatSeekBar r5 = r3.write
                o.getNextTransition r6 = new o.getNextTransition
                java.util.Iterator<? extends T> r3 = r3.IconCompatParcelizer
                r6.<init>(r3, r2)
                r4.<init>(r5, r6)
                o.setupDialog$IconCompatParcelizer r2 = new o.setupDialog$IconCompatParcelizer
                o.setupDialog$1 r3 = new o.setupDialog$1
                r3.<init>()
                o.setupDialog$8 r5 = new o.setupDialog$8
                r5.<init>()
                r2.<init>(r3, r5)
                java.lang.Object r2 = r4.write(r2)
                java.util.List r2 = (java.util.List) r2
                r1.read = r2
                goto L_0x00e6
            L_0x00df:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.read = r2
            L_0x00e6:
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.IconCompatParcelizer
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x0124
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.IconCompatParcelizer
                o.show r3 = new o.show
                r3.<init>(r2)
                o.WscKeyValuePair r2 = new o.WscKeyValuePair
                r2.<init>(r0)
                o.show r4 = new o.show
                o.AppCompatSeekBar r5 = r3.write
                o.getNextTransition r6 = new o.getNextTransition
                java.util.Iterator<? extends T> r3 = r3.IconCompatParcelizer
                r6.<init>(r3, r2)
                r4.<init>(r5, r6)
                o.setupDialog$IconCompatParcelizer r2 = new o.setupDialog$IconCompatParcelizer
                o.setupDialog$1 r3 = new o.setupDialog$1
                r3.<init>()
                o.setupDialog$8 r5 = new o.setupDialog$8
                r5.<init>()
                r2.<init>(r3, r5)
                java.lang.Object r2 = r4.write(r2)
                java.util.List r2 = (java.util.List) r2
                r1.IconCompatParcelizer = r2
                goto L_0x012b
            L_0x0124:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.IconCompatParcelizer = r2
            L_0x012b:
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x0169
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                o.show r3 = new o.show
                r3.<init>(r2)
                o.WscKeyValuePair$FIELD_INDEXES r2 = new o.WscKeyValuePair$FIELD_INDEXES
                r2.<init>(r0)
                o.show r4 = new o.show
                o.AppCompatSeekBar r5 = r3.write
                o.getNextTransition r6 = new o.getNextTransition
                java.util.Iterator<? extends T> r3 = r3.IconCompatParcelizer
                r6.<init>(r3, r2)
                r4.<init>(r5, r6)
                o.setupDialog$IconCompatParcelizer r2 = new o.setupDialog$IconCompatParcelizer
                o.setupDialog$1 r3 = new o.setupDialog$1
                r3.<init>()
                o.setupDialog$8 r5 = new o.setupDialog$8
                r5.<init>()
                r2.<init>(r3, r5)
                java.lang.Object r2 = r4.write(r2)
                java.util.List r2 = (java.util.List) r2
                r1.MediaBrowserCompat$CustomActionResultReceiver = r2
                goto L_0x0170
            L_0x0169:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.MediaBrowserCompat$CustomActionResultReceiver = r2
            L_0x0170:
                o.InstallerPackageNameProvider r2 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r2 = r2.MediaBrowserCompat$ItemReceiver
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x01ae
                o.InstallerPackageNameProvider r8 = r8.MediaBrowserCompat$ItemReceiver
                java.util.List<o.InstallIdProvider> r8 = r8.MediaBrowserCompat$ItemReceiver
                o.show r2 = new o.show
                r2.<init>(r8)
                o.WscIndexFieldsRequest r8 = new o.WscIndexFieldsRequest
                r8.<init>(r0)
                o.show r0 = new o.show
                o.AppCompatSeekBar r3 = r2.write
                o.getNextTransition r4 = new o.getNextTransition
                java.util.Iterator<? extends T> r2 = r2.IconCompatParcelizer
                r4.<init>(r2, r8)
                r0.<init>(r3, r4)
                o.setupDialog$IconCompatParcelizer r8 = new o.setupDialog$IconCompatParcelizer
                o.setupDialog$1 r2 = new o.setupDialog$1
                r2.<init>()
                o.setupDialog$8 r3 = new o.setupDialog$8
                r3.<init>()
                r8.<init>(r2, r3)
                java.lang.Object r8 = r0.write(r8)
                java.util.List r8 = (java.util.List) r8
                r1.MediaBrowserCompat$ItemReceiver = r8
                goto L_0x01b5
            L_0x01ae:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r1.MediaBrowserCompat$ItemReceiver = r8
            L_0x01b5:
                return r1
            L_0x01b6:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.FundActionsSearchFragment.IconCompatParcelizer.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            remainingCapacity remainingcapacity = (remainingCapacity) obj;
            if (remainingcapacity != null) {
                String read = FundActionsSearchFragment.this.MediaBrowserCompat$MediaItem;
                char c = 65535;
                boolean z = false;
                switch (read.hashCode()) {
                    case -2111590015:
                        if (read.equals("FUND_ACTION_SWITCH_IN")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1575706677:
                        if (read.equals("FUND_ACTION_REDEEM")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1034774958:
                        if (read.equals("FUND_ACTION_SWITCH_OUT")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 97916784:
                        if (read.equals("FUND_ACTION_PURCHASE")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    FundActionsSearchFragment fundActionsSearchFragment = FundActionsSearchFragment.this;
                    InstallerPackageNameProvider installerPackageNameProvider = (InstallerPackageNameProvider) remainingcapacity;
                    if (fundActionsSearchFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.size() == 0) {
                        z = true;
                    }
                    if (!z) {
                        getCancelWithdraw getcancelwithdraw = fundActionsSearchFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) "FRAGMENT_PURCHASED", "name");
                        PurchasedTabFragment purchasedTabFragment = (PurchasedTabFragment) getcancelwithdraw.MediaBrowserCompat$CustomActionResultReceiver.get("FRAGMENT_PURCHASED");
                        if (purchasedTabFragment != null && !fundActionsSearchFragment.MediaMetadataCompat) {
                            purchasedTabFragment.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment.RatingCompat;
                            purchasedTabFragment.write(installerPackageNameProvider.read);
                        }
                        getCancelWithdraw getcancelwithdraw2 = fundActionsSearchFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) "FRAGMENT_OTHERS", "name");
                        OthersTabFragment othersTabFragment = (OthersTabFragment) getcancelwithdraw2.MediaBrowserCompat$CustomActionResultReceiver.get("FRAGMENT_OTHERS");
                        if (othersTabFragment != null && !fundActionsSearchFragment.MediaDescriptionCompat) {
                            othersTabFragment.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment.RatingCompat;
                            othersTabFragment.write(installerPackageNameProvider.IconCompatParcelizer);
                        }
                        getCancelWithdraw getcancelwithdraw3 = fundActionsSearchFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) "FRAGMENT_IPO", "name");
                        IpoTabFragment ipoTabFragment = (IpoTabFragment) getcancelwithdraw3.MediaBrowserCompat$CustomActionResultReceiver.get("FRAGMENT_IPO");
                        if (ipoTabFragment != null && !fundActionsSearchFragment.IconCompatParcelizer) {
                            ipoTabFragment.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment.RatingCompat;
                            ipoTabFragment.write(installerPackageNameProvider.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                        getCancelWithdraw getcancelwithdraw4 = fundActionsSearchFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) "FRAGMENT_SSF", "name");
                        SSFTabFragment sSFTabFragment = (SSFTabFragment) getcancelwithdraw4.MediaBrowserCompat$CustomActionResultReceiver.get("FRAGMENT_SSF");
                        if (sSFTabFragment != null && !fundActionsSearchFragment.MediaBrowserCompat$SearchResultReceiver) {
                            sSFTabFragment.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment.RatingCompat;
                            sSFTabFragment.write(installerPackageNameProvider.MediaBrowserCompat$ItemReceiver);
                        }
                    }
                } else if (c == 1) {
                    FundActionsSearchFragment fundActionsSearchFragment2 = FundActionsSearchFragment.this;
                    loadInstallerPackageName loadinstallerpackagename = (loadInstallerPackageName) remainingcapacity;
                    FundRedeemSearchListFragment fundRedeemSearchListFragment = (FundRedeemSearchListFragment) fundActionsSearchFragment2.getChildFragmentManager().findFragmentByTag("REDEEM_SEARCH_LIST_FRAGMENT");
                    if (fundRedeemSearchListFragment != null) {
                        fundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment2.RatingCompat;
                        fundRedeemSearchListFragment.MediaBrowserCompat$CustomActionResultReceiver(loadinstallerpackagename.MediaBrowserCompat$ItemReceiver);
                    }
                } else if (c == 2) {
                    FundActionsSearchFragment fundActionsSearchFragment3 = FundActionsSearchFragment.this;
                    DeliveryMechanism deliveryMechanism = (DeliveryMechanism) remainingcapacity;
                    FundSwitchSearchListFragement fundSwitchSearchListFragement = (FundSwitchSearchListFragement) fundActionsSearchFragment3.getChildFragmentManager().findFragmentByTag("LIST_SWITCH_OUT_SEARCH");
                    if (fundSwitchSearchListFragement != null) {
                        fundSwitchSearchListFragement.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment3.RatingCompat;
                        fundSwitchSearchListFragement.read(deliveryMechanism.IconCompatParcelizer);
                    }
                } else if (c == 3) {
                    FundActionsSearchFragment fundActionsSearchFragment4 = FundActionsSearchFragment.this;
                    determineFrom determinefrom = (determineFrom) remainingcapacity;
                    FundSwitchSearchListFragement fundSwitchSearchListFragement2 = (FundSwitchSearchListFragement) fundActionsSearchFragment4.getChildFragmentManager().findFragmentByTag("LIST_SWITCH_IN_SEARCH");
                    if (fundSwitchSearchListFragement2 != null) {
                        fundSwitchSearchListFragement2.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSearchFragment4.RatingCompat;
                        fundSwitchSearchListFragement2.MediaBrowserCompat$ItemReceiver(determinefrom.MediaBrowserCompat$ItemReceiver);
                    }
                }
            }
        }
    }
}
