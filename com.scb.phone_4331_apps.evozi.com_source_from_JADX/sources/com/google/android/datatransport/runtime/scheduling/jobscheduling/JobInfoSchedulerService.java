package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p040o.RenderScript;
import p040o.RenderScript$MediaBrowserCompat$ItemReceiver;
import p040o.ZHPR2;
import p040o.createMultiContext;
import p040o.getPointerSize;
import p040o.isComplex;

public class JobInfoSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        getPointerSize.write(getApplicationContext());
        RenderScript$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = RenderScript.IconCompatParcelizer().read(string).IconCompatParcelizer(ZHPR2.IconCompatParcelizer(i));
        if (string2 != null) {
            IconCompatParcelizer.read(Base64.decode(string2, 0));
        }
        createMultiContext createmulticontext = getPointerSize.MediaBrowserCompat$CustomActionResultReceiver;
        if (createmulticontext != null) {
            isComplex.C138124 r1 = createmulticontext.write().MediaBrowserCompat$ItemReceiver;
            r1.write.execute(new isComplex.C137921(r1, IconCompatParcelizer.IconCompatParcelizer(), i2, new isComplex.C138023(this, jobParameters)));
            return true;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
