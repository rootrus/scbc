package org.tensorflow.lite;

import java.io.PrintStream;

public final class TensorFlowLite {
    public static native String version();

    static boolean IconCompatParcelizer() {
        try {
            System.loadLibrary("tensorflowlite_jni");
            return true;
        } catch (UnsatisfiedLinkError e) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("TensorFlowLite: failed to load native library: ");
            sb.append(e.getMessage());
            printStream.println(sb.toString());
            return false;
        }
    }

    static {
        IconCompatParcelizer();
    }
}
