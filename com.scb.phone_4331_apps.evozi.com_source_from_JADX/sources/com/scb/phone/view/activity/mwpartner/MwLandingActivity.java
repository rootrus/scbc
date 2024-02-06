package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C7099x42401b9d;
import p040o.CalendarDay;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.classificationConfidence$MediaBrowserCompat$ItemReceiver;
import p040o.copyToMonthOnly;
import p040o.getBuildVersion;
import p040o.getMonth;
import p040o.onAnimationCancel;
import p040o.onAnimationRepeat;
import p040o.onAnimationStart;
import p040o.setTapText;
import p040o.today;
import p040o.zzmd;

public class MwLandingActivity extends BaseActivity implements classificationConfidence$MediaBrowserCompat$ItemReceiver {
    private WalletAdapter MediaBrowserCompat$MediaItem;
    public C7099x42401b9d MediaBrowserCompat$SearchResultReceiver;
    private CustomDialog MediaDescriptionCompat;
    @BindView
    Button btnGmbActivateAccount;
    @BindView
    Button buttonDownload;
    @BindView
    ImageView ivGmbBanner;
    @BindView
    TextView myshopTitle;
    @BindView
    RecyclerView rvWallet;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, MwLandingActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78852131493110);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        mo13676d_("merchant_landing_page");
        this.rvWallet.setLayoutManager(new LinearLayoutManager());
        WalletAdapter walletAdapter = new WalletAdapter(new onAnimationRepeat(this), new onAnimationStart(this), new CalendarDay(this));
        this.MediaBrowserCompat$MediaItem = walletAdapter;
        this.rvWallet.setAdapter(walletAdapter);
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer((classificationConfidence$MediaBrowserCompat$ItemReceiver) this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        aj_();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
        MediaSessionCompat$QueueItem("");
        this.myshopTitle.setVisibility(0);
        this.buttonDownload.setVisibility(0);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14819x50fd9e4a() {
        AlertController$RecycleListView();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(8);
        }
        this.myshopTitle.setVisibility(8);
        this.buttonDownload.setVisibility(8);
    }

    public final void MediaSessionCompat$Token() {
        setTitle(R.string.mw_landing_title);
    }

    public void onStart() {
        super.onStart();
        this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDownloadClick() {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void omGMBSectionClick() {
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<getBuildVersion> list) {
        WalletAdapter walletAdapter = this.MediaBrowserCompat$MediaItem;
        walletAdapter.write.clear();
        walletAdapter.write.addAll(list);
        walletAdapter.IconCompatParcelizer.write();
    }

    public final void write(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
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
        } catch (Exception unused) {
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem();
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((Context) this, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent read = MerchantWalletDetailActivity.read((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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

    public final void RatingCompat() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwManageWalletActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void MediaDescriptionCompat() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public void onBackPressed() {
        this.MediaBrowserCompat$SearchResultReceiver.read();
    }

    public final void MediaMetadataCompat() {
        Intent read = MwCoachMarkActivity.read(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent putExtra = new Intent(this, HomeActivity.class).addFlags(268468224).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
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

    public final void IconCompatParcelizer() {
        Intent IconCompatParcelizer = MwOnboardInfoActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
        finish();
    }

    public final void read() {
        Intent intent = new Intent(this, MwCurrentUserEwalletActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent MediaBrowserCompat$ItemReceiver = MwTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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
        finish();
    }

    public final void MediaSessionCompat$QueueItem() {
        this.ivGmbBanner.setVisibility(0);
        this.btnGmbActivateAccount.setVisibility(0);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.ivGmbBanner.setVisibility(8);
        this.btnGmbActivateAccount.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.ivGmbBanner, str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), onAnimationCancel.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void write() {
        CustomDialog customDialog = this.MediaDescriptionCompat;
        if (customDialog != null && customDialog.isShowing()) {
            this.MediaDescriptionCompat.dismiss();
            this.MediaDescriptionCompat = null;
        }
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.auto_maemanee_gmb_error_signup_content);
        if (true ^ (string == null || string.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string);
        }
        this.MediaDescriptionCompat = IconCompatParcelizer;
        IconCompatParcelizer.RatingCompat(getString(R.string.auto_maemanee_gmb_error_signup_proceed), new today(this));
        this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.auto_maemanee_gmb_error_signup_more_info), new copyToMonthOnly(this));
        this.MediaDescriptionCompat.read(getString(R.string.auto_maemanee_gmb_error_signup_cancel), getMonth.write);
        this.MediaDescriptionCompat.setCancelable(false);
        this.MediaDescriptionCompat.show();
    }

    public final void read(String str) {
        this.scbAnalytics.write("gmb_existing_register", new ZSYR2K[0]);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("IS_NEED_HISTORY_STACK", true);
        intent.putExtra("EXTRA_CLEAR_COOKIES_PARAMETER", zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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
}
