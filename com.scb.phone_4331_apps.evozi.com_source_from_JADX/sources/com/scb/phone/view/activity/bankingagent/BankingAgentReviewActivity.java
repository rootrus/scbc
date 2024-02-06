package com.scb.phone.view.activity.bankingagent;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bankingagent.GenerateQRActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AbstractAppSpiCall;
import p040o.AbstractAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.AbstractAppSpiCall$MediaBrowserCompat$ItemReceiver;
import p040o.ComputingConcurrentHashMap;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiCheckExtractor_Factory;
import p040o.ZSYMM;
import p040o.endTask;
import p040o.getExitingScheduledExecutorService;
import p040o.onGetStartedClick;
import p040o.removeIfFromRandomAccessList;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class BankingAgentReviewActivity extends BaseActivity implements RttiCheckExtractor_Factory {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    @BindView
    public TextView accountLabelTextView;
    @BindView
    public ImageView agentIconImageView;
    @BindView
    public TextView agentNameTextView;
    @BindView
    public TextView amountTextView;
    @HmlPinActivity
    public AbstractAppSpiCall presenter;
    @BindView
    public TextView toAccountNameTextView;
    @BindView
    public TextView toAccountNoTextView;
    @BindView
    public TextView withDrawalRemarkTextView;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76732131492898);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        AbstractAppSpiCall abstractAppSpiCall = this.presenter;
        if (abstractAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        abstractAppSpiCall.MediaBrowserCompat$ItemReceiver(this);
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = (getExitingScheduledExecutorService) getIntent().getParcelableExtra("BANKING_AGENT_REVIEW_DISPLAY");
        setStackedBackground();
        setTabContainer();
        boolean z = true;
        MediaSessionCompat$QueueItem(getString(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(getexitingscheduledexecutorservice.MediaBrowserCompat$MediaItem, "D", true) ? R.string.banking_deposits_generate_qr_title : R.string.banking_withdrawal_generate_qr_title));
        AbstractAppSpiCall abstractAppSpiCall2 = this.presenter;
        if (abstractAppSpiCall2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) getexitingscheduledexecutorservice, "it");
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "reviewDisplay");
        abstractAppSpiCall2.read = getexitingscheduledexecutorservice;
        writeUInt64NoTag.IconCompatParcelizer abstractAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver = new AbstractAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver(getexitingscheduledexecutorservice);
        if (abstractAppSpiCall2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            abstractAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(abstractAppSpiCall2.RatingCompat);
        }
    }

    public final void onDestroy() {
        AbstractAppSpiCall abstractAppSpiCall = this.presenter;
        if (abstractAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        abstractAppSpiCall.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public final void clickGenerateQR() {
        AbstractAppSpiCall abstractAppSpiCall = this.presenter;
        if (abstractAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str = getexitingscheduledexecutorservice.IconCompatParcelizer;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice2 = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str2 = getexitingscheduledexecutorservice2.MediaBrowserCompat$CustomActionResultReceiver;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice3 = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String read = removeIfFromRandomAccessList.read(getexitingscheduledexecutorservice3.MediaDescriptionCompat);
        onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.amountDoubleWi…als(reviewDisplay.amount)");
        getExitingScheduledExecutorService getexitingscheduledexecutorservice4 = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        String str3 = getexitingscheduledexecutorservice4.MediaBrowserCompat$SearchResultReceiver;
        getExitingScheduledExecutorService getexitingscheduledexecutorservice5 = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        ComputingConcurrentHashMap computingConcurrentHashMap = new ComputingConcurrentHashMap(str, "BANKING_AGENT", str2, read, str3, getexitingscheduledexecutorservice5.MediaBrowserCompat$MediaItem);
        if (abstractAppSpiCall.RatingCompat != null) {
            abstractAppSpiCall.RatingCompat.AlertController$RecycleListView();
        }
        abstractAppSpiCall.write.read(new AbstractAppSpiCall.write(abstractAppSpiCall), new AbstractAppSpiCall.IconCompatParcelizer(abstractAppSpiCall), computingConcurrentHashMap, new AbstractAppSpiCall$MediaBrowserCompat$ItemReceiver(abstractAppSpiCall), abstractAppSpiCall.MediaBrowserCompat$ItemReceiver);
    }

    public final void write(getExitingScheduledExecutorService getexitingscheduledexecutorservice) {
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "display");
        TextView textView = this.accountLabelTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountLabelTextView");
        }
        textView.setText(getString(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "W", (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$MediaItem) ? R.string.banking_review_from : R.string.banking_review_to));
        TextView textView2 = this.toAccountNameTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("toAccountNameTextView");
        }
        textView2.setText(getexitingscheduledexecutorservice.write);
        TextView textView3 = this.toAccountNoTextView;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("toAccountNoTextView");
        }
        textView3.setText(getexitingscheduledexecutorservice.read);
        TextView textView4 = this.agentNameTextView;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentNameTextView");
        }
        textView4.setText(getexitingscheduledexecutorservice.MediaMetadataCompat);
        TextView textView5 = this.amountTextView;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountTextView");
        }
        textView5.setText(getexitingscheduledexecutorservice.RatingCompat);
        TextView textView6 = this.withDrawalRemarkTextView;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("withDrawalRemarkTextView");
        }
        textView6.setVisibility(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "W", (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$MediaItem) ? 0 : 8);
        Context context = this;
        Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.banking_agent_placeholder);
        ImageView imageView = this.agentIconImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentIconImageView");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write, imageView, getexitingscheduledexecutorservice.MediaBrowserCompat$ItemReceiver, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
    }

    public final void read(getExitingScheduledExecutorService getexitingscheduledexecutorservice, endTask endtask) {
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "reviewDisplay");
        onGetStartedClick.write((Object) endtask, "generateQRDisplay");
        GenerateQRActivity.IconCompatParcelizer iconCompatParcelizer = GenerateQRActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("banking_agent_bundle");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…nts.BANKING_AGENT_BUNDLE)");
        ZSYMM zsymm = (ZSYMM) parcelableExtra;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "bankingAgentReviewDisplay");
        onGetStartedClick.write((Object) endtask, "generateQRDisplay");
        onGetStartedClick.write((Object) zsymm, "tracker");
        Intent intent = new Intent(context, GenerateQRActivity.class);
        intent.putExtra("REVIEW_DISPLAY", getexitingscheduledexecutorservice);
        intent.putExtra("GENERATE_QR_DISPLAY", endtask);
        intent.putExtra("banking_agent_bundle", zsymm);
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
        finish();
    }
}
