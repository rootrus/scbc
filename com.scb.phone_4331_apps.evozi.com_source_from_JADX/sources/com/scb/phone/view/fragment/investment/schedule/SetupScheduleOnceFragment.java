package com.scb.phone.view.fragment.investment.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.scheduledtransaction.CalendarDialogActivity;
import com.scb.phone.view.custom.common.ScheduleDate;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityBuilder_ContributeCheckSCBSEligibilityActivity;
import p040o.CheckCaptureActivity;
import p040o.CrashlyticsCore;
import p040o.HmlPinActivity;
import p040o.LocationCallback;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder_ViewBinding;
import p040o.addJustCapturedListener;
import p040o.getDocumentSampleImage;
import p040o.getHoldParallelMessage;
import p040o.getImageWidth;
import p040o.setDiagnosticsViewEnabled;
import p040o.setTapText;

public class SetupScheduleOnceFragment extends BaseSetupScheduleFragment implements getImageWidth.IconCompatParcelizer.read {
    @BindView
    ScheduleDate paymentDate;
    @HmlPinActivity
    public setDiagnosticsViewEnabled presenter;

    /* access modifiers changed from: package-private */
    public final String write() {
        return "O";
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89912131494218, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setDiagnosticsViewEnabled setdiagnosticsviewenabled = this.presenter;
        CrashlyticsCore.C32494 IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        setdiagnosticsviewenabled.write = IconCompatParcelizer;
        setdiagnosticsviewenabled.IconCompatParcelizer = null;
        setdiagnosticsviewenabled.MediaBrowserCompat$ItemReceiver = true;
        getDocumentSampleImage getdocumentsampleimage = new getDocumentSampleImage(IconCompatParcelizer);
        if (setdiagnosticsviewenabled.RatingCompat != null) {
            getdocumentsampleimage.IconCompatParcelizer(setdiagnosticsviewenabled.RatingCompat);
        }
        OffsetDateTime offsetDateTime = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        while (true) {
            offsetDateTime = offsetDateTime.plusDays(1);
            QuickAccountSelectAdapter$FooterHolder_ViewBinding dayOfWeek = offsetDateTime.getDayOfWeek();
            if (!dayOfWeek.equals(QuickAccountSelectAdapter$FooterHolder_ViewBinding.SATURDAY) && !dayOfWeek.equals(QuickAccountSelectAdapter$FooterHolder_ViewBinding.SUNDAY)) {
                break;
            }
        }
        setdiagnosticsviewenabled.IconCompatParcelizer(offsetDateTime);
        setdiagnosticsviewenabled.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        if (setdiagnosticsviewenabled.IconCompatParcelizer != null) {
            getHoldParallelMessage getholdparallelmessage = getHoldParallelMessage.MediaBrowserCompat$CustomActionResultReceiver;
            if (setdiagnosticsviewenabled.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getholdparallelmessage.IconCompatParcelizer(setdiagnosticsviewenabled.RatingCompat);
            }
        } else {
            addJustCapturedListener addjustcapturedlistener = addJustCapturedListener.read;
            if (setdiagnosticsviewenabled.RatingCompat != null) {
                z = true;
            }
            if (z) {
                addjustcapturedlistener.IconCompatParcelizer(setdiagnosticsviewenabled.RatingCompat);
            }
        }
        return inflate;
    }

    public final void IconCompatParcelizer() {
        this.paymentDate.setOnSelectDateListener(new ActivityBuilder_ContributeCheckSCBSEligibilityActivity(this));
        this.paymentDate.setDateHint(getString(R.string.schedule_setup_once_select_date));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.presenter.MediaBrowserCompat$ItemReceiver = true;
        if (i == 0 && i2 == -1) {
            this.presenter.IconCompatParcelizer((OffsetDateTime) intent.getSerializableExtra("com.scb.phone.EXTRA_DATE"));
        }
    }

    public final void read(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3) {
        Intent IconCompatParcelizer = CalendarDialogActivity.IconCompatParcelizer(getContext(), 0, (OffsetDateTime) null, (OffsetDateTime) null, offsetDateTime2, offsetDateTime3, true, offsetDateTime);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(OffsetDateTime offsetDateTime) {
        this.paymentDate.setDateField(CheckCaptureActivity.read(getContext().getResources(), "dd MMM yyyy", offsetDateTime));
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    /* renamed from: com.scb.phone.view.fragment.investment.schedule.SetupScheduleOnceFragment$3 */
    static /* synthetic */ class C60673 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.LocationCallback[] r0 = p040o.LocationCallback.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.LocationCallback r1 = p040o.LocationCallback.REDEEM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.LocationCallback r1 = p040o.LocationCallback.PURCHASE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.LocationCallback r1 = p040o.LocationCallback.SWITCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.schedule.SetupScheduleOnceFragment.C60673.<clinit>():void");
        }
    }

    public final void write(LocationCallback locationCallback) {
        int i = C60673.write[locationCallback.ordinal()];
        if (i == 1) {
            this.paymentDate.setLabel(getString(R.string.payment_date_label));
        } else if (i == 2) {
            this.paymentDate.setLabel(getString(R.string.payment_date_label_purchase));
        } else if (i == 3) {
            this.paymentDate.setLabel(getString(R.string.payment_date_label_switch));
        }
    }
}
