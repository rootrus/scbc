package com.scb.phone.view.activity.csent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.MalformedJsonException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.scb.phone.R;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import org.bouncycastle.i18n.MessageBundle;
import org.json.JSONException;
import p040o.DependencyException;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.isSet;
import p040o.onGetStartedClick;
import p040o.parseInt;
import p040o.writeUInt64NoTag;

public final class PrivacyCSentWebViewActivity extends SCBUniversalWebViewActivity implements IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    @HmlPinActivity
    public parseInt privacyPresenter;

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        return write.read(context, str);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent read(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "callbackUrl");
            Intent intent = new Intent(context, PrivacyCSentWebViewActivity.class);
            intent.putExtra(ImagesContract.URL, str);
            intent.putExtra(MessageBundle.TITLE_ENTRY, context.getString(R.string.auto_privacy_notice_title));
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        parseInt parseint = this.privacyPresenter;
        if (parseint == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("privacyPresenter");
        }
        parseint.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "bridgeKey");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "onPrivacyNoticeCSentLoaded")) {
            parseInt parseint = this.privacyPresenter;
            if (parseint == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("privacyPresenter");
            }
            onGetStartedClick.write((Object) str2, "data");
            try {
                isSet isset = ((DependencyException) new Gson().fromJson(str2, DependencyException.class)).MediaBrowserCompat$CustomActionResultReceiver;
                if (isset != null) {
                    writeUInt64NoTag.IconCompatParcelizer read = new parseInt.read(isset);
                    if (parseint.RatingCompat != null) {
                        read.IconCompatParcelizer(parseint.RatingCompat);
                        return;
                    }
                    return;
                }
                parseint.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new parseInt.IconCompatParcelizer(parseint));
            } catch (NullPointerException unused) {
                parseint.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new parseInt.IconCompatParcelizer(parseint));
            } catch (JsonParseException unused2) {
                parseint.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new parseInt.IconCompatParcelizer(parseint));
            } catch (JSONException unused3) {
                parseint.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new parseInt.IconCompatParcelizer(parseint));
            } catch (MalformedJsonException unused4) {
                parseint.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new parseInt.IconCompatParcelizer(parseint));
            }
        }
    }

    public final void read() {
        mo13676d_("privacy_notice_content");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        finish();
    }
}
