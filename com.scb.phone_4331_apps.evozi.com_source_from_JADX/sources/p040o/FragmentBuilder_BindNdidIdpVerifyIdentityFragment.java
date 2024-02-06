package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p040o.ImmutableAsList;

/* renamed from: o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment */
public final class FragmentBuilder_BindNdidIdpVerifyIdentityFragment implements FragmentBuilder_BindNdidSelectIdpFragment {
    private final FragmentBuilder_BindHmlOperatingBankFragment IconCompatParcelizer;
    private final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment$write */
    public static final class write extends TypeToken<List<? extends ClientCredentials>> {
    }

    public FragmentBuilder_BindNdidIdpVerifyIdentityFragment(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlNtbOutcomeRejectFragment, "siteKey");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlOperatingBankFragment, "thinstance");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOperatingBankFragment;
    }

    public final Object IconCompatParcelizer(Context context) {
        Object obj;
        SharedPreferences sharedPreferences = context.getSharedPreferences("thunderhead", 0);
        if (sharedPreferences.contains("one-password-preference") || sharedPreferences.contains("one-username-preference")) {
            Object obj2 = null;
            String string = sharedPreferences.getString("one-username-preference", (String) null);
            String string2 = sharedPreferences.getString("one-password-preference", (String) null);
            if (!(string == null || string2 == null)) {
                boolean z = true;
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_4_CREDENTIALS_FOUND, string, string2);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("thunderhead", 0);
                setRootView MediaBrowserCompat$MediaItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$MediaItem();
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$MediaItem, "OneInternalProvider.getAuthHashUtil()");
                ClientCredentials clientCredentials = new ClientCredentials(string, string2, this.MediaBrowserCompat$CustomActionResultReceiver.read, this.IconCompatParcelizer.write.toString());
                clientCredentials.tryEncryptingUsername(MediaBrowserCompat$MediaItem);
                onGetStartedClick.IconCompatParcelizer((Object) sharedPreferences2, "version5Preferences");
                try {
                    obj = onClearClick.IconCompatParcelizer.fromJson(sharedPreferences2.getString("one-credentials-list-preference", (String) null), new write().getType());
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    obj = null;
                }
                List list = (List) obj;
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    list = Collections.singletonList(clientCredentials);
                    onGetStartedClick.IconCompatParcelizer((Object) list, "java.util.Collections.singletonList(element)");
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ClientCredentials) next).hasSiteKeyAndHost(clientCredentials)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        z = false;
                    }
                    if (!z) {
                        list = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(collection, clientCredentials);
                    }
                }
                try {
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.putString("one-credentials-list-preference", onClearClick.IconCompatParcelizer.toJson((Object) list));
                    edit.commit();
                } catch (Exception e2) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e2);
                    HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_4_CREDENTIALS_MIGRATED, new Object[0]);
            }
            sharedPreferences.edit().remove("one-password-preference").remove("one-username-preference").commit();
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_4_CREDENTIALS_REMOVED, new Object[0]);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements FragmentBuilder_BindCloseAccountSelectionOwnFragment {
        private SharedPreferences MediaBrowserCompat$ItemReceiver;
        private final readObjectNoData$MediaBrowserCompat$ItemReceiver read;
        private final keys write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(SharedPreferences sharedPreferences, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver, keys keys) {
            this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
            this.read = readobjectnodata_mediabrowsercompat_itemreceiver;
            this.write = keys;
        }

        public final DebitCardResetOtpActivity<zzum> write() {
            String string = this.MediaBrowserCompat$ItemReceiver.getString("randomDeviceId", UUID.randomUUID().toString());
            String string2 = this.MediaBrowserCompat$ItemReceiver.getString("com.scb.phone.pref.key.PHONE_NUMBER", (String) null);
            boolean z = this.read.IconCompatParcelizer.getBoolean("com.scb.phone.pref.key.ROOTED", false);
            int i = this.MediaBrowserCompat$ItemReceiver.getInt("environmentForDev", 0);
            boolean z2 = this.MediaBrowserCompat$ItemReceiver.getBoolean("ENVIRONMENT_SELECTOR", false);
            zzum zzum = new zzum();
            zzum.write = string;
            zzum.read = string2;
            zzum.MediaBrowserCompat$CustomActionResultReceiver = i;
            zzum.MediaBrowserCompat$ItemReceiver = z;
            zzum.MediaDescriptionCompat = z2;
            return DebitCardResetOtpActivity.just(zzum);
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.getBoolean("SHOW_INPUT_DIALOG", false);
        }

        public final DebitCardResetOtpActivity<Boolean> write(ImmutableAsList.SerializedForm serializedForm) {
            int i;
            SharedPreferences.Editor putString = this.MediaBrowserCompat$ItemReceiver.edit().putString("randomDeviceId", serializedForm.IconCompatParcelizer).putString("deviceModel", serializedForm.read);
            if (serializedForm.MediaBrowserCompat$MediaItem >= 0) {
                i = serializedForm.MediaBrowserCompat$MediaItem;
            } else {
                i = 0;
            }
            putString.putInt("environmentForDev", i).putString("com.scb.phone.pref.key.PHONE_NUMBER", serializedForm.MediaBrowserCompat$SearchResultReceiver).putString("BASE_URL", serializedForm.write).putString("BASE_ASSETS_URL", serializedForm.MediaBrowserCompat$ItemReceiver).putString("BASE_STATIC_URL", serializedForm.MediaBrowserCompat$CustomActionResultReceiver).putString("BASE_STATIC_URL", serializedForm.MediaBrowserCompat$CustomActionResultReceiver).apply();
            readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver = this.read;
            readobjectnodata_mediabrowsercompat_itemreceiver.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.ROOTED", serializedForm.RatingCompat).apply();
            this.write.read(serializedForm.MediaDescriptionCompat);
            return DebitCardResetOtpActivity.just(Boolean.TRUE);
        }

        public final void write(boolean z) {
            this.MediaBrowserCompat$ItemReceiver.edit().putBoolean("SHOW_INPUT_DIALOG", false).apply();
        }
    }
}
