package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zack;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zab;
import com.google.android.gms.signin.zac;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p040o.setTextAppearance;

@Deprecated
public abstract class GoogleApiClient {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    /* access modifiers changed from: private */
    public static final Set<GoogleApiClient> zacj = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void stopAutoManage(FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (zacj) {
            String concat = String.valueOf(str).concat("  ");
            int i = 0;
            for (GoogleApiClient dump : zacj) {
                printWriter.append(str).append("GoogleApiClient#").println(i);
                dump.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set;
        synchronized (zacj) {
            set = zacj;
        }
        return set;
    }

    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new UnsupportedOperationException();
    }

    public <L> ListenerHolder<L> registerListener(L l) {
        throw new UnsupportedOperationException();
    }

    public <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static final class Builder {
        private final Context mContext;
        private Looper zabl;
        private final Set<Scope> zabs;
        private final Set<Scope> zabt;
        private int zabu;
        private View zabv;
        private String zabw;
        private String zabx;
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> zaby;
        private boolean zabz;
        private final Map<Api<?>, Api.ApiOptions> zaca;
        private LifecycleActivity zacb;
        private int zacc;
        private OnConnectionFailedListener zacd;
        private GoogleApiAvailability zace;
        private Api.AbstractClientBuilder<? extends zac, SignInOptions> zacf;
        private final ArrayList<ConnectionCallbacks> zacg;
        private final ArrayList<OnConnectionFailedListener> zach;
        private boolean zaci;
        private Account zax;

        public Builder(Context context) {
            this.zabs = new HashSet();
            this.zabt = new HashSet();
            this.zaby = new setTextAppearance();
            this.zabz = false;
            this.zaca = new setTextAppearance();
            this.zacc = -1;
            this.zace = GoogleApiAvailability.getInstance();
            this.zacf = zab.zapv;
            this.zacg = new ArrayList<>();
            this.zach = new ArrayList<>();
            this.zaci = false;
            this.mContext = context;
            this.zabl = context.getMainLooper();
            this.zabw = context.getPackageName();
            this.zabx = context.getClass().getName();
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zacg.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zach.add(onConnectionFailedListener);
        }

        public final Builder setHandler(Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zabl = handler.getLooper();
            return this;
        }

        public final Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zacg.add(connectionCallbacks);
            return this;
        }

        public final Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zach.add(onConnectionFailedListener);
            return this;
        }

        public final Builder setViewForPopups(View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zabv = view;
            return this;
        }

        public final Builder addScope(Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zabs.add(scope);
            return this;
        }

        public final Builder addScopeNames(String[] strArr) {
            for (String scope : strArr) {
                this.zabs.add(new Scope(scope));
            }
            return this;
        }

        public final Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaca.put(api, (Object) null);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(null);
            this.zabt.addAll(impliedScopes);
            this.zabs.addAll(impliedScopes);
            return this;
        }

        public final Builder addApiIfAvailable(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaca.put(api, (Object) null);
            zaa(api, (Api.ApiOptions) null, scopeArr);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaca.put(api, o);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(o);
            this.zabt.addAll(impliedScopes);
            this.zabs.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(Api<O> api, O o, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaca.put(api, o);
            zaa(api, o, scopeArr);
            return this;
        }

        public final Builder setAccountName(String str) {
            this.zax = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        public final Builder setGravityForPopups(int i) {
            this.zabu = i;
            return this;
        }

        public final Builder enableAutoManage(FragmentActivity fragmentActivity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zacc = i;
            this.zacd = onConnectionFailedListener;
            this.zacb = lifecycleActivity;
            return this;
        }

        public final Builder enableAutoManage(FragmentActivity fragmentActivity, OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.DEFAULT;
            if (this.zaca.containsKey(zab.API)) {
                signInOptions = (SignInOptions) this.zaca.get(zab.API);
            }
            return new ClientSettings(this.zax, this.zabs, this.zaby, this.zabu, this.zabv, this.zabw, this.zabx, signInOptions, false);
        }

        public final GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaca.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings buildClientSettings = buildClientSettings();
            Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = buildClientSettings.getOptionalApiSettings();
            setTextAppearance settextappearance = new setTextAppearance();
            setTextAppearance settextappearance2 = new setTextAppearance();
            ArrayList arrayList = new ArrayList();
            Api api = null;
            boolean z = false;
            for (Api next : this.zaca.keySet()) {
                Api.ApiOptions apiOptions = this.zaca.get(next);
                boolean z2 = optionalApiSettings.get(next) != null;
                settextappearance.put(next, Boolean.valueOf(z2));
                zap zap = new zap(next, z2);
                arrayList.add(zap);
                Api.AbstractClientBuilder zai = next.zai();
                Api api2 = next;
                Api.Client buildClient = zai.buildClient(this.mContext, this.zabl, buildClientSettings, apiOptions, (ConnectionCallbacks) zap, (OnConnectionFailedListener) zap);
                settextappearance2.put(api2.getClientKey(), buildClient);
                if (zai.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String name = api2.getName();
                        String name2 = api.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21 + String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.checkState(this.zax == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                    Preconditions.checkState(this.zabs.equals(this.zabt), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
                } else {
                    String name3 = api.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(name3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            zaaw zaaw = new zaaw(this.mContext, new ReentrantLock(), this.zabl, buildClientSettings, this.zace, this.zacf, settextappearance, this.zacg, this.zach, settextappearance2, this.zacc, zaaw.zaa(settextappearance2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.zacj) {
                GoogleApiClient.zacj.add(zaaw);
            }
            if (this.zacc >= 0) {
                zai.zaa(this.zacb).zaa(this.zacc, zaaw, this.zacd);
            }
            return zaaw;
        }

        private final <O extends Api.ApiOptions> void zaa(Api<O> api, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(api.zah().getImpliedScopes(o));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.zaby.put(api, new ClientSettings.OptionalApiSettings(hashSet));
        }
    }

    public boolean hasApi(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public void zaa(zack zack) {
        throw new UnsupportedOperationException();
    }

    public void zab(zack zack) {
        throw new UnsupportedOperationException();
    }
}
