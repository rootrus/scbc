package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.FragmentBuilder_BindECouponBarCodeFragment */
public final class FragmentBuilder_BindECouponBarCodeFragment extends FragmentBuilder_BindEasycashLoanFeaturesAccountFragment {
    public FragmentBuilder_BindECouponBarCodeFragment(Context context, String str, String str2) {
        super(context, str, Settings.Secure.getString(context.getContentResolver(), "android_id"), str2);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) this, "androidIdSharedPreferences");
        onGetStartedClick.write((Object) str2, "fileName");
        FragmentBuilder_BindEBillSubscriptionDetailFragment fragmentBuilder_BindEBillSubscriptionDetailFragment = new FragmentBuilder_BindEBillSubscriptionDetailFragment();
        fragmentBuilder_BindEBillSubscriptionDetailFragment.read = context;
        fragmentBuilder_BindEBillSubscriptionDetailFragment.IconCompatParcelizer = this;
        fragmentBuilder_BindEBillSubscriptionDetailFragment.MediaBrowserCompat$ItemReceiver = str2;
        SharedPreferences sharedPreferences = fragmentBuilder_BindEBillSubscriptionDetailFragment.IconCompatParcelizer;
        if (sharedPreferences == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAndroidIdSharedPreferences");
        }
        if (sharedPreferences.getString("LAST_MIGRATED_VERSION", (String) null) == null) {
            Context context2 = fragmentBuilder_BindEBillSubscriptionDetailFragment.read;
            if (context2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContext");
            }
            String str3 = fragmentBuilder_BindEBillSubscriptionDetailFragment.MediaBrowserCompat$ItemReceiver;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFileName");
            }
            FragmentBuilder_BindEasycashLoanFeaturesAccountFragment fragmentBuilder_BindEasycashLoanFeaturesAccountFragment = new FragmentBuilder_BindEasycashLoanFeaturesAccountFragment(context2, "", str3);
            SharedPreferences sharedPreferences2 = fragmentBuilder_BindEBillSubscriptionDetailFragment.IconCompatParcelizer;
            if (sharedPreferences2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAndroidIdSharedPreferences");
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            if (fragmentBuilder_BindEasycashLoanFeaturesAccountFragment.getAll().isEmpty()) {
                edit.putString("LAST_MIGRATED_VERSION", FragmentBuilder_BindEBillSubscriptionDetailFragment.write()).commit();
                return;
            }
            Map linkedHashMap = new LinkedHashMap();
            for (FragmentBuilder_BindDirectDebitInputBillerListFragment fragmentBuilder_BindDirectDebitInputBillerListFragment : FragmentBuilder_BindDirectDebitInputBillerListFragment.values()) {
                String MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindEasycashLoanFeaturesAccountFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindDirectDebitInputBillerListFragment.value);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "hashedValue");
                linkedHashMap.put(MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindDirectDebitInputBillerListFragment.value);
            }
            FragmentBuilder_BindDialogDialogQuickBalanceFragment[] values = FragmentBuilder_BindDialogDialogQuickBalanceFragment.values();
            Collection arrayList = new ArrayList(values.length);
            for (FragmentBuilder_BindDialogDialogQuickBalanceFragment fragmentBuilder_BindDialogDialogQuickBalanceFragment : values) {
                arrayList.add(fragmentBuilder_BindDialogDialogQuickBalanceFragment.value);
            }
            List list = (List) arrayList;
            Map<String, String> all = fragmentBuilder_BindEasycashLoanFeaturesAccountFragment.getAll();
            onGetStartedClick.IconCompatParcelizer((Object) all, "oldSharedPreferences.all");
            for (Map.Entry next : all.entrySet()) {
                String str4 = (String) linkedHashMap.get(next.getKey());
                if (str4 != null) {
                    if (list.contains(str4)) {
                        Set<String> stringSet = fragmentBuilder_BindEasycashLoanFeaturesAccountFragment.getStringSet(str4, (Set<String>) null);
                        if (stringSet != null) {
                            onGetStartedClick.IconCompatParcelizer((Object) stringSet, "existingSet");
                            Iterable iterable = stringSet;
                            onGetStartedClick.write((Object) iterable, "$this$filterNotNull");
                            edit.putStringSet(str4, HmlNTBBusinessURLInformationActivity.write((List) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(iterable, new ArrayList())));
                        }
                    } else {
                        edit.putString(str4, (String) next.getValue());
                    }
                }
            }
            edit.putString("LAST_MIGRATED_VERSION", FragmentBuilder_BindEBillSubscriptionDetailFragment.write());
            edit.commit();
        }
    }

    public final String getString(String str, String str2) {
        try {
            return super.getString(str, str2);
        } catch (ClassCastException unused) {
            return str2;
        }
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        try {
            return super.getStringSet(str, set);
        } catch (ClassCastException unused) {
            return set;
        }
    }

    public final int getInt(String str, int i) {
        try {
            return super.getInt(str, i);
        } catch (ClassCastException unused) {
            return i;
        }
    }

    public final long getLong(String str, long j) {
        try {
            return super.getLong(str, j);
        } catch (ClassCastException unused) {
            return j;
        }
    }

    public final float getFloat(String str, float f) {
        try {
            return super.getFloat(str, f);
        } catch (ClassCastException unused) {
            return f;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            return super.getBoolean(str, z);
        } catch (ClassCastException unused) {
            return z;
        }
    }
}
