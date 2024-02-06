package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class TouchPointAccountDetailActivity extends BaseTouchPointBreadcrumbActivity implements DepositProductDetailFragment.write {
    public static final Intent write(Context context, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "productCode");
        onGetStartedClick.write((Object) str2, "objectiveId");
        Intent intent = new Intent(context, TouchPointAccountDetailActivity.class);
        intent.putExtra("EXTRA_PRODUCT_CODE", str);
        intent.putExtra("EXTRA_OBJECTIVE_ID", str2);
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r4 = r4.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r4 = 2131493239(0x7f0c0177, float:1.8609953E38)
            r3.setContentView(r4)
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r4)
            r3.setStackedBackground()
            r4 = 2131756186(0x7f10049a, float:1.9143272E38)
            r3.setTitle(r4)
            r3.setTabContainer()
            android.content.Intent r4 = r3.getIntent()
            r0 = 0
            if (r4 == 0) goto L_0x002f
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x002f
            java.lang.String r1 = "EXTRA_PRODUCT_CODE"
            java.lang.String r4 = r4.getString(r1)
            goto L_0x0030
        L_0x002f:
            r4 = r0
        L_0x0030:
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L_0x0043
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x0043
            java.lang.String r2 = "EXTRA_OBJECTIVE_ID"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0044
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r4 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x004f
            com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment r4 = com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment.read(r4, r1)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            goto L_0x0054
        L_0x004f:
            androidx.fragment.app.Fragment r4 = new androidx.fragment.app.Fragment
            r4.<init>()
        L_0x0054:
            boolean r1 = r4 instanceof com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment
            if (r1 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r4
        L_0x005a:
            com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment r0 = (com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment) r0
            if (r0 == 0) goto L_0x0063
            r1 = r3
            com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment$write r1 = (com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment.write) r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x0063:
            java.lang.String r0 = "fragment"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r0)
            r0 = 2131297796(0x7f090604, float:1.8213547E38)
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((androidx.appcompat.app.AppCompatActivity) r3, (androidx.fragment.app.Fragment) r4, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ntb.touchpoint.TouchPointAccountDetailActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.SELECT_ACCOUNT;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (str != null && str2 != null) {
            C5680x3e49184 touchPointTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver = TouchPointTermsAndConditionsActivity.MediaDescriptionCompat;
            Context context = this;
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "depositProductCode");
            onGetStartedClick.write((Object) str2, "objectiveId");
            Intent putExtra = new Intent(context, TouchPointTermsAndConditionsActivity.class).putExtra("EXTRA_PRODUCT_CODE", str).putExtra("EXTRA_OBJECTIVE_ID", str2);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…BJECTIVE_ID, objectiveId)");
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
    }
}
