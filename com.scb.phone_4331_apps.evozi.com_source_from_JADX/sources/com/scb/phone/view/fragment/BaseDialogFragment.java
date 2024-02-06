package com.scb.phone.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.FullScreenProgressDialog;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QueueFile;
import p040o.access$2200;
import p040o.access$2300;
import p040o.confirmSwitch;
import p040o.getMutualFundsConfig;
import p040o.setTapText;

public abstract class BaseDialogFragment extends DialogFragment implements CheckCaptureModule_GetICheckDeserializerRttiFactory {
    private Dialog MediaBrowserCompat$ItemReceiver;
    @BindView
    protected TextView mActionBarTitle;
    @BindView
    protected ViewGroup mProgress;
    @BindView
    protected SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView
    protected Toolbar mToolbar;
    private Intent read = null;
    private CustomDialog write;

    private static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((BaseDialogFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        CustomDialog customDialog = this.write;
        if (customDialog != null && customDialog.isShowing()) {
            this.write.dismiss();
        }
        super.onDestroy();
    }

    public final void Keep() {
        ViewGroup viewGroup = this.mProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).Keep();
        }
    }

    public final void ay_() {
        ViewGroup viewGroup = this.mProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        } else if (getActivity() != null) {
            ((BaseActivity) getActivity()).ay_();
        }
    }

    private void read() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.no_connection_title);
        access_2200.IconCompatParcelizer = getString(R.string.no_connection_msg);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    /* renamed from: com.scb.phone.view.fragment.BaseDialogFragment$2 */
    static /* synthetic */ class C58442 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.access$2300$write[] r0 = p040o.access$2300.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.access$2300$write r1 = p040o.access$2300.write.NAVIGATE_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.access$2300$write r1 = p040o.access$2300.write.CUSTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.access$2300$write r1 = p040o.access$2300.write.LOGOUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.access$2300$write r1 = p040o.access$2300.write.WIPE_CONFIG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.BaseDialogFragment.C58442.<clinit>():void");
        }
    }

    public final void read(access$2300 access_2300) {
        int i = C58442.IconCompatParcelizer[access_2300.read.ordinal()];
        if (i == 1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (i == 2) {
            access_2300.MediaBrowserCompat$CustomActionResultReceiver.run();
        } else if (i == 3) {
            MediaBrowserCompat$CustomActionResultReceiver(true);
        } else if (i == 4 && getActivity() != null && (getActivity() instanceof PreLoadCheckActivity)) {
            ((PreLoadCheckActivity) getActivity()).MediaSessionCompat$Token(true);
        }
    }

    public final void PlaybackStateCompat$CustomAction() {
        if (getActivity() != null && isAdded()) {
            ((BaseActivity) getActivity()).PlaybackStateCompat$CustomAction();
        }
    }

    public final void az_() {
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        } else if (getContext() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_HIDE_SWIPE_REFRESH");
            getContext().sendBroadcast(intent);
        }
    }

    public final void write(QueueFile queueFile) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                FullScreenProgressDialog fullScreenProgressDialog = new FullScreenProgressDialog(activity);
                fullScreenProgressDialog.title.setText(queueFile.MediaBrowserCompat$ItemReceiver);
                fullScreenProgressDialog.description.setText(queueFile.write);
                this.MediaBrowserCompat$ItemReceiver = fullScreenProgressDialog;
            }
            this.MediaBrowserCompat$ItemReceiver.show();
        }
    }

    public final void aj_() {
        Dialog dialog = this.MediaBrowserCompat$ItemReceiver;
        if (dialog != null && dialog.isShowing()) {
            this.MediaBrowserCompat$ItemReceiver.dismiss();
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_NEED_RELOAD", z);
        intent.addFlags(268468224);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        IconCompatParcelizer(this, intent);
    }

    public void startActivity(Intent intent) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getContext()) || !AlertController$RecycleListView.write(intent, getContext())) {
            write(intent, -1, false);
        } else {
            read();
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getContext()) || !AlertController$RecycleListView.write(intent, getContext())) {
            write(intent, i, true);
        } else {
            read();
        }
    }

    private void write(Intent intent, int i, boolean z) {
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            BaseActivity baseActivity = (BaseActivity) getActivity();
            boolean z2 = baseActivity.setGroupDividerEnabled() && !baseActivity.mo13022E_();
            if (AlertController$RecycleListView.read(intent) && !z2) {
                this.read = intent;
                super.startActivityForResult(new Intent(getActivity(), PinLoginActivity.class), 7134);
                baseActivity.setSubtitle();
            } else if (z) {
                super.startActivityForResult(intent, i);
            } else {
                super.startActivity(intent);
            }
        }
    }

    public void onAttach(Context context) {
        AlertController$RecycleListView.write((Fragment) this);
        super.onAttach(context);
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

    /* renamed from: k_ */
    public final void mo13677k_(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13677k_(str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).RatingCompat = true;
        }
        if (i != 7134) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && (intent2 = this.read) != null) {
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
            this.read = null;
        } else if (getActivity() instanceof HomeActivity) {
            MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver(false);
        }
    }

    public final void write(access$2200 access_2200) {
        if (!(getActivity() != null && (getActivity() instanceof BaseActivity) && ((BaseActivity) getActivity()).MediaBrowserCompat$CustomActionResultReceiver) && access_2200 != null && getContext() != null) {
            CustomDialog customDialog = this.write;
            if (customDialog != null && customDialog.isShowing()) {
                this.write.dismiss();
                this.write = null;
            }
            if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
                ((BaseActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver(true);
            }
            CustomDialog MediaBrowserCompat$ItemReceiver2 = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer);
            this.write = MediaBrowserCompat$ItemReceiver2;
            MediaBrowserCompat$ItemReceiver2.setOnDismissListener(this);
            access$2300 access_2300 = access_2200.MediaBrowserCompat$CustomActionResultReceiver;
            if (access_2300 != null) {
                this.write.IconCompatParcelizer(access_2300.MediaBrowserCompat$ItemReceiver, new confirmSwitch(this, access_2300));
            }
            access$2300 access_23002 = access_2200.write;
            if (access_23002 != null) {
                this.write.MediaBrowserCompat$ItemReceiver(access_23002.MediaBrowserCompat$ItemReceiver, new getMutualFundsConfig(this, access_2300));
            }
            this.write.setCancelable(false);
            this.write.show();
            if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
                ((BaseActivity) getActivity()).RatingCompat(access_2200);
            }
        }
    }

    public final void AlertController$RecycleListView() {
        write(new QueueFile());
    }
}
