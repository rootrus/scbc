package com.scb.phone.view.activity.profilemanagement.promptpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.profilemanagement.promptpay.LinkAccountFragment;
import com.scb.phone.view.fragment.profilemanagement.promptpay.UnlinkAccountFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.AlertController$RecycleListView;
import p040o.C1181x6b6283a1;
import p040o.C3080xc2f5febc;
import p040o.C4869jh;
import p040o.C4874jm;
import p040o.C4876jo;
import p040o.C4889kC;
import p040o.FragmentBuilder_BindCcSofBillPaymentInputFragment;
import p040o.HmlPinActivity;
import p040o.ImmutableMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBaseAddress;
import p040o.getBinaries;
import p040o.getKernelIDDstIn;
import p040o.getMicr;
import p040o.getOversizeImage;
import p040o.setBaseAddress;
import p040o.setExecution;
import p040o.setTapText;
import p040o.setTileHeightDp;
import p040o.setTitleMonths;
import p040o.setUuid;
import p040o.split;

public class LinkAndUnlinkPromptPayActivity extends BaseActivity implements getMicr, FragmentBuilder_BindCcSofBillPaymentInputFragment.IconCompatParcelizer, C1181x6b6283a1 {
    private getKernelIDDstIn MediaBrowserCompat$MediaItem = new getKernelIDDstIn();
    @HmlPinActivity
    public C4889kC presenter;

    public static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public static void read(Context context, setExecution setexecution) {
        Intent intent = new Intent(context, LinkAndUnlinkPromptPayActivity.class);
        intent.putExtra("account", setexecution);
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
        setContentView(R.layout.f78532131493078);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setExecution setexecution = (setExecution) getIntent().getParcelableExtra("account");
        C4889kC kCVar = this.presenter;
        kCVar.write = setexecution;
        boolean z = true;
        boolean z2 = setexecution.MediaBrowserCompat$ItemReceiver == null;
        kCVar.read = z2;
        if (z2) {
            if (kCVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                kCVar.RatingCompat.AlertController$RecycleListView();
            }
            kCVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
            kCVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4889kC.read(kCVar, (byte) 0));
            return;
        }
        C4876jo joVar = new C4876jo(kCVar, setexecution);
        if (kCVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            joVar.IconCompatParcelizer(kCVar.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.manage_scb_promptpay_landing_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public final void IconCompatParcelizer(C3080xc2f5febc autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "managepromptpay_link");
        LinkAccountFragment MediaBrowserCompat$ItemReceiver = LinkAccountFragment.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.getClass().getName()).write();
    }

    public final void read(setUuid setuuid) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "managepromptpay_unlink");
        UnlinkAccountFragment write = UnlinkAccountFragment.write(setuuid);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, write, write.getClass().getName()).write();
    }

    public final void MediaSessionCompat$Token() {
        C4889kC kCVar = this.presenter;
        String D_ = mo3026D_();
        if (kCVar.MediaBrowserCompat$MediaItem != null) {
            C4874jm jmVar = new C4874jm(kCVar, D_);
            if (kCVar.RatingCompat != null) {
                jmVar.IconCompatParcelizer(kCVar.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getBaseAddress getbaseaddress) {
        this.presenter.MediaBrowserCompat$MediaItem = getbaseaddress;
    }

    public final void read(boolean z) {
        this.presenter.MediaDescriptionCompat = z;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15217x50fd9e4a() {
        C4889kC kCVar = this.presenter;
        C4869jh jhVar = new C4869jh(kCVar);
        if (kCVar.RatingCompat != null) {
            jhVar.IconCompatParcelizer(kCVar.RatingCompat);
        }
    }

    public final void write(boolean z) {
        C4889kC kCVar = this.presenter;
        kCVar.IconCompatParcelizer = z;
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.AlertController$RecycleListView();
        }
        split split = kCVar.MediaBrowserCompat$SearchResultReceiver;
        ImmutableMultimap.Values.C35011.read read = ImmutableMultimap.Values.C35011.read();
        read.IconCompatParcelizer = kCVar.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        read.write = kCVar.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        read.MediaBrowserCompat$ItemReceiver = kCVar.write.read == 0 ? "MOB" : "CID";
        read.MediaBrowserCompat$CustomActionResultReceiver = z ? 1 : 0;
        read.read = kCVar.write.MediaMetadataCompat;
        split.write(new ImmutableMultimap.Values.C35011(read, (byte) 0));
        kCVar.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new C4889kC.IconCompatParcelizer(kCVar, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setBaseAddress setbaseaddress) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String str = setbaseaddress.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        String str2 = setbaseaddress.write;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        IconCompatParcelizer.IconCompatParcelizer(setbaseaddress.MediaBrowserCompat$CustomActionResultReceiver, new setTileHeightDp(this)).MediaBrowserCompat$ItemReceiver(setbaseaddress.read, setTitleMonths.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void write(setExecution setexecution, getBaseAddress getbaseaddress, String str, int i) {
        Intent IconCompatParcelizer = PromptPayOtpActivity.IconCompatParcelizer(this, str, setexecution, getbaseaddress, i);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof UnlinkAccountFragment) {
            UnlinkAccountFragment unlinkAccountFragment = (UnlinkAccountFragment) findFragmentById;
            unlinkAccountFragment.payAlertToggle.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            unlinkAccountFragment.payAlertToggle.setChecked(z);
            unlinkAccountFragment.payAlertToggle.setOnCheckedChangeListener(unlinkAccountFragment.IconCompatParcelizer);
        }
        if (z2) {
            write(this, R.id.root_view, getString(z ? R.string.manage_promptpay_rtp_enabled : R.string.manage_promptpay_rtp_disabled), getOversizeImage.SUCCESS);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getBinaries getbinaries) {
        ManagePromptpaySuccessActivity.read(this, getbinaries, false);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 123 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
