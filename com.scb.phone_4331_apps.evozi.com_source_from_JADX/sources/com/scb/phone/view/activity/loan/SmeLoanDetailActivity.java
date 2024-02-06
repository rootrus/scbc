package com.scb.phone.view.activity.loan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.loan.SmeLoanAccountSelectorAdapter;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.loan.C1119xf28bc137;
import com.scb.phone.view.fragment.loan.SmeLoanDetailFragment;
import com.scb.phone.view.fragment.loan.SmeLoanSelectorFragment;
import com.scb.phone.view.fragment.loan.SmeLoanStatusFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collections;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.Futures;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class SmeLoanDetailActivity extends BaseActivity implements C1119xf28bc137, SmeLoanDetailFragment.read {
    private int MediaBrowserCompat$MediaItem;
    private List<Futures.ChainingListenableFuture> MediaBrowserCompat$SearchResultReceiver;
    private SmeLoanStatusFragment MediaDescriptionCompat;
    private SmeLoanDetailFragment MediaMetadataCompat;
    @BindView
    CustomHorizontalProgressBar mCustomProgressBarSmeLoanStatus;

    public void onCreate(Bundle bundle) {
        List<Futures.ChainingListenableFuture> list;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79982131493223);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.account_summary_my_business_loans);
        setTabContainer();
        Intent intent = getIntent();
        if (intent == null || (list = intent.getParcelableArrayListExtra("com.scb.phone.EXTRA_SME_LOAN_LIST")) == null) {
            list = Collections.emptyList();
        }
        this.MediaBrowserCompat$SearchResultReceiver = list;
        this.MediaBrowserCompat$MediaItem = getIntent().getIntExtra("com.scb.phone.EXTRA_SME_LOAN_SELECTED_POSITION", 0);
        SmeLoanSelectorFragment smeLoanSelectorFragment = (SmeLoanSelectorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_account_selector);
        if (smeLoanSelectorFragment != null) {
            List<Futures.ChainingListenableFuture> list2 = this.MediaBrowserCompat$SearchResultReceiver;
            smeLoanSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver = list2;
            smeLoanSelectorFragment.mViewPager.setAdapter(new SmeLoanAccountSelectorAdapter(list2));
            smeLoanSelectorFragment.mViewPager.setClipToPadding(false);
            smeLoanSelectorFragment.mViewPager.setPadding(smeLoanSelectorFragment.getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, smeLoanSelectorFragment.getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
            smeLoanSelectorFragment.mViewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    SmeLoanSelectorFragment.this.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
            });
            smeLoanSelectorFragment.mCircleIndicator.setViewPager(smeLoanSelectorFragment.mViewPager);
            if (smeLoanSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver.size() >= 10) {
                smeLoanSelectorFragment.mCircleIndicator.setVisibility(8);
            } else {
                smeLoanSelectorFragment.mCircleIndicator.setVisibility(0);
            }
            int i = this.MediaBrowserCompat$MediaItem;
            boolean z = smeLoanSelectorFragment.mViewPager.getCurrentItem() != i;
            smeLoanSelectorFragment.mViewPager.setCurrentItem(i, false);
            if (!z) {
                smeLoanSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.account_summary_my_business_loans);
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34051 r4) {
        Intent putExtra = new Intent(this, LoanInputActivity.class).putExtra("com.scb.phone.EXTRA_LOAN_DISPLAY", r4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(p040o.Futures.ChainingListenableFuture r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.AppCompatActivity
            int r1 = r0.hashCode()
            r2 = 2
            java.lang.String r3 = "COMMERCIAL_LOAN"
            java.lang.String r4 = "PN"
            java.lang.String r5 = "LG"
            r6 = 0
            r7 = 1
            r8 = 2427(0x97b, float:3.401E-42)
            if (r1 == r8) goto L_0x002c
            r8 = 2558(0x9fe, float:3.585E-42)
            if (r1 == r8) goto L_0x0024
            r8 = 159567045(0x982ccc5, float:3.1488926E-33)
            if (r1 != r8) goto L_0x0034
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0034
            r0 = r6
            goto L_0x0035
        L_0x0024:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0034
            r0 = r2
            goto L_0x0035
        L_0x002c:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0034
            r0 = r7
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            java.lang.String r1 = "accountsummary_businessloandetails"
            java.lang.String r8 = "product"
            if (r0 == 0) goto L_0x0061
            if (r0 == r7) goto L_0x0050
            if (r0 != r2) goto L_0x0071
            o.ZSYR2K[] r0 = new p040o.ZSYR2K[r7]
            o.ZSYR2K r2 = new o.ZSYR2K
            java.lang.String r9 = "promissory_note"
            r2.<init>(r8, r9)
            r0[r6] = r2
            o.getKernelIDDst r2 = r10.scbAnalytics
            r2.write(r1, r0)
            goto L_0x0071
        L_0x0050:
            o.ZSYR2K[] r0 = new p040o.ZSYR2K[r7]
            o.ZSYR2K r2 = new o.ZSYR2K
            java.lang.String r9 = "letters_of_guarantee"
            r2.<init>(r8, r9)
            r0[r6] = r2
            o.getKernelIDDst r2 = r10.scbAnalytics
            r2.write(r1, r0)
            goto L_0x0071
        L_0x0061:
            o.ZSYR2K[] r0 = new p040o.ZSYR2K[r7]
            o.ZSYR2K r2 = new o.ZSYR2K
            java.lang.String r9 = "commercial_loan"
            r2.<init>(r8, r9)
            r0[r6] = r2
            o.getKernelIDDst r2 = r10.scbAnalytics
            r2.write(r1, r0)
        L_0x0071:
            com.scb.phone.view.fragment.loan.SmeLoanStatusFragment r0 = r10.MediaDescriptionCompat
            if (r0 != 0) goto L_0x0084
            o.setTitleMarginStart r0 = r10.getSupportFragmentManager()
            r1 = 2131297891(0x7f090663, float:1.821374E38)
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            com.scb.phone.view.fragment.loan.SmeLoanStatusFragment r0 = (com.scb.phone.view.fragment.loan.SmeLoanStatusFragment) r0
            r10.MediaDescriptionCompat = r0
        L_0x0084:
            com.scb.phone.view.fragment.loan.SmeLoanStatusFragment r0 = r10.MediaDescriptionCompat
            if (r0 == 0) goto L_0x00e8
            com.scb.phone.view.custom.common.CustomHorizontalProgressBar r1 = r0.mCustomProgressBarSmeLoanStatus
            if (r1 == 0) goto L_0x00e8
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setProgressMax(r2)
            o.AppStatistics$c r0 = r0.mPresenter
            if (r11 == 0) goto L_0x00e8
            java.lang.String r1 = r11.AppCompatActivity
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00b1
            o.addDataStoreInitializedListener r1 = new o.addDataStoreInitializedListener
            r1.<init>(r11)
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x00a8
            r2 = r7
            goto L_0x00a9
        L_0x00a8:
            r2 = r6
        L_0x00a9:
            if (r2 == 0) goto L_0x00e8
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x00e8
        L_0x00b1:
            java.lang.String r1 = r11.AppCompatActivity
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00cd
            o.daoCalcObjSizeResult r1 = new o.daoCalcObjSizeResult
            r1.<init>(r11)
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x00c4
            r2 = r7
            goto L_0x00c5
        L_0x00c4:
            r2 = r6
        L_0x00c5:
            if (r2 == 0) goto L_0x00e8
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x00e8
        L_0x00cd:
            java.lang.String r1 = r11.AppCompatActivity
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00e8
            o.currentEventTime r1 = new o.currentEventTime
            r1.<init>(r11)
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x00e0
            r2 = r7
            goto L_0x00e1
        L_0x00e0:
            r2 = r6
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x00e8:
            com.scb.phone.view.fragment.loan.SmeLoanDetailFragment r0 = r10.MediaMetadataCompat
            if (r0 != 0) goto L_0x00fb
            o.setTitleMarginStart r0 = r10.getSupportFragmentManager()
            r1 = 2131297890(0x7f090662, float:1.8213738E38)
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            com.scb.phone.view.fragment.loan.SmeLoanDetailFragment r0 = (com.scb.phone.view.fragment.loan.SmeLoanDetailFragment) r0
            r10.MediaMetadataCompat = r0
        L_0x00fb:
            com.scb.phone.view.fragment.loan.SmeLoanDetailFragment r0 = r10.MediaMetadataCompat
            if (r0 == 0) goto L_0x0161
            r0.MediaBrowserCompat$CustomActionResultReceiver = r11
            o.logAppStats r0 = r0.mPresenter
            o.getCategory r1 = new o.getCategory
            r1.<init>(r11)
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x010e
            r2 = r7
            goto L_0x010f
        L_0x010e:
            r2 = r6
        L_0x010f:
            if (r2 == 0) goto L_0x0116
            T r2 = r0.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x0116:
            if (r11 == 0) goto L_0x0161
            java.lang.String r1 = r11.AppCompatActivity
            boolean r2 = r3.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0132
            o.dataStoreInitialized r1 = new o.dataStoreInitialized
            r1.<init>(r11)
            T r11 = r0.RatingCompat
            if (r11 == 0) goto L_0x012a
            r6 = r7
        L_0x012a:
            if (r6 == 0) goto L_0x0131
            T r11 = r0.RatingCompat
            r1.IconCompatParcelizer(r11)
        L_0x0131:
            return
        L_0x0132:
            boolean r2 = r4.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x014a
            o.dataStoreExportComplete r1 = new o.dataStoreExportComplete
            r1.<init>(r11)
            T r11 = r0.RatingCompat
            if (r11 == 0) goto L_0x0142
            r6 = r7
        L_0x0142:
            if (r6 == 0) goto L_0x0149
            T r11 = r0.RatingCompat
            r1.IconCompatParcelizer(r11)
        L_0x0149:
            return
        L_0x014a:
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0161
            o.AppStatistics$FriendAS r1 = new o.AppStatistics$FriendAS
            r1.<init>(r11)
            T r11 = r0.RatingCompat
            if (r11 == 0) goto L_0x015a
            r6 = r7
        L_0x015a:
            if (r6 == 0) goto L_0x0161
            T r11 = r0.RatingCompat
            r1.IconCompatParcelizer(r11)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.loan.SmeLoanDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(o.Futures$ChainingListenableFuture):void");
    }
}
