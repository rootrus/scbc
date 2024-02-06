package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import p039io.gsonfire.gson.SimpleIterableTypeAdapter;

/* renamed from: o.DebitTransactionAdapter$ParentViewHolder */
public final class DebitTransactionAdapter$ParentViewHolder implements TypeAdapterFactory {
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.getRawType() != DebitWithdrawalLimitActivity.class) {
            return null;
        }
        if (typeToken.getType() instanceof ParameterizedType) {
            return new SimpleIterableTypeAdapter(gson, ((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0]);
        }
        return new SimpleIterableTypeAdapter(gson, Object.class);
    }
}
