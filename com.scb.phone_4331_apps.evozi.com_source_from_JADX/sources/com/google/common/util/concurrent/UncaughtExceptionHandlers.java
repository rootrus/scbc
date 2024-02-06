package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class UncaughtExceptionHandlers {
    private UncaughtExceptionHandlers() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }

    static final class Exiter implements Thread.UncaughtExceptionHandler {
        private static final Logger logger = Logger.getLogger(Exiter.class.getName());
        private final Runtime runtime;

        Exiter(Runtime runtime2) {
            this.runtime = runtime2;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            logger.log(Level.SEVERE, String.format("Caught an exception in %s.  Shutting down.", new Object[]{thread}), th);
            this.runtime.exit(1);
        }
    }
}
