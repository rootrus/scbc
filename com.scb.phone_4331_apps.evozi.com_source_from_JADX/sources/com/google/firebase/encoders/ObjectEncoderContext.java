package com.google.firebase.encoders;

import java.io.IOException;

public interface ObjectEncoderContext {
    ObjectEncoderContext add(String str, int i) throws IOException;

    ObjectEncoderContext add(String str, long j) throws IOException;

    ObjectEncoderContext add(String str, Object obj) throws IOException;

    ObjectEncoderContext add(String str, boolean z) throws IOException;
}
