package com.thunderhead.android.infrastructure.data;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.thunderhead.android.infrastructure.data.DataSource$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;

public interface DataSource<S extends DataSource$MediaBrowserCompat$CustomActionResultReceiver> {

    public static final class DataSourceException extends Exception {
        public DataSourceException() {
            this((String) null, 3);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataSourceException(String str, int i) {
            this((i & 1) != 0 ? "" : str, (Throwable) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private DataSourceException(String str, Throwable th) {
            super(str, (Throwable) null);
            onGetStartedClick.write((Object) str, C8183f.f4230JO);
        }
    }
}
