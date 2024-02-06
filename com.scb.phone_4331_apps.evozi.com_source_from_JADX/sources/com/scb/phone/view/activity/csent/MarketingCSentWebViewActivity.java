package com.scb.phone.view.activity.csent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.MalformedJsonException;
import android.view.MenuItem;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchActivity;
import com.scb.phone.view.activity.hml.HmlNTBExternalAuthenticationActivity;
import com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.theme.ThemesActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import org.json.JSONException;
import p040o.DependencyException;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ReflectionAccessor;
import p040o.getEventLogSize;
import p040o.isSet;
import p040o.onGetStartedClick;
import p040o.proxyGetIExceptionResponseDeserializerOnDevice;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class MarketingCSentWebViewActivity extends SCBUniversalWebViewActivity implements proxyGetIExceptionResponseDeserializerOnDevice {
    @HmlPinActivity
    public ReflectionAccessor generalCSentPresenter;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, LogFileManager.DirectoryProvider directoryProvider) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) directoryProvider, "display");
        Intent intent = new Intent(context, MarketingCSentWebViewActivity.class);
        intent.putExtra(ImagesContract.URL, directoryProvider.IconCompatParcelizer);
        intent.putExtra("com.scb.phone.EXTRA_PRELOAD_CHECK", directoryProvider);
        intent.putExtra(MessageBundle.TITLE_ENTRY, "");
        return intent;
    }

    public static final class IconCompatParcelizer {
        public final DeejungTermsAndConditionsActivity.IconCompatParcelizer IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final HmlNTBExternalAuthenticationActivity.read MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final int MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$QueueItem;
        public final List<MwPinShopLocationActivity.IconCompatParcelizer> ParcelableVolumeInfo;
        public final String RatingCompat;
        public final String read;
        public final RewardSearchActivity.write write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(String str, int i, String str2, String str3, String str4, String str5, RewardSearchActivity.write write2, HmlNTBExternalAuthenticationActivity.read read2, List<MwPinShopLocationActivity.IconCompatParcelizer> list, String str6, DeejungTermsAndConditionsActivity.IconCompatParcelizer iconCompatParcelizer, String str7) {
            onGetStartedClick.write((Object) str, "function");
            this.read = str;
            this.MediaDescriptionCompat = i;
            this.MediaSessionCompat$QueueItem = str2;
            this.MediaMetadataCompat = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.write = write2;
            this.MediaBrowserCompat$MediaItem = read2;
            this.ParcelableVolumeInfo = list;
            this.MediaBrowserCompat$ItemReceiver = str6;
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.RatingCompat = str7;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReflectionAccessor reflectionAccessor = this.generalCSentPresenter;
        if (reflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
        }
        reflectionAccessor.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        LogFileManager.DirectoryProvider directoryProvider = extras != null ? (LogFileManager.DirectoryProvider) extras.getParcelable("com.scb.phone.EXTRA_PRELOAD_CHECK") : null;
        ReflectionAccessor reflectionAccessor2 = this.generalCSentPresenter;
        if (reflectionAccessor2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
        }
        if (directoryProvider != null) {
            reflectionAccessor2.MediaBrowserCompat$ItemReceiver = directoryProvider;
        }
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize != null) {
            geteventlogsize.f2831x50fd9e4a = directoryProvider;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "bridgeKey");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        int hashCode = str.hashCode();
        boolean z = true;
        if (hashCode != -2027027273) {
            if (hashCode == -975175927 && str.equals("onGeneralCSentSubmitted")) {
                ReflectionAccessor reflectionAccessor = this.generalCSentPresenter;
                if (reflectionAccessor == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
                }
                if (str2 != null) {
                    try {
                        if (((DependencyException) new Gson().fromJson(str2, DependencyException.class)).MediaBrowserCompat$CustomActionResultReceiver != null) {
                            writeUInt64NoTag.IconCompatParcelizer read = new ReflectionAccessor.read(reflectionAccessor);
                            if (reflectionAccessor.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                read.IconCompatParcelizer(reflectionAccessor.RatingCompat);
                                return;
                            }
                            return;
                        }
                        reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                    } catch (NullPointerException unused) {
                        reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                    } catch (JsonParseException unused2) {
                        reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                    } catch (JSONException unused3) {
                        reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                    } catch (MalformedJsonException unused4) {
                        reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                    }
                } else {
                    reflectionAccessor.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor));
                }
            }
        } else if (str.equals("onGeneralCSentLoaded")) {
            ReflectionAccessor reflectionAccessor2 = this.generalCSentPresenter;
            if (reflectionAccessor2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
            }
            if (str2 != null) {
                try {
                    isSet isset = ((DependencyException) new Gson().fromJson(str2, DependencyException.class)).MediaBrowserCompat$CustomActionResultReceiver;
                    if (isset == null) {
                        reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
                    } else if (!isset.MediaBrowserCompat$ItemReceiver) {
                        writeUInt64NoTag.IconCompatParcelizer read2 = new ReflectionAccessor.read(reflectionAccessor2);
                        if (reflectionAccessor2.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            read2.IconCompatParcelizer(reflectionAccessor2.RatingCompat);
                        }
                    }
                } catch (NullPointerException unused5) {
                    reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
                } catch (JsonParseException unused6) {
                    reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
                } catch (JSONException unused7) {
                    reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
                } catch (MalformedJsonException unused8) {
                    reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
                }
            } else {
                reflectionAccessor2.read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new ReflectionAccessor.write(reflectionAccessor2));
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        ReflectionAccessor reflectionAccessor = this.generalCSentPresenter;
        if (reflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new ReflectionAccessor.read(reflectionAccessor);
        if (reflectionAccessor.RatingCompat != null) {
            read.IconCompatParcelizer(reflectionAccessor.RatingCompat);
        }
        return true;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15004x50fd9e4a() {
        ReflectionAccessor reflectionAccessor = this.generalCSentPresenter;
        if (reflectionAccessor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("generalCSentPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new ReflectionAccessor.read(reflectionAccessor);
        if (reflectionAccessor.RatingCompat != null) {
            read.IconCompatParcelizer(reflectionAccessor.RatingCompat);
        }
    }

    public final void write(LogFileManager.DirectoryProvider directoryProvider) {
        onGetStartedClick.write((Object) directoryProvider, "display");
        getEventLogSize geteventlogsize = this.ParcelableVolumeInfo;
        if (geteventlogsize == null || !geteventlogsize.read()) {
            HomeActivity.read((Context) this, directoryProvider);
            return;
        }
        Intent MediaBrowserCompat$CustomActionResultReceiver = ThemesActivity.MediaBrowserCompat$CustomActionResultReceiver(this, directoryProvider);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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
    }
}
