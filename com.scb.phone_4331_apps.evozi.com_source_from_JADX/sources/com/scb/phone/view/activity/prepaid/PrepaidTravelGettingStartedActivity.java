package com.scb.phone.view.activity.prepaid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PrepaidTravelGettingStartedActivity extends BaseActivity {
    @BindView
    public Button mGettingStarted;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78512131493076);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_travel_welcome_title);
        setTabContainer();
        Button button = this.mGettingStarted;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGettingStarted");
        }
        button.setOnClickListener(new write(this));
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ PrepaidTravelGettingStartedActivity MediaBrowserCompat$ItemReceiver;

        write(PrepaidTravelGettingStartedActivity prepaidTravelGettingStartedActivity) {
            this.MediaBrowserCompat$ItemReceiver = prepaidTravelGettingStartedActivity;
        }

        public final void onClick(View view) {
            PrepaidTravelGettingStartedActivity.write(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.setResult(-1);
            this.MediaBrowserCompat$ItemReceiver.finish();
        }
    }

    public static final /* synthetic */ void write(PrepaidTravelGettingStartedActivity prepaidTravelGettingStartedActivity) {
        Intent intent = new Intent(prepaidTravelGettingStartedActivity, PrepaidTravelCoachMarkActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(prepaidTravelGettingStartedActivity, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(prepaidTravelGettingStartedActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            prepaidTravelGettingStartedActivity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
