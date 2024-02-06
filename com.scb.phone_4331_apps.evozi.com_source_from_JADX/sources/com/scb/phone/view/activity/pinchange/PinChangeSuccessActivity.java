package com.scb.phone.view.activity.pinchange;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.forEachDstIn;
import p040o.zzmd;

public class PinChangeSuccessActivity extends BaseActivity {
    private forEachDstIn MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    @BindView
    protected TextView message;
    @BindView
    protected TextView title;

    public void onBackPressed() {
    }

    public static Intent read(Context context, String str) {
        Intent intent = new Intent(context, PinChangeSuccessActivity.class);
        intent.putExtra("JURISTIC_MODE_KEY", true);
        intent.putExtra("JURISTIC_DEVICE_STATE_KEY", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79272131493152);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = new forEachDstIn();
        boolean booleanExtra = getIntent().getBooleanExtra("JURISTIC_MODE_KEY", false);
        this.MediaBrowserCompat$SearchResultReceiver = booleanExtra;
        if (booleanExtra) {
            String stringExtra = getIntent().getStringExtra("JURISTIC_DEVICE_STATE_KEY");
            this.title.setText(getString(R.string.juristic_onboarding_success_title));
            this.message.setText(getString(R.string.juristic_onboarding_success_message));
            this.MediaBrowserCompat$MediaItem.read("user_state", forEachDstIn.MediaBrowserCompat$CustomActionResultReceiver(stringExtra));
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_success");
        }
    }

    @OnClick
    public void onOkClick() {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            write(zzmd.zzm.zzb.zza.JURISTIC);
        }
        MediaSessionCompat$Token(true);
    }
}
