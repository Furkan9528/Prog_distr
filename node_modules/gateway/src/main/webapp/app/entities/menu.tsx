import React from 'react';
import { Translate } from 'react-jhipster';

import MenuItem from 'app/shared/layout/menus/menu-item';

const EntitiesMenu = () => {
  return (
    <>
      {/* prettier-ignore */}
      <MenuItem icon="asterisk" to="/invoice">
        <Translate contentKey="global.menu.entities.invoiceInvoice" />
      </MenuItem>
      <MenuItem icon="asterisk" to="/shipment">
        <Translate contentKey="global.menu.entities.invoiceShipment" />
      </MenuItem>
      {/* jhipster-needle-add-entity-to-menu - JHipster will add entities to the menu here */}
    </>
  );
};

export default EntitiesMenu;
