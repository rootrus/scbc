package com.scb.phone.view.fragment.mailingaddress;

import com.scb.phone.view.custom.common.CustomAddressInput;

final class BaseMailingAddressFragment$MediaBrowserCompat$ItemReceiver implements CustomAddressInput.write {
    private /* synthetic */ BaseMailingAddressFragment IconCompatParcelizer;

    BaseMailingAddressFragment$MediaBrowserCompat$ItemReceiver(BaseMailingAddressFragment baseMailingAddressFragment) {
        this.IconCompatParcelizer = baseMailingAddressFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        BaseMailingAddressFragment.IconCompatParcelizer(this.IconCompatParcelizer, z);
    }
}
