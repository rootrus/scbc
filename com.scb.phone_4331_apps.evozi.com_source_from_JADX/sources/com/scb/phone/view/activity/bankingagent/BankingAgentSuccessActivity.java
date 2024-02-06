package com.scb.phone.view.activity.bankingagent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Arrays;
import java.util.Calendar;
import org.jmrtd.lds.ImageInfo;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7181iz;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getOversizeImage;
import p040o.getPayeeEndorsement;
import p040o.handleResponse;
import p040o.handleResponse$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.handleResponse$MediaBrowserCompat$ItemReceiver;
import p040o.handleResponse$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class BankingAgentSuccessActivity extends BaseActivity implements getPayeeEndorsement {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private MoreExecutors.SameThreadExecutorService MediaDescriptionCompat;
    @BindView
    public TextView accountLabelTextView;
    @BindView
    public TextView accountNameTextView;
    @BindView
    public TextView accountNoTextView;
    @BindView
    public ImageView agentIcon;
    @BindView
    public TextView agentNameTextView;
    @BindView
    public TextView agentNoTextView;
    @BindView
    public TextView amountTextView;
    @BindView
    public View buttonDivider;
    @HmlPinActivity
    public handleResponse presenter;
    @BindView
    public TextView refIdTextView;
    @BindView
    public Button saveButton;
    @BindView
    public TextView titleTextView;
    @BindView
    public TextView transactionDateTextView;

    public final class SlipScreenshot_ViewBinding implements Unbinder {
        private SlipScreenshot MediaBrowserCompat$CustomActionResultReceiver;

        public SlipScreenshot_ViewBinding(SlipScreenshot slipScreenshot, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = slipScreenshot;
            slipScreenshot.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleTextView'", TextView.class);
            slipScreenshot.transactionDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'transactionDateTextView'", TextView.class);
            slipScreenshot.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'refIdTextView'", TextView.class);
            slipScreenshot.accountLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_label, "field 'accountLabelTextView'", TextView.class);
            slipScreenshot.accountNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_name, "field 'accountNameTextView'", TextView.class);
            slipScreenshot.accountNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_to_account_no, "field 'accountNoTextView'", TextView.class);
            slipScreenshot.agentIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_agent_icon, "field 'agentIcon'", ImageView.class);
            slipScreenshot.agentNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agent_name, "field 'agentNameTextView'", TextView.class);
            slipScreenshot.agentNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_agent_no, "field 'agentNoTextView'", TextView.class);
            slipScreenshot.amountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amountTextView'", TextView.class);
        }

        public final void read() {
            SlipScreenshot slipScreenshot = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (slipScreenshot != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                slipScreenshot.titleTextView = null;
                slipScreenshot.transactionDateTextView = null;
                slipScreenshot.refIdTextView = null;
                slipScreenshot.accountLabelTextView = null;
                slipScreenshot.accountNameTextView = null;
                slipScreenshot.accountNoTextView = null;
                slipScreenshot.agentIcon = null;
                slipScreenshot.agentNameTextView = null;
                slipScreenshot.agentNoTextView = null;
                slipScreenshot.amountTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ BankingAgentSuccessActivity IconCompatParcelizer;
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

        write(BankingAgentSuccessActivity bankingAgentSuccessActivity, boolean z) {
            this.IconCompatParcelizer = bankingAgentSuccessActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Uri uri = (Uri) obj;
            handleResponse handleresponse = this.IconCompatParcelizer.presenter;
            if (handleresponse == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String obj2 = uri.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "uri.toString()");
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) obj2, "slipFilePath");
            CharSequence charSequence = obj2;
            boolean z2 = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                writeUInt64NoTag.IconCompatParcelizer write = new handleResponse.write(z, obj2);
                if (handleresponse.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    write.IconCompatParcelizer(handleresponse.RatingCompat);
                }
            }
        }
    }

    public final void setButtonDivider(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.buttonDivider = view;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76742131492899);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        handleResponse handleresponse = this.presenter;
        if (handleresponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        handleresponse.MediaBrowserCompat$ItemReceiver(this);
        MoreExecutors.SameThreadExecutorService sameThreadExecutorService = (MoreExecutors.SameThreadExecutorService) getIntent().getParcelableExtra("DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) sameThreadExecutorService, "it");
        this.MediaDescriptionCompat = sameThreadExecutorService;
        handleResponse handleresponse2 = this.presenter;
        if (handleresponse2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        handleresponse2.IconCompatParcelizer = sameThreadExecutorService;
        writeUInt64NoTag.IconCompatParcelizer handleresponse_mediabrowsercompat_searchresultreceiver = new handleResponse$MediaBrowserCompat$SearchResultReceiver(sameThreadExecutorService);
        boolean z = true;
        if (handleresponse2.RatingCompat != null) {
            handleresponse_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(handleresponse2.RatingCompat);
        }
        boolean shortcut = handleresponse2.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
        writeUInt64NoTag.IconCompatParcelizer handleresponse_mediabrowsercompat_itemreceiver = new handleResponse$MediaBrowserCompat$ItemReceiver(shortcut);
        if (handleresponse2.RatingCompat != null) {
            handleresponse_mediabrowsercompat_itemreceiver.IconCompatParcelizer(handleresponse2.RatingCompat);
        }
        if (shortcut) {
            writeUInt64NoTag.IconCompatParcelizer handleresponse_mediabrowsercompat_customactionresultreceiver = new handleResponse$MediaBrowserCompat$CustomActionResultReceiver(handleresponse2);
            if (handleresponse2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                handleresponse_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(handleresponse2.RatingCompat);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        handleResponse handleresponse = this.presenter;
        if (handleresponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        handleresponse.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7181iz.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    @OnClick
    public final void clickShareSlip() {
        C7181iz.IconCompatParcelizer(this);
    }

    @OnClick
    public final void clickSaveSlip() {
        C7181iz.read(this);
    }

    @OnClick
    public final void clickReturnToAccount() {
        handleResponse handleresponse = this.presenter;
        if (handleresponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = handleResponse.read.read;
        if (handleresponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(handleresponse.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MoreExecutors.SameThreadExecutorService sameThreadExecutorService, boolean z) {
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        SlipScreenshot slipScreenshot = new SlipScreenshot();
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        MoreExecutors.SameThreadExecutorService sameThreadExecutorService2 = this.MediaDescriptionCompat;
        if (sameThreadExecutorService2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        int i = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) sameThreadExecutorService2.MediaMetadataCompat, (Object) "D") ? R.string.banking_success_deposit_slip_file_name : R.string.banking_success_withdraw_slip_file_name;
        Calendar instance = Calendar.getInstance();
        onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
        String string = getString(i, new Object[]{String.valueOf(instance.getTimeInMillis())});
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(if (display.po….timeInMillis.toString())");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        this.MediaBrowserCompat$SearchResultReceiver = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(slipScreenshot, new IconCompatParcelizer(format, z, sameThreadExecutorService), this)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new write(this, z), new BankingAgentSuccessActivity$MediaBrowserCompat$ItemReceiver(this));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13919x50fd9e4a() {
        handleResponse handleresponse = this.presenter;
        if (handleresponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new handleResponse.IconCompatParcelizer(handleresponse);
        if (handleresponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(handleresponse.RatingCompat);
        }
    }

    public final void MediaSessionCompat$Token() {
        handleResponse handleresponse = this.presenter;
        if (handleresponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer handleresponse_mediabrowsercompat_customactionresultreceiver = new handleResponse$MediaBrowserCompat$CustomActionResultReceiver(handleresponse);
        if (handleresponse.RatingCompat != null) {
            handleresponse_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(handleresponse.RatingCompat);
        }
    }

    public final void write(MoreExecutors.SameThreadExecutorService sameThreadExecutorService) {
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        TextView textView = this.titleTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleTextView");
        }
        textView.setText(sameThreadExecutorService.MediaBrowserCompat$MediaItem);
        TextView textView2 = this.transactionDateTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDateTextView");
        }
        textView2.setText(sameThreadExecutorService.MediaSessionCompat$Token);
        TextView textView3 = this.refIdTextView;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("refIdTextView");
        }
        textView3.setText(sameThreadExecutorService.RatingCompat);
        TextView textView4 = this.accountNameTextView;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountNameTextView");
        }
        textView4.setText(sameThreadExecutorService.IconCompatParcelizer);
        TextView textView5 = this.accountNoTextView;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountNoTextView");
        }
        textView5.setText(sameThreadExecutorService.MediaBrowserCompat$ItemReceiver);
        TextView textView6 = this.agentNameTextView;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentNameTextView");
        }
        textView6.setText(sameThreadExecutorService.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView7 = this.agentNoTextView;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentNoTextView");
        }
        textView7.setText(sameThreadExecutorService.MediaDescriptionCompat);
        TextView textView8 = this.amountTextView;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountTextView");
        }
        textView8.setText(sameThreadExecutorService.MediaBrowserCompat$SearchResultReceiver);
        TextView textView9 = this.accountLabelTextView;
        if (textView9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountLabelTextView");
        }
        textView9.setText(getString(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "W", (Object) sameThreadExecutorService.MediaMetadataCompat) ? R.string.banking_review_from : R.string.banking_review_to));
        Context context = this;
        ImageView imageView = this.agentIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentIcon");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, (int) R.drawable.banking_agent_placeholder, imageView, sameThreadExecutorService.write, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
    }

    public final void write(boolean z) {
        int i = z ? 0 : 8;
        Button button = this.saveButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveButton");
        }
        button.setVisibility(i);
        View view = this.buttonDivider;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDivider");
        }
        view.setVisibility(i);
    }

    public final void write(MoreExecutors.SameThreadExecutorService sameThreadExecutorService, boolean z) {
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        C7181iz.MediaBrowserCompat$ItemReceiver(this, sameThreadExecutorService, z);
    }

    public final void write() {
        write(this, R.id.root_view, getString(R.string.banking_success_save_to_your_gallery), getOversizeImage.SUCCESS);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "slipFilePath");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.banking_success_share_slip));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, createChooser).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HomeActivity.write((Context) this, true);
        finish();
    }

    public static final class IconCompatParcelizer extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        MoreExecutors.SameThreadExecutorService read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, boolean z, MoreExecutors.SameThreadExecutorService sameThreadExecutorService) {
            super(R.layout.f91052131494332, str, z);
            onGetStartedClick.write((Object) str, "fileName");
            onGetStartedClick.write((Object) sameThreadExecutorService, "display");
            this.read = sameThreadExecutorService;
        }
    }

    public static final class SlipScreenshot extends FragmentBuilder_BindEBillSelectedFragment<IconCompatParcelizer> {
        @BindView
        public TextView accountLabelTextView;
        @BindView
        public TextView accountNameTextView;
        @BindView
        public TextView accountNoTextView;
        @BindView
        public ImageView agentIcon;
        @BindView
        public TextView agentNameTextView;
        @BindView
        public TextView agentNoTextView;
        @BindView
        public TextView amountTextView;
        @BindView
        public TextView refIdTextView;
        @BindView
        public TextView titleTextView;
        @BindView
        public TextView transactionDateTextView;

        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            CharSequence charSequence;
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) simpleForwardingListenableFuture;
            onGetStartedClick.write((Object) iconCompatParcelizer, "screenshotDisplay");
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
            MoreExecutors.SameThreadExecutorService sameThreadExecutorService = iconCompatParcelizer.read;
            TextView textView = this.titleTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleTextView");
            }
            textView.setText(sameThreadExecutorService.MediaBrowserCompat$MediaItem);
            TextView textView2 = this.transactionDateTextView;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDateTextView");
            }
            textView2.setText(sameThreadExecutorService.MediaSessionCompat$Token);
            TextView textView3 = this.refIdTextView;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("refIdTextView");
            }
            textView3.setText(sameThreadExecutorService.RatingCompat);
            TextView textView4 = this.accountNameTextView;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountNameTextView");
            }
            textView4.setText(sameThreadExecutorService.IconCompatParcelizer);
            TextView textView5 = this.accountNoTextView;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountNoTextView");
            }
            textView5.setText(sameThreadExecutorService.read);
            TextView textView6 = this.agentNameTextView;
            if (textView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentNameTextView");
            }
            textView6.setText(sameThreadExecutorService.MediaBrowserCompat$CustomActionResultReceiver);
            TextView textView7 = this.agentNoTextView;
            if (textView7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentNoTextView");
            }
            textView7.setText(sameThreadExecutorService.MediaDescriptionCompat);
            TextView textView8 = this.amountTextView;
            if (textView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountTextView");
            }
            textView8.setText(sameThreadExecutorService.MediaBrowserCompat$SearchResultReceiver);
            Context context = view.getContext();
            if (context != null) {
                TextView textView9 = this.accountLabelTextView;
                if (textView9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountLabelTextView");
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "W", (Object) sameThreadExecutorService.MediaMetadataCompat)) {
                    charSequence = context.getString(R.string.banking_review_from);
                } else {
                    charSequence = context.getString(R.string.banking_review_to);
                }
                textView9.setText(charSequence);
                ImageView imageView = this.agentIcon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentIcon");
                }
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, (int) R.drawable.banking_agent_placeholder, imageView, sameThreadExecutorService.write, context.getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
            }
        }
    }
}
