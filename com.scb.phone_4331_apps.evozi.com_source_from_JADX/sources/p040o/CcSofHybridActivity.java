package p040o;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.regex.Pattern;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.CcSofHybridActivity */
public final class CcSofHybridActivity {
    private write IconCompatParcelizer = new write();
    private IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();
    private CcSofHybridActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new CcSofHybridActivity$MediaBrowserCompat$ItemReceiver(this);
    private read read = new read();
    Gson write = new SensitiveCSentActivity().MediaBrowserCompat$CustomActionResultReceiver().registerTypeAdapter(Date.class, this.MediaBrowserCompat$CustomActionResultReceiver).registerTypeAdapter(java.sql.Date.class, this.IconCompatParcelizer).registerTypeAdapter(OffsetDateTime.class, this.read).registerTypeAdapter(QuickAccountSelectAdapter$UnselectedHolder.class, this.MediaBrowserCompat$ItemReceiver).create();

    /* renamed from: o.CcSofHybridActivity$4 */
    static /* synthetic */ class C96924 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        static {
            int[] iArr = new int[JsonToken.values().length];
            MediaBrowserCompat$CustomActionResultReceiver = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final <T> T MediaBrowserCompat$ItemReceiver(String str, Type type) {
        try {
            return this.write.fromJson(str, type);
        } catch (JsonParseException e) {
            if (type.equals(String.class)) {
                return str;
            }
            throw e;
        }
    }

    /* renamed from: o.CcSofHybridActivity$IconCompatParcelizer */
    public static class IconCompatParcelizer extends TypeAdapter<Date> {
        private static Date IconCompatParcelizer(JsonReader jsonReader) throws IOException {
            try {
                if (C96924.MediaBrowserCompat$CustomActionResultReceiver[jsonReader.peek().ordinal()] != 1) {
                    return ISO8601Utils.parse(jsonReader.nextString(), new ParsePosition(0));
                }
                jsonReader.nextNull();
                return null;
            } catch (ParseException e) {
                throw new JsonParseException((Throwable) e);
            } catch (IllegalArgumentException e2) {
                throw new JsonParseException((Throwable) e2);
            }
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return IconCompatParcelizer(jsonReader);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Date date = (Date) obj;
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(ISO8601Utils.format(date, true));
            }
        }
    }

    /* renamed from: o.CcSofHybridActivity$read */
    public static class read extends TypeAdapter<OffsetDateTime> {
        private GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder MediaBrowserCompat$CustomActionResultReceiver;

        public read() {
            this(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_OFFSET_DATE_TIME);
        }

        private read(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
            this.MediaBrowserCompat$CustomActionResultReceiver = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder;
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            if (C96924.MediaBrowserCompat$CustomActionResultReceiver[jsonReader.peek().ordinal()] != 1) {
                return OffsetDateTime.parse(Pattern.compile("([+-])(\\d{2})(\\d{2})$").matcher(jsonReader.nextString()).replaceAll("$1$2:$3"), this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            jsonReader.nextNull();
            return null;
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (offsetDateTime == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(this.MediaBrowserCompat$CustomActionResultReceiver.format(offsetDateTime));
            }
        }
    }

    /* renamed from: o.CcSofHybridActivity$write */
    public static class write extends TypeAdapter<java.sql.Date> {
        private static java.sql.Date MediaBrowserCompat$ItemReceiver(JsonReader jsonReader) throws IOException {
            if (C96924.MediaBrowserCompat$CustomActionResultReceiver[jsonReader.peek().ordinal()] != 1) {
                try {
                    return new java.sql.Date(ISO8601Utils.parse(jsonReader.nextString(), new ParsePosition(0)).getTime());
                } catch (ParseException e) {
                    throw new JsonParseException((Throwable) e);
                }
            } else {
                jsonReader.nextNull();
                return null;
            }
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
            return MediaBrowserCompat$ItemReceiver(jsonReader);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            java.sql.Date date = (java.sql.Date) obj;
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(date.toString());
            }
        }
    }
}
