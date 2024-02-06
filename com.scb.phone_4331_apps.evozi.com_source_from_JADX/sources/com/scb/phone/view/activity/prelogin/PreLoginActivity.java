package com.scb.phone.view.activity.prelogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.help.HelpActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.HowToAddAccountActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.SetupQuickBalanceActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.QuickPromptPayActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.SetupQuickPromptPayActivity;
import com.scb.phone.view.activity.prelogin.quicktopup.QuickTopUpReviewActivity;
import com.scb.phone.view.activity.prelogin.quicktopup.SetupQuickTopUpActivity;
import com.scb.phone.view.adapter.prelogin.PreLoginTutorialViewPagerAdapter;
import com.scb.phone.view.custom.common.CustomFragmentDialog;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C4404fP;
import p040o.C4410fW;
import p040o.C4419fc;
import p040o.FragmentBuilder_BindCreateGroupFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.fc$MediaBrowserCompat$ItemReceiver;
import p040o.getAdditionalTopScanLinesHeight;
import p040o.getArch;
import p040o.getCores;
import p040o.getICheckDeserializerRtti;
import p040o.setOnMyLocationChangeListener;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p059me.relex.circleindicator.CircleIndicator;

public class PreLoginActivity extends BaseActivity implements getAdditionalTopScanLinesHeight, FragmentBuilder_BindCreateGroupFragment, ViewTreeObserver.OnGlobalLayoutListener {
    private CustomFragmentDialog MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    @BindView
    ImageView imageAvatar;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    ImageView mOverlayImageView;
    @BindView
    RelativeLayout mRootView;
    @BindView
    ViewPager mTutorialViewPager;
    @HmlPinActivity
    public C4419fc preLoginPresenter;
    @BindView
    TextView textUserName;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79322131493157);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setContentHeight();
        this.preLoginPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4419fc fcVar = this.preLoginPresenter;
        C4410fW fWVar = new C4410fW(fcVar);
        if (fcVar.RatingCompat != null) {
            fWVar.IconCompatParcelizer(fcVar.RatingCompat);
        }
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        if (bundle != null) {
            boolean z = bundle.getBoolean("com.scb.phone.EXTRA_IS_LOGIN_SUCCESS");
            this.MediaBrowserCompat$SearchResultReceiver = z;
            if (z) {
                this.preLoginPresenter.IconCompatParcelizer();
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        boolean booleanExtra = intent.getBooleanExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", false);
        boolean booleanExtra2 = intent.getBooleanExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        if (booleanExtra) {
            AlertController$RecycleListView.read(this, R.id.view_group_root, booleanExtra2 ? R.drawable.ic_check_circle_white_24dp : R.drawable.ic_error_white_24dp, intent.getStringExtra("com.scb.phone.EXTRA_MESSAGE"), R.color.f71012131100257, booleanExtra2 ? R.color.f67402131099896 : R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) this));
        }
        CustomFragmentDialog customFragmentDialog = this.MediaBrowserCompat$MediaItem;
        if (customFragmentDialog != null && customFragmentDialog.isAdded()) {
            this.MediaBrowserCompat$MediaItem.dismiss();
            this.MediaBrowserCompat$MediaItem = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.scb.phone.EXTRA_IS_LOGIN_SUCCESS", this.MediaBrowserCompat$SearchResultReceiver);
    }

    public void onDestroy() {
        this.preLoginPresenter.onDestroy();
        super.onDestroy();
    }

    public void onBackPressed() {
        CustomFragmentDialog customFragmentDialog = this.MediaBrowserCompat$MediaItem;
        if (customFragmentDialog == null || !customFragmentDialog.isAdded()) {
            super.onBackPressed();
            return;
        }
        this.MediaBrowserCompat$MediaItem.dismiss();
        this.MediaBrowserCompat$MediaItem = null;
    }

    public final void MediaMetadataCompat() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_TITLE", getString(R.string.enter_scb_easy_pin));
        intent.putExtra("com.scb.phone.EXTRA_SUBTITLE", getString(R.string.quick_top_up_require_pin));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 5001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        setuuidfromutf8bytes.setGroupDividerEnabled = getICheckDeserializerRtti.write((Context) this, (int) R.drawable.bankicon_scb);
        Intent intent = new Intent(this, QuickTopUpReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
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

    public final void RatingCompat() {
        Intent intent = new Intent(this, SetupQuickTopUpActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_QUICK_TOP_UP_STATUS", setOnMyLocationChangeListener.WITHOUT_PRE_REQUISITE.type);
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

    public final void write() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_TITLE", getString(R.string.enter_scb_easy_pin));
        intent.putExtra("com.scb.phone.EXTRA_SUBTITLE", getString(R.string.quick_balance_require_pin));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 5002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(getArch getarch) {
        this.MediaBrowserCompat$MediaItem = CustomFragmentDialog.read(getarch);
        this.MediaBrowserCompat$MediaItem.show(getSupportFragmentManager().read(), "dialog");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, HowToAddAccountActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TITLE", getString(R.string.set_up_quick_balance));
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_1", getString(R.string.quick_balance_no_deposit));
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_2", getString(R.string.quick_balance_no_deposit_description));
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

    public final void read() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_TITLE", getString(R.string.enter_scb_easy_pin));
        intent.putExtra("com.scb.phone.EXTRA_SUBTITLE", getString(R.string.quick_prompt_pay_require_pin));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 5003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(getCores getcores) {
        Intent intent = new Intent(this, QuickPromptPayActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_QUICK_PROMPT_PAY_DISPLAY", getcores);
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

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, HowToAddAccountActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TITLE", getString(R.string.set_up_quick_prompt_pay));
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_1", getString(R.string.quick_prompt_pay_no_deposit));
        intent.putExtra("com.scb.phone.EXTRA_HOW_TO_ADD_ACCOUNT_TEXT_2", getString(R.string.quick_prompt_pay_no_deposit_description));
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

    public final void IconCompatParcelizer(Futures.C34104 r4) {
        FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.profile_placeholder, this.imageAvatar, r4.MediaBrowserCompat$ItemReceiver);
        this.textUserName.setText(r4.RatingCompat);
    }

    @OnClick
    public void onLoginButtonClick() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onMenuQuickBalanceClick() {
        C4419fc fcVar = this.preLoginPresenter;
        fcVar.read = 0;
        if (fcVar.RatingCompat != null) {
            fcVar.RatingCompat.AlertController$RecycleListView();
        }
        fcVar.write.write();
        fcVar.write.IconCompatParcelizer(new C4419fc.read(fcVar, (byte) 0));
    }

    @OnClick
    public void onMenuTopUpClick() {
        C4419fc fcVar = this.preLoginPresenter;
        fcVar.read = 2;
        if (fcVar.RatingCompat != null) {
            fcVar.RatingCompat.AlertController$RecycleListView();
        }
        fcVar.write.read();
        fcVar.write.IconCompatParcelizer(new C4419fc.IconCompatParcelizer(fcVar, (byte) 0));
    }

    @OnClick
    public void onMenuPromptPayClick() {
        C4419fc fcVar = this.preLoginPresenter;
        boolean z = true;
        fcVar.read = 1;
        if (fcVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            fcVar.RatingCompat.AlertController$RecycleListView();
        }
        fcVar.write.IconCompatParcelizer();
        fcVar.write.IconCompatParcelizer(new fc$MediaBrowserCompat$ItemReceiver(fcVar, (byte) 0));
    }

    @OnClick
    public void onNeedHelpClick() {
        Intent intent = new Intent(this, HelpActivity.class);
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

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(268468224);
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

    public final void MediaBrowserCompat$MediaItem() {
        this.mTutorialViewPager.setAdapter(new PreLoginTutorialViewPagerAdapter(this, this));
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver((Context) this, this.mRootView, this.mOverlayImageView);
        this.mTutorialViewPager.setVisibility(0);
        this.mCircleIndicator.setVisibility(0);
        this.mCircleIndicator.setViewPager(this.mTutorialViewPager);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.preLoginPresenter.write((int) R.string.setup_quick_top_up);
    }

    public final void MediaSessionCompat$Token() {
        int currentItem = this.mTutorialViewPager.getCurrentItem() + 1;
        if (currentItem < this.mTutorialViewPager.getAdapter().getCount()) {
            this.mTutorialViewPager.setCurrentItem(currentItem);
            return;
        }
        this.mTutorialViewPager.setVisibility(8);
        this.mOverlayImageView.setVisibility(8);
        this.mCircleIndicator.setVisibility(8);
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C4419fc fcVar = this.preLoginPresenter;
        if (!fcVar.write.IconCompatParcelizer.mo15922x50fd9e4a()) {
            boolean z = true;
            if (fcVar.RatingCompat != null) {
                fcVar.write.IconCompatParcelizer.setExpandedFormat();
                C4404fP fPVar = C4404fP.read;
                if (fcVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    fPVar.IconCompatParcelizer(fcVar.RatingCompat);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.RatingCompat = true;
        if (i2 == -1) {
            if (i == 7134) {
                this.MediaBrowserCompat$SearchResultReceiver = true;
                mo3028a_(this.preLoginPresenter.write.read.setCheckable());
                this.preLoginPresenter.IconCompatParcelizer();
                return;
            } else if (i == 5001) {
                Intent intent2 = new Intent(this, SetupQuickTopUpActivity.class);
                intent2.putExtra("com.scb.phone.EXTRA_QUICK_TOP_UP_STATUS", setOnMyLocationChangeListener.SETUP.type);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(this, intent2).read();
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(read);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            } else if (i == 5002) {
                Intent intent3 = new Intent(this, SetupQuickBalanceActivity.class);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, intent3).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read2.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                    startActivity(read2);
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            } else if (i == 5003) {
                Intent intent4 = new Intent(this, SetupQuickPromptPayActivity.class);
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read3 = setTapText.write(this, intent4).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb3 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb3.append(read3.getData());
                    sb3.append("\n with context ");
                    sb3.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb3.toString());
                    startActivity(read3);
                    return;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
