package com.scb.phone.view.activity.merchant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.merchant.C1120xb01419fd;
import com.scb.phone.view.fragment.merchant.MerchantWalletMoreInfoFragment;
import com.scb.phone.view.fragment.merchant.MerchantWalletSelectorFragment;
import com.scb.phone.view.fragment.merchant.MerchantWalletTransactionFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.AppStatsExportListener;
import p040o.AppStatsNewJsonExportHandler;
import p040o.AppStatsSessionEvent;
import p040o.AppStatsSqLiteDs;
import p040o.C3985aS;
import p040o.CharMatcher;
import p040o.HmlPinActivity;
import p040o.ICheckExtractorListener;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.doWriteToLog;
import p040o.getExportStatus;
import p040o.getSDKName;
import p040o.onCheckBoxClick;
import p040o.onPlaceSelected;
import p040o.setTapText;
import p040o.zzur;
import p040o.zzvf;

public class MerchantWalletDetailActivity extends BaseActivity implements ICheckExtractorListener.MediaDescriptionCompat, C1120xb01419fd {
    @HmlPinActivity
    public AppStatsSessionEvent merchantWalletDetailPresenter;
    @BindView
    NestedScrollView scrollView;

    public static Intent read(Context context) {
        Intent intent = new Intent(context, MerchantWalletDetailActivity.class);
        intent.putExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_SELECTED_MERCHANT_WALLET", 0);
        return intent;
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, int i, List<doWriteToLog> list) {
        Intent intent = new Intent(context, MerchantWalletDetailActivity.class);
        intent.putExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_SELECTED_MERCHANT_WALLET", i);
        intent.putParcelableArrayListExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_MERCHANT_WALLET_LIST", new ArrayList(list));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        List<zzur> list;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.merchantWalletDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        setContentView(R.layout.f78712131493096);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.wallet_detail_page_title);
        setTabContainer();
        AppStatsSessionEvent appStatsSessionEvent = this.merchantWalletDetailPresenter;
        zzvf RatingCompat = appStatsSessionEvent.write.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
        List<zzur> list2 = null;
        if (RatingCompat != null) {
            list = RatingCompat.MediaDescriptionCompat;
        } else {
            list = null;
        }
        boolean z = true;
        if (list != null) {
            zzvf RatingCompat2 = appStatsSessionEvent.write.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
            if (RatingCompat2 != null) {
                list2 = RatingCompat2.MediaDescriptionCompat;
            }
            if (!list2.isEmpty()) {
                AppStatsNewJsonExportHandler appStatsNewJsonExportHandler = AppStatsNewJsonExportHandler.MediaBrowserCompat$CustomActionResultReceiver;
                if (appStatsSessionEvent.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    appStatsNewJsonExportHandler.IconCompatParcelizer(appStatsSessionEvent.RatingCompat);
                    return;
                }
                return;
            }
        }
        if (appStatsSessionEvent.RatingCompat == null) {
            z = false;
        }
        if (z) {
            appStatsSessionEvent.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.C315410 r0 = appStatsSessionEvent.write;
        r0.read(r0.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor(), new AppStatsExportListener(appStatsSessionEvent), new AppStatsExportListener.ExportStatus(appStatsSessionEvent));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.wallet_detail_page_title);
        setTabContainer();
    }

    public void onDestroy() {
        AppStatsSessionEvent appStatsSessionEvent = this.merchantWalletDetailPresenter;
        if (appStatsSessionEvent != null) {
            appStatsSessionEvent.onDestroy();
        }
        super.onDestroy();
    }

