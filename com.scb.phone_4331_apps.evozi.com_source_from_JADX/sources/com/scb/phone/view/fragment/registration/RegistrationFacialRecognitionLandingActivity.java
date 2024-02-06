package com.scb.phone.view.fragment.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.SensitiveCSentActivity;
import com.scb.phone.view.activity.ntb.touchpoint.C5679xbaf88dd0;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointLivenessCheckActivity;
import com.scb.phone.view.activity.registration.C5709xe487f1a8;
import com.scb.phone.view.activity.registration.RegistrationLivenessCheckActivity;
import com.scb.phone.view.fragment.registration.RegistrationFacialVerificationLockedActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import p040o.C10047mG;
import p040o.CrashlyticsReportJsonTransform$$Lambda$6;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.KtaServiceCaller;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickExtractorAgentListener;
import p040o.Suppliers;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.detectFacesJni;
import p040o.getKernelIDDstOver;
import p040o.getKernelIDMultiply;
import p040o.getObject;
import p040o.getObject$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getObject$MediaBrowserCompat$ItemReceiver;
import p040o.getObject$MediaBrowserCompat$MediaItem;
import p040o.getObject$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.onMarkerClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RegistrationFacialRecognitionLandingActivity extends BaseActivity implements QuickExtractorAgentListener {
    public static final C6141xb267e810 MediaMetadataCompat = new C6141xb267e810((byte) 0);
    private getKernelIDMultiply MediaBrowserCompat$MediaItem = new getKernelIDMultiply();
    private getKernelIDDstOver MediaBrowserCompat$SearchResultReceiver = new getKernelIDDstOver();
    @HmlPinActivity
    public getObject presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79622131493187);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        Intent intent = getIntent();
        Object obj = null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_FLOW_TYPE") : null;
        if (serializableExtra instanceof binaryImagesJsonFromMapsFile) {
            obj = serializableExtra;
        }
        binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile = (binaryImagesJsonFromMapsFile) obj;
        if (binaryimagesjsonfrommapsfile != null) {
            getObject getobject = this.presenter;
            if (getobject == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getobject.MediaBrowserCompat$ItemReceiver(this);
            getObject getobject2 = this.presenter;
            if (getobject2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) binaryimagesjsonfrommapsfile, "flow");
            getobject2.write = binaryimagesjsonfrommapsfile;
            if (binaryimagesjsonfrommapsfile == binaryImagesJsonFromMapsFile.TOUCH_POINT) {
                getKernelIDMultiply getkernelidmultiply = this.MediaBrowserCompat$MediaItem;
                getObject getobject3 = this.presenter;
                if (getobject3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                String write = getobject3.read.write();
                onGetStartedClick.write((Object) write, "customerGroup");
                getkernelidmultiply.read("customer_group", write);
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "touchpoint_ekyc_facial_instruction");
                return;
            }
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_face_instruction");
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @OnClick
    public final void onNextButtonClicked() {
        getObject getobject = this.presenter;
        if (getobject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile = getobject.write;
        if (binaryimagesjsonfrommapsfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        boolean z = false;
        if (binaryimagesjsonfrommapsfile == binaryImagesJsonFromMapsFile.TOUCH_POINT) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getObject$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (getobject.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getobject.RatingCompat);
                return;
            }
            return;
        }
        if (getobject.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getobject.RatingCompat.AlertController$RecycleListView();
        }
        binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile2 = getobject.write;
        if (binaryimagesjsonfrommapsfile2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        int i = KtaServiceCaller.IconCompatParcelizer[binaryimagesjsonfrommapsfile2.ordinal()];
        if (i == 1) {
            Suppliers.ExpiringMemoizingSupplier expiringMemoizingSupplier = getobject.MediaBrowserCompat$ItemReceiver;
            getObject getobject2 = getobject;
            expiringMemoizingSupplier.read(expiringMemoizingSupplier.IconCompatParcelizer.read(), new C10047mG(new getObject.RatingCompat(getobject2)), new C10047mG(new getObject$MediaBrowserCompat$SearchResultReceiver(getobject2)));
        } else if (i == 2) {
            detectFacesJni detectfacesjni = getobject.IconCompatParcelizer;
            getObject getobject3 = getobject;
            detectfacesjni.read(detectfacesjni.read.write(), new C10047mG(new getObject.MediaMetadataCompat(getobject3)), new C10047mG(new getObject$MediaBrowserCompat$MediaItem(getobject3)));
        }
    }

    @OnClick
    public final void onReturnButtonClicked() {
        getObject getobject = this.presenter;
        if (getobject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile = getobject.write;
        if (binaryimagesjsonfrommapsfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        boolean z = true;
        if (binaryimagesjsonfrommapsfile == binaryImagesJsonFromMapsFile.TOUCH_POINT) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getObject.IconCompatParcelizer.write;
            if (getobject.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getobject.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getObject$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (getobject.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(getobject.RatingCompat);
        }
    }

    public final void read() {
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(this));
    }

    public final void write() {
        mo13803Z_();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("EXTRA_FATCA_STATUS") : null;
        C5679xbaf88dd0 touchPointLivenessCheckActivity$MediaBrowserCompat$CustomActionResultReceiver = TouchPointLivenessCheckActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, TouchPointLivenessCheckActivity.class).putExtra("EXTRA_FATCA_STATUS", stringExtra);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…ATCA_STATUS, fatcaStatus)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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

    public final void MediaBrowserCompat$ItemReceiver(onMarkerClick onmarkerclick, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        onGetStartedClick.write((Object) onmarkerclick, "verifiedMethod");
        onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flow");
        C5709xe487f1a8 registrationLivenessCheckActivity$MediaBrowserCompat$CustomActionResultReceiver = RegistrationLivenessCheckActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flowType");
        onGetStartedClick.write((Object) onmarkerclick, "verifiedMethod");
        Intent intent = new Intent(context, RegistrationLivenessCheckActivity.class);
        intent.putExtra(RegistrationLivenessCheckActivity.MediaMetadataCompat, parseprocmapsjsonfromstream);
        intent.putExtra(RegistrationLivenessCheckActivity.MediaBrowserCompat$SearchResultReceiver, onmarkerclick);
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

    public final void write(onMarkerClick onmarkerclick, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        onGetStartedClick.write((Object) onmarkerclick, "verifiedMethod");
        onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flow");
        RegistrationFacialVerificationLockedActivity.read read = RegistrationFacialVerificationLockedActivity.MediaDescriptionCompat;
        Intent IconCompatParcelizer = RegistrationFacialVerificationLockedActivity.read.IconCompatParcelizer(this, onmarkerclick, parseprocmapsjsonfromstream);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        SensitiveCSentActivity.read read = SensitiveCSentActivity.MediaBrowserCompat$SearchResultReceiver;
        Intent MediaBrowserCompat$ItemReceiver = SensitiveCSentActivity.read.MediaBrowserCompat$ItemReceiver(this, CrashlyticsReportJsonTransform$$Lambda$6.SENSITIVE_NEWREGISTER);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (-1 == i2 && i == 9001) {
            getObject getobject = this.presenter;
            if (getobject == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onMarkerClick onmarkerclick = getobject.MediaBrowserCompat$SearchResultReceiver;
            if (onmarkerclick != null) {
                writeUInt64NoTag.IconCompatParcelizer write = new getObject.write(onmarkerclick, getobject);
                if (getobject.RatingCompat != null) {
                    write.IconCompatParcelizer(getobject.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile) {
        return C6141xb267e810.IconCompatParcelizer(context, binaryimagesjsonfrommapsfile, (String) null);
    }
}
