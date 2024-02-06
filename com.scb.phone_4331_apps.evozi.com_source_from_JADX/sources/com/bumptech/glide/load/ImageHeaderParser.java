package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p040o.CheckParameters;

public interface ImageHeaderParser {
    ImageType IconCompatParcelizer(ByteBuffer byteBuffer) throws IOException;

    int MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, CheckParameters.CheckCountry checkCountry) throws IOException;

    ImageType read(InputStream inputStream) throws IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public final boolean hasAlpha() {
            return this.hasAlpha;
        }
    }
}
