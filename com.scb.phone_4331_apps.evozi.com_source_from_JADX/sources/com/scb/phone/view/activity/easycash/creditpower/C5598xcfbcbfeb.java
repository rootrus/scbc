package com.scb.phone.view.activity.easycash.creditpower;

import android.content.Context;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.performUpdateApp;
import p040o.setTapText;

/* renamed from: com.scb.phone.view.activity.easycash.creditpower.EasycashCreditPowerSummaryActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5598xcfbcbfeb {
    private C5598xcfbcbfeb() {
    }

    public /* synthetic */ C5598xcfbcbfeb(byte b) {
        this();
    }

    public final void write(Context context, List<performUpdateApp> list, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) list, "productDisplay");
        onGetStartedClick.write((Object) str, "ncbAcceptedFlag");
        Intent intent = new Intent(context, EasycashCreditPowerSummaryActivity.class);
        intent.putParcelableArrayListExtra("product_displays", new ArrayList(list));
        intent.putExtra("ncb_accepted_flag", str);
        IntentTidInjectionContextAspect.aspectOf();
        write(context, intent);
    }

    private static final /* synthetic */ void write(Context context, Intent intent) {
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
}