    public final void read(List<doWriteToLog> list) {
        this.scrollView.setVisibility(0);
        int intExtra = getIntent().getIntExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_SELECTED_MERCHANT_WALLET", 0);
        this.merchantWalletDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.merchantWalletDetailPresenter.MediaBrowserCompat$ItemReceiver = list;
        MerchantWalletSelectorFragment merchantWalletSelectorFragment = (MerchantWalletSelectorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_account_selector);
        if (merchantWalletSelectorFragment != null) {
            merchantWalletSelectorFragment.IconCompatParcelizer(list);
            merchantWalletSelectorFragment.IconCompatParcelizer(intExtra);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(doWriteToLog dowritetolog, boolean z) {
        if (dowritetolog != null) {
            ((MerchantWalletMoreInfoFragment) getSupportFragmentManager().findFragmentById(R.id.layout_info)).MediaBrowserCompat$CustomActionResultReceiver(dowritetolog);
            AppStatsSqLiteDs.C3043b bVar = ((MerchantWalletTransactionFragment) getSupportFragmentManager().findFragmentById(R.id.layout_transactions)).mPresenter;
            bVar.write = dowritetolog;
            OffsetDateTime now = OffsetDateTime.now();
            boolean z2 = true;
            bVar.MediaBrowserCompat$ItemReceiver = now.withDayOfMonth(1).format(bVar.IconCompatParcelizer);
            bVar.read = now.format(bVar.IconCompatParcelizer);
            C3985aS aSVar = new C3985aS(bVar, z);
            if (bVar.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                aSVar.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    public final void write(int i) {
        AppStatsSessionEvent appStatsSessionEvent = this.merchantWalletDetailPresenter;
        if (appStatsSessionEvent != null) {
            boolean z = true;
            if (!(appStatsSessionEvent.RatingCompat != null)) {
                onCheckBoxClick.write("view is missing!", new Object[0]);
                return;
            }
            doWriteToLog dowritetolog = appStatsSessionEvent.MediaBrowserCompat$ItemReceiver.size() > i ? appStatsSessionEvent.MediaBrowserCompat$ItemReceiver.get(i) : null;
            if (dowritetolog != null) {
                getExportStatus getexportstatus = new getExportStatus(appStatsSessionEvent, i, dowritetolog);
                if (appStatsSessionEvent.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getexportstatus.IconCompatParcelizer(appStatsSessionEvent.RatingCompat);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ArrayList arrayList;
        if (!getIntent().hasExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_MERCHANT_WALLET_LIST")) {
            this.scrollView.setVisibility(8);
            AppStatsSessionEvent appStatsSessionEvent = this.merchantWalletDetailPresenter;
            appStatsSessionEvent.IconCompatParcelizer = true;
            if (appStatsSessionEvent.RatingCompat != null) {
                appStatsSessionEvent.RatingCompat.AlertController$RecycleListView();
            }
            OffsetDateTime now = OffsetDateTime.now();
            appStatsSessionEvent.write.read(20, now.withDayOfMonth(1).format(appStatsSessionEvent.read), now.format(appStatsSessionEvent.read));
            appStatsSessionEvent.write.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onPlaceSelected>>() {
                public final /* synthetic */ void onNext(Object obj) {
                    List list = (List) obj;
                    super.onNext(list);
                    AppStatsSessionEvent appStatsSessionEvent = AppStatsSessionEvent.this;
                    exportStatusEvent exportstatusevent = new exportStatusEvent(this, list);
                    if (appStatsSessionEvent.RatingCompat != null) {
                        exportstatusevent.IconCompatParcelizer(appStatsSessionEvent.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    AppStatsSessionEvent appStatsSessionEvent = AppStatsSessionEvent.this;
                    getPercentComplete getpercentcomplete = new getPercentComplete(this, th);
                    if (appStatsSessionEvent.RatingCompat != null) {
                        getpercentcomplete.IconCompatParcelizer(appStatsSessionEvent.RatingCompat);
                    }
                }
            });
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                arrayList = intent.getParcelableArrayListExtra("com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity.EXTRA_MERCHANT_WALLET_LIST");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = new ArrayList();
            }
            read((List<doWriteToLog>) arrayList);
        }
        this.scrollView.setOnScrollChangeListener(new getSDKName(this));
    }
}
