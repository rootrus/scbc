package com.scb.phone.view.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.FullScreenProgressDialog;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.scb.phone.view.fragment.notification.NotificationFragment;
import com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p039io.github.inflationx.calligraphy3.TypefaceUtils;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QueueFile;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getFundList;
import p040o.getLandingDiscover;
import p040o.getOversizeImage;
import p040o.getSwitchInSearchFunds;
import p040o.onCheckBoxClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public abstract class BaseFragment extends Fragment implements CheckCaptureModule_GetICheckDeserializerRttiFactory, DialogInterface.OnDismissListener {
    private CustomDialog IconCompatParcelizer;
    private Keep MediaBrowserCompat$CustomActionResultReceiver;
    public BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private Intent MediaBrowserCompat$MediaItem = null;
    @BindView
    public TextView mActionBarTitle;
    @BindView
    protected ViewGroup mProgress;
    @BindView
    public SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView
    public Toolbar mToolbar;
    public Unbinder read;
    public Dialog write;

    @FunctionalInterface
    public interface write {
        void MediaBrowserCompat$ItemReceiver(Context context);
    }

    public void aw_() {
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj, View view) {
        this.read = ButterKnife.IconCompatParcelizer(obj, view);
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }
        CustomDialog customDialog = this.IconCompatParcelizer;
        if (customDialog != null && customDialog.isShowing()) {
            this.IconCompatParcelizer.dismiss();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getActivity() == null) {
            return true;
        }
        getActivity().onBackPressed();
        return true;
    }

    public void Keep() {
        ViewGroup viewGroup = this.mProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).Keep();
        }
    }

    public void ay_() {
        ViewGroup viewGroup = this.mProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        } else if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).ay_();
        }
    }

    public final void write(Activity activity, int i, String str, getOversizeImage getoversizeimage) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.root_view, str, getoversizeimage);
        }
    }

    private void setActionBarHideOffset() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.no_connection_title);
        access_2200.IconCompatParcelizer = getString(R.string.no_connection_msg);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    /* renamed from: com.scb.phone.view.fragment.BaseFragment$5 */
    static /* synthetic */ class C11145 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.access$2300$write[] r0 = p040o.access$2300.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$2300$write r1 = p040o.access$2300.write.CUSTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$2300$write r1 = p040o.access$2300.write.LOGOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$2300$write r1 = p040o.access$2300.write.WIPE_CONFIG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.access$2300$write r1 = p040o.access$2300.write.UPDATE_APP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.BaseFragment.C11145.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2300 access_2300) {
        int i = C11145.MediaBrowserCompat$CustomActionResultReceiver[access_2300.read.ordinal()];
        if (i != 1) {
            if (i == 2) {
                access_2300.MediaBrowserCompat$CustomActionResultReceiver.run();
            } else if (i == 3 || i == 4) {
                if (getActivity() != null && (getActivity() instanceof PreLoadCheckActivity)) {
                    ((PreLoadCheckActivity) getActivity()).MediaSessionCompat$Token(true);
                }
            } else if (i == 5) {
                Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(getContext());
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                    }
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb.append(IconCompatParcelizer2.getData());
                    sb.append("\n with context ");
                    sb.append(activity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    startActivity(IconCompatParcelizer2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) null));
                    AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                    try {
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            intent = setTapText.write(activity2, intent).read();
                        }
                        MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                        sb2.append(intent.getData());
                        sb2.append("\n with context ");
                        sb2.append(activity2.hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                        startActivity(intent);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } catch (Exception e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            }
        } else if (this instanceof BaseTargetSelectedFragment) {
            ((BaseTargetSelectedFragment) this).aD_();
        } else if (this instanceof EBillSelectedFragment) {
            ((EBillSelectedFragment) this).aD_();
        } else if (!(this instanceof NotificationFragment) && !(this instanceof BreadcrumbFragment)) {
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.finish();
            }
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver(false);
            getActivity().onBackPressed();
        }
    }

    public final void PlaybackStateCompat$CustomAction() {
        if (getActivity() != null && isAdded()) {
            ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
        }
    }

    public void az_() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        } else if (getContext() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_HIDE_SWIPE_REFRESH");
            getContext().sendBroadcast(intent);
        }
    }

    public void setTransitioning() {
        if (this.mToolbar != null) {
            BaseActivity baseActivity = null;
            if (getActivity() instanceof BaseActivity) {
                baseActivity = (BaseActivity) getActivity();
            }
            Toolbar toolbar = this.mToolbar;
            if (toolbar != null && baseActivity != null) {
                baseActivity.read(toolbar);
                Keep B_ = baseActivity.mo11B_();
                this.MediaBrowserCompat$CustomActionResultReceiver = B_;
                if (B_ != null) {
                    B_.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) "");
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
                }
                TextView textView = this.mActionBarTitle;
                if (textView != null) {
                    textView.setTextSize(2, ((float) getResources().getDimensionPixelSize(R.dimen.f71922131165260)) / getResources().getDisplayMetrics().density);
                    this.mActionBarTitle.setTypeface(TypefaceUtils.load(getActivity().getAssets(), "fonts/db_heavent_medium.ttf"));
                }
                Drawable mutate = setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_arrow_back_white_24dp).mutate();
                TextView textView2 = this.mActionBarTitle;
                if (textView2 != null) {
                    mutate.setColorFilter(textView2.getCurrentTextColor(), PorterDuff.Mode.SRC_ATOP);
                    this.MediaBrowserCompat$CustomActionResultReceiver.read(mutate);
                }
            }
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).setStackedBackground();
        }
    }

    /* access modifiers changed from: protected */
    public void ParcelableVolumeInfo(String str) {
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setText(str);
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).MediaSessionCompat$QueueItem(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void setActionBarVisibilityCallback() {
        Keep B_;
        Keep keep = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (keep != null) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(true);
        } else if ((getActivity() instanceof BaseActivity) && (B_ = ((BaseActivity) getActivity()).mo11B_()) != null) {
            B_.MediaBrowserCompat$CustomActionResultReceiver(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void setCustomView() {
        Keep B_;
        Keep keep = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (keep != null) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(false);
        } else if ((getActivity() instanceof BaseActivity) && (B_ = ((BaseActivity) getActivity()).mo11B_()) != null) {
            B_.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void ActionBarContextView() {
        BaseActivity baseActivity = getActivity() instanceof BaseActivity ? (BaseActivity) getActivity() : null;
        if (baseActivity == null) {
            return;
        }
        if (this.mToolbar != null) {
            baseActivity.getWindow().getDecorView().setSystemUiVisibility(1280);
            this.mToolbar.getLayoutParams().height += AlertController$RecycleListView.IconCompatParcelizer(getContext());
            this.mToolbar.setPadding(0, AlertController$RecycleListView.IconCompatParcelizer(getContext()), 0, 0);
            return;
        }
        baseActivity.setContentHeight();
    }

    /* access modifiers changed from: protected */
    public final void setTitleOptional() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setColorSchemeColors(setLastBaselineToBottomHeight.read(getContext(), R.color.f67252131099881));
            this.mSwipeRefreshLayout.setOnRefreshListener(new getSwitchInSearchFunds(this));
        }
    }

    public final void write(QueueFile queueFile) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (this.write == null) {
                FullScreenProgressDialog fullScreenProgressDialog = new FullScreenProgressDialog(activity);
                fullScreenProgressDialog.title.setText(queueFile.MediaBrowserCompat$ItemReceiver);
                fullScreenProgressDialog.description.setText(queueFile.write);
                this.write = fullScreenProgressDialog;
            }
            this.write.show();
        }
    }

    public final void aj_() {
        Dialog dialog = this.write;
        if (dialog != null && dialog.isShowing()) {
            this.write.dismiss();
            this.write = null;
        }
    }

    public String setStackedBackground() {
        if (getActivity() instanceof BaseActivity) {
            return ((BaseActivity) getActivity()).mo3026D_();
        }
        return null;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15340x50fd9e4a(boolean z) {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEED_RELOAD", z);
        intent.addFlags(268468224);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void setSplitBackground() {
        Intent intent = new Intent(getContext(), NTBLandingActivity.class);
        intent.addFlags(268468224);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void setPrimaryBackground() {
        Intent write2 = NTBLandingActivity.write(getContext(), true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void ActionBarContainer() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEED_RELOAD", false);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void setTabContainer() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.addFlags(603979776);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void startActivity(Intent intent) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getContext()) || !AlertController$RecycleListView.write(intent, getContext())) {
            read(intent, -1, false);
        } else {
            setActionBarHideOffset();
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getContext()) || !AlertController$RecycleListView.write(intent, getContext())) {
            read(intent, i, true);
        } else {
            setActionBarHideOffset();
        }
    }

    private void read(Intent intent, int i, boolean z) {
        if (getActivity() == null || !(getActivity() instanceof BaseActivity)) {
            super.startActivity(intent);
            return;
        }
        BaseActivity baseActivity = (BaseActivity) getActivity();
        boolean z2 = baseActivity.setGroupDividerEnabled() && !baseActivity.mo13022E_();
        if (AlertController$RecycleListView.read(intent) && !z2) {
            this.MediaBrowserCompat$MediaItem = intent;
            super.startActivityForResult(PinLoginActivity.write(getContext()), 7134);
            baseActivity.setSubtitle();
        } else if (z) {
            super.startActivityForResult(intent, i);
        } else {
            super.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void setSubtitle() {
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            BaseActivity baseActivity = (BaseActivity) getActivity();
            if (baseActivity.getApplication() instanceof AndroidApplication) {
                ((AndroidApplication) baseActivity.getApplication()).IconCompatParcelizer = false;
            }
        }
    }

    public void onAttach(Context context) {
        AlertController$RecycleListView.write((Fragment) this);
        super.onAttach(context);
    }

    public final void IconCompatParcelizer(String str, ZSYR2K... zsyr2kArr) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write(str, zsyr2kArr);
        }
    }

    public final <T extends ZTBSV> void read(HmlVerifyEmailSuccessfulActivity<String, T> hmlVerifyEmailSuccessfulActivity) {
        if (getActivity() != null) {
            ((ZTBSV) hmlVerifyEmailSuccessfulActivity.write).MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public String AbsActionBarView() {
        if (getArguments() != null && getArguments().getString("source") != null) {
            return getArguments().getString("source");
        }
        if (getActivity() == null || !(getActivity() instanceof BaseActivity) || ((BaseActivity) getActivity()).read("source", "") == null) {
            return "";
        }
        return ((BaseActivity) getActivity()).read("source", "");
    }

    public final String setVisibility() {
        if (getArguments() != null && getArguments().getString("subtype") != null) {
            return getArguments().getString("subtype");
        }
        if (getActivity() == null || !(getActivity() instanceof BaseActivity) || ((BaseActivity) getActivity()).read("subtype", "") == null) {
            return "";
        }
        return ((BaseActivity) getActivity()).read("subtype", "");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("OUTSTATE_POST_LOGIN_INTENT", this.MediaBrowserCompat$MediaItem);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.MediaBrowserCompat$MediaItem = (Intent) bundle.getParcelable("OUTSTATE_POST_LOGIN_INTENT");
        }
    }

    public final void setBackgroundResource() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).setBackgroundResource();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).MediaBrowserCompat$ItemReceiver(str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).RatingCompat = true;
        }
        if (i != 7134) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && (intent2 = this.MediaBrowserCompat$MediaItem) != null) {
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent2 = setTapText.write(activity, intent2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.MediaBrowserCompat$MediaItem = null;
        } else if (!(getActivity() instanceof HomeActivity)) {
        } else {
            if (i2 == -1) {
                mo15340x50fd9e4a(false);
            } else {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onDestroyView() {
        Dialog dialog = this.write;
        if (dialog != null && dialog.isShowing()) {
            this.write.dismiss();
            this.write = null;
        }
        CustomDialog customDialog = this.IconCompatParcelizer;
        if (customDialog != null && customDialog.isShowing()) {
            this.IconCompatParcelizer.dismiss();
            this.IconCompatParcelizer = null;
        }
        super.onDestroyView();
        Unbinder unbinder = this.read;
        if (unbinder != null) {
            unbinder.read();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver(false);
        }
    }

    public void write(access$2200 access_2200) {
        if (!(getActivity() != null && (getActivity() instanceof BaseActivity) && ((BaseActivity) getActivity()).MediaBrowserCompat$CustomActionResultReceiver) && access_2200 != null && getContext() != null) {
            CustomDialog customDialog = this.IconCompatParcelizer;
            if (customDialog != null && customDialog.isShowing()) {
                this.IconCompatParcelizer.dismiss();
                this.IconCompatParcelizer = null;
            }
            if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
                ((BaseActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver(true);
            }
            CustomDialog MediaBrowserCompat$ItemReceiver2 = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer);
            this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
            MediaBrowserCompat$ItemReceiver2.setOnDismissListener(this);
            access$2300 access_2300 = access_2200.MediaBrowserCompat$CustomActionResultReceiver;
            if (access_2300 != null) {
                this.IconCompatParcelizer.IconCompatParcelizer(access_2300.MediaBrowserCompat$ItemReceiver, new getLandingDiscover(this, access_2300));
            }
            access$2300 access_23002 = access_2200.write;
            if (access_23002 != null) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(access_23002.MediaBrowserCompat$ItemReceiver, new getFundList(this, access_23002));
            }
            this.IconCompatParcelizer.setCancelable(false);
            this.IconCompatParcelizer.show();
            if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
                ((BaseActivity) getActivity()).RatingCompat(access_2200);
            }
        }
    }

    /* renamed from: k_ */
    public final void mo13677k_(String str) {
        Dialog dialog = this.write;
        if (dialog != null && dialog.isShowing()) {
            this.write.dismiss();
            this.write = null;
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13677k_(str);
        }
    }

    public final void AlertController$RecycleListView() {
        write(new QueueFile());
    }
}
