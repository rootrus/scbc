package p040o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: o.Matrix4f */
public final class Matrix4f {
    public final long read;

    public Matrix4f() {
    }

    public static Matrix4f MediaBrowserCompat$CustomActionResultReceiver(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new Matrix4f(Long.parseLong(jsonReader.nextString()));
                } else {
                    Matrix4f matrix4f = new Matrix4f(jsonReader.nextLong());
                    jsonReader.close();
                    return matrix4f;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    private Matrix4f(long j) {
        this();
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Matrix4f)) {
            return false;
        }
        if (this.read != ((Matrix4f) obj).read) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.read;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogResponse{nextRequestWaitMillis=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }
}
