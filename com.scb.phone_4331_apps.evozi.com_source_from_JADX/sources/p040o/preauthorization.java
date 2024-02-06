package p040o;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.kofax.kmc.kut.utilities.Licensing;
import java.text.BreakIterator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.TypeCastException;
import p040o.zzmd;

/* renamed from: o.preauthorization */
public final class preauthorization implements TransformationMethod {
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) charSequence, "sourceText");
        onGetStartedClick.write((Object) rect, "previouslyFocusedRect");
    }

    /* renamed from: o.preauthorization$read */
    public static final class read implements getFrontException {
        public final SharedPreferences IconCompatParcelizer;
        private final zaad MediaBrowserCompat$CustomActionResultReceiver;
        public final ScriptIntrinsicLUT MediaBrowserCompat$ItemReceiver;
        private final getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver read;

        private read() {
        }

        @HmlPinActivity
        public read(getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver getenvcarrier_mediabrowsercompat_customactionresultreceiver, zaad zaad, ScriptIntrinsicLUT scriptIntrinsicLUT, SharedPreferences sharedPreferences) {
            this.read = getenvcarrier_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = zaad;
            this.MediaBrowserCompat$ItemReceiver = scriptIntrinsicLUT;
            this.IconCompatParcelizer = sharedPreferences;
        }

        public final void IconCompatParcelizer(String str) {
            if (str != null && !TextUtils.isEmpty(str)) {
                SharedPreferences.Editor edit = this.IconCompatParcelizer.edit();
                Set<String> stringSet = this.IconCompatParcelizer.getStringSet("SUMMARY_ADS_ID_KEY", new HashSet());
                stringSet.add(str);
                edit.putStringSet("SUMMARY_ADS_ID_KEY", stringSet).apply();
            }
        }

        public final Set<String> MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer.getStringSet("ADS_ID_KEY", new HashSet());
        }

        public final DebitCardResetOtpActivity<zzwi> MediaBrowserCompat$CustomActionResultReceiver(String str) {
            if (MediaBrowserCompat$ItemReceiver()) {
                getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver getenvcarrier_mediabrowsercompat_customactionresultreceiver = this.read;
                OnItemLongClick onItemLongClick = new OnItemLongClick("42", str, this.IconCompatParcelizer.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode));
                zabr.IconCompatParcelizer(PlaceAutocompleteFragment.SYSTEM_MAINTENANCE.code);
                return getenvcarrier_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.getAppConfig(onItemLongClick).map(new getInt(this.MediaBrowserCompat$CustomActionResultReceiver)).doOnNext(new ReflectedParcelable(this));
            }
            zzwi IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            if (IconCompatParcelizer2 == null) {
                IconCompatParcelizer2 = null;
            } else {
                String str2 = IconCompatParcelizer2.MediaSessionCompat$QueueItem;
                if (str2 != null) {
                    Licensing.setMobileSDKLicense(str2);
                }
            }
            return DebitCardResetOtpActivity.just(IconCompatParcelizer2);
        }

        public final zzwi write() {
            zzwi IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            if (IconCompatParcelizer2 == null) {
                return null;
            }
            String str = IconCompatParcelizer2.MediaSessionCompat$QueueItem;
            if (str != null) {
                Licensing.setMobileSDKLicense(str);
            }
            return IconCompatParcelizer2;
        }

        public final boolean IconCompatParcelizer() {
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer().MediaSessionCompat$ResultReceiverWrapper.read;
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer() == null || this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer().MediaMetadataCompat == null) {
                return true;
            }
            if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver() - this.IconCompatParcelizer.getLong("com.scb.phone.PREF_KEY_LAST_RECEIVE_CONFIG_TIME", 0) >= this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer().MediaMetadataCompat.write * 60 * 1000) {
                return true;
            }
            return false;
        }

        public final boolean MediaBrowserCompat$ItemReceiver(String str) {
            return this.IconCompatParcelizer.getStringSet("SUMMARY_ADS_ID_KEY", new HashSet()).contains(str);
        }

        public final boolean read() {
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer().MediaSessionCompat$ResultReceiverWrapper.AppCompatActivity;
        }

        public final void read(String str) {
            if (str != null && !TextUtils.isEmpty(str)) {
                SharedPreferences.Editor edit = this.IconCompatParcelizer.edit();
                Set<String> stringSet = this.IconCompatParcelizer.getStringSet("ADS_ID_KEY", new HashSet());
                stringSet.add(str);
                edit.putStringSet("ADS_ID_KEY", stringSet).apply();
            }
        }

        public final boolean MediaMetadataCompat() {
            return this.MediaBrowserCompat$ItemReceiver.write.edit().putString("com.scb.phone.PREK_KEY_APP_CONFIG", (String) null).commit();
        }
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        StringBuilder sb;
        onGetStartedClick.write((Object) charSequence, "source");
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        if (!(view instanceof TextView)) {
            return charSequence;
        }
        int width = view.getWidth();
        TextView textView = (TextView) view;
        if (width == 0) {
            return charSequence;
        }
        int paddingLeft = textView.getPaddingLeft();
        int paddingRight = textView.getPaddingRight();
        String obj = charSequence.toString();
        float f = (float) (width - (paddingLeft + paddingRight));
        if (textView.getPaint().measureText(obj) > f && !(textView.getText() instanceof SpannableString)) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(new Locale("th"));
            wordInstance.setText(obj);
            onGetStartedClick.IconCompatParcelizer((Object) wordInstance, "boundary");
            List<String> read2 = GoodToKnowActivity.read((CharSequence) MediaBrowserCompat$CustomActionResultReceiver(wordInstance, obj), new String[]{"!split!"}, false, 0);
            int size = read2.size();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (int i = 0; i < size; i++) {
                String obj2 = sb3.toString();
                onGetStartedClick.IconCompatParcelizer((Object) obj2, "testString.toString()");
                onGetStartedClick.write((Object) obj2, "$this$endsWith");
                onGetStartedClick.write((Object) "\n", "suffix");
                if (obj2.endsWith("\n")) {
                    sb3 = new StringBuilder();
                }
                sb3.append(read2.get(i));
                float measureText = textView.getPaint().measureText(sb3.toString());
                if (f > measureText) {
                    sb2.append(read2.get(i));
                } else {
                    if (f == measureText) {
                        sb = new StringBuilder();
                        sb2.append(read2.get(i));
                        String obj3 = sb2.toString();
                        onGetStartedClick.IconCompatParcelizer((Object) obj3, "allString.toString()");
                        onGetStartedClick.write((Object) obj3, "$this$endsWith");
                        onGetStartedClick.write((Object) " ", "suffix");
                        if (!obj3.endsWith(" ")) {
                            String obj4 = sb2.toString();
                            onGetStartedClick.IconCompatParcelizer((Object) obj4, "allString.toString()");
                            onGetStartedClick.write((Object) obj4, "$this$endsWith");
                            onGetStartedClick.write((Object) "\n", "suffix");
                            if (!obj4.endsWith("\n")) {
                                sb2.append("\n");
                            }
                        }
                    } else {
                        String str = read2.get(i);
                        sb = new StringBuilder();
                        sb.append(str);
                        String obj5 = sb2.toString();
                        onGetStartedClick.IconCompatParcelizer((Object) obj5, "allString.toString()");
                        onGetStartedClick.write((Object) obj5, "$this$endsWith");
                        onGetStartedClick.write((Object) " ", "suffix");
                        if (!obj5.endsWith(" ")) {
                            String obj6 = sb2.toString();
                            onGetStartedClick.IconCompatParcelizer((Object) obj6, "allString.toString()");
                            onGetStartedClick.write((Object) obj6, "$this$endsWith");
                            onGetStartedClick.write((Object) "\n", "suffix");
                            if (!obj6.endsWith("\n") && !GoodToKnowActivity.read(str, " ", false) && !GoodToKnowActivity.read(str, "\n", false)) {
                                String obj7 = sb2.toString();
                                onGetStartedClick.IconCompatParcelizer((Object) obj7, "allString.toString()");
                                onGetStartedClick.write((Object) obj7, "$this$endsWith");
                                onGetStartedClick.write((Object) ":", "suffix");
                                if (!obj7.endsWith(":")) {
                                    String obj8 = sb2.toString();
                                    onGetStartedClick.IconCompatParcelizer((Object) obj8, "allString.toString()");
                                    if (obj8.length() > 0) {
                                        sb2.append("\n");
                                    }
                                }
                            }
                        }
                        sb2.append(str);
                    }
                    sb3 = sb;
                }
            }
            obj = sb2.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "allString.toString()");
        }
        return obj;
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(BreakIterator breakIterator, String str) {
        StringBuilder sb = new StringBuilder();
        int first = breakIterator.first();
        int next = breakIterator.next();
        while (true) {
            int i = next;
            int i2 = first;
            first = i;
            if (first != -1) {
                StringBuilder sb2 = new StringBuilder();
                if (str != null) {
                    String substring = str.substring(i2, first);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append("!split!");
                    sb.append(sb2.toString());
                    next = breakIterator.next();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                String obj = sb.toString();
                onGetStartedClick.IconCompatParcelizer((Object) obj, "stringOut.toString()");
                return obj;
            }
        }
    }
}
