package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/* renamed from: o.DebitCardDetailActivity_ViewBinding */
public final class DebitCardDetailActivity_ViewBinding<T> implements TypeAdapterFactory {
    private final CreditCardDetailActivity<T> MediaBrowserCompat$CustomActionResultReceiver;

    public DebitCardDetailActivity_ViewBinding(CreditCardDetailActivity<T> creditCardDetailActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardDetailActivity;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.gson.TypeAdapter<T>, java.lang.Class] */
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        ? r1 = 0;
        if (!r1.isAssignableFrom(typeToken.getRawType())) {
            return r1;
        }
        return new CustomizeYourPageActivity(typeToken.getRawType(), this.MediaBrowserCompat$CustomActionResultReceiver, gson.getDelegateAdapter(this, typeToken), gson);
    }
}
