package com.scb.phone.view.activity.remittance;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.remittance.RemittanceFaqActivity;
import com.scb.phone.view.fragment.remittance.RemittanceInputFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C5000nE;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class RemittanceInputActivity extends BaseActivityWithFragment {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, C3092xce3d994b.Builder builder, C3088x7e3e3ebd.C30891 r2) {
        return read.IconCompatParcelizer(context, builder, r2);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent IconCompatParcelizer(Context context, C3092xce3d994b.Builder builder, C3088x7e3e3ebd.C30891 r4) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) builder, "state");
            Intent intent = new Intent(context, RemittanceInputActivity.class);
            onGetStartedClick.IconCompatParcelizer((Object) intent.putExtra("STATE", builder.ordinal()), "putExtra(key, value?.ordinal ?: -1)");
            intent.putExtra("INPUT_DISPLAY", r4);
            return intent;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Enum enumR = C3092xce3d994b.Builder.NORMAL;
        int intExtra = intent.getIntExtra("STATE", -1);
        if (intExtra >= 0) {
            enumR = C3092xce3d994b.Builder.values()[intExtra];
        }
        RemittanceInputFragment.read read2 = RemittanceInputFragment.IconCompatParcelizer;
        return RemittanceInputFragment.read.IconCompatParcelizer((C3092xce3d994b.Builder) enumR, (C3088x7e3e3ebd.C30891) getIntent().getParcelableExtra("INPUT_DISPLAY"));
    }

    public final String au_() {
        String string = getString(R.string.remittance_input_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remittance_input_title)");
        return string;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f93042131558408, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 16908332) {
            onBackPressed();
            return true;
        } else if (valueOf == null || valueOf.intValue() != R.id.menu_faq) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            RemittanceFaqActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceFaqActivity.MediaDescriptionCompat;
            Context context = this;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, RemittanceFaqActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        }
    }

    public final void onDestroy() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof RemittanceInputFragment) {
            C5000nE nEVar = ((RemittanceInputFragment) findFragmentById).presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nEVar.MediaMetadataCompat.write.IconCompatParcelizer();
            nEVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
        super.onDestroy();
    }
}
