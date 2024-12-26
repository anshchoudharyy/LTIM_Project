package com.wecp.progressive.dao;

import java.util.List;

import com.wecp.progressive.entity.Warehouse;

public class WarehouseDAOImpl {
    int addWarehouse(Warehouse warehouse);
    Warehouse getWarehouseById(int warehouseId);
    void updateWarehouse (Warehouse warehouse);
    void deleteWarehouse (int warehouseId);
    List<Warehouse> getAllWarehouse();
    
}
