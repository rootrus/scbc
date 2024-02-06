package com.kofax.mobile.sdk._internal.impl.extraction;

import android.os.AsyncTask;
import com.kofax.mobile.sdk._internal.extraction.DataUnit;
import com.kofax.mobile.sdk._internal.extraction.IDataUnitProcessedListener;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.a */
public abstract class C7982a implements IExtractionServer {
    /* access modifiers changed from: protected */
    public abstract void extractInBackground(DataUnit dataUnit);

    public void extract(DataUnit dataUnit, IDataUnitProcessedListener iDataUnitProcessedListener) {
        C7985b bVar = new C7985b(dataUnit, iDataUnitProcessedListener);
        new C7984a().execute(new C7985b[]{bVar});
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.a$a */
    class C7984a extends AsyncTask<C7985b, Void, C7985b> {
        private C7984a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7985b doInBackground(C7985b... bVarArr) {
            if (bVarArr.length == 1) {
                C7985b bVar = bVarArr[0];
                C7982a.this.extractInBackground(bVar.f3732Jp);
                return bVar;
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C7985b bVar) {
            super.onPostExecute(bVar);
            bVar.mo54377mq();
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.a$b */
    static class C7985b {

        /* renamed from: Jp */
        public final DataUnit f3732Jp;

        /* renamed from: Jq */
        public final IDataUnitProcessedListener f3733Jq;

        public C7985b(DataUnit dataUnit, IDataUnitProcessedListener iDataUnitProcessedListener) {
            if (dataUnit == null) {
                throw new IllegalArgumentException("unit may not be null");
            } else if (iDataUnitProcessedListener != null) {
                this.f3732Jp = dataUnit;
                this.f3733Jq = iDataUnitProcessedListener;
            } else {
                throw new IllegalArgumentException("listener may not be null");
            }
        }

        /* renamed from: mq */
        public void mo54377mq() {
            this.f3733Jq.onExtractionComplete(this.f3732Jp);
        }
    }
}
