package com.vendingmachine;

import com.vendingmachine.controller.VendingMachineController;
import com.vendingmachine.dao.VendingMachineAuditDao;
import com.vendingmachine.dao.VendingMachineAuditDaoFileImpl;
import com.vendingmachine.dao.VendingMachineDao;
import com.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.vendingmachine.service.VendingMachineServiceLayer;
import com.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.vendingmachine.ui.UserIO;
import com.vendingmachine.ui.UserIOConsoleImpl;
import com.vendingmachine.ui.VendingMachineView;

public class App {

	public static void main(String[] args) {
				
		UserIO io = new UserIOConsoleImpl();
        VendingMachineView view = new VendingMachineView(io);
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();
        VendingMachineDao dao = new VendingMachineDaoFileImpl();
        VendingMachineServiceLayer service = new VendingMachineServiceLayerImpl(auditDao, dao);
        VendingMachineController controller = new VendingMachineController(view, service);
        controller.run();
	}
}