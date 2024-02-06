package com.scb.phone.view.activity.personalize;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.HowToAddAccountActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.SetupQuickBalanceActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.QuickPromptPayActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.SetupQuickPromptPayActivity;
import com.scb.phone.view.activity.remittance.RemittanceLandingActivity;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomFragmentDialog;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C3092xce3d994b;
import p040o.C4382er;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.canGoForward;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.dispatchOnMonthChanged;
import p040o.forEachDstOut;
import p040o.getArch;
import p040o.getCalendarContentDescription;
import p040o.getCores;
import p040o.getCurrentDate;
import p040o.getGeoDataClient;
import p040o.getIdType;
import p040o.getLeftEdgeTearWidth;
import p040o.onCheckBoxClick;
import p040o.parseEventSignal;
import p040o.setLocale;
import p040o.setOnMyLocationChangeListener;
import p040o.setTapText;

public class ShortcutRouterActivity extends BaseActivity implements getLeftEdgeTearWidth {
    private CustomFragmentDialog MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat = true;
    public discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @HmlPinActivity
    public C4382er presenter;

    public static void MediaBrowserCompat$ItemReceiver(Context context, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        Intent intent = new Intent(context, ShortcutRouterActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SHORTCUT", discardoldlogfiles_mediabrowsercompat_itemreceiver);
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
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Fragment fragment, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        Intent intent = new Intent(fragment.getContext(), ShortcutRouterActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SHORTCUT", discardoldlogfiles_mediabrowsercompat_itemreceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            fragment.startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (fragment.getContext() instanceof Activity) {
            ((Activity) fragment.getContext()).overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        Window window = getWindow();
        window.addFlags(512);
        window.addFlags(67108864);
        this.MediaMetadataCompat = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SHORTCUT");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat);
        if (m2977x50fd9e4a()) {
            if (this.MediaMetadataCompat.AbsActionBarView == null) {
                str = "null";
            } else {
                str = this.MediaMetadataCompat.AbsActionBarView.setCheckable;
            }
            this.scbAnalytics.write("predictives", new ZSYR2K("function", this.MediaMetadataCompat.setTitle.toString()), new ZSYR2K("sub_function", str), new ZSYR2K(Name.MARK, String.valueOf(this.MediaMetadataCompat.setBackgroundResource)), new ZSYR2K("sort_sequence", String.valueOf(this.MediaMetadataCompat.setIcon)));
        }
        String IconCompatParcelizer = forEachDstOut.IconCompatParcelizer((int) this.MediaMetadataCompat.setBackgroundResource);
        if (IconCompatParcelizer != null) {
            mo13676d_(IconCompatParcelizer);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean m2977x50fd9e4a() {
        return this.MediaMetadataCompat.setTitle != null && this.MediaMetadataCompat.ExpandedMenuView.equals(setLocale.PREDICTIVE);
    }

    private String MediaSessionCompat$Token() {
        if (m2977x50fd9e4a()) {
            return "predictive";
        }
        return this.MediaMetadataCompat.setTitle != null && this.MediaMetadataCompat.setTitle.equals(getGeoDataClient.FAVOURITE) ? "favourite" : "tile";
    }

    public final void write() {
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
        Intent intent = new Intent(this, FavouriteSelectedActivity.class);
        intent.putExtra("source", MediaSessionCompat$Token());
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
        TransferActivity.MediaBrowserCompat$CustomActionResultReceiver(this, MediaSessionCompat$Token());
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution, LogFileManager.C35981 r3) {
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
        BillPaymentActivity.read(this, execution, r3, MediaSessionCompat$Token());
    }

    public final void MediaBrowserCompat$ItemReceiver(parseEventSignal parseeventsignal, LogFileManager.C35981 r3) {
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
        TopUpActivity.write(this, parseeventsignal, r3, MediaSessionCompat$Token());
    }

    public final void read(getArch getarch) {
        mo13676d_("lifestyle_quickbalance");
        this.MediaBrowserCompat$SearchResultReceiver = CustomFragmentDialog.read(getarch);
        this.MediaBrowserCompat$SearchResultReceiver.show(getSupportFragmentManager().read(), "dialog");
    }

    public final void read(getCores getcores) {
        finish();
        Intent intent = new Intent(this, QuickPromptPayActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_QUICK_PROMPT_PAY_DISPLAY", getcores);
        intent.putExtra("source", MediaSessionCompat$Token());
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
        finish();
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, SetupQuickBalanceActivity.class);
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
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
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, SetupQuickPromptPayActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_QUICK_TOP_UP_STATUS", setOnMyLocationChangeListener.SETUP.type);
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void MediaMetadataCompat() {
        if (this.iDeviceCompatibilityHelper.read()) {
            Intent intent = new Intent(this, ScanPaymentActivity.class);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read, 0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaDescriptionCompat() {
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
        Intent write = RemittanceLandingActivity.write(this, C3092xce3d994b.Builder.FAVOURITE);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onBackPressed() {
        CustomFragmentDialog customFragmentDialog = this.MediaBrowserCompat$SearchResultReceiver;
        if (customFragmentDialog == null || !customFragmentDialog.isAdded()) {
            super.onBackPressed();
            return;
        }
        this.MediaBrowserCompat$SearchResultReceiver.dismiss();
        this.MediaBrowserCompat$SearchResultReceiver = null;
        finish();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        setTransitioning();
        super.onDestroy();
    }

    public final void read(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
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
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        finish();
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.MediaDescriptionCompat = true;
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.auto_airtime_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.auto_airtime_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.IconCompatParcelizer(getString(R.string.auto_airtime_dialog_save), new dispatchOnMonthChanged(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.auto_airtime_dialog_cancel), new canGoForward(this));
        MediaBrowserCompat$ItemReceiver.mTitleTextView.setTypeface(Typeface.createFromAsset(MediaBrowserCompat$ItemReceiver.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        MediaBrowserCompat$ItemReceiver.mTextTextView.setTypeface(Typeface.createFromAsset(MediaBrowserCompat$ItemReceiver.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        MediaBrowserCompat$ItemReceiver.mPositiveButton.setTypeface(Typeface.createFromAsset(MediaBrowserCompat$ItemReceiver.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        MediaBrowserCompat$ItemReceiver.mNegativeButton.setTypeface(Typeface.createFromAsset(MediaBrowserCompat$ItemReceiver.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        MediaBrowserCompat$ItemReceiver.setOnDismissListener(new getCurrentDate(this));
        MediaBrowserCompat$ItemReceiver.show();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        getCalendarContentDescription.read(this, i, iArr);
    }
}
