package com.vendingmachine.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.vendingmachine.dto.Item;

public interface VendingMachineDao {

	void removeOneItemFromInventory(String name) throws VendingMachinePersistenceException;

	List<Item> getAllItems() throws VendingMachinePersistenceException;

	int getItemInventory(String name) throws VendingMachinePersistenceException;

	Item getItem(String name) throws VendingMachinePersistenceException;

	Map<String, BigDecimal> getMapOfItemNamesInStockWithCosts() throws VendingMachinePersistenceException;

}
