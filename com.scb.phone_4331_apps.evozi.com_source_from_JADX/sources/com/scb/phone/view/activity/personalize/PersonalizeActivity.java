package com.scb.phone.view.activity.personalize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.personalize.PersonalizeFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class PersonalizeActivity extends BaseActivity {
    public static void write(Context context, long j) {
        Intent intent = new Intent(context, PersonalizeActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_PARENT_ID", j);
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

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79252131493150);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_container, PersonalizeFragment.read(getIntent().getLongExtra("com.scb.phone.EXTRA_PARENT_ID", 0)), getString(R.string.landing_page_personalize));
        read.write();
        super.setStackedBackground();
        setTitle(R.string.landing_page_personalize);
        setTabContainer();
        mo13676d_("lifestyle_tilesetup");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.landing_page_personalize);
        setTabContainer();
    }
}
