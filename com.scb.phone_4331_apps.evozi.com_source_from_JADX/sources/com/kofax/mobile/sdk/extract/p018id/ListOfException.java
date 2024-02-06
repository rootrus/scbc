package com.kofax.mobile.sdk.extract.p018id;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.extract.id.ListOfException */
public class ListOfException extends Exception {
    private static final String adV = "There were multiple errors.";
    private static final long serialVersionUID = 1;
    private List<Throwable> adW;

    public ListOfException(String str, Throwable[] thArr) {
        this(str, (List<? extends Throwable>) Arrays.asList(thArr));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListOfException(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.size() <= 0) ? null : (Throwable) list.get(0));
        this.adW = Collections.unmodifiableList(list);
    }

    public ListOfException(List<? extends Throwable> list) {
        this(adV, list);
    }

    public List<Throwable> getInnerThrowables() {
        return this.adW;
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable printStackTrace : this.adW) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            printStackTrace.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable printStackTrace : this.adW) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            printStackTrace.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
