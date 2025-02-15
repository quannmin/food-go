package com.foodygo.shipping.service;

import com.foodygo.shipping.entity.ShipperLog;

public interface ShipperLogService extends BaseService<ShipperLog, Integer> {
    void acceptOrRejectShipping(Integer orderId, Integer shipperId);
}
