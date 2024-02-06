package com.scb.phone.view.activity.ntb.ekyc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.bouncycastle.i18n.MessageBundle;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.setTapText;

public class NationalIdHelpActivity extends BaseActivity {
    private blend MediaDescriptionCompat = new blend();
    private String MediaMetadataCompat;

    /* access modifiers changed from: protected */
    public String MediaSessionCompat$Token() {
        return "open_account";
    }

    public static void write(Context context, String str) {
        Intent intent = new Intent(context, NationalIdHelpActivity.class);
        intent.putExtra(MessageBundle.TITLE_ENTRY, str);
        intent.putExtra("content", R.layout.f85362131493763);
        intent.addFlags(268435456);
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
        super.onCreate(bundle);
        this.MediaMetadataCompat = getIntent().getStringExtra(MessageBundle.TITLE_ENTRY);
        int intExtra = getIntent().getIntExtra("content", 0);
        setContentView(R.layout.f76772131492902);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        View.inflate(this, intExtra, (ViewGroup) findViewById(R.id.content_layout));
        setStackedBackground();
        this.MediaDescriptionCompat.read("feature", MediaSessionCompat$Token());
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ekyc_laseridsample");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(this.MediaMetadataCompat);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }
}
