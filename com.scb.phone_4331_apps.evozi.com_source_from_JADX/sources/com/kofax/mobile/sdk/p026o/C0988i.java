package com.kofax.mobile.sdk.p026o;

import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.Vector;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.o.i */
public class C0988i implements C0981a {
    private static final String TAG = C0988i.class.getSimpleName();

    /* renamed from: bA */
    private DocumentTracker f2381bA = new DocumentTracker();

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    @HmlPinActivity
    C0988i() {
    }

    /* renamed from: a */
    public void mo12392a(C0982b bVar) {
        this.f2381bA.initializeString(bVar.mo12382mb(), bVar.mo12383mc());
        this.f2381bA.reset();
        this.f2381bA.startup();
        this.f2381bA.RunDetection = false;
        this.f2381bA.RunLocalSearch = false;
        this.f2381bA.RunBoundaryDetection = false;
    }

    /* renamed from: a */
    public TrackedDocument mo12371a(C0985f fVar) {
        m2567b(fVar);
        TrackedDocument mi = m2568mi();
        releaseFrame();
        return mi;
    }

    public void destroy() {
        this.f2381bA.dispose();
    }

    /* renamed from: b */
    private void m2567b(C0985f fVar) {
        fVar.mo12394a(this.f2381bA);
    }

    /* renamed from: mi */
    private TrackedDocument m2568mi() {
        this.f2381bA.processFrame();
        Vector<TrackedDocument> Documents = this.f2381bA.Documents();
        if (!Documents.isEmpty()) {
            return Documents.firstElement();
        }
        C0767k.m1801b(TAG, "No documents found, returning null");
        return null;
    }

    private void releaseFrame() {
        this.f2381bA.releaseFrame();
    }
}
