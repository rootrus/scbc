package com.scb.phone.view.activity.ntb.ekyc;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.DateInputText;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DayViewFacade;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.addSpan;
import p040o.applyTo;
import p040o.areDaysDisabled;
import p040o.blend;
import p040o.getBackgroundDrawable;
import p040o.getFrameSize;
import p040o.getSelectionDrawable;
import p040o.lambda$static$0;
import p040o.makeDirectory;
import p040o.writeEnum;
import p040o.writeUInt32NoTag;

public class NationalIdActivity extends BaseActivity implements KtaJsonCheck.C6928a {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private View.OnClickListener MediaDescriptionCompat = new addSpan(this);
    private blend MediaMetadataCompat = new blend();
    @BindView
    public DateInputText dateEditText;
    @BindView
    protected View fieldsContainer;
    @BindView
    protected ImageView helpButton;
    @BindView
    public EditText laserIdFirst;
    @BindView
    public EditText laserIdSecond;
    @BindView
    public EditText laserIdThird;
    @HmlPinActivity
    public getFrameSize nationalIdPresenter;
    @BindView
    protected Button nextButton;
    @BindView
    protected ImageView scanIdIcon;

    public /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(String str, int i) {
    }

    public /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    /* access modifiers changed from: protected */
    public String MediaSessionCompat$Token() {
        return "open_account";
    }

    public /* synthetic */ void read(AutoValue_CrashlyticsReport_FilesPayload.Builder builder) {
    }

