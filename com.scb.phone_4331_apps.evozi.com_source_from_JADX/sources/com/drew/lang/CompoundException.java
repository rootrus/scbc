package com.drew.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

public class CompoundException extends Exception {
    private final Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public CompoundException(String str) {
        this(str, (Throwable) null);
    }

    public CompoundException(Throwable th) {
        this((String) null, th);
    }

    private CompoundException(String str, Throwable th) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            sb.append("\n");
            sb.append("--- inner exception ---");
            sb.append("\n");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
        }
        return sb.toString();
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            printStream.println("--- inner exception ---");
            this.MediaBrowserCompat$CustomActionResultReceiver.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            printWriter.println("--- inner exception ---");
            this.MediaBrowserCompat$CustomActionResultReceiver.printStackTrace(printWriter);
        }
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            System.err.println("--- inner exception ---");
            this.MediaBrowserCompat$CustomActionResultReceiver.printStackTrace();
        }
    }
}
