package com.scb.phone.view.activity.fastpay;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;
import com.scb.phone.view.adapter.common.RadioButtonGroupAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.C7410qw;
import p040o.C7411qx;
import p040o.CreditCard;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RestrictedComponentContainer;
import p040o.createImageRaw;
import p040o.finalizePreviousNativeSession;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.nativeFillBitmap;
import p040o.nativeSetOutputFilePath;
import p040o.releaseFileBuffer;
import p040o.setTapText;

public class ManageFastPayQrScanActivity extends BaseActivity implements RadioButtonGroupAdapter.IconCompatParcelizer, CreditCard.C11681 {
    public RadioButtonGroupAdapter MediaDescriptionCompat;
    @BindView
    LinearLayout layoutFastPaySetup;
    @BindView
    RelativeLayout layoutFastPaySetupFastPayDetail;
    @BindView
    RelativeLayout layoutFastPaySetupFastPayInitState;
    @HmlPinActivity
    public releaseFileBuffer presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    TextView textFastPayAccountName;
    @BindView
    TextView textFastPayLimitAmount;
    @BindView
    TextView textFastPaySettingTitle;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static /* synthetic */ void m2896x50fd9e4a() {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78662131493091);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fastpay_manage_qr_activity_title);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ArrayList arrayList = new ArrayList();
        RestrictedComponentContainer.RestrictedPublisher restrictedPublisher = new RestrictedComponentContainer.RestrictedPublisher();
        restrictedPublisher.read = getString(R.string.fastpay_manage_qr_option_standard);
        restrictedPublisher.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.fastpay_manage_qr_option_standard_description);
        arrayList.add(restrictedPublisher);
        RestrictedComponentContainer.RestrictedPublisher restrictedPublisher2 = new RestrictedComponentContainer.RestrictedPublisher();
        restrictedPublisher2.read = getString(R.string.fastpay_manage_qr_option_fastpay);
        restrictedPublisher2.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.fastpay_manage_qr_option_fastpay_description);
        arrayList.add(restrictedPublisher2);
        this.MediaDescriptionCompat = new RadioButtonGroupAdapter(arrayList, this);
        boolean z = true;
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setAdapter(this.MediaDescriptionCompat);
        releaseFileBuffer releasefilebuffer = this.presenter;
        nativeSetOutputFilePath nativesetoutputfilepath = nativeSetOutputFilePath.IconCompatParcelizer;
        if (releasefilebuffer.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativesetoutputfilepath.IconCompatParcelizer(releasefilebuffer.RatingCompat);
        }
        releasefilebuffer.write.write();
        releasefilebuffer.write.IconCompatParcelizer(new releaseFileBuffer.IconCompatParcelizer(releasefilebuffer, (byte) 0));
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.fastpay_manage_qr_activity_title);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            finalizePreviousNativeSession finalizepreviousnativesession = null;
            if (intent != null) {
                finalizepreviousnativesession = (finalizePreviousNativeSession) intent.getParcelableExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE");
            }
            setResult(-1, intent);
            this.presenter.MediaBrowserCompat$ItemReceiver(finalizepreviousnativesession);
            write(this, R.id.view_group_root, getString(R.string.fastpay_manage_qr_update_successfully), getOversizeImage.SUCCESS);
        }
    }

    public final void write(int i) {
        releaseFileBuffer releasefilebuffer = this.presenter;
        releasefilebuffer.MediaDescriptionCompat = i;
        nativeFillBitmap nativefillbitmap = new nativeFillBitmap(releasefilebuffer, i);
        if (releasefilebuffer.RatingCompat != null) {
            nativefillbitmap.IconCompatParcelizer(releasefilebuffer.RatingCompat);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RadioButtonGroupAdapter radioButtonGroupAdapter = this.MediaDescriptionCompat;
        if (radioButtonGroupAdapter != null) {
            radioButtonGroupAdapter.write(0);
        }
    }

    public final void IconCompatParcelizer() {
        RadioButtonGroupAdapter radioButtonGroupAdapter = this.MediaDescriptionCompat;
        if (radioButtonGroupAdapter != null) {
            radioButtonGroupAdapter.write(1);
        }
    }

    public final void write(finalizePreviousNativeSession finalizepreviousnativesession) {
        this.layoutFastPaySetup.setVisibility(0);
        this.textFastPaySettingTitle.setVisibility(0);
        this.layoutFastPaySetupFastPayDetail.setVisibility(0);
        if (finalizepreviousnativesession != null) {
            this.textFastPayAccountName.setText(finalizepreviousnativesession.write);
            this.textFastPayLimitAmount.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(finalizepreviousnativesession.MediaBrowserCompat$ItemReceiver));
        }
    }

    public final void write() {
        this.layoutFastPaySetup.setVisibility(0);
        this.textFastPaySettingTitle.setVisibility(0);
        this.layoutFastPaySetupFastPayInitState.setVisibility(0);
    }

    public final void read() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.fastpay_manage_qr_changing_option_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.fastpay_manage_qr_changing_option_dialog_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), new C7410qw(this));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                releaseFileBuffer releasefilebuffer = ManageFastPayQrScanActivity.this.presenter;
                resetSingleton resetsingleton = resetSingleton.IconCompatParcelizer;
                if (releasefilebuffer.RatingCompat != null) {
                    resetsingleton.IconCompatParcelizer(releasefilebuffer.RatingCompat);
                }
                releasefilebuffer.IconCompatParcelizer.IconCompatParcelizer(recordLockedRead.MediaBrowserCompat$CustomActionResultReceiver());
                releasefilebuffer.IconCompatParcelizer.IconCompatParcelizer(new releaseFileBuffer.read(releasefilebuffer, (byte) 0));
            }
        });
        IconCompatParcelizer2.setOnCancelListener(new C7411qx(this));
        IconCompatParcelizer2.show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.layoutFastPaySetup.setVisibility(8);
        this.textFastPaySettingTitle.setVisibility(8);
        this.layoutFastPaySetupFastPayInitState.setVisibility(8);
        this.layoutFastPaySetupFastPayDetail.setVisibility(8);
    }

    public final void read(finalizePreviousNativeSession finalizepreviousnativesession) {
        Intent intent = new Intent(this, FastPaySettingActivity.class);
        intent.putExtra("com.scb.phone.FastPaySettingActivity.EXTRA_FAST_PAY_PROFILE", finalizepreviousnativesession);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onClickInitStateLayout(View view) {
        releaseFileBuffer releasefilebuffer = this.presenter;
        createImageRaw createimageraw = new createImageRaw(releasefilebuffer);
        if (releasefilebuffer.RatingCompat != null) {
            createimageraw.IconCompatParcelizer(releasefilebuffer.RatingCompat);
        }
    }

    @OnClick
    public void onClickDetailLayout(View view) {
        releaseFileBuffer releasefilebuffer = this.presenter;
        createImageRaw createimageraw = new createImageRaw(releasefilebuffer);
        if (releasefilebuffer.RatingCompat != null) {
            createimageraw.IconCompatParcelizer(releasefilebuffer.RatingCompat);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((r1 == null || !r1.IconCompatParcelizer) == false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r6 = this;
            o.releaseFileBuffer r0 = r6.presenter
            int r1 = r0.MediaDescriptionCompat
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0018
            o.finalizePreviousNativeSession r1 = r0.read
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.IconCompatParcelizer
            if (r1 == 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            if (r1 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = r3
            goto L_0x0031
        L_0x0018:
            o.finalizePreviousNativeSession r1 = r0.read
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.IconCompatParcelizer
            if (r1 == 0) goto L_0x0022
            r1 = r2
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            if (r1 != 0) goto L_0x0030
            o.finalizePreviousNativeSession r0 = r0.read
            double r0 = r0.MediaBrowserCompat$ItemReceiver
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
            goto L_0x0016
        L_0x0030:
            r0 = r2
        L_0x0031:
            if (r0 != 0) goto L_0x009e
            com.scb.phone.view.custom.common.CustomDialog r0 = com.scb.phone.view.custom.common.CustomDialog.IconCompatParcelizer((android.content.Context) r6)
            android.content.Context r1 = r0.read
            r4 = 2131757499(0x7f1009bb, float:1.9145935E38)
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L_0x004a
            int r4 = r1.length()
            if (r4 == 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0058
            android.widget.TextView r4 = r0.mTitleTextView
            r4.setVisibility(r2)
            android.widget.TextView r4 = r0.mTitleTextView
            r4.setText(r1)
        L_0x0058:
            android.content.Context r1 = r0.read
            r4 = 2131757498(0x7f1009ba, float:1.9145933E38)
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L_0x006b
            int r4 = r1.length()
            if (r4 == 0) goto L_0x006b
            r4 = r2
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0079
            android.widget.TextView r3 = r0.mTextTextView
            r3.setVisibility(r2)
            android.widget.TextView r2 = r0.mTextTextView
            r2.setText(r1)
        L_0x0079:
            o.qv r1 = p040o.C7409qv.IconCompatParcelizer
            android.content.Context r2 = r0.read
            r3 = 2131756397(0x7f10056d, float:1.91437E38)
            java.lang.String r2 = r2.getString(r3)
            com.scb.phone.view.custom.common.CustomDialog r0 = r0.MediaBrowserCompat$ItemReceiver(r2, r1)
            o.qu r1 = new o.qu
            r1.<init>(r6)
            android.content.Context r2 = r0.read
            r3 = 2131759707(0x7f10125b, float:1.9150414E38)
            java.lang.String r2 = r2.getString(r3)
            com.scb.phone.view.custom.common.CustomDialog r0 = r0.IconCompatParcelizer(r2, r1)
            r0.show()
            return
        L_0x009e:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity.onBackPressed():void");
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
        super.onBackPressed();
    }
}
