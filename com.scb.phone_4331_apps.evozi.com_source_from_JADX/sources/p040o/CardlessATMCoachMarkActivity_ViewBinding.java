package p040o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.auth.MalformedChallengeException;

/* renamed from: o.CardlessATMCoachMarkActivity_ViewBinding */
public abstract class CardlessATMCoachMarkActivity_ViewBinding extends btnReturnClicked implements Serializable {
    private transient Charset IconCompatParcelizer;
    private final Map<String, String> MediaBrowserCompat$CustomActionResultReceiver;

    public CardlessATMCoachMarkActivity_ViewBinding(Charset charset) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        this.IconCompatParcelizer = charset == null ? PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver : charset;
    }

    public CardlessATMCoachMarkActivity_ViewBinding() {
        this(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: package-private */
    public final String MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity) {
        String str = (String) privacyConsentActivity.write().IconCompatParcelizer("http.auth.credential-charset");
        if (str != null) {
            return str;
        }
        Charset charset = this.IconCompatParcelizer;
        if (charset == null) {
            charset = PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return charset.name();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, int i, int i2) throws MalformedChallengeException {
        PrepaidTravelConversionLandingActivity_ViewBinding[] IconCompatParcelizer2 = StopChequeHistoryAdapter$ViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, new RadioButtonGroupAdapter$RadioButtonViewGroup(i, depositTransactionAdapter$ChildViewHolder_ViewBinding.length()));
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        for (PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding : IconCompatParcelizer2) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(prepaidTravelConversionLandingActivity_ViewBinding.read().toLowerCase(Locale.ROOT), prepaidTravelConversionLandingActivity_ViewBinding.write());
        }
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String read(String str) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(str.toLowerCase(Locale.ROOT));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.IconCompatParcelizer.name());
        objectOutputStream.writeObject(this.MediaBrowserCompat$ItemReceiver);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Charset read = DepositTransactionAdapter$ChildViewHolder.read(objectInputStream.readUTF());
        this.IconCompatParcelizer = read;
        if (read == null) {
            this.IconCompatParcelizer = PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        this.MediaBrowserCompat$ItemReceiver = (RegistrationCountrySearchActivity) objectInputStream.readObject();
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get("realm".toLowerCase(Locale.ROOT));
    }
}
