package com.vendingmachine.service;

import java.math.BigDecimal;
import java.util.Map;

import com.vendingmachine.dao.VendingMachinePersistenceException;
import com.vendingmachine.dto.Item;

public interface VendingMachineServiceLayer {

	void checkIfEnoughMoney(Item item, BigDecimal inputMoney) throws InsufficientFundsException;

	void removeOneItemFromInventory(String name) throws NoItemInventoryException, VendingMachinePersistenceException;

	Map<String, BigDecimal> getItemsInStockWithCosts() throws VendingMachinePersistenceException;

	Item getItem(String name, BigDecimal inputMoney)
			throws InsufficientFundsException, NoItemInventoryException, VendingMachinePersistenceException;

	Map<BigDecimal, BigDecimal> getChangePerCoin(Item item, BigDecimal money);

}