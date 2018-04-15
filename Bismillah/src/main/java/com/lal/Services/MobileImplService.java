package com.lal.Services;

import com.lal.DAO.MobileInventoryDAO;
import com.lal.Model.Item;

import java.util.List;

public class MobileImplService implements  MobileDAOService {
    MobileInventoryDAO mobileInventoryDAO;
    public MobileImplService(){

    }
    public MobileImplService(MobileInventoryDAO mobileInventoryDAO){
        this.mobileInventoryDAO = mobileInventoryDAO;
    }
    public List<Item> getAllInventorySvc(){
        return mobileInventoryDAO.getAllInventory();
    }

    private static MobileDAOService mobileDAOService;
    public static MobileDAOService create(MobileInventoryDAO mobileInventoryDAO){
        if (mobileDAOService==null){
            mobileDAOService = new MobileImplService(mobileInventoryDAO);
        }
        return mobileDAOService;
    }

}
