package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.akexorcist.localizationactivity.BlankDummyActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import java.net.URI;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;

@Deprecated
/* renamed from: o.setOnCloseListener */
public class setOnCloseListener implements Runnable, PurchaseReviewActivity, Serializable, RegistrationNoDataActivity, RegistrationSuccessActivity {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$format$SignStyle;
    public String IconCompatParcelizer;
    public final Activity MediaBrowserCompat$CustomActionResultReceiver;
    public final List<CheckExtractActivity_MembersInjector> read;
    public boolean write;

    /* renamed from: o.setOnCloseListener$read */
    public interface read<T> {
        boolean MediaBrowserCompat$CustomActionResultReceiver(T t);

        T read();
    }

    public Principal MediaBrowserCompat$ItemReceiver() {
        return null;
    }

    public String write() {
        return null;
    }

    /* renamed from: o.setOnCloseListener$write */
    public static class write<T> extends setOnCloseListener$MediaBrowserCompat$CustomActionResultReceiver<T> {
        private final Object write = new Object();

        public write(int i) {
            super(i);
        }

        public final T read() {
            T read;
            synchronized (this.write) {
                read = super.read();
            }
            return read;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(T t) {
            boolean MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (this.write) {
                MediaBrowserCompat$CustomActionResultReceiver = super.MediaBrowserCompat$CustomActionResultReceiver(t);
            }
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public setOnCloseListener() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    static {
        /*
            o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding[] r0 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$format$SignStyle = r0
            o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r1 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x001d }
            o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r1 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r1 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$format$SignStyle     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r1 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setOnCloseListener.<clinit>():void");
    }

    public setOnCloseListener(Activity activity) {
        this.write = false;
        this.IconCompatParcelizer = onGetLayoutInflater.read();
        this.read = new ArrayList();
        this.MediaBrowserCompat$CustomActionResultReceiver = activity;
    }

    private static /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((Activity) context).startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null && !str.trim().isEmpty() && !str.equals(onGetLayoutInflater.IconCompatParcelizer())) {
            onGetLayoutInflater.write(this.MediaBrowserCompat$CustomActionResultReceiver, str);
            Iterator<CheckExtractActivity_MembersInjector> it = this.read.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.getIntent().putExtra("activity_locale_changed", true);
            Activity activity = this.MediaBrowserCompat$CustomActionResultReceiver;
            Intent intent = new Intent(this.MediaBrowserCompat$CustomActionResultReceiver, BlankDummyActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            IconCompatParcelizer(activity, intent);
            this.MediaBrowserCompat$CustomActionResultReceiver.recreate();
        }
    }

    public void read(Locale locale) {
        MediaBrowserCompat$CustomActionResultReceiver(locale.getLanguage());
    }

    public void run() {
        if (!this.IconCompatParcelizer.equals(onGetLayoutInflater.IconCompatParcelizer())) {
            Iterator<CheckExtractActivity_MembersInjector> it = this.read.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.write = true;
            Activity activity = this.MediaBrowserCompat$CustomActionResultReceiver;
            Intent intent = new Intent(this.MediaBrowserCompat$CustomActionResultReceiver, BlankDummyActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            IconCompatParcelizer(activity, intent);
            this.MediaBrowserCompat$CustomActionResultReceiver.recreate();
        }
        if (this.write) {
            for (CheckExtractActivity_MembersInjector z_ : this.read) {
                z_.mo3031z_();
            }
            this.write = false;
        }
        for (CheckExtractActivity_MembersInjector F_ : this.read) {
            F_.mo3027F_();
        }
    }

    public void write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ManagePromptpayLandingActivity managePromptpayLandingActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        RegistrationCountrySearchActivity_ViewBinding registrationCountrySearchActivity_ViewBinding = (RegistrationCountrySearchActivity_ViewBinding) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.auth.auth-cache");
        if (registrationCountrySearchActivity_ViewBinding != null) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = null;
            if (prepaidTravelCoachMarkActivity_ViewBinding.IconCompatParcelizer()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removing from cache '");
                sb.append(managePromptpayLandingActivity.read());
                sb.append("' auth scheme for ");
                sb.append(privacyManagementLandingViewHolder);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            registrationCountrySearchActivity_ViewBinding.IconCompatParcelizer(privacyManagementLandingViewHolder);
        }
    }

    public void IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ManagePromptpayLandingActivity managePromptpayLandingActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        boolean z;
        RegistrationCountrySearchActivity_ViewBinding registrationCountrySearchActivity_ViewBinding = (RegistrationCountrySearchActivity_ViewBinding) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.auth.auth-cache");
        if (managePromptpayLandingActivity == null || !managePromptpayLandingActivity.MediaBrowserCompat$CustomActionResultReceiver()) {
            z = false;
        } else {
            z = managePromptpayLandingActivity.read().equalsIgnoreCase("Basic");
        }
        if (z) {
            if (registrationCountrySearchActivity_ViewBinding == null) {
                registrationCountrySearchActivity_ViewBinding = new CardlessAtmInfoActivity();
                creditCardBilledDetailAdapter$ParentViewHolder.write("http.auth.auth-cache", registrationCountrySearchActivity_ViewBinding);
            }
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = null;
            if (prepaidTravelCoachMarkActivity_ViewBinding.IconCompatParcelizer()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Caching '");
                sb.append(managePromptpayLandingActivity.read());
                sb.append("' auth scheme for ");
                sb.append(privacyManagementLandingViewHolder);
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            registrationCountrySearchActivity_ViewBinding.IconCompatParcelizer(privacyManagementLandingViewHolder, managePromptpayLandingActivity);
        }
    }

    public Map<String, PrepaidRequestMarketConductActivity> write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws MalformedChallengeException {
        Keep.read read2 = null;
        return read2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public boolean IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        Keep.read read2 = null;
        return read2.IconCompatParcelizer();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [o.PrepaidTravelCoachMarkActivity_ViewBinding, o.Keep$read] */
    public Queue<VerifyIdentityTipsActivity> read(Map<String, PrepaidRequestMarketConductActivity> map, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws MalformedChallengeException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(map, "Map of auth challenges");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        LinkedList linkedList = new LinkedList();
        RegistrationDeadCardActivity registrationDeadCardActivity = (RegistrationDeadCardActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.auth.credentials-provider");
        ? r0 = 0;
        if (registrationDeadCardActivity == null) {
            r0.write("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            ManagePromptpayLandingActivity write2 = r0.write();
            write2.MediaBrowserCompat$CustomActionResultReceiver(map.get(write2.read().toLowerCase(Locale.ROOT)));
            PurchaseReviewActivity IconCompatParcelizer2 = registrationDeadCardActivity.IconCompatParcelizer(new PromptPayTermsAndConditionsActivity(privacyManagementLandingViewHolder.write, privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver, write2.IconCompatParcelizer(), write2.read()));
            if (IconCompatParcelizer2 != null) {
                linkedList.add(new VerifyIdentityTipsActivity(write2, IconCompatParcelizer2));
            }
            return linkedList;
        } catch (AuthenticationException e) {
            if (r0.MediaBrowserCompat$CustomActionResultReceiver()) {
                r0.MediaBrowserCompat$ItemReceiver(e.getMessage(), e);
            }
            return linkedList;
        }
    }

    public RemittanceCoachmarkActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws ProtocolException {
        Keep.read read2 = null;
        URI MediaBrowserCompat$SearchResultReceiver = read2.MediaBrowserCompat$SearchResultReceiver();
        if (privacyConsentActivity.MediaBrowserCompat$MediaItem().MediaBrowserCompat$ItemReceiver().equalsIgnoreCase("HEAD")) {
            return new PreregistrationPinActivity(MediaBrowserCompat$SearchResultReceiver);
        }
        return new PreregistrationOtpActivity(MediaBrowserCompat$SearchResultReceiver);
    }

    public boolean MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) throws ProtocolException {
        Keep.read read2 = null;
        return read2.MediaMetadataCompat();
    }
}
