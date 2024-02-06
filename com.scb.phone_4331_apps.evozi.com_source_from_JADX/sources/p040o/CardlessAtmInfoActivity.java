package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.UnsupportedSchemeException;

/* renamed from: o.CardlessAtmInfoActivity */
public final class CardlessAtmInfoActivity implements RegistrationCountrySearchActivity_ViewBinding {
    private final Map<PrivacyManagementLandingViewHolder, byte[]> MediaBrowserCompat$CustomActionResultReceiver;
    private final DealsBuyReviewActivity read;
    private final PrepaidTravelCoachMarkActivity_ViewBinding write;

    private CardlessAtmInfoActivity(byte b) {
        this.write = PrepaidOtpActivity.write((Class) getClass());
        this.MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap();
        this.read = CardViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer;
    }

    public CardlessAtmInfoActivity() {
        this((byte) 0);
    }

    public final void IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, ManagePromptpayLandingActivity managePromptpayLandingActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        if (managePromptpayLandingActivity != null) {
            if (managePromptpayLandingActivity instanceof Serializable) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(managePromptpayLandingActivity);
                    objectOutputStream.close();
                    this.MediaBrowserCompat$CustomActionResultReceiver.put(MediaBrowserCompat$ItemReceiver(privacyManagementLandingViewHolder), byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
                        this.write.MediaBrowserCompat$ItemReceiver("Unexpected I/O error while serializing auth scheme", e);
                    }
                }
            } else if (this.write.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Auth scheme ");
                sb.append(managePromptpayLandingActivity.getClass());
                sb.append(" is not serializable");
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
        }
    }

    public final ManagePromptpayLandingActivity write(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver.get(MediaBrowserCompat$ItemReceiver(privacyManagementLandingViewHolder));
        if (bArr != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                ManagePromptpayLandingActivity managePromptpayLandingActivity = (ManagePromptpayLandingActivity) objectInputStream.readObject();
                objectInputStream.close();
                return managePromptpayLandingActivity;
            } catch (IOException e) {
                if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
                    this.write.MediaBrowserCompat$ItemReceiver("Unexpected I/O error while de-serializing auth scheme", e);
                }
            } catch (ClassNotFoundException e2) {
                if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
                    this.write.MediaBrowserCompat$ItemReceiver("Unexpected error while de-serializing auth scheme", e2);
                }
                return null;
            }
        }
        return null;
    }

    public final void IconCompatParcelizer(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        this.MediaBrowserCompat$CustomActionResultReceiver.remove(MediaBrowserCompat$ItemReceiver(privacyManagementLandingViewHolder));
    }

    public final String toString() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.toString();
    }

    private PrivacyManagementLandingViewHolder MediaBrowserCompat$ItemReceiver(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder) {
        if (privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver <= 0) {
            try {
                return new PrivacyManagementLandingViewHolder(privacyManagementLandingViewHolder.write, this.read.read(privacyManagementLandingViewHolder), privacyManagementLandingViewHolder.read);
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return privacyManagementLandingViewHolder;
    }
}
