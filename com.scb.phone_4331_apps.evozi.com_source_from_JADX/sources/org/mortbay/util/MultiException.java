package org.mortbay.util;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MultiException extends Exception {
    public String toString() {
        return "org.mortbay.util.MultiException";
    }

    public MultiException() {
        super("Multiple exceptions");
    }

    public void printStackTrace() {
        super.printStackTrace();
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }
}
