package com.scb.phone.view.activity.deposit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountEligibilityActivity;
import com.scb.phone.view.activity.deposit.exportstatement.DepositExportStatementActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import com.scb.phone.view.adapter.deposit.DepositAccountSelectorAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.C1115xe3ed9a7b;
import com.scb.phone.view.fragment.DepositBottomSelectionEntryFragment;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import com.scb.phone.view.fragment.deposit.DepositMoreInfoFragment;
import com.scb.phone.view.fragment.deposit.DepositSelectorFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7271oA;
import p040o.C7275oE;
import p040o.C7277oG;
import p040o.C7366pb;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.ConsecutiveFramesUnclassified;
import p040o.DebitCardResetOtpActivity;
import p040o.DetectorName;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.IsActive;
import p040o.MissingNativeComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBLAS;
import p040o.ZSYR2K;
import p040o.access$2300;
import p040o.getCompanyFirstPage;
import p040o.getConsent;
import p040o.getKtdxXML;
import p040o.getOutcome;
import p040o.getSessionFileProvider;
import p040o.getShortName;
import p040o.icon;
import p040o.immediateCheckedFuture;
import p040o.nativeGetOutputNames;
import p040o.onCheckBoxClick;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.validateGER;
import p040o.validateWithImage;
import p040o.valueIterator;
import p040o.withPhenotypePrefix;
import p040o.zzmd;

