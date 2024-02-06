package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.BaseActivity;

public class MwShopAddressActivity extends BaseActivity {
    public static Intent IconCompatParcelizer(Context context, String str) {
        return new Intent(context, MwShopAddressActivity.class).putExtra("SHOP_TYPE", str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r4 = 2131493220(0x7f0c0164, float:1.8609914E38)
            r3.setContentView(r4)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r3)
            r3.setStackedBackground()
            r4 = 2131759324(0x7f1010dc, float:1.9149637E38)
            r3.setTitle(r4)
            r3.setTabContainer()
            java.lang.String r4 = "merchant_shop_address"
            r3.mo13676d_(r4)
            android.content.Intent r4 = r3.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r0 = "SHOP_TYPE"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.getString(r0, r1)
            int r0 = r4.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case 2376168: goto L_0x004b;
                case 2376169: goto L_0x0041;
                case 2376170: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0055
        L_0x0037:
            java.lang.String r0 = "MT03"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0055
            r4 = r1
            goto L_0x0056
        L_0x0041:
            java.lang.String r0 = "MT02"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0055
            r4 = r2
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "MT01"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0055
            r4 = 0
            goto L_0x0056
        L_0x0055:
            r4 = -1
        L_0x0056:
            if (r4 == 0) goto L_0x006b
            if (r4 == r2) goto L_0x0066
            if (r4 == r1) goto L_0x0061
            r3.onBackPressed()
            r4 = 0
            goto L_0x006f
        L_0x0061:
            com.scb.phone.view.fragment.mwpartner.MwShopAddressStandAloneFragment r4 = com.scb.phone.view.fragment.mwpartner.MwShopAddressStandAloneFragment.MediaBrowserCompat$CustomActionResultReceiver()
            goto L_0x006f
        L_0x0066:
            com.scb.phone.view.fragment.mwpartner.MwShopAddressDepartmentFragment r4 = com.scb.phone.view.fragment.mwpartner.MwShopAddressDepartmentFragment.MediaBrowserCompat$CustomActionResultReceiver()
            goto L_0x006f
        L_0x006b:
            com.scb.phone.view.fragment.mwpartner.MwShopAddressOnlineFragment r4 = com.scb.phone.view.fragment.mwpartner.MwShopAddressOnlineFragment.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x006f:
            o.setTitleMarginStart r0 = r3.getSupportFragmentManager()
            o.CardView r0 = r0.read()
            r1 = 2131297116(0x7f09035c, float:1.8212168E38)
            o.CardView r4 = r0.MediaBrowserCompat$ItemReceiver(r1, r4)
            r4.write()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mwpartner.MwShopAddressActivity.onCreate(android.os.Bundle):void");
    }
}
