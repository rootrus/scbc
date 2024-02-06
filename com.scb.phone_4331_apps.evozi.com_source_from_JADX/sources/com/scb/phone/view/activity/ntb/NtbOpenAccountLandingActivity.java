package com.scb.phone.view.activity.ntb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.SensitiveCSentActivity;
import com.scb.phone.view.activity.ndid.NdidLandingActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointInstructionActivity;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p040o.C4160cW;
import p040o.C4193ck;
import p040o.CrashlyticsReportJsonTransform$$Lambda$6;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$lambda$0;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getFrontBarcodes;
import p040o.onGetStartedClick;
import p040o.setCustomBackground;
import p040o.setGenerator;
import p040o.setTapText;

public class NtbOpenAccountLandingActivity extends BaseActivity implements getFrontBarcodes {
    private PartnerLandingAdapter MediaBrowserCompat$MediaItem;
    @BindView
    RecyclerView mRecyclerViewRegistrationMethods;
    @BindView
    TextView mTextViewDisclaimer;
    @HmlPinActivity
    public C4193ck presenter;

    public void read() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver, List<access$lambda$0> list, boolean z) {
        Intent intent = new Intent(context, NtbOpenAccountLandingActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA", discardoldlogfiles_mediabrowsercompat_itemreceiver);
        intent.putParcelableArrayListExtra("INTRODUCTION_LIST", new ArrayList(list));
        intent.putExtra("com.scb.phone.EXTRA_REGISTRATION_FROM_NTB_USER_INFO", z);
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

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        Intent intent = new Intent(context, NtbOpenAccountLandingActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA", discardoldlogfiles_mediabrowsercompat_itemreceiver);
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

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, long j) {
        Intent intent = new Intent(context, NtbOpenAccountLandingActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_TILE_ID", j);
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

    public static void write(Context context) {
        Intent addFlags = new Intent(context, NtbOpenAccountLandingActivity.class).addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, addFlags).read();
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
        super.onCreate(bundle);
        setContentView(R.layout.f79082131493133);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        mo11B_().MediaBrowserCompat$MediaItem();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = new PartnerLandingAdapter(new setCustomBackground(this.presenter));
        this.mRecyclerViewRegistrationMethods.setLayoutManager(new LinearLayoutManager());
        this.mRecyclerViewRegistrationMethods.setAdapter(this.MediaBrowserCompat$MediaItem);
        this.mRecyclerViewRegistrationMethods.setNestedScrollingEnabled(false);
        Intent intent = getIntent();
        if (intent.hasExtra("INTRODUCTION_LIST") && intent.hasExtra("com.scb.phone.EXTRA_REGISTRATION_FROM_NTB_USER_INFO")) {
            intent.getParcelableArrayListExtra("INTRODUCTION_LIST");
            intent.getBooleanExtra("com.scb.phone.EXTRA_REGISTRATION_FROM_NTB_USER_INFO", false);
            this.presenter.IconCompatParcelizer((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) intent.getParcelableExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA"));
        } else if (intent.hasExtra("com.scb.phone.EXTRA_TILE_ID")) {
            this.presenter.IconCompatParcelizer(intent.getLongExtra("com.scb.phone.EXTRA_TILE_ID", 0));
        } else {
            this.presenter.IconCompatParcelizer((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) intent.getParcelableExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA"));
        }
        mo33954x50fd9e4a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public void mo33954x50fd9e4a() {
        this.scbAnalytics.write("open_account_select_method", new ZSYR2K("feature", "open_account"), new ZSYR2K("source", this.presenter.read()));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        mo11B_().MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C4193ck ckVar = this.presenter;
        C4160cW cWVar = C4160cW.read;
        if (ckVar.RatingCompat != null) {
            cWVar.IconCompatParcelizer(ckVar.RatingCompat);
        }
        return true;
    }

    public final void read(String str) {
        MediaSessionCompat$QueueItem(str);
    }

    public final void MediaDescriptionCompat() {
        MediaSessionCompat$QueueItem(getResources().getString(R.string.ntb_fillinformation_review_info_result_title_page));
    }

    public final void IconCompatParcelizer(String str) {
        this.mTextViewDisclaimer.setText(str);
        this.mTextViewDisclaimer.setVisibility(0);
    }

    public void onBackPressed() {
        C4193ck ckVar = this.presenter;
        C4160cW cWVar = C4160cW.read;
        if (ckVar.RatingCompat != null) {
            cWVar.IconCompatParcelizer(ckVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<setGenerator> list) {
        PartnerLandingAdapter partnerLandingAdapter = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        partnerLandingAdapter.read = list;
        partnerLandingAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, ReviewInfoResultActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice);
        intent.putExtra("EXTRA_PAGE_TITLE", getString(R.string.ntb_fillinformation_review_info_result_title_page));
        intent.putExtra("EXTRA_TITLE", getString(R.string.ntb_phone_not_supported_title));
        intent.putExtra("EXTRA_DESCRIPTION", getString(R.string.ntb_phone_not_supported_description));
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

    public final void MediaMetadataCompat() {
        Intent read = SensitiveCSentActivity.read(this, CrashlyticsReportJsonTransform$$Lambda$6.SENSITIVE_TP);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, PlacesStatusCodes.KEY_INVALID);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = TouchPointInstructionActivity.IconCompatParcelizer(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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

    public void MediaBrowserCompat$MediaItem() {
        Intent read = SensitiveCSentActivity.read(this, CrashlyticsReportJsonTransform$$Lambda$6.SENSITIVE_NDID_RP);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void IconCompatParcelizer() {
        Intent read = NdidLandingActivity.read(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (-1 != i2) {
            super.onActivityResult(i, i2, intent);
        } else if (i == 9001) {
            IconCompatParcelizer();
        } else if (i == 9002) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(this, NTBActivity.class);
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

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write() {
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(this));
        finish();
    }
}