public class DepositDetailActivity extends BaseActivity implements CheckCaptureModule_GetLookAndFeelParametersFactory.write, DepositMoreInfoFragment.write, C1115xe3ed9a7b, ViewTreeObserver.OnGlobalLayoutListener {
    private DepositBottomSelectionEntryFragment MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;
    public read MediaDescriptionCompat = new read(this);
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    private ScriptIntrinsicBLAS.Transpose MediaSessionCompat$ResultReceiverWrapper = new ScriptIntrinsicBLAS.Transpose();
    private ScriptIntrinsicBLAS.Side MediaSessionCompat$Token = new ScriptIntrinsicBLAS.Side();
    @BindView
    NoSwipeViewPager depositCoachMarkViewPager;
    @HmlPinActivity
    public validateWithImage depositDetailPresenter;
    @BindView
    RelativeLayout depositTutorialContainer;
    @BindView
    RelativeLayout rootView;
    @BindView
    NestedScrollView scrollView;

    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        zzmd.zzm.zzb.zza zza;
        Context context;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77342131492959);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "accountsummary_depositdetails");
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        IntentFilter intentFilter = new IntentFilter("com.scb.phone.ACTION_SELECTED_DEPOSIT_UPDATE");
        intentFilter.addAction("com.scb.phone.ACTION_MORE_INFO_UPDATE");
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(this, intentFilter).subscribe(new C7271oA(this), C7277oG.write);
        Intent intent = getIntent();
        if (intent != null) {
            arrayList = intent.getParcelableArrayListExtra("com.scb.phone.EXTRA_DEPOSIT_LIST");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        int intExtra = getIntent().getIntExtra("com.scb.phone.EXTRA_SELECTED_DEPOSIT", 0);
        this.depositDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        validateWithImage validatewithimage = this.depositDetailPresenter;
        validatewithimage.MediaBrowserCompat$ItemReceiver = arrayList;
        validatewithimage.IconCompatParcelizer = arrayList.get(intExtra);
        DepositSelectorFragment depositSelectorFragment = (DepositSelectorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_account_selector);
        if (depositSelectorFragment != null) {
            DepositAccountSelectorAdapter depositAccountSelectorAdapter = new DepositAccountSelectorAdapter(arrayList);
            zzmd.zzm.zzb.zza zza2 = zzmd.zzm.zzb.zza.JURISTIC;
            if (depositSelectorFragment.getActivity() instanceof PreLoadCheckActivity) {
                zza = ((PreLoadCheckActivity) depositSelectorFragment.getActivity()).setTitleOptional();
            } else {
                zza = null;
            }
            boolean z = true;
            depositAccountSelectorAdapter.read = zza2 == zza;
            depositSelectorFragment.mViewPager.setAdapter(depositAccountSelectorAdapter);
            depositSelectorFragment.mViewPager.setClipToPadding(false);
            depositSelectorFragment.mViewPager.setPadding(depositSelectorFragment.getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, depositSelectorFragment.getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
            depositSelectorFragment.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    DepositSelectorFragment.MediaBrowserCompat$ItemReceiver(DepositSelectorFragment.this, i);
                }
            });
            depositSelectorFragment.mCircleIndicator.setViewPager(depositSelectorFragment.mViewPager);
            if (arrayList.size() >= 10) {
                depositSelectorFragment.mCircleIndicator.setVisibility(8);
            } else {
                depositSelectorFragment.mCircleIndicator.setVisibility(0);
            }
            if (depositSelectorFragment.mViewPager.getCurrentItem() == intExtra) {
                z = false;
            }
            depositSelectorFragment.mViewPager.setCurrentItem(intExtra, false);
            if (!z && (context = depositSelectorFragment.getContext()) != null) {
                context.sendBroadcast(new Intent("com.scb.phone.ACTION_SELECTED_DEPOSIT_UPDATE").putExtra("com.scb.phone.EXTRA_SELECTED_DEPOSIT", intExtra));
            }
        }
        setStackedBackground();
        this.scrollView.setOnScrollChangeListener(new C7366pb(this));
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        validateWithImage validatewithimage = this.depositDetailPresenter;
        IsActive isActive = new IsActive(setTitleOptional());
        if (validatewithimage.RatingCompat != null) {
            isActive.IconCompatParcelizer(validatewithimage.RatingCompat);
        }
        setTabContainer();
    }

    public void onGlobalLayout() {
        this.rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        validateWithImage validatewithimage = this.depositDetailPresenter;
        if (zzmd.zzm.zzb.zza.JURISTIC != setTitleOptional()) {
            boolean z = true;
            if (validatewithimage.RatingCompat != null) {
                boolean IconCompatParcelizer = validatewithimage.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                validatewithimage.read.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction();
                if (!IconCompatParcelizer) {
                    nativeGetOutputNames nativegetoutputnames = nativeGetOutputNames.read;
                    if (validatewithimage.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        nativegetoutputnames.IconCompatParcelizer(validatewithimage.RatingCompat);
                    }
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, mo3026D_().equals("th") ? new int[]{R.drawable.annotation_tutorial1_th, R.drawable.annotation_tutorial2_th, R.drawable.annotation_tutorial3_th, R.drawable.annotation_tutorial4_th, R.drawable.annotation_tutorial5_th} : new int[]{R.drawable.annotation_tutorial1_en, R.drawable.annotation_tutorial2_en, R.drawable.annotation_tutorial3_en, R.drawable.annotation_tutorial4_en, R.drawable.annotation_tutorial5_en});
        this.depositCoachMarkViewPager.setAdapter(coachMarkViewPagerAdapter);
        this.depositCoachMarkViewPager.setPagingEnabled(false);
        this.depositTutorialContainer.setVisibility(0);
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new C7275oE(this);
    }

    public final void write(int i) {
        setTitle(i);
    }

    public /* synthetic */ void lambda$displayCoachMark$0$DepositDetailActivity(View view) {
        int currentItem = this.depositCoachMarkViewPager.getCurrentItem() + 1;
        if (currentItem < this.depositCoachMarkViewPager.getAdapter().getCount()) {
            this.depositCoachMarkViewPager.setCurrentItem(currentItem);
        } else {
            this.depositTutorialContainer.setVisibility(8);
        }
    }

    public void onDestroy() {
        validateWithImage validatewithimage = this.depositDetailPresenter;
        if (validatewithimage != null) {
            validatewithimage.onDestroy();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
        super.onDestroy();
    }

    static class read extends Handler {
        private WeakReference<DepositDetailActivity> read = null;

        public read(DepositDetailActivity depositDetailActivity) {
            this.read = new WeakReference<>(depositDetailActivity);
        }

        public final void handleMessage(Message message) {
            DepositDetailActivity depositDetailActivity = this.read.get();
            if (depositDetailActivity != null && message.what == 1) {
                depositDetailActivity.scrollView.scrollTo(0, depositDetailActivity.MediaBrowserCompat$SearchResultReceiver);
            }
        }
    }

    public final void IconCompatParcelizer(immediateCheckedFuture immediatecheckedfuture, MissingNativeComponent missingNativeComponent) {
        DepositExportStatementActivity.IconCompatParcelizer(this, immediatecheckedfuture, missingNativeComponent);
    }

    public final void read() {
        this.depositDetailPresenter.write((int) R.string.error_generic_resource);
    }

    public final void MediaSessionCompat$QueueItem() {
        validateWithImage validatewithimage = this.depositDetailPresenter;
        ConsecutiveFramesUnclassified consecutiveFramesUnclassified = new ConsecutiveFramesUnclassified(validatewithimage);
        if (validatewithimage.RatingCompat != null) {
            consecutiveFramesUnclassified.IconCompatParcelizer(validatewithimage.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<String> list) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = DepositBottomSelectionEntryFragment.write();
        }
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer = list;
        if (!this.MediaBrowserCompat$MediaItem.isAdded()) {
            this.MediaBrowserCompat$MediaItem.show(getSupportFragmentManager(), this.MediaBrowserCompat$MediaItem.getTag());
        }
    }

    public final void write() {
        Intent MediaBrowserCompat$ItemReceiver = CloseAccountEligibilityActivity.MediaBrowserCompat$ItemReceiver((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "export_stmt_prerequest");
        validateWithImage validatewithimage = this.depositDetailPresenter;
        if (validatewithimage.IconCompatParcelizer != null) {
            if (validatewithimage.RatingCompat != null) {
                validatewithimage.RatingCompat.AlertController$RecycleListView();
            }
            icon icon = validatewithimage.read;
            valueIterator valueiterator = new valueIterator();
            valueiterator.MediaBrowserCompat$CustomActionResultReceiver = validatewithimage.IconCompatParcelizer.AppCompatViewInflater;
            icon.MediaBrowserCompat$ItemReceiver(valueiterator);
            validatewithimage.read.IconCompatParcelizer(new validateWithImage.read(validatewithimage, (byte) 0));
        }
        this.MediaBrowserCompat$MediaItem.dismiss();
    }

    public final void MediaSessionCompat$Token() {
        this.scbAnalytics.write("more_services_list", new ZSYR2K("feature", "close account"));
        this.MediaBrowserCompat$MediaItem.dismiss();
        validateWithImage validatewithimage = this.depositDetailPresenter;
        withPhenotypePrefix withphenotypeprefix = validatewithimage.MediaMetadataCompat;
        withphenotypeprefix.write(withphenotypeprefix.MediaBrowserCompat$ItemReceiver(validatewithimage.IconCompatParcelizer.setPopupCallback), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void>() {
            public final void onComplete() {
                validateWithImage validatewithimage = validateWithImage.this;
                nativeValidateWithVrsImage nativevalidatewithvrsimage = nativeValidateWithVrsImage.IconCompatParcelizer;
                if (validatewithimage.RatingCompat != null) {
                    nativevalidatewithvrsimage.IconCompatParcelizer(validatewithimage.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                validateWithImage.this.MediaBrowserCompat$ItemReceiver(validateWithImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        });
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DepositDetailActivity depositDetailActivity, Intent intent) {
        DepositDetailTransactionFragment depositDetailTransactionFragment;
        String action = intent.getAction();
        if ("com.scb.phone.ACTION_SELECTED_DEPOSIT_UPDATE".equals(action)) {
            boolean z = false;
            int intExtra = intent.getIntExtra("com.scb.phone.EXTRA_SELECTED_DEPOSIT", 0);
            validateWithImage validatewithimage = depositDetailActivity.depositDetailPresenter;
            if (validatewithimage != null) {
                onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onAccountSelectionChange %d", Integer.valueOf(intExtra));
                if (!(validatewithimage.RatingCompat != null)) {
                    onCheckBoxClick.write("view is missing!", new Object[0]);
                    return;
                }
                immediateCheckedFuture immediatecheckedfuture = validatewithimage.MediaBrowserCompat$ItemReceiver.size() > intExtra ? validatewithimage.MediaBrowserCompat$ItemReceiver.get(intExtra) : null;
                if (immediatecheckedfuture == null) {
                    onCheckBoxClick.write("deposit is missing!", new Object[0]);
                    return;
                }
                validatewithimage.IconCompatParcelizer = immediatecheckedfuture;
                validatewithimage.write = immediatecheckedfuture.MediaBrowserCompat$MediaItem;
                DetectorName detectorName = new DetectorName(validatewithimage, intExtra);
                if (validatewithimage.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    detectorName.IconCompatParcelizer(validatewithimage.RatingCompat);
                }
            }
        } else if ("com.scb.phone.ACTION_MORE_INFO_UPDATE".equals(action)) {
            getSessionFileProvider getsessionfileprovider = (getSessionFileProvider) intent.getParcelableExtra("com.scb.phone.EXTRA_MORE_INFO");
            if (getsessionfileprovider == null) {
                DepositDetailTransactionFragment depositDetailTransactionFragment2 = (DepositDetailTransactionFragment) depositDetailActivity.getSupportFragmentManager().findFragmentById(R.id.layout_transactions);
                if (depositDetailTransactionFragment2 != null && depositDetailTransactionFragment2.mDepositTransactionPresenter != null && !depositDetailTransactionFragment2.MediaBrowserCompat$CustomActionResultReceiver) {
                    depositDetailTransactionFragment2.RatingCompat.post(new getOutcome(depositDetailTransactionFragment2));
                    return;
                }
                return;
            }
            if (getsessionfileprovider.ParcelableVolumeInfo.equals(depositDetailActivity.depositDetailPresenter.IconCompatParcelizer.AppCompatViewInflater) && (depositDetailTransactionFragment = (DepositDetailTransactionFragment) depositDetailActivity.getSupportFragmentManager().findFragmentById(R.id.layout_transactions)) != null && depositDetailTransactionFragment.mDepositTransactionPresenter != null) {
                depositDetailTransactionFragment.MediaBrowserCompat$SearchResultReceiver = getsessionfileprovider.PlaybackStateCompat$CustomAction;
                depositDetailTransactionFragment.RatingCompat.post(new getConsent(depositDetailTransactionFragment, getsessionfileprovider));
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(immediateCheckedFuture immediatecheckedfuture) {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        String str;
        if (immediatecheckedfuture.AppCompatViewInflater.equals(this.depositDetailPresenter.IconCompatParcelizer.AppCompatViewInflater)) {
            DepositMoreInfoFragment depositMoreInfoFragment = (DepositMoreInfoFragment) getSupportFragmentManager().findFragmentById(R.id.layout_info);
            depositMoreInfoFragment.MediaBrowserCompat$CustomActionResultReceiver = this;
            if (immediatecheckedfuture != null) {
                depositMoreInfoFragment.mTenorTitle.setVisibility(0);
                depositMoreInfoFragment.mTextTenor.setVisibility(0);
                String str2 = immediatecheckedfuture.AppCompatDialogFragment;
                String str3 = immediatecheckedfuture.AppCompatDelegateImpl$ListMenuDecorView;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = String.format("%s (%s)", new Object[]{str2, str3});
                    if ("MT".toLowerCase().equals(immediatecheckedfuture.AppCompatActivity.toLowerCase())) {
                        depositMoreInfoFragment.mTenorTitle.setVisibility(8);
                        depositMoreInfoFragment.mTextTenor.setVisibility(8);
                    }
                }
                depositMoreInfoFragment.mTextProductType.setText(str2);
                depositMoreInfoFragment.mTextProductName.setText(immediatecheckedfuture.setContentView);
            }
            depositMoreInfoFragment.mLayoutOverdraftStatus.setVisibility(8);
            boolean z = immediatecheckedfuture.RatingCompat || immediatecheckedfuture.MediaBrowserCompat$MediaItem.contains("CLOSE_ACCOUNT_SOURCE");
            depositMoreInfoFragment.moreServices.setEnabled(z);
            depositMoreInfoFragment.moreServices.setVisibility(z ? 0 : 8);
            HashMap<String, getSessionFileProvider> hashMap = depositMoreInfoFragment.IconCompatParcelizer;
            if (hashMap == null || !hashMap.containsKey(immediatecheckedfuture.MediaBrowserCompat$ItemReceiver.replaceAll("-", ""))) {
                depositMoreInfoFragment.depositMoreInfoPresenter.read = null;
            } else {
                depositMoreInfoFragment.depositMoreInfoPresenter.read = depositMoreInfoFragment.IconCompatParcelizer.get(immediatecheckedfuture.MediaBrowserCompat$ItemReceiver);
            }
            getKtdxXML getktdxxml = depositMoreInfoFragment.depositMoreInfoPresenter;
            valueIterator valueiterator = new valueIterator();
            valueiterator.MediaBrowserCompat$CustomActionResultReceiver = immediatecheckedfuture.AppCompatViewInflater;
            int i = getKtdxXML.C46011.read[immediatecheckedfuture.setBackgroundResource.ordinal()];
            if (i == 1 || i == 2) {
                debitCardResetOtpActivity = getktdxxml.write.read.IconCompatParcelizer(valueiterator);
            } else if (i == 3) {
                debitCardResetOtpActivity = getktdxxml.write.read.write(valueiterator);
            } else if (i != 4) {
                debitCardResetOtpActivity = null;
            } else {
                debitCardResetOtpActivity = getktdxxml.write.read.read(valueiterator);
            }
            getKtdxXML.read read2 = getktdxxml.IconCompatParcelizer;
            if (read2 != null) {
                read2.dispose();
            }
            getKtdxXML.read read3 = new getKtdxXML.read(immediatecheckedfuture.setBackgroundResource);
            getktdxxml.IconCompatParcelizer = read3;
            if (debitCardResetOtpActivity != null) {
                getktdxxml.write.write(debitCardResetOtpActivity, read3);
            }
            depositMoreInfoFragment.mLayoutExpanded.setVisibility(8);
            DepositDetailTransactionFragment depositDetailTransactionFragment = (DepositDetailTransactionFragment) getSupportFragmentManager().findFragmentById(R.id.layout_transactions);
            depositDetailTransactionFragment.MediaBrowserCompat$SearchResultReceiver = immediatecheckedfuture.AppCompatViewInflater;
            depositDetailTransactionFragment.mDepositTransactionPresenter.read = null;
            validateGER validateger = depositDetailTransactionFragment.MediaBrowserCompat$MediaItem;
            if (validateger != null) {
                validateger.MediaBrowserCompat$CustomActionResultReceiver();
            }
            depositDetailTransactionFragment.mDepositTransactionPresenter.write = immediatecheckedfuture;
            getShortName getshortname = immediatecheckedfuture.setBackgroundResource;
            if (!TextUtils.isEmpty(immediatecheckedfuture.AppCompatActivity)) {
                str = immediatecheckedfuture.AppCompatActivity;
            } else {
                str = "";
            }
            if (getshortname == getShortName.TYPE_SAVING) {
                depositDetailTransactionFragment.MediaDescriptionCompat.read("account_type", "savings");
            } else if (getshortname == getShortName.TYPE_CURRENT) {
                depositDetailTransactionFragment.MediaDescriptionCompat.read("account_type", "current");
            }
            ScriptIntrinsicBLAS.Side side = depositDetailTransactionFragment.MediaDescriptionCompat;
            if (depositDetailTransactionFragment.getActivity() != null) {
                side.MediaBrowserCompat$ItemReceiver(((BaseActivity) depositDetailTransactionFragment.getActivity()).scbAnalytics, "accountsummary_depositdetails");
            }
            depositDetailTransactionFragment.MediaMetadataCompat.MediaMetadataCompat = getshortname;
            depositDetailTransactionFragment.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver = str;
            depositDetailTransactionFragment.MediaBrowserCompat$CustomActionResultReceiver = getshortname == getShortName.TYPE_SAVING || getshortname == getShortName.TYPE_CURRENT;
            depositDetailTransactionFragment.Keep();
            depositDetailTransactionFragment.mTextMessage.setVisibility(8);
            depositDetailTransactionFragment.mRecyclerView.setVisibility(8);
            depositDetailTransactionFragment.mEmptyCard.setVisibility(8);
            if (depositDetailTransactionFragment.MediaBrowserCompat$CustomActionResultReceiver) {
                depositDetailTransactionFragment.mTextTxn.setText(R.string.deposit_details_txn_header_saving_current);
                if (immediatecheckedfuture.PlaybackStateCompat$CustomAction) {
                    depositDetailTransactionFragment.mTextTxnMonth.setVisibility(8);
                    depositDetailTransactionFragment.mToolbarTxn.setVisibility(8);
                    depositDetailTransactionFragment.mRecyclerView.setVisibility(8);
                    depositDetailTransactionFragment.mEmptyCard.setVisibility(8);
                    depositDetailTransactionFragment.write(depositDetailTransactionFragment.getString(R.string.deposit_transaction_custom_error_contact_call_center));
                } else if (immediatecheckedfuture.MediaBrowserCompat$SearchResultReceiver) {
                    depositDetailTransactionFragment.mToolbarTxn.setOnMenuItemClickListener(new getCompanyFirstPage(depositDetailTransactionFragment));
                    depositDetailTransactionFragment.IconCompatParcelizer = true;
                    depositDetailTransactionFragment.mTextTxnMonth.setText("");
                    depositDetailTransactionFragment.mTextTxnMonth.setVisibility(0);
                    depositDetailTransactionFragment.mToolbarTxn.MediaBrowserCompat$CustomActionResultReceiver().getItem(0).setVisible(true);
                    depositDetailTransactionFragment.mDepositTransactionPresenter.read(false, 0);
                } else {
                    depositDetailTransactionFragment.mTextTxnMonth.setVisibility(8);
                    depositDetailTransactionFragment.write(depositDetailTransactionFragment.getString(R.string.deposit_detail_no_transactions));
                }
            } else {
                depositDetailTransactionFragment.IconCompatParcelizer = false;
                depositDetailTransactionFragment.mTextTxnMonth.setVisibility(8);
                depositDetailTransactionFragment.mToolbarTxn.MediaBrowserCompat$CustomActionResultReceiver().getItem(0).setVisible(false);
                depositDetailTransactionFragment.mTextTxn.setText(R.string.deposit_details_txn_header_fixed_long_term);
            }
        }
    }
}
