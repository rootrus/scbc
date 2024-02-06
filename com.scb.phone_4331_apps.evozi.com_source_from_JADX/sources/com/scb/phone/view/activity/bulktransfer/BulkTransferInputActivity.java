package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferInputActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;
import com.scb.phone.view.adapter.bulktransfer.RecipientsAdapter;
import com.scb.phone.view.custom.bulktransfer.CustomRecipientsList;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomLimit;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4835j;
import p040o.C7126xb23daf18;
import p040o.C7157iM;
import p040o.C7159iO;
import p040o.CardView;
import p040o.CheckCaptureActivity;
import p040o.ComputingConcurrentHashMap;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FirebaseInstallations;
import p040o.FirebaseInstallations$$Lambda$2;
import p040o.HmlPinActivity;
import p040o.LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SimpleTimeLimiter;
import p040o.UncaughtExceptionHandlers;
import p040o.access$2200;
import p040o.addGetAuthTokenListener;
import p040o.declaresInterruptedEx;
import p040o.doGetAuthTokenForceRefresh;
import p040o.doGetAuthTokenWithoutForceRefresh;
import p040o.getRamUsed;
import p040o.insertOrUpdatePrefs;
import p040o.onCheckBoxClick;
import p040o.parseKey;
import p040o.proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver;
import p040o.readExistingIidOrCreateFid;
import p040o.setBaselineAligned;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.triggerOnException;
import p040o.withRegisteredFid;
import p040o.writeUInt64NoTag;
import p040o.zzj;

