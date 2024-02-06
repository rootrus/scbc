package com.scb.phone.view.activity.transferandpay.cardlessatm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collection;
import java.util.List;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.inject_permissionChecker;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class CardlessATMCoachMarkActivity extends BaseActivity {
    private static read MediaMetadataCompat = new read((byte) 0);
    @HmlPinActivity
    public inject_permissionChecker presenter;
    @BindView
    public ViewPager viewpage;

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2) {
        return read.MediaBrowserCompat$ItemReceiver(context, str, str2);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) {
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, CardlessATMCoachMarkActivity.class);
            intent.putExtra("source", str);
            if (str2 == null) {
                str2 = CardlessATMActivity.IconCompatParcelizer.DEPOSITS.name();
            }
            intent.putExtra("CARDLESS_DEFAULT_TAB", str2);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78822131493107);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        inject_permissionChecker inject_permissionchecker = this.presenter;
        if (inject_permissionchecker == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = inject_permissionchecker.MediaBrowserCompat$CustomActionResultReceiver();
        inject_permissionChecker inject_permissionchecker2 = this.presenter;
        if (inject_permissionchecker2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        inject_permissionchecker2.write();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "listUnseen");
        int[] IconCompatParcelizer = HmlNTBBusinessURLInformationActivity.IconCompatParcelizer((Collection<Integer>) MediaBrowserCompat$CustomActionResultReceiver);
        CoachMarkViewPagerAdapter coachMarkViewPagerAdapter = new CoachMarkViewPagerAdapter(this, IconCompatParcelizer);
        ViewPager viewPager = this.viewpage;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewpage");
        }
        viewPager.setAdapter(coachMarkViewPagerAdapter);
        coachMarkViewPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver = new C5721xb2fc1972(this, IconCompatParcelizer.length);
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(CardlessATMCoachMarkActivity cardlessATMCoachMarkActivity) {
        Intent intent = new Intent(cardlessATMCoachMarkActivity, CardlessATMActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("source", cardlessATMCoachMarkActivity.read("source", ""));
        String stringExtra = cardlessATMCoachMarkActivity.getIntent().getStringExtra("CARDLESS_DEFAULT_TAB");
        if (stringExtra != null) {
            intent.putExtra("CARDLESS_DEFAULT_TAB", stringExtra);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(cardlessATMCoachMarkActivity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(cardlessATMCoachMarkActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            cardlessATMCoachMarkActivity.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        cardlessATMCoachMarkActivity.finish();
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        return read.MediaBrowserCompat$ItemReceiver(context, str, CardlessATMActivity.IconCompatParcelizer.DEPOSITS.name());
    }
}
