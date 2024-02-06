package p040o;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: o.RegistrationNoDataActivity_ViewBinding */
public final class RegistrationNoDataActivity_ViewBinding extends FixedTransferSuccessActivity {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationNoDataActivity_ViewBinding(Iterable<? extends AddAccountsActivity> iterable, Charset charset) {
        super(RemittanceSenderAddressReviewActivity.MediaBrowserCompat$ItemReceiver(iterable, charset != null ? charset : CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver), FavouriteSelectedActivity.IconCompatParcelizer("application/x-www-form-urlencoded", charset));
    }

    public RegistrationNoDataActivity_ViewBinding(List<? extends AddAccountsActivity> list) throws UnsupportedEncodingException {
        this(list, (Charset) null);
    }
}