public class BulkTransferInputActivity extends BaseActivity implements proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver, AccountSourceSelectFragment.write {
    private RecipientsAdapter.read MediaBrowserCompat$MediaItem = new RecipientsAdapter.read() {
        public final void write() {
            withRegisteredFid withregisteredfid = BulkTransferInputActivity.this.bulkTransferInputPresenter;
            FirebaseInstallations$$Lambda$2 firebaseInstallations$$Lambda$2 = new FirebaseInstallations$$Lambda$2(withregisteredfid);
            boolean z = true;
            if (withregisteredfid.RatingCompat != null) {
                firebaseInstallations$$Lambda$2.IconCompatParcelizer(withregisteredfid.RatingCompat);
            }
            FirebaseInstallations.C33761 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    withRegisteredFid withregisteredfid = withRegisteredFid.this;
                    ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(!show.IconCompatParcelizer(new show(withregisteredfid.write.read), show.IconCompatParcelizer(new show(withregisteredfid.write.RatingCompat), new show(withregisteredfid.write.MediaBrowserCompat$ItemReceiver))).read(setRegistrationStatus.MediaBrowserCompat$CustomActionResultReceiver, 2) && show.IconCompatParcelizer(new show(withregisteredfid.write.read), show.IconCompatParcelizer(new show(withregisteredfid.write.RatingCompat), new show(withregisteredfid.write.MediaBrowserCompat$ItemReceiver))).read(releaseAndClose.read, 2));
                }
            };
            if (withregisteredfid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r1.IconCompatParcelizer(withregisteredfid.RatingCompat);
            }
        }

        public final void IconCompatParcelizer() {
            BulkTransferInputActivity.this.PlaybackStateCompat$CustomAction();
        }
    };
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @HmlPinActivity
    public withRegisteredFid bulkTransferInputPresenter;
    @BindView
    CustomScheduleView customScheduleView;
    @BindView
    TextView groupHeader;
    @BindView
    LinearLayout layoutMoreOptions;
    @BindView
    ViewGroup noRecipents;
    @BindView
    CustomRecipientsList otherRecipientList;
    @BindView
    CustomRecipientsList ownRecipientList;
    @BindView
    DefaultButton reviewButton;
    @BindView
    CustomRecipientsList scbRecipientList;
    @BindView
    TextView totalAmount;
    @BindView
    ViewGroup totalAmountViewGroup;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, BulkTransferInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_GROUP_ID", str);
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

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76882131492913);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        RecipientsAdapter.read read = this.MediaBrowserCompat$MediaItem;
        this.ownRecipientList.setOnRecipientChangeListener(read);
        this.scbRecipientList.setOnRecipientChangeListener(read);
        this.otherRecipientList.setOnRecipientChangeListener(read);
        this.customScheduleView.setOnClickListener(new C7157iM(this));
        CardView read2 = getSupportFragmentManager().read();
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.IconCompatParcelizer = false;
        read2.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0)));
        read2.write();
        this.reviewButton.setEnabled(false);
        this.bulkTransferInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.bulkTransferInputPresenter.IconCompatParcelizer(getIntent().getStringExtra("com.scb.phone.EXTRA_GROUP_ID"), mo3026D_());
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getBaseContext(), new IntentFilter("com.scb.phone/BROADCAST_GROUP_DELETED_BULK_TRANSFER")).subscribe(new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                BulkTransferInputActivity.this.finish();
            }
        }, C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getBaseContext(), new IntentFilter("com.scb.phone/BROADCAST_RELOAD_INPUT_BULK_TRANSFER")).subscribe(new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                BulkTransferInputActivity.write(BulkTransferInputActivity.this);
            }
        }, C7159iO.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void onDestroy() {
        this.bulkTransferInputPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_RELOAD_BULK_TRANSFER");
        sendBroadcast(intent);
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.bulk_transfer));
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public /* synthetic */ void lambda$setupListeners$0$BulkTransferInputActivity(View view) {
        withRegisteredFid withregisteredfid = this.bulkTransferInputPresenter;
        zzj.zza zza = zzj.zza.IconCompatParcelizer;
        if (withregisteredfid.RatingCompat != null) {
            zza.IconCompatParcelizer(withregisteredfid.RatingCompat);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93062131558411, menu);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_settings).getIcon().mutate());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(this, R.color.f65582131099711));
        menu.findItem(R.id.menu_action_settings).setIcon(MediaBrowserCompat$MediaItem2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() != R.id.menu_action_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver = this.bulkTransferInputPresenter.MediaMetadataCompat;
        if (lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver != null) {
            str = lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        } else {
            str = "";
        }
        ManageRecipientGroupActivity.MediaBrowserCompat$ItemReceiver(this, str, "com.scb.phone/BROADCAST_RELOAD_INPUT_BULK_TRANSFER");
        onCheckBoxClick.read("Menu icon pressed", new Object[0]);
        return true;
    }

    public final void write(declaresInterruptedEx declaresinterruptedex) {
        this.groupHeader.setText(declaresinterruptedex.IconCompatParcelizer);
        int i = 8;
        this.noRecipents.setVisibility(declaresinterruptedex.MediaBrowserCompat$CustomActionResultReceiver ? 8 : 0);
        IconCompatParcelizer(this.ownRecipientList, getString(R.string.to_my_own_accounts), declaresinterruptedex.read);
        IconCompatParcelizer(this.scbRecipientList, getString(R.string.to_other_scb_accounts), declaresinterruptedex.RatingCompat);
        IconCompatParcelizer(this.otherRecipientList, getString(R.string.to_other_banks), declaresinterruptedex.MediaBrowserCompat$ItemReceiver);
        ViewGroup viewGroup = this.totalAmountViewGroup;
        if (declaresinterruptedex.MediaBrowserCompat$CustomActionResultReceiver) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        this.totalAmount.setText(declaresinterruptedex.MediaBrowserCompat$SearchResultReceiver);
        this.reviewButton.setButtonEnabled(declaresinterruptedex.MediaBrowserCompat$CustomActionResultReceiver);
    }

    private static void IconCompatParcelizer(CustomRecipientsList customRecipientsList, String str, List<UncaughtExceptionHandlers> list) {
        if (list == null || list.isEmpty()) {
            customRecipientsList.setVisibility(8);
            return;
        }
        customRecipientsList.setVisibility(0);
        customRecipientsList.setHeader(str);
        customRecipientsList.setRecipients(list);
    }

    public final void MediaDescriptionCompat() {
        CustomLimit customLimit = this.ownRecipientList.customLimit;
        customLimit.mLimitProgress.setVisibility(0);
        customLimit.remainingLimit.setVisibility(8);
        CustomLimit customLimit2 = this.scbRecipientList.customLimit;
        customLimit2.mLimitProgress.setVisibility(0);
        customLimit2.remainingLimit.setVisibility(8);
        CustomLimit customLimit3 = this.otherRecipientList.customLimit;
        customLimit3.mLimitProgress.setVisibility(0);
        customLimit3.remainingLimit.setVisibility(8);
    }

    public final void read(String str) {
        this.ownRecipientList.setRemainingLimit(str);
    }

    public final void IconCompatParcelizer(String str) {
        this.scbRecipientList.setRemainingLimit(str);
    }

    public final void write(String str) {
        this.otherRecipientList.setRemainingLimit(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.totalAmount.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(SimpleTimeLimiter simpleTimeLimiter) {
        RecipientsAdapter.read read = this.MediaBrowserCompat$MediaItem;
        this.ownRecipientList.setOnRecipientChangeListener(read);
        this.scbRecipientList.setOnRecipientChangeListener(read);
        this.otherRecipientList.setOnRecipientChangeListener(read);
        BulkTransferReviewActivity.IconCompatParcelizer(this, simpleTimeLimiter);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.reviewButton.setButtonEnabled(z);
    }

    public final void write() {
        CustomLimit customLimit = this.ownRecipientList.customLimit;
        customLimit.mLimitProgress.setVisibility(8);
        customLimit.remainingLimit.setVisibility(0);
        customLimit.remainingLimit.setText(R.string.limit_not_available);
    }

    public final void IconCompatParcelizer() {
        CustomLimit customLimit = this.scbRecipientList.customLimit;
        customLimit.mLimitProgress.setVisibility(8);
        customLimit.remainingLimit.setVisibility(0);
        customLimit.remainingLimit.setText(R.string.limit_not_available);
    }

    public final void read() {
        CustomLimit customLimit = this.otherRecipientList.customLimit;
        customLimit.mLimitProgress.setVisibility(8);
        customLimit.remainingLimit.setVisibility(0);
        customLimit.remainingLimit.setText(R.string.limit_not_available);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ScheduleLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            boolean z = false;
            if (i2 == -1) {
                withRegisteredFid withregisteredfid = this.bulkTransferInputPresenter;
                getRamUsed getramused = (getRamUsed) intent.getParcelableExtra("SCHEDULE_DETAIL");
                withregisteredfid.MediaSessionCompat$ResultReceiverWrapper = getramused;
                readExistingIidOrCreateFid readexistingiidorcreatefid = new readExistingIidOrCreateFid(getramused);
                if (withregisteredfid.RatingCompat != null) {
                    readexistingiidorcreatefid.IconCompatParcelizer(withregisteredfid.RatingCompat);
                }
                withregisteredfid.write(withregisteredfid.MediaSessionCompat$Token != null, new addGetAuthTokenListener(withregisteredfid));
                withregisteredfid.write(withregisteredfid.ParcelableVolumeInfo != null, new doGetAuthTokenForceRefresh(withregisteredfid));
                if (withregisteredfid.MediaBrowserCompat$MediaItem != null) {
                    z = true;
                }
                withregisteredfid.write(z, new doGetAuthTokenWithoutForceRefresh(withregisteredfid));
            } else if (i2 == 1) {
                withRegisteredFid withregisteredfid2 = this.bulkTransferInputPresenter;
                withregisteredfid2.MediaSessionCompat$ResultReceiverWrapper = null;
                parseKey parsekey = parseKey.MediaBrowserCompat$ItemReceiver;
                if (withregisteredfid2.RatingCompat != null) {
                    parsekey.IconCompatParcelizer(withregisteredfid2.RatingCompat);
                }
                withregisteredfid2.write(withregisteredfid2.MediaSessionCompat$Token != null, new triggerOnException(withregisteredfid2));
                withregisteredfid2.write(withregisteredfid2.ParcelableVolumeInfo != null, new FirebaseInstallations(withregisteredfid2));
                if (withregisteredfid2.MediaBrowserCompat$MediaItem != null) {
                    z = true;
                }
                withregisteredfid2.write(z, new insertOrUpdatePrefs(withregisteredfid2));
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getRamUsed getramused) {
        this.customScheduleView.setScheduleView(getramused, true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.customScheduleView.read();
    }

    public final void read(String str, String str2, C7126xb23daf18.read read) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.common_error);
        }
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.proceed), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7126xb23daf18.read.this.MediaBrowserCompat$ItemReceiver();
            }
        });
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), C4835j.C48414.MediaBrowserCompat$CustomActionResultReceiver).show();
        RecipientsAdapter.read read2 = this.MediaBrowserCompat$MediaItem;
        this.ownRecipientList.setOnRecipientChangeListener(read2);
        this.scbRecipientList.setOnRecipientChangeListener(read2);
        this.otherRecipientList.setOnRecipientChangeListener(read2);
    }

    public final void write(access$2200 access_2200) {
        super.write(access_2200);
        RecipientsAdapter.read read = this.MediaBrowserCompat$MediaItem;
        this.ownRecipientList.setOnRecipientChangeListener(read);
        this.scbRecipientList.setOnRecipientChangeListener(read);
        this.otherRecipientList.setOnRecipientChangeListener(read);
    }

    public static /* synthetic */ void write(BulkTransferInputActivity bulkTransferInputActivity) {
        String str;
        withRegisteredFid withregisteredfid = bulkTransferInputActivity.bulkTransferInputPresenter;
        LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver = withregisteredfid.MediaMetadataCompat;
        if (lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver != null) {
            str = lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        } else {
            str = "";
        }
        withregisteredfid.IconCompatParcelizer(str, bulkTransferInputActivity.mo3026D_());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.bulkTransferInputPresenter.read = builder.MediaSessionCompat$Token;
    }

    @OnClick
    public void onReviewButtonClicked() {
        this.ownRecipientList.setOnRecipientChangeListener((RecipientsAdapter.read) null);
        this.scbRecipientList.setOnRecipientChangeListener((RecipientsAdapter.read) null);
        this.otherRecipientList.setOnRecipientChangeListener((RecipientsAdapter.read) null);
        withRegisteredFid withregisteredfid = this.bulkTransferInputPresenter;
        if (!withregisteredfid.MediaBrowserCompat$SearchResultReceiver) {
            boolean z = true;
            withregisteredfid.MediaBrowserCompat$SearchResultReceiver = true;
            ComputingConcurrentHashMap.NullPointerExceptionReference MediaBrowserCompat$CustomActionResultReceiver = ComputingConcurrentHashMap.NullPointerExceptionReference.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.read = withregisteredfid.read;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = withregisteredfid.MediaMetadataCompat.IconCompatParcelizer;
            MediaBrowserCompat$CustomActionResultReceiver.write = withregisteredfid.MediaBrowserCompat$ItemReceiver(withregisteredfid.write.read);
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = withregisteredfid.MediaBrowserCompat$ItemReceiver(withregisteredfid.write.RatingCompat);
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = withregisteredfid.MediaBrowserCompat$ItemReceiver(withregisteredfid.write.MediaBrowserCompat$ItemReceiver);
            getRamUsed getramused = withregisteredfid.MediaSessionCompat$ResultReceiverWrapper;
            if (getramused != null) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = new ComputingConcurrentHashMap.ComputingSerializationProxy(getramused.IconCompatParcelizer, withregisteredfid.MediaSessionCompat$ResultReceiverWrapper.write, CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(withregisteredfid.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver), CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(withregisteredfid.MediaSessionCompat$ResultReceiverWrapper.read));
            }
            if (withregisteredfid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                withregisteredfid.RatingCompat.AlertController$RecycleListView();
            }
            withregisteredfid.MediaBrowserCompat$ItemReceiver.read(MediaBrowserCompat$CustomActionResultReceiver);
            withregisteredfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new withRegisteredFid.read(MediaBrowserCompat$CustomActionResultReceiver));
        }
    }
}
