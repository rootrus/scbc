package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.easycash.EasycashLoanTrackAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CameraSource;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LinkedHashMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCardNumber;
import p040o.onGetStartedClick;
import p040o.setImageFileWidth;
import p040o.setImageFileWidth$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.streamToString;

public final class EasycashLoanTrackActivity extends BaseActivity implements getCardNumber {
    private static IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public setImageFileWidth presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public TextView textNoLoan;
    @BindView
    public View viewNoLoan;

    public final void setViewNoLoan(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.viewNoLoan = view;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f77592131492984);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.loan_tracking_title));
        setTabContainer();
        setImageFileWidth setimagefilewidth = this.presenter;
        if (setimagefilewidth == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagefilewidth.MediaBrowserCompat$ItemReceiver(this);
        setImageFileWidth setimagefilewidth2 = this.presenter;
        if (setimagefilewidth2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setimagefilewidth2.RatingCompat != null) {
            setimagefilewidth2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap linkedHashMultimap = setimagefilewidth2.read;
        FundFactSheetActivity iconCompatParcelizer = new setImageFileWidth.IconCompatParcelizer(setimagefilewidth2);
        FundFactSheetActivity setimagefilewidth_mediabrowsercompat_customactionresultreceiver = new setImageFileWidth$MediaBrowserCompat$CustomActionResultReceiver(setimagefilewidth2);
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
        onGetStartedClick.write((Object) setimagefilewidth_mediabrowsercompat_customactionresultreceiver, "onError");
        linkedHashMultimap.MediaBrowserCompat$ItemReceiver(linkedHashMultimap.read, iconCompatParcelizer, setimagefilewidth_mediabrowsercompat_customactionresultreceiver, new CameraSource.zzc.write(), new LinkedHashMultimap.write(linkedHashMultimap));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.loan_tracking_title));
        setTabContainer();
    }

    public final void write(streamToString streamtostring) {
        onGetStartedClick.write((Object) streamtostring, "display");
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        EasycashLoanTrackAdapter easycashLoanTrackAdapter = new EasycashLoanTrackAdapter(streamtostring.write);
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setAdapter(easycashLoanTrackAdapter);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "emptyString");
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setVisibility(8);
        View view = this.viewNoLoan;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewNoLoan");
        }
        view.setVisibility(0);
        TextView textView = this.textNoLoan;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textNoLoan");
        }
        textView.setText(str);
    }

    public final void onDestroy() {
        setImageFileWidth setimagefilewidth = this.presenter;
        if (setimagefilewidth == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagefilewidth.onDestroy();
        super.onDestroy();
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, EasycashLoanTrackActivity.class);
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
}
