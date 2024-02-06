package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.debitcard.DebitCardSaleSheetFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class DebitCardSaleSheetActivity extends BaseActivityWithFragment {
    public static void MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, DebitCardSaleSheetActivity.class);
        intent.putExtra("pdf_path", str);
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return DebitCardSaleSheetFragment.IconCompatParcelizer(getIntent().getStringExtra("pdf_path"));
    }

    public final String au_() {
        return getResources().getString(R.string.debit_card_request_product_sales_sheet);
    }
}
