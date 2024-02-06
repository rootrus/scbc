package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* renamed from: o.FragmentBuilder_BindEasycashLoanFeaturesAccountFragment */
public class FragmentBuilder_BindEasycashLoanFeaturesAccountFragment implements SharedPreferences {
    private static final String read = FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.class.getName();
    /* access modifiers changed from: private */
    public SharedPreferences IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private C6440x626e8d3 MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindEasycashLoanFeaturesAccountFragment(Context context, String str, String str2) {
        this(context, str, (String) null, str2);
    }

    public FragmentBuilder_BindEasycashLoanFeaturesAccountFragment(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, 10000);
    }

    private FragmentBuilder_BindEasycashLoanFeaturesAccountFragment(Context context, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        SharedPreferences sharedPreferences;
        if (this.IconCompatParcelizer == null) {
            if (TextUtils.isEmpty(str3)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            } else {
                sharedPreferences = context.getSharedPreferences(str3, 0);
            }
            this.IconCompatParcelizer = sharedPreferences;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        if (TextUtils.isEmpty(str)) {
            try {
                String packageName = context.getPackageName();
                if (TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                    str5 = IconCompatParcelizer(context);
                } else {
                    str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                }
                String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(ECouponRedemptionDetailActivity_ViewBinding.write(packageName, str5.getBytes(), 10000).toString());
                String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver2, (String) null);
                if (string == null) {
                    this.MediaBrowserCompat$ItemReceiver = ECouponRedemptionDetailActivity_ViewBinding.write();
                    if (!this.IconCompatParcelizer.edit().putString(MediaBrowserCompat$ItemReceiver2, this.MediaBrowserCompat$ItemReceiver.toString()).commit()) {
                        Log.w(read, "Key not committed to prefs");
                    }
                } else {
                    this.MediaBrowserCompat$ItemReceiver = ECouponRedemptionDetailActivity_ViewBinding.read(string);
                }
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    throw new GeneralSecurityException("Problem generating Key");
                }
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                if (TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver)) {
                    str4 = IconCompatParcelizer(context);
                } else {
                    str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                }
                this.MediaBrowserCompat$ItemReceiver = ECouponRedemptionDetailActivity_ViewBinding.write(str, str4.getBytes(), 10000);
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static String IconCompatParcelizer(Context context) {
        try {
            String str = (String) Build.class.getField("SERIAL").get((Object) null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), "android_id") : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    public static String MediaBrowserCompat$ItemReceiver(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public String IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return ECouponRedemptionDetailActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(str, this.MediaBrowserCompat$ItemReceiver).toString();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    private String write(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return ECouponRedemptionDetailActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(new C6439x870a5304(str), this.MediaBrowserCompat$ItemReceiver);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    public Map<String, String> getAll() {
        Map<String, ?> all = this.IconCompatParcelizer.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry next : all.entrySet()) {
            try {
                Object value = next.getValue();
                if (value != null && !value.equals(this.MediaBrowserCompat$ItemReceiver.toString())) {
                    hashMap.put(next.getKey(), write(value.toString()));
                }
            } catch (Exception unused) {
                hashMap.put(next.getKey(), next.getValue().toString());
            }
        }
        return hashMap;
    }

    public String getString(String str, String str2) {
        String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver(str), (String) null);
        String write = write(string);
        return (string == null || write == null) ? str2 : write;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.IconCompatParcelizer.getStringSet(MediaBrowserCompat$ItemReceiver(str), (Set) null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        for (String write : stringSet) {
            hashSet.add(write(write));
        }
        return hashSet;
    }

    public int getInt(String str, int i) {
        String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver(str), (String) null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(write(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public long getLong(String str, long j) {
        String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver(str), (String) null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(write(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public float getFloat(String str, float f) {
        String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver(str), (String) null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(write(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public boolean getBoolean(String str, boolean z) {
        String string = this.IconCompatParcelizer.getString(MediaBrowserCompat$ItemReceiver(str), (String) null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(write(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public boolean contains(String str) {
        return this.IconCompatParcelizer.contains(MediaBrowserCompat$ItemReceiver(str));
    }

    /* renamed from: o.FragmentBuilder_BindEasycashLoanFeaturesAccountFragment$IconCompatParcelizer */
    public final class IconCompatParcelizer implements SharedPreferences.Editor {
        private SharedPreferences.Editor write;

        /* synthetic */ IconCompatParcelizer(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment fragmentBuilder_BindEasycashLoanFeaturesAccountFragment, byte b) {
            this();
        }

        private IconCompatParcelizer() {
            this.write = FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer.edit();
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.write.putString(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(str2));
            return this;
        }

        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            for (String MediaBrowserCompat$ItemReceiver : set) {
                hashSet.add(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver));
            }
            this.write.putStringSet(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), hashSet);
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            this.write.putString(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(Integer.toString(i)));
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            this.write.putString(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(Long.toString(j)));
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            this.write.putString(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(Float.toString(f)));
            return this;
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.write.putString(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str), FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.this.IconCompatParcelizer(Boolean.toString(z)));
            return this;
        }

        public final SharedPreferences.Editor remove(String str) {
            this.write.remove(FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(str));
            return this;
        }

        public final SharedPreferences.Editor clear() {
            this.write.clear();
            return this;
        }

        public final boolean commit() {
            return this.write.commit();
        }

        public final void apply() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.write.apply();
            } else {
                commit();
            }
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.IconCompatParcelizer.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.IconCompatParcelizer.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public /* synthetic */ SharedPreferences.Editor edit() {
        return new IconCompatParcelizer(this, (byte) 0);
    }
}
