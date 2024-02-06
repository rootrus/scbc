package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.CustomizeYourPageActivity */
public final class CustomizeYourPageActivity<T> extends TypeAdapter<T> {
    private final TypeAdapter<T> MediaBrowserCompat$CustomActionResultReceiver;
    private final CreditCardDetailActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private final Gson write;

    public CustomizeYourPageActivity(Class<T> cls, CreditCardDetailActivity<? super T> creditCardDetailActivity, TypeAdapter<T> typeAdapter, Gson gson) {
        new AddAccountOtpActivity();
        this.MediaBrowserCompat$ItemReceiver = creditCardDetailActivity;
        this.write = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = typeAdapter;
    }

    public final void write(JsonWriter jsonWriter, T t) throws IOException {
        JsonElement jsonTree = this.MediaBrowserCompat$CustomActionResultReceiver.toJsonTree(t);
        CreditCardDetailActivity<? super T> creditCardDetailActivity = this.MediaBrowserCompat$ItemReceiver;
        if (creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver == null) {
            creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
        }
        Iterator<Object<T>> it = creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.write.toJson(jsonTree, jsonWriter);
    }

    public final T read(JsonReader jsonReader) throws IOException {
        JsonElement parse = new JsonParser().parse(jsonReader);
        CreditCardDetailActivity<? super T> creditCardDetailActivity = this.MediaBrowserCompat$ItemReceiver;
        if (creditCardDetailActivity.MediaBrowserCompat$ItemReceiver == null) {
            creditCardDetailActivity.MediaBrowserCompat$ItemReceiver = new ArrayList();
        }
        Iterator<Object<T>> it = creditCardDetailActivity.MediaBrowserCompat$ItemReceiver.iterator();
        while (it.hasNext()) {
            it.next();
        }
        T fromJsonTree = this.MediaBrowserCompat$CustomActionResultReceiver.fromJsonTree(parse);
        MediaBrowserCompat$CustomActionResultReceiver();
        return fromJsonTree;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        CreditCardDetailActivity<? super T> creditCardDetailActivity = this.MediaBrowserCompat$ItemReceiver;
        if (creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver == null) {
            creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
        }
        Iterator<Object<T>> it = creditCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