    public /* synthetic */ void lambda$new$0$NationalIdActivity(View view) {
        int id = view.getId();
        if (id != R.id.button_next) {
            boolean z = true;
            if (id == R.id.help_button) {
                getFrameSize getframesize = this.nationalIdPresenter;
                if (getframesize.IconCompatParcelizer.booleanValue()) {
                    getframesize.IconCompatParcelizer = Boolean.FALSE;
                    writeUInt32NoTag writeuint32notag = writeUInt32NoTag.read;
                    if (getframesize.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        writeuint32notag.IconCompatParcelizer(getframesize.RatingCompat);
                    }
                }
            } else if (id == R.id.icon_scan_id) {
                getFrameSize getframesize2 = this.nationalIdPresenter;
                if (getframesize2.IconCompatParcelizer.booleanValue() && getframesize2.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper == null) {
                    getframesize2.IconCompatParcelizer = Boolean.FALSE;
                    writeEnum writeenum = writeEnum.write;
                    if (getframesize2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        writeenum.IconCompatParcelizer(getframesize2.RatingCompat);
                    }
                }
            }
        } else {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.nationalIdPresenter.read(Math.min(point.x, point.y));
            this.fieldsContainer.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78972131493122);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.scanIdIcon.setOnClickListener(this.MediaDescriptionCompat);
        this.nextButton.setOnClickListener(this.MediaDescriptionCompat);
        this.helpButton.setOnClickListener(this.MediaDescriptionCompat);
        this.laserIdFirst.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(3)});
        this.laserIdSecond.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(7)});
        this.laserIdThird.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(2)});
        this.laserIdFirst.addTextChangedListener(new read(3, this.laserIdSecond));
        this.laserIdSecond.addTextChangedListener(new read(7, this.laserIdThird));
        this.laserIdThird.addTextChangedListener(new read(2, this.dateEditText));
        this.dateEditText.setDateUpdatedListener(new DayViewFacade(this));
        this.dateEditText.setValidateInputListener(new applyTo(this));
        this.dateEditText.setOnEditTextClickListener(new areDaysDisabled(this));
        this.nationalIdPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.nationalIdPresenter.IconCompatParcelizer();
        this.MediaMetadataCompat.read("ekyc");
        this.MediaMetadataCompat.read("feature", MediaSessionCompat$Token());
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ekyc_nationalid");
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
        this.MediaMetadataCompat.read("feature", MediaSessionCompat$Token());
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ekyc_scanidcard");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.national_id_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void read() {
        DayViewFacade.Span.read(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050 A[Catch:{ IOException -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057 A[Catch:{ IOException -> 0x00b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$QueueItem() {
        /*
            r5 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x00b2 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b2 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "mounted_ro"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x00b2 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b2 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r2 = "yyyyMMdd_HHmmss"
            r1.<init>(r2)     // Catch:{ IOException -> 0x00b2 }
            java.util.Date r2 = new java.util.Date     // Catch:{ IOException -> 0x00b2 }
            r2.<init>()     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x00b2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b2 }
            r2.<init>()     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r3 = "JPEG_"
            r2.append(r3)     // Catch:{ IOException -> 0x00b2 }
            r2.append(r1)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = "_"
            r2.append(r1)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ IOException -> 0x00b2 }
            java.io.File r2 = r5.getExternalFilesDir(r2)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r3 = ".jpg"
            java.io.File r1 = java.io.File.createTempFile(r1, r3, r2)     // Catch:{ IOException -> 0x00b2 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x00b2 }
            android.net.Uri r0 = p040o.AppCompatTextView.IconCompatParcelizer(r5, r0, r1)     // Catch:{ IOException -> 0x00b2 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r0 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x00b2 }
            android.net.Uri r0 = p040o.AppCompatTextView.IconCompatParcelizer(r5, r0, r1)     // Catch:{ IOException -> 0x00b2 }
        L_0x005d:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ IOException -> 0x00b2 }
            java.lang.Class<com.scb.phone.view.activity.ndid.NationalIdCameraActivity> r3 = com.scb.phone.view.activity.ndid.NationalIdCameraActivity.class
            r2.<init>(r5, r3)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r3 = "output"
            r2.putExtra(r3, r0)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r0 = "EXTRA_CROP_RATIO"
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.putExtra(r0, r3)     // Catch:{ IOException -> 0x00b2 }
            com.thunderhead.android.aspects.IntentTidInjectionActivityAspect.aspectOf()     // Catch:{ IOException -> 0x00b2 }
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r5, r2)     // Catch:{ all -> 0x00a7 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x00a7 }
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "Uri intercepted on Activity.startActivityForResult(Intent, int), modified: "
            r3.<init>(r4)     // Catch:{ all -> 0x00a7 }
            android.net.Uri r4 = r0.getData()     // Catch:{ all -> 0x00a7 }
            r3.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "\n with context "
            r3.append(r4)     // Catch:{ all -> 0x00a7 }
            int r4 = r5.hashCode()     // Catch:{ all -> 0x00a7 }
            r3.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00a7 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00a7 }
            r2 = r5
            com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity r2 = (com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity) r2     // Catch:{ all -> 0x00a7 }
            r3 = 123(0x7b, float:1.72E-43)
            r2.startActivityForResult(r0, r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException -> 0x00b2 }
        L_0x00ab:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x00b2 }
            r5.MediaBrowserCompat$SearchResultReceiver = r0     // Catch:{ IOException -> 0x00b2 }
            return
        L_0x00b2:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity.MediaSessionCompat$QueueItem():void");
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.scanIdIcon.setImageResource(z ? R.drawable.icon_green_tick : R.drawable.icon_plus_circle);
    }

    public final void read(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        NationalIdHelpActivity.write(this, getString(R.string.laser_id_help_title));
    }

    public final void write(AutoValue_CrashlyticsReport_FilesPayload.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("idDisplay", builder);
        setResult(-1, intent);
        finish();
    }

    public final void read(String str, int i) {
        this.MediaBrowserCompat$MediaItem = FragmentBuilder_BindDepositSelectorFragment.write(str, i).write(new getSelectionDrawable(this.nationalIdPresenter), new getBackgroundDrawable(this.nationalIdPresenter));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        DayViewFacade.Span.MediaBrowserCompat$ItemReceiver(this, i, iArr);
        for (int i2 : iArr) {
            if (i2 != 0) {
                finish();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.nationalIdPresenter.IconCompatParcelizer = Boolean.TRUE;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 123) {
            getFrameSize getframesize = this.nationalIdPresenter;
            getframesize.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$SearchResultReceiver;
            makeDirectory makedirectory = makeDirectory.write;
            boolean z = true;
            if (getframesize.RatingCompat != null) {
                makedirectory.IconCompatParcelizer(getframesize.RatingCompat);
            }
            lambda$static$0 lambda_static_0 = new lambda$static$0(getframesize);
            if (getframesize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                lambda_static_0.IconCompatParcelizer(getframesize.RatingCompat);
            }
        } else if (i2 == 0 && i == 123) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    class read extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private int IconCompatParcelizer;
        private View MediaBrowserCompat$CustomActionResultReceiver;

        public read(int i, View view) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            getFrameSize getframesize = NationalIdActivity.this.nationalIdPresenter;
            StringBuilder sb = new StringBuilder();
            sb.append(NationalIdActivity.this.laserIdFirst.getText().toString());
            sb.append(NationalIdActivity.this.laserIdSecond.getText().toString());
            sb.append(NationalIdActivity.this.laserIdThird.getText().toString());
            getframesize.MediaBrowserCompat$ItemReceiver.f2673x50fd9e4a = sb.toString();
            lambda$static$0 lambda_static_0 = new lambda$static$0(getframesize);
            if (getframesize.RatingCompat != null) {
                lambda_static_0.IconCompatParcelizer(getframesize.RatingCompat);
            }
            if (charSequence.length() == this.IconCompatParcelizer) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver == NationalIdActivity.this.laserIdSecond || this.MediaBrowserCompat$CustomActionResultReceiver == NationalIdActivity.this.laserIdThird) {
                    ((EditText) this.MediaBrowserCompat$CustomActionResultReceiver).setText("");
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.requestFocus();
            }
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    public /* synthetic */ void lambda$setListeners$3$NationalIdActivity(View view) {
        this.MediaMetadataCompat.read("feature", MediaSessionCompat$Token());
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ekyc_dateofissue");
    }
}
