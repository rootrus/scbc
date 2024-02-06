package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.CcSofHybridActivity;

/* renamed from: o.CcSofHybridActivity$MediaBrowserCompat$ItemReceiver */
public class CcSofHybridActivity$MediaBrowserCompat$ItemReceiver extends TypeAdapter<QuickAccountSelectAdapter$UnselectedHolder> {
    private GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder MediaBrowserCompat$ItemReceiver;

    public CcSofHybridActivity$MediaBrowserCompat$ItemReceiver(CcSofHybridActivity ccSofHybridActivity) {
        this(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_LOCAL_DATE);
    }

    private CcSofHybridActivity$MediaBrowserCompat$ItemReceiver(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        this.MediaBrowserCompat$ItemReceiver = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder;
    }

    public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        if (CcSofHybridActivity.C96924.MediaBrowserCompat$CustomActionResultReceiver[jsonReader.peek().ordinal()] != 1) {
            return QuickAccountSelectAdapter$UnselectedHolder.parse(jsonReader.nextString(), this.MediaBrowserCompat$ItemReceiver);
        }
        jsonReader.nextNull();
        return null;
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder = (QuickAccountSelectAdapter$UnselectedHolder) obj;
        if (quickAccountSelectAdapter$UnselectedHolder == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.MediaBrowserCompat$ItemReceiver.format(quickAccountSelectAdapter$UnselectedHolder));
        }
    }
}
