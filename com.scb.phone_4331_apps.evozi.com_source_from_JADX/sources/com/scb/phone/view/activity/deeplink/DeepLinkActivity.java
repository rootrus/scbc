package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import p040o.C7248ma;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;
import p040o.startJobService;
import p040o.submitDocument;
import p040o.zzmd;

public class DeepLinkActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77332131492958);
        if (new C7248ma(new zzmd.zza.C10771zza()).dispatchFrom(this).isSuccessful()) {
            finish();
        } else if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            read(new startJobService(this));
        } else {
            read(new submitDocument(this));
        }
    }

    public static final /* synthetic */ void read(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((DeepLinkActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void read(DialogInterface.OnClickListener onClickListener) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.error_default_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.error_update_latest_version);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        IconCompatParcelizer.setCancelable(false);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), onClickListener);
        IconCompatParcelizer2.mTitleTextView.setTypeface(Typeface.createFromAsset(IconCompatParcelizer2.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        IconCompatParcelizer2.mTextTextView.setTypeface(Typeface.createFromAsset(IconCompatParcelizer2.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        IconCompatParcelizer2.mPositiveButton.setTypeface(Typeface.createFromAsset(IconCompatParcelizer2.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        IconCompatParcelizer2.show();
    }
}
