package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;

/* renamed from: o.TransferGiftingInputActivity */
public final class TransferGiftingInputActivity implements RegistrationNewPinActivity {
    private final Set<Class<? extends IOException>> IconCompatParcelizer;
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final int read;

    static {
        new TransferGiftingInputActivity();
    }

    private TransferGiftingInputActivity(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.read = 3;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = new HashSet();
        for (Class<? extends IOException> add : collection) {
            this.IconCompatParcelizer.add(add);
        }
    }

    private TransferGiftingInputActivity(byte b) {
        this(3, false, Arrays.asList(new Class[]{InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class}));
    }

    public TransferGiftingInputActivity() {
        this((byte) 0);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(IOException iOException, int i, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        PrivacyConsentActivity privacyConsentActivity;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(iOException, "Exception parameter");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(creditCardBilledDetailAdapter$ParentViewHolder, "HTTP context");
        if (i > this.read || this.IconCompatParcelizer.contains(iOException.getClass())) {
            return false;
        }
        for (Class<? extends IOException> isInstance : this.IconCompatParcelizer) {
            if (isInstance.isInstance(iOException)) {
                return false;
            }
        }
        RemittanceAddFavouriteRecipientDetailActivity remittanceAddFavouriteRecipientDetailActivity = creditCardBilledDetailAdapter$ParentViewHolder instanceof RemittanceAddFavouriteRecipientDetailActivity ? (RemittanceAddFavouriteRecipientDetailActivity) creditCardBilledDetailAdapter$ParentViewHolder : new RemittanceAddFavouriteRecipientDetailActivity(creditCardBilledDetailAdapter$ParentViewHolder);
        Class<PrivacyConsentActivity> cls = PrivacyConsentActivity.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver2 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.request");
        Boolean bool = null;
        PrivacyConsentActivity cast = MediaBrowserCompat$ItemReceiver2 == null ? null : cls.cast(MediaBrowserCompat$ItemReceiver2);
        if (cast instanceof C9665x53ba63f5) {
            privacyConsentActivity = ((C9665x53ba63f5) cast).MediaBrowserCompat$ItemReceiver;
        } else {
            privacyConsentActivity = cast;
        }
        if ((privacyConsentActivity instanceof RemittanceCoachmarkActivity_ViewBinding) && ((RemittanceCoachmarkActivity_ViewBinding) privacyConsentActivity).MediaBrowserCompat$SearchResultReceiver()) {
            return false;
        }
        if (!(cast instanceof PrepaidResetPinSuccessActivity_ViewBinding)) {
            return true;
        }
        Class<Boolean> cls2 = Boolean.class;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(cls2, "Attribute class");
        Object MediaBrowserCompat$ItemReceiver3 = remittanceAddFavouriteRecipientDetailActivity.write.MediaBrowserCompat$ItemReceiver("http.request_sent");
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            bool = cls2.cast(MediaBrowserCompat$ItemReceiver3);
        }
        Boolean bool2 = bool;
        if (!(bool2 != null && bool2.booleanValue()) || this.MediaBrowserCompat$ItemReceiver) {
            return true;
        }
        return false;
    }
}
