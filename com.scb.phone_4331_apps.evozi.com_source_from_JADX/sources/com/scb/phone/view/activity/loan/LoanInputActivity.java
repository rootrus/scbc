package com.scb.phone.view.activity.loan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Pattern;
import p040o.AlertController$RecycleListView;
import p040o.AppStatistics;
import p040o.C5219x51187542;
import p040o.C7110xdd0518ac;
import p040o.CardView;
import p040o.ComparisonChain;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PreviewFrame;
import p040o.ZSYR2K;
import p040o.destroyPool;
import p040o.forEachSrcOut;
import p040o.getCameraMode;
import p040o.getCardManagementActivation;
import p040o.getEpc;
import p040o.getICheckDeserializerRtti;
import p040o.getLastSessionEventID;
import p040o.removeDataStoreInitializedListener;
import p040o.removeIfFromRandomAccessList;
import p040o.rollThreshold;
import p040o.setFileSizeThreshold;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.writeUInt64NoTag;

public class LoanInputActivity extends BaseActivity implements getEpc, AccountSourceSelectFragment.write {
    private Runnable MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private getCardManagementActivation MediaDescriptionCompat;
    private Futures.C34051 MediaMetadataCompat;
    private forEachSrcOut MediaSessionCompat$Token;
    @BindView
    protected DefaultButton buttonReview;
    @BindView
    protected ImageView imageIcon;
    @HmlPinActivity
    public removeDataStoreInitializedListener loanInputPresenter;
    @BindView
    protected NoteEditText noteEditText;
    @BindView
    protected LinearLayout noteLayout;
    @BindView
    CustomTabLayout tabAmountSelect;
    @BindView
    protected TextView textAccountNumber;
    @BindView
    protected TextView textTitle;
    @BindView
    WrapContentViewPager viewPagerAmountSelect;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static void write(Context context, Futures.C34051 r4) {
        Intent intent = new Intent(context, LoanInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_LOAN_DISPLAY", r4);
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

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, Futures.C34051 r3, String str) {
        Intent intent = new Intent(context, LoanInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_LOAN_DISPLAY", r3);
        intent.putExtra("com.scb.phone.EXTRA_LOAN_CTA_SOURCE", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78552131493080);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.input_loan));
        this.loanInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        CardView read = getSupportFragmentManager().read();
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.LOAN_PAYMENT_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        boolean z = true;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0)));
        read.write();
        this.viewPagerAmountSelect.setOffscreenPageLimit(3);
        getCardManagementActivation getcardmanagementactivation = new getCardManagementActivation(this, Collections.emptyList(), new destroyPool(this), new C7110xdd0518ac() {
            public final void write(double d) {
                removeDataStoreInitializedListener removedatastoreinitializedlistener = LoanInputActivity.this.loanInputPresenter;
                String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
                removedatastoreinitializedlistener.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver;
                AppStatistics.AppStatsExportFormat appStatsExportFormat = new AppStatistics.AppStatsExportFormat(removedatastoreinitializedlistener, MediaBrowserCompat$ItemReceiver);
                if (removedatastoreinitializedlistener.RatingCompat != null) {
                    appStatsExportFormat.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                LoanInputActivity.this.noteEditText.requestFocus();
            }
        });
        this.MediaDescriptionCompat = getcardmanagementactivation;
        this.viewPagerAmountSelect.setAdapter(getcardmanagementactivation);
        this.viewPagerAmountSelect.addOnPageChangeListener(this.MediaDescriptionCompat);
        this.viewPagerAmountSelect.addOnPageChangeListener(new ViewPager$MediaBrowserCompat$MediaItem() {
            public final void onPageSelected(int i) {
                WrapContentViewPager wrapContentViewPager = LoanInputActivity.this.viewPagerAmountSelect;
                wrapContentViewPager.IconCompatParcelizer = i;
                wrapContentViewPager.requestLayout();
            }
        });
        this.MediaMetadataCompat = (Futures.C34051) getIntent().getExtras().getParcelable("com.scb.phone.EXTRA_LOAN_DISPLAY");
        this.MediaBrowserCompat$SearchResultReceiver = getIntent().getExtras().getString("com.scb.phone.EXTRA_LOAN_CTA_SOURCE");
        this.MediaSessionCompat$Token = new forEachSrcOut();
        removeDataStoreInitializedListener removedatastoreinitializedlistener = this.loanInputPresenter;
        Futures.C34051 r0 = this.MediaMetadataCompat;
        String D_ = mo3026D_();
        String str = r0.read;
        String str2 = r0.MediaSessionCompat$Token;
        removedatastoreinitializedlistener.IconCompatParcelizer = str;
        removedatastoreinitializedlistener.write = str2;
        AppStatistics.C30221 r4 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                removeDataStoreInitializedListener.IconCompatParcelizer(Futures.C34051.this, (getEpc) obj);
            }
        };
        if (removedatastoreinitializedlistener.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r4.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
        }
        removedatastoreinitializedlistener.ParcelableVolumeInfo.write(D_);
        removedatastoreinitializedlistener.ParcelableVolumeInfo.IconCompatParcelizer(new C5219x51187542(removedatastoreinitializedlistener, (byte) 0));
        removedatastoreinitializedlistener.MediaMetadataCompat = r0;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.input_loan));
    }

    public void onDestroy() {
        this.loanInputPresenter.onDestroy();
        if (this.MediaBrowserCompat$MediaItem != null) {
            this.viewPagerAmountSelect.removeCallbacks((Runnable) null);
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34051 r4) {
        getCardManagementActivation getcardmanagementactivation = this.MediaDescriptionCompat;
        getcardmanagementactivation.MediaBrowserCompat$CustomActionResultReceiver = getCardManagementActivation.IconCompatParcelizer((Activity) this, r4.AppCompatDialogFragment, r4.PlaybackStateCompat$CustomAction);
        getcardmanagementactivation.notifyDataSetChanged();
        rollThreshold rollthreshold = new rollThreshold(this, r4);
        this.MediaBrowserCompat$MediaItem = rollthreshold;
        this.viewPagerAmountSelect.post(rollthreshold);
        this.tabAmountSelect.setupWithViewPager(this.viewPagerAmountSelect);
        this.textTitle.setText(r4.MediaSessionCompat$Token);
        this.textAccountNumber.setText(r4.read);
    }

    public final void write(String str) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((Context) this, (int) R.drawable.bankicon_place_holder, this.imageIcon, str, getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(this, R.color.f66402131099796));
    }

    public final void IconCompatParcelizer(boolean z) {
        this.buttonReview.setButtonEnabled(z);
    }

    public final void write() {
        this.noteEditText.write();
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.scbAnalytics.write("loan_review", new ZSYR2K("loan_review", this.MediaDescriptionCompat.write().read));
        LoanPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(this, setuuidfromutf8bytes, this.MediaDescriptionCompat.write().read);
    }

    public final void IconCompatParcelizer() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.review_loan);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.loan_repeating_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        IconCompatParcelizer.IconCompatParcelizer(getString(R.string.ok), new PreviewFrame(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.cancel), getCameraMode.write).show();
    }

    public final void read(double d) {
        getCardManagementActivation getcardmanagementactivation = this.MediaDescriptionCompat;
        for (int i = 0; i < getcardmanagementactivation.MediaBrowserCompat$CustomActionResultReceiver.size(); i++) {
            getcardmanagementactivation.MediaBrowserCompat$ItemReceiver.get(i).setAvailableBalanceCurrencyFormattingTextWatcher(d);
        }
    }

    @OnClick
    public void onReviewButtonClick() {
        if ("commercial".equalsIgnoreCase(this.MediaMetadataCompat.ParcelableVolumeInfo) && ("PUSH".equalsIgnoreCase(this.MediaBrowserCompat$SearchResultReceiver) || "INBOX".equalsIgnoreCase(this.MediaBrowserCompat$SearchResultReceiver))) {
            if ("PUSH".equalsIgnoreCase(this.MediaBrowserCompat$SearchResultReceiver)) {
                this.MediaSessionCompat$Token.read("combination", "push_commercial_loan");
            } else {
                this.MediaSessionCompat$Token.read("combination", "inbox_commercial_loan");
            }
            this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "loan_input");
        }
        removeDataStoreInitializedListener removedatastoreinitializedlistener = this.loanInputPresenter;
        V obj = this.noteEditText.mNoteEditText.getText().toString();
        getCardManagementActivation getcardmanagementactivation = this.MediaDescriptionCompat;
        getcardmanagementactivation.MediaBrowserCompat$ItemReceiver(getcardmanagementactivation.write);
        double d = getcardmanagementactivation.IconCompatParcelizer;
        if (!removedatastoreinitializedlistener.MediaBrowserCompat$SearchResultReceiver) {
            boolean z = false;
            if (TextUtils.isEmpty(obj) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj).matches()) {
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(d);
                removedatastoreinitializedlistener.MediaBrowserCompat$MediaItem = format;
                removedatastoreinitializedlistener.MediaBrowserCompat$SearchResultReceiver = true;
                AppStatistics.DataStoreInitializedListener dataStoreInitializedListener = AppStatistics.DataStoreInitializedListener.write;
                if (removedatastoreinitializedlistener.RatingCompat != null) {
                    dataStoreInitializedListener.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
                }
                ComparisonChain.C31831 write = ComparisonChain.C31831.write();
                write.MediaBrowserCompat$ItemReceiver = removedatastoreinitializedlistener.read;
                write.read = removedatastoreinitializedlistener.IconCompatParcelizer;
                write.write = removeIfFromRandomAccessList.read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(format).doubleValue());
                write.MediaBrowserCompat$CustomActionResultReceiver = removedatastoreinitializedlistener.MediaMetadataCompat.setBackgroundResource;
                write.MediaDescriptionCompat = removedatastoreinitializedlistener.MediaMetadataCompat.setContentView;
                write.MediaMetadataCompat = removedatastoreinitializedlistener.MediaMetadataCompat.AppCompatActivity;
                if (obj == null || obj.length() == 0) {
                    z = true;
                }
                write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = z ? null : obj;
                removedatastoreinitializedlistener.f2927x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver(write);
                removedatastoreinitializedlistener.f2927x50fd9e4a.IconCompatParcelizer(new removeDataStoreInitializedListener.IconCompatParcelizer(obj, removedatastoreinitializedlistener.read, removedatastoreinitializedlistener.IconCompatParcelizer, removedatastoreinitializedlistener.write, removedatastoreinitializedlistener.MediaDescriptionCompat));
                return;
            }
            getLastSessionEventID getlastsessioneventid = getLastSessionEventID.MediaBrowserCompat$CustomActionResultReceiver;
            if (removedatastoreinitializedlistener.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getlastsessioneventid.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            removeDataStoreInitializedListener removedatastoreinitializedlistener = this.loanInputPresenter;
            String str = builder.MediaSessionCompat$Token;
            double doubleValue = builder.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
            removedatastoreinitializedlistener.read = str;
            removedatastoreinitializedlistener.MediaBrowserCompat$ItemReceiver = doubleValue;
            setFileSizeThreshold setfilesizethreshold = new setFileSizeThreshold(removedatastoreinitializedlistener, doubleValue, str);
            if (removedatastoreinitializedlistener.RatingCompat != null) {
                setfilesizethreshold.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
            }
        }
    }
}
