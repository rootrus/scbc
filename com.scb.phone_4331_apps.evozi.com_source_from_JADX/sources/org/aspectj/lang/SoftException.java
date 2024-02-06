package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SoftException extends RuntimeException {
    public Throwable getCause() {
        return null;
    }

    static {
        try {
            Class.forName("java.nio.Buffer");
        } catch (Throwable unused) {
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }
}
