package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Set;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setServerTimeout;
import p040o.setTapText;

public class ExternalDeepLinkActivity extends BaseDeepLinkActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        Uri uri = null;
        try {
            Uri parse = Uri.parse(intent.getExtras() != null ? intent.getExtras().getString(ImagesContract.URL, "") : null);
            String D_ = mo3026D_();
            if (parse != null) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null) {
                    queryParameterNames = HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                if (queryParameterNames.contains("lang")) {
                    if (buildUpon != null) {
                        buildUpon.clearQuery();
                    } else {
                        buildUpon = null;
                    }
                    for (String next : queryParameterNames) {
                        if (buildUpon != null) {
                            buildUpon.appendQueryParameter(next, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next, (Object) "lang") ? D_ : parse.getQueryParameter(next));
                        }
                    }
                } else if (buildUpon != null) {
                    buildUpon.appendQueryParameter("lang", D_);
                }
                if (buildUpon != null) {
                    uri = buildUpon.build();
                }
            }
            Intent data = new Intent("android.intent.action.VIEW").setData(uri);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, data).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            finish();
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
            String string = IconCompatParcelizer.read.getString(R.string.common_error);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer.read.getString(R.string.error_generic_resource);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), new setServerTimeout(this));
            IconCompatParcelizer2.setCancelable(false);
            IconCompatParcelizer2.show();
        }
    }
}
