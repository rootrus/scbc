package org.apache.http.impl.client;

import org.apache.http.HttpException;
import p040o.ScbPrivacyPolicyActivity;

@Deprecated
public class TunnelRefusedException extends HttpException {
    public final ScbPrivacyPolicyActivity write;

    public TunnelRefusedException(String str, ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
        super(str);
        this.write = scbPrivacyPolicyActivity;
    }
}
