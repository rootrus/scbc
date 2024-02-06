package com.scb.phone.view.activity.hml.ekyc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5619xe159b4de;
import com.scb.phone.view.activity.hml.HmlNTBBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlNTBVerificationMethodsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7511tU;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBackendType;
import p040o.getBackendType$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getBackendType$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.removeActivityTransitionUpdates;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlNTBeKYCLandingActivity extends BaseActivity implements C7511tU {
    public static final HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @BindView
    public ProgressStateBar breadcrumbsNtb;
    @BindView
    public Button button;
    @BindView
    public TextView mainTextView;
    @HmlPinActivity
    public getBackendType presenter;
    @BindView
    public TextView secondaryTextView;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78342131493059);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_ntb_ekyc_landing_activity_title));
        setPrimaryBackground();
        setTabContainer();
        TextView textView = this.mainTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mainTextView");
        }
        textView.setText(getString(R.string.hml_ntb_ekyc_landing_activity_subtitle));
        TextView textView2 = this.secondaryTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondaryTextView");
        }
        textView2.setText(getString(R.string.hml_ntb_ekyc_landing_activity_description));
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setText(getString(R.string.next_button));
        ProgressStateBar progressStateBar = this.breadcrumbsNtb;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar2 = this.breadcrumbsNtb;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        boolean z = false;
        progressStateBar2.setVisibility(0);
        ProgressStateBar progressStateBar3 = this.breadcrumbsNtb;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        progressStateBar3.setCurrentState(1);
        getBackendType getbackendtype = this.presenter;
        if (getbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getbackendtype.MediaBrowserCompat$ItemReceiver(this);
        getBackendType getbackendtype2 = this.presenter;
        if (getbackendtype2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getbackendtype2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getbackendtype2.RatingCompat.AlertController$RecycleListView();
        }
        getbackendtype2.MediaBrowserCompat$ItemReceiver.write();
        getbackendtype2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getBackendType$MediaBrowserCompat$ItemReceiver(getbackendtype2));
        Button button3 = this.button;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button3.setOnClickListener(new write(this));
        mo13676d_("p10x1_ekyc_landing");
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ HmlNTBeKYCLandingActivity MediaBrowserCompat$ItemReceiver;

        write(HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity) {
            this.MediaBrowserCompat$ItemReceiver = hmlNTBeKYCLandingActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
            if (r0.equals("RP_PENDING") != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
            if (r0.equals("RP_CID_VERIFIED") != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            if (r0.equals("BRANCH_INITIAL") != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
            if (r0.equals("RP_LIVENESS") != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
            r0 = p040o.getBackendType.read.MediaBrowserCompat$ItemReceiver;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r5.RatingCompat == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
            r0.IconCompatParcelizer(r5.RatingCompat);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity r5 = r4.MediaBrowserCompat$ItemReceiver
                o.getBackendType r5 = r5.presenter
                if (r5 != 0) goto L_0x000b
                java.lang.String r0 = "presenter"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x000b:
                o.removeActivityTransitionUpdates r0 = r5.IconCompatParcelizer
                java.lang.String r1 = "hmlVerifyKycStatus"
                if (r0 != 0) goto L_0x0014
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x0014:
                boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x002c
                o.getBackendType$write r0 = p040o.getBackendType.write.MediaBrowserCompat$ItemReceiver
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r5.RatingCompat
                if (r1 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r2 = r3
            L_0x0024:
                if (r2 == 0) goto L_0x002b
                T r5 = r5.RatingCompat
                r0.IconCompatParcelizer(r5)
            L_0x002b:
                return
            L_0x002c:
                o.removeActivityTransitionUpdates r0 = r5.IconCompatParcelizer
                if (r0 != 0) goto L_0x0033
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
            L_0x0033:
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0074
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1865702876: goto L_0x005a;
                    case -1058807417: goto L_0x0051;
                    case -107413078: goto L_0x0048;
                    case 596945014: goto L_0x003f;
                    default: goto L_0x003e;
                }
            L_0x003e:
                goto L_0x0074
            L_0x003f:
                java.lang.String r1 = "RP_PENDING"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0074
                goto L_0x0062
            L_0x0048:
                java.lang.String r1 = "RP_CID_VERIFIED"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0074
                goto L_0x0062
            L_0x0051:
                java.lang.String r1 = "BRANCH_INITIAL"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0074
                goto L_0x0062
            L_0x005a:
                java.lang.String r1 = "RP_LIVENESS"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0074
            L_0x0062:
                o.getBackendType$read r0 = p040o.getBackendType.read.MediaBrowserCompat$ItemReceiver
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r5.RatingCompat
                if (r1 == 0) goto L_0x006b
                goto L_0x006c
            L_0x006b:
                r2 = r3
            L_0x006c:
                if (r2 == 0) goto L_0x0073
                T r5 = r5.RatingCompat
                r0.IconCompatParcelizer(r5)
            L_0x0073:
                return
            L_0x0074:
                T r0 = r5.RatingCompat
                if (r0 == 0) goto L_0x0079
                goto L_0x007a
            L_0x0079:
                r2 = r3
            L_0x007a:
                if (r2 == 0) goto L_0x0081
                T r0 = r5.RatingCompat
                r0.AlertController$RecycleListView()
            L_0x0081:
                o.setSelectedTabIndicatorColor r0 = r5.MediaBrowserCompat$ItemReceiver
                r0.IconCompatParcelizer()
                o.setSelectedTabIndicatorColor r0 = r5.MediaBrowserCompat$ItemReceiver
                o.getBackendType$MediaMetadataCompat r1 = new o.getBackendType$MediaMetadataCompat
                r1.<init>(r5)
                o.IndoorBuilding$MediaBrowserCompat$ItemReceiver r1 = (p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver) r1
                r0.IconCompatParcelizer(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity.write.onClick(android.view.View):void");
        }
    }

    public final void onDestroy() {
        getBackendType getbackendtype = this.presenter;
        if (getbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getbackendtype.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_ntb_ekyc_landing_activity_title));
        setPrimaryBackground();
        setTabContainer();
    }

    public final void MediaDescriptionCompat() {
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setText(getString(R.string.hml_ntb_ekyc_landing_activity_already_verified_btn));
    }

    public final void write() {
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setText(getString(R.string.next_button));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ HmlNTBeKYCLandingActivity IconCompatParcelizer;

        IconCompatParcelizer(HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity) {
            this.IconCompatParcelizer = hmlNTBeKYCLandingActivity;
        }

        public final void onClick(View view) {
            HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity = this.IconCompatParcelizer;
            HmlNTBBusinessOccupationInfoActivity.read read = HmlNTBBusinessOccupationInfoActivity.MediaMetadataCompat;
            Context context = this.IconCompatParcelizer;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlNTBBusinessOccupationInfoActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(hmlNTBeKYCLandingActivity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(hmlNTBeKYCLandingActivity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                hmlNTBeKYCLandingActivity.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setOnClickListener(new IconCompatParcelizer(this));
    }

    public final void IconCompatParcelizer() {
        C5619xe159b4de hmlNTBVerificationMethodsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBVerificationMethodsActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBVerificationMethodsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.hml_ntb_ekyc_landing_pop_up_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.hml_ntb_ekyc_landing_pop_up_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.hml_ntb_ekyc_landing_pop_up_resume_btn), new read(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.hml_ntb_ekyc_landing_pop_up_start_over_btn), new C5630x5aba7cce(this)).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlNTBeKYCLandingActivity IconCompatParcelizer;

        read(HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity) {
            this.IconCompatParcelizer = hmlNTBeKYCLandingActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getBackendType getbackendtype = this.IconCompatParcelizer.presenter;
            if (getbackendtype == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            removeActivityTransitionUpdates removeactivitytransitionupdates = getbackendtype.IconCompatParcelizer;
            if (removeactivitytransitionupdates == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlVerifyKycStatus");
            }
            boolean z = true;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) removeactivitytransitionupdates.MediaBrowserCompat$ItemReceiver, (Object) "BRANCH_INITIAL")) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getBackendType$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (getbackendtype.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getbackendtype.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getBackendType.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (getbackendtype.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getbackendtype.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C5629xe00ea892 hmlNTBEkycBranchInstructionActivity$MediaBrowserCompat$ItemReceiver = HmlNTBEkycBranchInstructionActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBEkycBranchInstructionActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver hmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver = HmlNTBEkycNdidLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBEkycNdidLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
}
