package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C1219xa97c14d5;
import p040o.C3849x5daebc18;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TaskRunner;
import p040o.TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver;
import p040o.getKernelIDClear;
import p040o.getOprRenew;
import p040o.getOprRenew$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.immediateCheckedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.transparency;
import p040o.writeUInt64NoTag;

public final class MwManageReceivingAccountActivity extends BaseActivity implements C1219xa97c14d5 {
    public static final C5660xaf907d98 MediaBrowserCompat$MediaItem = new C5660xaf907d98((byte) 0);
    public immediateCheckedFuture MediaMetadataCompat;
    @BindView
    public Button btnChange;
    @BindView
    public LinearLayout emptyView;
    @HmlPinActivity
    public TaskRunner.TaskCompletedListener presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public TextView tvAccountNo;
    @BindView
    public TextView tvAccountType;
    @BindView
    public TextView tvRemake;
    @BindView
    public TextView tvWalletId;
    @BindView
    public View verticalLine;

    public final void setVerticalLine(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.verticalLine = view;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78862131493111);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.mw_manage_account_title);
        TaskRunner.TaskCompletedListener taskCompletedListener = this.presenter;
        if (taskCompletedListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        taskCompletedListener.MediaBrowserCompat$ItemReceiver(this);
        TaskRunner.TaskCompletedListener taskCompletedListener2 = this.presenter;
        if (taskCompletedListener2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new TaskRunner.TaskCompletedListener.write(taskCompletedListener2);
        if (taskCompletedListener2.RatingCompat != null) {
            write2.IconCompatParcelizer(taskCompletedListener2.RatingCompat);
        }
        transparency transparency = taskCompletedListener2.MediaBrowserCompat$ItemReceiver;
        transparency.read(transparency.read(), new C3849x5daebc18(taskCompletedListener2), new TaskRunner$TaskCompletedListener$MediaBrowserCompat$ItemReceiver(taskCompletedListener2));
        new getKernelIDClear().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_manage_receving_account");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "walletId");
        onGetStartedClick.write((Object) str2, "accountNo");
        TextView textView = this.tvWalletId;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvWalletId");
        }
        textView.setText(str);
        TextView textView2 = this.tvAccountNo;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountNo");
        }
        textView2.setText(str2);
        CharSequence charSequence = str3;
        if (charSequence == null || charSequence.length() == 0) {
            TextView textView3 = this.tvAccountType;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountType");
            }
            textView3.setVisibility(8);
            return;
        }
        TextView textView4 = this.tvAccountType;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountType");
        }
        textView4.setText(charSequence);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends immediateCheckedFuture> list) {
        onGetStartedClick.write((Object) list, "listDepositDisplay");
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter(new getOprRenew(list, new write(this)));
        View view = this.verticalLine;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verticalLine");
        }
        view.setVisibility(0);
        LinearLayout linearLayout = this.emptyView;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyView");
        }
        linearLayout.setVisibility(8);
        TextView textView = this.tvRemake;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemake");
        }
        textView.setVisibility(0);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.setVisibility(0);
        Button button = this.btnChange;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnChange");
        }
        button.setEnabled(false);
    }

    public static final class write implements getOprRenew$MediaBrowserCompat$CustomActionResultReceiver {
        private /* synthetic */ MwManageReceivingAccountActivity write;

        write(MwManageReceivingAccountActivity mwManageReceivingAccountActivity) {
            this.write = mwManageReceivingAccountActivity;
        }

        public final void MediaBrowserCompat$ItemReceiver(immediateCheckedFuture immediatecheckedfuture) {
            onGetStartedClick.write((Object) immediatecheckedfuture, "depositDisplay");
            MwManageReceivingAccountActivity mwManageReceivingAccountActivity = this.write;
            onGetStartedClick.write((Object) immediatecheckedfuture, "<set-?>");
            mwManageReceivingAccountActivity.MediaMetadataCompat = immediatecheckedfuture;
            MwManageReceivingAccountActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    public final void read() {
        View view = this.verticalLine;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verticalLine");
        }
        view.setVisibility(8);
        LinearLayout linearLayout = this.emptyView;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyView");
        }
        linearLayout.setVisibility(0);
        TextView textView = this.tvRemake;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemake");
        }
        textView.setVisibility(8);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setVisibility(8);
        Button button = this.btnChange;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnChange");
        }
        button.setEnabled(false);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "remark");
        TextView textView = this.tvRemake;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemake");
        }
        textView.setText(str);
    }

    @OnClick
    public final void onClickChange() {
        MwCasaOtpActivity$MediaBrowserCompat$ItemReceiver mwCasaOtpActivity$MediaBrowserCompat$ItemReceiver = MwCasaOtpActivity.MediaMetadataCompat;
        Context context = this;
        immediateCheckedFuture immediatecheckedfuture = this.MediaMetadataCompat;
        if (immediatecheckedfuture == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositDisplaySelect");
        }
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) immediatecheckedfuture, "depositDisplay");
        Intent intent = new Intent(context, MwCasaOtpActivity.class);
        intent.putExtra("depositDisplay", immediatecheckedfuture);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void onDestroy() {
        super.onDestroy();
        TaskRunner.TaskCompletedListener taskCompletedListener = this.presenter;
        if (taskCompletedListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        taskCompletedListener.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(MwManageReceivingAccountActivity mwManageReceivingAccountActivity) {
        Button button = mwManageReceivingAccountActivity.btnChange;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnChange");
        }
        button.setEnabled(true);
    }
}
