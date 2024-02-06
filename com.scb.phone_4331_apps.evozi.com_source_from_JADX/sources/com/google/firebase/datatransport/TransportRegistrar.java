package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.List;
import p040o.C7236load;
import p040o.Matrix2f;
import p040o.createMultiContext;
import p040o.getPointerSize;

public class TransportRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Collections.singletonList(Component.builder(Matrix2f.class).add(Dependency.required(Context.class)).factory(TransportRegistrar$$Lambda$1.lambdaFactory$()).build());
    }

    static /* synthetic */ Matrix2f lambda$getComponents$0(ComponentContainer componentContainer) {
        getPointerSize.write((Context) componentContainer.get(Context.class));
        createMultiContext createmulticontext = getPointerSize.MediaBrowserCompat$CustomActionResultReceiver;
        if (createmulticontext != null) {
            return createmulticontext.write().MediaBrowserCompat$ItemReceiver(C7236load.MediaBrowserCompat$CustomActionResultReceiver);
        }
        throw new IllegalStateException("Not initialized!");
    }
}
